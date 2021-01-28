package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.CursoDao;
import model.entities.Aluno;
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
	public Aluno findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
