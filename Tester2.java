import java.util.Scanner;

class Tester2{
	public static void main(String args[]){
		String r[] = new String[3];
		int m[] = new int[3];
		for(int i = 0; i < 3; i ++){
			System.out.println("Employee no. " + (i + 1) + ":");
			r[i] = Recruitment.printResult(Testing.takeTest(), i);
			m[i] = Testing.takeTest();
		}
	}
}

class Recruitment extends Tester2{
	public static String printResult(int result, int i){
		if((result/660)*100>=60){
			System.out.println("Employee no. " + (i + 1) + " PASSED :)");
			return "PASS";
		}
		else{
			System.out.println("Employee no. " + (i + 1) + " FAILED :(");
			return "FAIL";
		}
	}
}

class Testing extends Tester2{
	public static int takeTest(){
		String ques[]={ "What is the vision of the company?", 
			        "How long will you stay in this role?",
				"What is final method in Java?",
				"What is the latest version of Java?",
				".What did you learn about Java in last job?",
				"What do you wish to learn?",
				"What makes a team successful?",
				"Do you work faster in team or as individual?"};
		String answers[][]={{"Excellent :D","Great :)","Good :|","Satisfactory :/"},
				    {"5 years.","3 years.","2 year.","Less than 2 years."},
				    {"Assigns variable a constant value.","Executes at last.","None of the above.","All of the above."},
				    {"17","18","21","15"},
				    {"All of the above.","App development.","DSA.","none of the above."},
				    {"Data Management.","Cyber Security.","Machine Learning and Neural networks.","none of the above."},
				    {"Coordination,faith,hardwork.","None of the above."},
				    {"Team.","Individual."}};
		char input;
		int marks=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ques.length;i++){
			System.out.println((i+1)+"."+ques[i]);
			for(int j=0;j<answers[i].length;j++){
				System.out.println(answers[i][j]);
			}
			System.out.println("Input option:-");
			input=sc.next().charAt(0);
			if(i!=7 && i!=3){	
				if(input=='a' || input=='A'){
					marks+=90;
				}
				if(input=='b' || input=='B'){
					marks+=67;
				}
				if(input=='c' || input=='C'){
					marks+=45;
				}
				if(input=='d' || input=='D'){
					marks+=2;
				}	
			}
			else if(i==3){
				if(input=='a' || input=='A'){
				marks+=90;
				}
			}
			else if(i==7){
				if(input=='a' || input=='A'){
					marks+=30;
				}
				else{
					marks+=22;
				}
			}
			else if(i==6){
				if(input=='a' || input=='A'){
					marks+=30;
				}
				else{
					marks+=2;
				}
			}
		}
		return marks;
	}
	public static int generateResult(){		
		return takeTest();
	}
}
