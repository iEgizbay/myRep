public class Calculate{
	public static void main (String [] args){
		System.out.println("Calculating...");
		if(args != null){
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			char operator = args[2].charAt(0);

			switch(operator){
				case '+':
					System.out.print("Sum: ");
					System.out.println(a+b);
					break;
				case '-':
					System.out.print("Sub: ");
					System.out.println(a-b);
					break;
				case 'x':
					System.out.print("Mult: ");
					System.out.println(a*b);
					break;
				case '/':
					System.out.print("Div: ");
					System.out.println(a/b);
					break;
			}
		}
	}
}