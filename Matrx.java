import java.util.Scanner;
public class Matrx{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a=new int[m][n];
		for(int i = 0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		for(int i = 0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]+=sc.nextInt();
		for(int i = 0;i<m;i++){
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+"  ");
		    System.out.println();
		}
	}
}
/*
2
3

1 2 3
4 3 2

4 3 2
1 0 3

5  5  5
5  3  5
*/