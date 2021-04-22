package entities;

public class Wage {
	
	public String name;
	public double GrossSalary;
	public double tax;

	public double NetSalary() {
		double netSalary = GrossSalary - tax;
		return netSalary;
	}
	
	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage / 100.0;;
	}
	
	
	
	public String toString() {
		return "Name: "+
			name+
			", Net Salary: $ "+
			String.format("%.2f", NetSalary());
	}
}
