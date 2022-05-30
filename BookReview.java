import java.util.*;

class Arrays{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int[][] a = new int [3][100];
		double[] b = new double[3];
		for(int i = 0; i < 3; i ++){
			System.out.print("Enter the number of reviewers for book " + (i + 1) + ": ");
			double n = sc.nextInt();
			double sum = 0;
			for(int j = 0; j < n; j ++){
				System.out.println("Enter the review of user " + (j + 1) + ": ");
				a[i][j] = sc.nextInt();
				sum += a[i][j];
			}
			double avg = sum / n;
			b[i] = avg;
		}
		double max = 0;
		int flag = 0;
		for(int i = 0; i < 3; i ++){
			System.out.println("The average review of book " + (i + 1) + " is " + b[i]);
			if(b[i] > max){
				max = b[i];
				flag = i;
			}
		}
		System.out.println("The highest average is of Book " + (flag + 1) + " with average rating " + max);
	}
}
