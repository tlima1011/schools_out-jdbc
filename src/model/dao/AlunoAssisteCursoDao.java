package model.dao;

import java.util.List;

import model.entities.Aluno;

public interface AlunoAssisteCursoDao {

	// Crud
	void insert(AlunoAssisteCursoDao obj);
	void update(AlunoAssisteCursoDao obj);
	void deleteById(Integer id);
	Aluno findById(Integer id);
	List<AlunoAssisteCursoDao> findAll();
	List<AlunoAssisteCursoDao> findByAlunoAssisteCurso(AlunoAssisteCursoDao alunoAssisteCursoDao);

}
