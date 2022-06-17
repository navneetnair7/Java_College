class Employee{
	private String name;
	private String id;
	private int age;
	Employee(String n, String i, int a){
		name = n;
		id = i;
		age = a;
	}
}
class SalariedEmployee extends Employee{
	private double empSalary;
	SalariedEmployee(String name, String id, int age, double empSalary){
		super(name, id, age);
		this.empSalary = empSalary;
	}
}
class Tester{
	public static void main(String args[]){
		Scanner sc = new Scanner(Sysetm.in);
		for(int i = 0; i < 5; i ++){
			System.out.println("Enter details of " + i + "th employee- ");
			System.out.println("Enter the name of the employee- ");
			String n = sc.nextLine();
			System.out.println("Enter the id of the employee- ");
			String i = sc.nextLine();
			System.out.println("Enter the age of the employee- ");
			int a = sc.nextInt();
			System.out.println("Enter the salary of the employee- ");
			double s = sc.nextDouble();
			sc.nextLine();
			System.out.println("Is the employee Permamant or not(Y/N)- ");
			String p = sc.nextLine();
			if(p == "Y"){}
		}
	}
}
