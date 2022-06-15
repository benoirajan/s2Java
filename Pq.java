//Java program to demonstrate working of comparator based priority queue constructor

import java.util.*;

public class Pq {

    public static void main(String args[]) {

        PriorityQueue<Student> pq = new PriorityQueue<Student>(new StudentComparator());

        String s = "";
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ender Student name cgpa press d when done");
        while(!(s=sc.next()).equals("d"))
            pq.add(new Student(s, sc.nextFloat()));

        System.out.println("Students priority queue");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return (int)(100*(s2.cgpa-s1.cgpa));
    }
}

class Student {
    public String name;
    public double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String toString() {
        return this.name + " " + this.cgpa;
    }
}

/** 
Ender Student name cgpa press d when done
Gokul 8.5
Tom 7.0
Athul 7.5
d
Students priority queue
Gokul 8.5
Athul 7.5
Tom 7.0
*/ 