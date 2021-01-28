package model.dao;

import db.DB;
import model.dao.impl.AlunoAssisteCursoDaoJDBC;
import model.dao.impl.AlunoDaoJDBC;
import model.dao.impl.CursoDaoJDBC;

public class DaoFactory {
	
	public static AlunoDao createAlunoDao() {
		return new AlunoDaoJDBC(DB.getConnection()); 
	}
	
	public static CursoDao createCursoDao() { 
		return new CursoDaoJDBC(DB.getConnection()); 
	}
	
	public static AlunoAssisteCursoDao createAlunoAssisteCursoDao() {
		return new AlunoAssisteCursoDaoJDBC(DB.getConnection()); 
	}
}
