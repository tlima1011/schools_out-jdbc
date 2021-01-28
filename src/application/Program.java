package application;

import java.text.ParseException;
import java.util.Scanner;

import model.dao.CursoDao;
import model.dao.DaoFactory;
import model.entities.Curso;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		CursoDao cursoDao = DaoFactory.createCursoDao();
				
		System.out.println("=== Table Curso === Teste1 FindById ===");
		Curso curso = cursoDao.findById(3);
		System.out.println(curso);
		
				
		
		sc.close();
	}
}
