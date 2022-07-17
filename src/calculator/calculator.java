package calculator;
import java.util.Scanner;

class calculator{
	final double n1,n2;
	static double n;
	static char opr;
	calculator(double n1 , double n2){
		this.n1 = n1;
		this.n2 = n2;		
	}
	double addition() {
		return n1+n2;		
	}
	
	double substraction() {
		return n1-n2;
	}
	
	double multiplication() {
		return n1*n2;
	}
	
	double division() {
		return n1/n2;
	}
	
	public static class cal{
		public static void main (String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please Enter first number : ");
			double n1 = input.nextDouble();
			
			System.out.println("Please Enter second number : ");
			double n2 = input.nextDouble();
			
			System.out.println("Please Select the operaion (+ , - , * , /) ");
			opr = input.next().charAt(0);
			
			input.close();
			
			calculator cl = new calculator(n1,n2);
			switch(opr) {
			case '+':
				n=cl.addition();
				System.out.println("Your Answer = " +n);
				break;
				
			case '-':
				n=cl.substraction();
				System.out.println("Your Answer = " +n);
				break;
				
			case '*':
				n=cl.multiplication();
				System.out.println("Your Answer = " +n);
				break;
				
			case '/':
				if(n2 !=0) {
					n=cl.division();
					System.out.println("Your Answer = " +n);
				}
				else {
					System.out.println("Division cant be performed as second number cant be zero");
					
				}
				break;
				
				default:
					System.out.println("Invalid Operation, Please try again...");
				
				
				}	
					
		}
	}
}