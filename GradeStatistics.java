  import java.util.*;

class GradeStatistics{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++){
			System.out.println("Enter the marks of student " + i + 1);
			arr[i] = sc.nextInt();
		}
		float min = arr[0], max = 0.00f, avg = 0.00f;
		float std = 0.00f;
		for(int i = 0; i < n - 1; i ++){
			for(int j = i + 1; j < n; j ++){
				if (arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			} 
		}
		for(int i = 0; i < n; i ++){
			if(arr[i] > max){
				max = arr[i];
			}
			else if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("The minimum is: " + min + " and the maximum is: " + max);
		if(n % 2 == 0){
			System.out.println("The middle elements are: " + arr[n / 2 - 1] + " and " + arr[n / 2]);
		}
		else{
			System.out.println("The middle element is: " + arr[n / 2]);
		}
		float sum = 0.00f;
		for(int i = 0; i < n; i ++){
			sum = sum + arr[i];
		}
		avg = sum / n;
		System.out.println("The Average is: " + avg);
		for(int i = 0; i < n; i ++){
			std = std + (float)(((Math.pow((arr[i] - avg), 2)/n)));
		}
		std = (float)Math.sqrt(std);
		std = (float)Math.round(std * 100)/100;
		System.out.println("The standard deviation is: " + std);
	}
}
