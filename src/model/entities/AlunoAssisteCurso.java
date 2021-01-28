package model.entities;

import java.io.Serializable;

public class AlunoAssisteCurso implements Serializable{
	
	//Atributos 
	private static final long serialVersionUID = 1L;
	private Integer id;
	
	private Integer id_aluno; 
	private Integer id_curso;
	private Aluno aluno;
	private Curso curso; 
	
	//Construtores 
	public AlunoAssisteCurso() {
		
	}

	public AlunoAssisteCurso(Integer id, Aluno aluno, Curso curso) {
		this.id = id;
		this.aluno = aluno;
		this.curso = curso;
		
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

	@Override
	public String toString() {
		return "AlunoAssisteCurso [id = " + id + ", id_aluno = " + aluno.getId() + " - Nome: " + aluno.getNome() + ", id_curso: " + curso.getId() + " Nome Curso: " +curso.getNome()+ " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((id_aluno == null) ? 0 : id_aluno.hashCode());
		result = prime * result + ((id_curso == null) ? 0 : id_curso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoAssisteCurso other = (AlunoAssisteCurso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (id_aluno == null) {
			if (other.id_aluno != null)
				return false;
		} else if (!id_aluno.equals(other.id_aluno))
			return false;
		if (id_curso == null) {
			if (other.id_curso != null)
				return false;
		} else if (!id_curso.equals(other.id_curso))
			return false;
		return true;
	}
	
}
