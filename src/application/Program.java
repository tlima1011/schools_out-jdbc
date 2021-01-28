package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.entities.Aluno;
import model.entities.AlunoAssisteCurso;
import model.entities.Curso;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 		
		
		Aluno aluno1 = new Aluno(1,"Joao Adenilson","adenilson@joaojo.com",sdf.parse("24/09/2001"));
		Aluno aluno2 = new Aluno(2,"Joana Adenilsa","ade@gekamail.com",sdf.parse("22/04/1999"));
		Aluno aluno3 = new Aluno(3,"Miguel Xules"," xules@joaojo.com",sdf.parse("24/09/2001"));
		
		List<Aluno> list = Arrays.asList(aluno1, aluno2, aluno3); 
		for (Aluno aluno : list) {
			System.out.println(aluno);
		}
		
		Curso curso1 = new Curso(1,"Introdutorio MySQL",60); 
		Curso curso2 = new Curso(2,"Introdutorio Java",40);
				
		AlunoAssisteCurso ac1 = new AlunoAssisteCurso(1, aluno1,curso1); 
		AlunoAssisteCurso ac2 = new AlunoAssisteCurso(2, aluno2,curso1);
			
		AlunoAssisteCurso ac3 = new AlunoAssisteCurso(3,aluno2,curso2);
		AlunoAssisteCurso ac4 = new AlunoAssisteCurso(4,aluno3 ,curso2);
		
		List<AlunoAssisteCurso> list1 = Arrays.asList(ac1, ac2, ac3,ac4); 
		for(AlunoAssisteCurso ac: list1) {
			System.out.println(ac);
		}
		sc.close();
	}
}
