class Bank{
	public int get_rate_of_interest(){
		return 0;
	}
	public int withdraw_amount(int N, int amt){
		return 0;
	}
	public int getBalance(int P, int T){
		return 0;
	}
}

class SBI_Bank extends Bank{
	public int get_rate_of_interest(){
		return 8;
	}
	public int withdraw_amount(int N,int amt){
		if(N - amt > 400){
		return N-amt;
		}
		System.out.println("Not enough");
		return N;
	}
	public int getBalance(int P, int T){
		return P + (P * 8 * T)/1200;
	}
}

class ICICI_Bank extends Bank{
	public int get_rate_of_interest(){
		return 7;
	}
	public int withdraw_amount(int N,int amt){
		if(N - amt > 500){
		return N-amt;
		}
		System.out.println("Not enough");
		return N;
	}
	public int getBalance(int P, int T){
		return P + (P * 7 * T)/1200;
	}
}

class AXIS_Bank extends Bank{
	public int get_rate_of_interest(){
		return 9;
	}
	public int withdraw_amount(int N,int amt){
		if(N - amt > 600){
		return N-amt;
		}
		System.out.println("Not enough");
		return N;
	}
	public int getBalance(int P, int T){
		return P + (P * 9 * T)/1200;
	}
}

class Runner{
	public static void main(String [] args){
		int balance = 0;
		AXIS_Bank b = new AXIS_Bank();
		System.out.println("AXIS BANK-");
		balance += b.getBalance(20000,2);
		System.out.println(balance);
		balance = b.withdraw_amount(balance,150);
		System.out.println(balance);
		
		ICICI_Bank c = new ICICI_Bank();
		System.out.println("ICICI BANK");
		balance += b.getBalance(12500,2);
		System.out.println(balance);
		balance = b.withdraw_amount(balance,150);
		System.out.println(balance);
		
		SBI_Bank d = new SBI_Bank();
		System.out.println("SBI BANK");
		balance += b.getBalance(10000,2);
		System.out.println(balance);
		balance = b.withdraw_amount(balance,150);
		System.out.println(balance);
	}
	
}
