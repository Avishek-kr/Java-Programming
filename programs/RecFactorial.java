class RecFactorial {
  public static void main(String[] args) {
    int fact=1;
		int no=5, res;
		factorial f= new factorial();
		res=f.calFact(no);
		System.out.println(res); 
  }
	int calFact(int no){
if(no>1){
	fact=fact*no;
	calFact(no-1);
	return fact;
}
	}
}