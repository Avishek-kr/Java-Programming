class RecFibonacciSeries{
	static 	int c, a=0, b=1;
	public static void main(String[] args){
		System.out.print(a+" "+b);
		RecFibonacciSeries ob= new RecFibonacciSeries();
		ob.printFb(10);
	}
	void printFb(int i){
		if(i>1){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			printFb(i-1);
		}
	}
}