import java.util.Scanner;

public class DigitSum{
	public static void main(String[] args) {
		System.out.print("Enter a no.: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Sum of digits is: "+sum(n));
	}

	public static int sum(int n){
		int s = 0;
		while(n>0){
			s+=n%10;
			n/=10;
		}
		return s>9?sum(s):s;
	}
}

/*
Enter a no.: 33
Sum of digits is: 6
*/