import java.util.Scanner;
public class ComplexAdd{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		a+=sc.nextInt();
		b+=sc.nextInt();
		System.out.printf("%d + %di",a,b);
	}
}


/*
input
2 4    (2+4i)
5 7    (5+7i)

output
7 + 11i
*/