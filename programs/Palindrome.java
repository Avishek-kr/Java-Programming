class Palindrome{
	public static void main(String[] args){
		int no=465;
		int temp=no; //storing the number in another variable so we will use it while comparing the two variable.
		int rev=0, rem;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev){
			System.out.println(no + " Number is Palindrome");
		}else{
			System.out.println(no + " Number is Not Palindrome");
		}
	}
}