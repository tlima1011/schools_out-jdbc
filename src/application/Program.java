package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
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
		System.out.println("\n=== Table Curso === Teste2 FindAll ===");
		List<Curso> list = new ArrayList<Curso>();
		list = cursoDao.findAll();
		for (Curso obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n=== Table Curso === Teste2 Insert curso ===");
		Curso newCurso = new Curso(null, "HTML/CSS",60);
		cursoDao.insert(newCurso);
		System.out.println("Inserted!! New id = " + newCurso.getId());
		
		
		
		
		sc.close();
	}
}
