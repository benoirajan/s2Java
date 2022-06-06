//1-6-22, WED

import java.util.*;
public class NintAvg{
	public static void main(String[] args) {
		
		System.out.print("Enter size: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		for(int i=0;i<n;){
			try{
			 	int t=sc.nextInt();
			 	if(t<0)
			 		throw new NegativeException("Only +ve is acceptable");
			 	s+=t;
			 	i++;
			}
			catch(NegativeException ne){
				System.out.println(ne);
			}
		}
		System.out.println("Avg: "+ (s/(float)n));
	}
}
class NegativeException extends Exception{
	public NegativeException(String s){
		super(s);
	}	
}

/*
Enter size: 4
5
2
-5
NegativeException: Only +ve is acceptable
4
2
Avg: 3.25
*/