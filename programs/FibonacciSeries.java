class FibonacciSeries{
	public static void main(String[] args){
		int c, a=0, b=1;
		for (int i=2; i<=10; i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
			System.out.println(a);
			System.out.println(b);
	}
}