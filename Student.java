import java.util.*;
public class Student{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		Stdnt std = new Stdnt(s.nextInt(),s.nextInt(),s.nextInt(),s.next());
		System.out.println("Name: "+std.name);
		System.out.println("Total Mark: "+ std.getTotal());
	}
}



class Stdnt{
	private int m1,m2,m3;
	public String name;
	public Stdnt(int a,int b, int c, String s){
		m1=a;
		m2=b;
		m3=c;
		name=s;
	}

	public int getTotal(){
		return m1+m2+m3;
	}
}