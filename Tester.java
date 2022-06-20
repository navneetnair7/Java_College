import java.util.*;

class Employee{
	private String name;
	private String id;
	private int age;
	Employee(String n, String i, int a){
		name = n;
		id = i;
		age = a;
	}
	void printData()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
}

class SalariedEmployee extends Employee{
	private double empSalary;
	SalariedEmployee(String name, String id, int age, double empSalary){
		super(name, id, age);
		this.empSalary = empSalary;
	}
	void printData1()
	{
		System.out.println(empSalary);
	}
}

class Tester{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		double max = 0;
		SalariedEmployee[] se = new SalariedEmployee[5];
		for(int i = 0; i < 5; i ++){
			System.out.println("Enter details of " + i + "th employee- ");
			System.out.println("Enter the name of the employee- ");
			String n = sc.nextLine();
			System.out.println("Enter the id of the employee- ");
			String d = sc.nextLine();
			System.out.println("Enter the age of the employee- ");
			int a = sc.nextInt();
			System.out.println("Enter the salary of the employee- ");
			double s = sc.nextDouble();
			System.out.println("Is the employee Permamant or not(Y/N)- ");
			String p = sc.nextLine();
			if(p.equals("Y")){
				s = s + 2000;
			}
			se[i] = new SalariedEmployee(n, d, a, s);
			if(s > max){
				max = s;
				flag = i;
			}
		}
		System.out.println("The details of the employee with the highest salary is- ");
		se[flag].printData();
		se[flag].printData1();
	}	
}
