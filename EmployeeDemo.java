import java.util.*;
class Employee{
	String empName;
	String empId;
	double salary;
	Employee(String e, String i, double s){
		empName = e;
		empId = i;
		salary = s;
	}
}
class EmployeeDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee's name: ");
		String em = sc.nextLine();
		System.out.println("Enter the Unique id: ");
		String ui = sc.nextLine();
		System.out.println("Enter their salary: ");
		Double sal = sc.nextDouble();
		Employee e1 = new Employee(em, ui, sal);
		System.out.println("The name of the employee is " + e1.empName);
		System.out.println("The UID of the employee is " + e1.empId);
		System.out.println("Their salary is $" + e1.salary);
	}
}
