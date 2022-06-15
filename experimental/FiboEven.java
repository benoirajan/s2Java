//1-6-22, WED

import java.util.*;
public class FiboEven implements Runnable{
	public int range;
	public FiboEven(int r){
		range=r;
	}
	public static void main(String[] args) {
		
		System.out.print("Enter range: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		new Thread(new FiboEven(n)).start();
		new Thread(new Even(n)).start();

	}

	public void run(){
		for(int i=0,f=0,s=1,t;i<range;i++){
			if(i<1)
				t=f;
			else if(i<2)t=s;
			else t = f+s;
			System.out.println("f:"+t);
			if(i>1){
				f=s;
				s=t;
			}
		}
	}

}
class Even implements Runnable{
	public int range;
	public Even(int r){
		range=r;
	}
	public void run(){
		for(int i=0;i<range;i++){
			System.out.println("e:"+i*2);
		}
	}
}

/*
Enter range: 5
f:0
f:1
f:1
f:2
f:3
e:0
e:2
e:4
e:6
e:8

*/