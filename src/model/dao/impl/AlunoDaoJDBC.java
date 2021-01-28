package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.AlunoAssisteCursoDao;
import model.dao.AlunoDao;
import model.entities.Aluno;

public class AlunoDaoJDBC implements AlunoDao{

	// Atributo
	private Connection conn;

	// Construtor
	public AlunoDaoJDBC(Connection conn) {
			this.conn = conn;
	}
		
	@Override
	public void insert(Aluno obj) {
		
	}

	@Override
	public void update(Aluno obj) {
		
		
	}

	@Override
	public void deleteById(Integer id) {
		
	}

	@Override
	public Aluno findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT aluno.id, aluno.nome, aluno.email, curso.nome, curso.duracao " + 
					"from aluno " + 
					"join aluno_assiste_curso " + 
					"on aluno.id = aluno_assiste_curso.id_aluno " + 
					"inner join curso " + 
					"on aluno_assiste_curso.id_curso = curso.id " + 
					"where aluno.id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
			//	Department dep = instantiateDepartment(rs);
			//	Seller obj = instantiateSeller(rs, dep);
				//return obj;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Aluno> findAll() {
		return null;
	}

	@Override
	public List<Aluno> findByAlunoAssisteCurso(AlunoAssisteCursoDao alunoAssisteCursoDao) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
