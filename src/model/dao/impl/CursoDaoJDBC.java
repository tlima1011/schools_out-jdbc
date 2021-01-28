package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Curso obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
