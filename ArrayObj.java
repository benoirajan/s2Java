import java.util.Scanner;

public class ArrayObj{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Student[] sl =  new Student[10];
		for(int i=0;i<3;i++)
			sl[i]=(new Student(sc.nextInt(),sc.next()));
		for(int i=0;i<3;i++)
			System.out.println(sl[i]);
	}
}

/**
 * It is a student class 
 */
class Student{
	String name;
	int roll;
	public Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString(){
		return String.format("roll: %d, name: %s",roll,name);
	}
}
/*
for(int i=0;i<3;i++)
			sl[i]=(new Student(sc.nextInt(),sc.next()));
*/