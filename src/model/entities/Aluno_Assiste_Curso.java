package model.entities;

import java.io.Serializable;

public class Aluno_Assiste_Curso implements Serializable{
	
	//Atributos 
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer id_aluno; 
	private Integer id_curso;
	
	//Construtores 
	public Aluno_Assiste_Curso() {
		
	}

	public Aluno_Assiste_Curso(Integer id, Integer id_aluno, Integer id_curso) {
		this.id = id;
		this.id_aluno = id_aluno;
		this.id_curso = id_curso;
	}
	//Getters and Setters 

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Integer id_aluno) {
		this.id_aluno = id_aluno;
	}

	public Integer getId_curso() {
		return id_curso;
	}

	public void setId_curso(Integer id_curso) {
		this.id_curso = id_curso;
	}
	
	

}
