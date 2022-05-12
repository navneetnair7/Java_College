import java.util.*;
class test{
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("The sum of the numbers are: " + (a + b));
        System.out.println("The difference between the numbers are: " + (a - b));
        System.out.println("The product of the numbers are: " + (a * b));
        System.out.println("The quotient of the numbers are: " + (a / b));
        System.out.println("The remainder of the numbers are: " + (a % b));
    }
}
