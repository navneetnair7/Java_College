import java.util.*;
class Stock{
  int n;
  int arr[];
  String name;
  public static void main(String[] args) {
        Transaction t = new Transaction();
        t.input();
        System.out.println("The maximum profit is " + t.findMaximum());
  }
  void input(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name of the stock");
      name = sc.nextLine();
      System.out.println("Enter the number of days: ");
      n = sc.nextInt();
      arr = new int[n];
      for(int i = 0; i < n; i ++){
        System.out.println("Enter the price on day " + (i + 1) + " : ");
        arr[i] = sc.nextInt();
        }
    }
}

class Transaction extends Stock{
  int findMaximum(){
  int max = 0;
  int low = arr[0];
  for(int i = 1; i < n; i ++){
      if(arr[i] < arr[i - 1]){
        max += (arr[i - 1] - low);
        low = arr[i];
      }
  }
  if(arr[n - 1] > low){
      max += (arr[n - 1] - low);
  }
   return max;
  }
}
