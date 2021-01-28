package model.dao.impl;

import java.sql.Connection;
import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
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
