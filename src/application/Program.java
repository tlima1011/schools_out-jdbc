package application;

import java.sql.Connection;
import java.text.ParseException;
import java.util.Scanner;

import db.DB;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Connection conn = DB.getConnection();

		sc.close();
	}
}
