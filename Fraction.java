import java.util.*;	

class Fraction{
	Fraction(double a, double b, double c, double d){
		a = 1;
		b = 1;
		c = 1;
		d = 1;
	}
	static void sum(double a, double b, double c, double d){
		double add = (a * d + b * c)/(b * d);
		System.out.println("The sum of the 2 fractions is " + add);
	}
	static void diff(double a, double b, double c, double d){
		double subt = (a * d - b * c)/(b * d);
		System.out.println("The difference between the 2 fractions is " + subt);
	}
	static void prod(double a, double b, double c, double d){
		double mult = (a * c)/(b * d);
		System.out.println("The product of the 2 fractions is " + mult);
	}
	static void quot(double a, double b, double c, double d){
		double quot = (a * d) / (b * c);
		System.out.println("The quotient when one is divided by the other is " + quot);
	}
	static int hcf(int a, int b){
		int temp1 = a;
      		int temp2 = b;

      		while(temp2 != 0){
         		int temp = temp2;
         		temp2 = temp1%temp2;
         		temp1 = temp;
      		}
      		int hcf = temp1;
      		return hcf;
	}
	static void prod2(int a, int b, int c, int d){
		int den = (b * d) / hcf((a * c), (b * d));
		int num = (a * c) / hcf((a * c), (b * d));
		System.out.print(num + "/" + den + "\t");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter the numerator of the first fraction: ");
		int a = sc.nextInt();
		System.out.println("Enter the denominator of the first fraction: ");
		int b = sc.nextInt();
		System.out.println("Enter the numerator of the second fraction: ");
		int c = sc.nextInt();
		System.out.println("Enter the denominator of the second fraction: ");
		int d = sc.nextInt();
		sum(a, b, c, d);
		diff(a, b, c, d);
		prod(a, b, c, d);
		quot(a, b, c, d);*/
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.println("-------------------------------------");
		for(int i = 1; i < n; i ++){
			for(int j = 1; j < n; j ++){
				prod2(i, n, j, n);
			}
			System.out.println("\n");
		}
		
	}
}
