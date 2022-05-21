class PrimeArm{
    public static int length(int n){
        if(n == 0)
            return 0;
        else
            return 1 + length(n/10);
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=n - 1;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean isArmstrong(int n){
        int sum=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit, length(n));
            temp/=10;
        }
        return sum==n;
    }
    public static void main(String[] args){
        for(int i = 0; i < 100; i ++) {
            if (isPrime(i) && isArmstrong(i)) {
                System.out.println("*" + i + "#");
            }
            else if (isPrime(i)) {
                System.out.println("*" + i);
            }
            else if (isArmstrong(i)) {
                System.out.println("#" + i);
            }
            else{
                System.out.println(i);
            }
        }
    }
}