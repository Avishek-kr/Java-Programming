class Swap {
  public static void main(String[] args) {
    int a=10;
		int b=20;
		int t;

			t=a;
			a=b;
			b=t;

			System.out.println("a "+ a );
				System.out.println("b "+ b );



// without 3rd variable

 int a=10, b=20;

	a=a+b;
	b=a-b;
	a=a-b;

	System.out.println("a "+ a );
				System.out.println("b "+ b );


	}
}