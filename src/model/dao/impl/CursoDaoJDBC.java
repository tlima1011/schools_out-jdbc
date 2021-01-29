package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.CursoDao;
import model.entities.Curso;

public class CursoDaoJDBC implements CursoDao{
	
	//Atributos 
	private Connection conn; 

	//Construtor
	public CursoDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Curso obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("INSERT INTO curso (nome, duracao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
			st.setString(1, obj.getNome());
			st.setInt(2, obj.getDuracao());
			int rowsAffected = st.executeUpdate();
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			} else {
				throw new DbException("Unexpected error: no rows affected");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	@Override
	public void update(Curso obj) {
		
		
	}

	@Override
	public void deleteById(Integer id) {
		
		
	}
 
	@Override
	public Curso findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM CURSO WHERE curso.id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Curso course = instantiateCurso(rs);
				return course;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}		
		
	}

	private Curso instantiateCurso(ResultSet rs) throws SQLException {
		Curso curso = new Curso();
		curso.setId(rs.getInt("id"));
		curso.setNome(rs.getString("nome"));
		curso.setDuracao(rs.getInt("duracao"));
		return curso;
	}

	@Override
	public List<Curso> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM CURSO");
			rs = st.executeQuery();
			List<Curso> list = new ArrayList<>();
			while (rs.next()) {
				Curso obj = new Curso();
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("nome"));
				obj.setDuracao(rs.getInt("duracao"));
				list.add(obj);
			}
			return list;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
}
	
