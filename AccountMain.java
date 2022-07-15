import java.util.*;
abstract class Account{
	String name;
	int balance;
	int acc_no;
	abstract void deposit(int depo) throws NegativeAmountException;
	abstract void withdraw(int with) throws InsufficientAmountException, NegativeAmountException;
	abstract void display();
}

class Saving_Account extends Account{
	double rate;
	int minBalance = 10000;
	void addInterest(double r, int b){
		rate = r;
		balance = b + (b * (r / 100));
	}
	void transfer(int tran) throws NegativeAmountException, InsufficientAmountException{
		if(tran < 0){
			throw new NegativeAmountException("RETARD!");
		}
		else if(balance - tran > minBalance){
			balance -= tran;
			System.out.println("Succesfully transfered.");
		}
		else{
			throw new InsufficientAmountException("POOR!");
		}
		System.out.println("The balance after the transfer is " + balance);
	}
	void deposit(int depo) throws NegativeAmountException{
		if(depo < 0){
			throw new NegativeAmountException("RETARD!");
		}
		else{
			balance += depo;
			System.out.println("The balance after the deposition is- " + balance);
		}
	}
	void withdraw(int with) throws InsufficientAmountException, NegativeAmountException{
		if(with < 0){
			throw new NegativeAmountException("RETARD!");
		}
		else if(balance - with > minBalance){
			System.out.println("The balance after the withdrawal is- " + balance);
		}
		else{
			throw new InsufficientAmountException("POOR!");
		}
	}
	void display(){
		System.out.println("The current balance is- " + balance);
	}
}

class NegativeAmountException extends Exception{
	NegativeAmountException(String s){
		System.out.println(s);
	}
}

class InsufficientAmountException extends Exception{
	InsufficientAmountException(String s){
		System.out.println(s);
	}
}

class AccountMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Saving_Account a = new Saving_Account();
		System.out.println("Enter the initial balance- ");
		int b = sc.nextInt();
		System.out.println("Enter the rate of interest- ");
		double r = sc.nextDouble();
		a.addInterest(r, b);
		System.out.println("Enter the amount you want to deposit");
		int d = sc.nextInt();
		try{
			a.deposit(d);
		}
		catch(NegativeAmountException e){
			e.getMessage();
		}
		System.out.println("Enter the amount you want to withdraw- ");
		int w = sc.nextInt();
		try{
			a.withdraw(w);
		}
		catch(InsufficientAmountException | NegativeAmountException e){
			e.getMessage();
		}
		System.out.println("Enter amount you want to transfer- ");
		int t = sc.nextInt();
		try{
			a.transfer(t);
		}
		catch(InsufficientAmountException | NegativeAmountException e){
			e.getMessage();
		}
		a.display();
	}
}
