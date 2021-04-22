package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Wage;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Wage wage = new Wage();
		
		System.out.println("Wage data: ");
		System.out.println("Name: ");
		wage.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		wage.GrossSalary = sc.nextDouble();
		
		wage.tax = wage.GrossSalary * 0.10;
		
		
		
		System.out.println(wage);
		
		System.out.println("Percentage: "); 
		double percentage = sc.nextDouble();
		wage.IncreaseSalary(percentage);
		
		System.out.println("Update Data: "+wage);
		
		
		
		
		sc.close();
	}

}
