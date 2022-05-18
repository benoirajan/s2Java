public class DigitSum{
	public static void main(String[] args) {
		int n = 431;
		int s = 0;
		while(n>0){
			s+=n%10;
			n/=10;
		}
		System.out.println("Sum of digits is: "+s);
	}
}