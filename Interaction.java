package myRep;

import java.util.Scanner;


public class Interaction{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		try{
			Calculator calc = new Calculator(); 
			
			int x, y;
			String exit = "yes";
			char o;
			while(exit.equals("yes")){
				x = getOperand(calc);
				calc.setOperand1(x);
				o = getOperator();
				y = getOperand(calc);
				calc.setOperand2(y);
				switch(o){
					case '+':
						calc.add();
						break;
					case '-':
						calc.sub();
						break;
					case 'x':
						calc.mult();
						break;
					case '/':
						calc.div();
						break;
				}
				System.out.println("Result: " +calc.getResult());
				System.out.println("Continue?");
				exit = input.nextLine();
			}
		
		} finally{
			input.close();
		}
		

	}

	public static  char getOperator(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter operator: ");
		String o = input.next();
		char c = o.charAt(0);
		return c;
	}

	public static int getOperand(Calculator calc){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter operand: ");
		String line = input.nextLine();
			
		if(line.equals("memory")) {
			return calc.getResult();
		}else{
			return Integer.parseInt(line);
		}
	}
}