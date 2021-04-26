import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {
    
		Scanner scanner= new Scanner(System.in);

				System.out.println("Enter Your Name");
				String name=scanner.next();

				System.out.println("Enter Your age");
				int age=scanner.nextInt();

				System.out.println("Enter Your gender");
				char gender=scanner.next().charAt(0);

				System.out.println("Enter Your phone no.");
				long phn=scanner.nextLong();


			System.out.println("name: " + name);
				System.out.println("age "+ age);
				System.out.println("gender "+ gender);
				System.out.println("phone "+ phn);

  }
}