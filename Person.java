//10, 23-5-22
import java.util.*;  
class Person {

    Person(String n,String d){
        name=n;
        dob=d;
    }
	public String name,dob;
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter adm,name,dob,m 1-3 : ");
		Student std = new Student(s.nextInt(),s.next(),s.next(),s.nextInt(),s.nextInt(),s.nextInt());
		System.out.println("Details: adno name dob totalmark\n"+std);
    }

}

class Student extends Person{
	public int m1,m2,m3,adno;
	public Student(int adm, String s,String d,int a,int b, int c){
        super(s,d);
        adno=adm;
		m1=a;
		m2=b;
		m3=c;
	}

	public int getTotal(){
		return m1+m2+m3;
	}

    public String toString(){
        return String.format("%d %s %s %d",adno,name,dob,getTotal());
    }
}

/**
Enter adm,name,dob,m 1-3 :
123 Bibi 20-03-2000 30 20 30
Details: adno name dob totalmark
123 Bibi 20-03-2000 80
*/
