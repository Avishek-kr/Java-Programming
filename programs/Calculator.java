import java.util.Scanner;

class Calculator{
  public static void main(String[] args) {
    
		Scanner scanner= new Scanner(System.in);

				System.out.println("Enter first no.");
				int a=scanner.nextInt();

				System.out.println("Enter second no.");
				int b=scanner.nextInt();

				String sym="+";

				switch(sym){
					case "+":
					int sum=a+b;
					System.out.println("Your sum is " + sum);
					break;
					default:
				System.out.println("nothing");
				}

			

  }
}