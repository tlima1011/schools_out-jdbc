package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.AlunoAssisteCursoDao;
import model.entities.Aluno;

public class AlunoAssisteCursoDaoJDBC implements AlunoAssisteCursoDao {

	// Atributo
	private Connection conn;

	// Construtor
	public AlunoAssisteCursoDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(AlunoAssisteCursoDao obj) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(AlunoAssisteCursoDao obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Aluno findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlunoAssisteCursoDao> findAll() {
		return null;
	}

	@Override
	public List<AlunoAssisteCursoDao> findByAlunoAssisteCurso(AlunoAssisteCursoDao alunoAssisteCursoDao) {
		return null;
	}

}
