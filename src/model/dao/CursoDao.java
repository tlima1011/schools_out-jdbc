package model.dao;

import java.util.List;

import model.entities.Aluno;
import model.entities.Curso;

public interface CursoDao {

	// Crud
	void insert(Curso obj);
	void update(Curso obj);
	void deleteById(Integer id);
	Curso findById(Integer id);
	List<Curso> findAll();

}
