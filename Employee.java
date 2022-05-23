//8, 23-5-22
import java.util.*;  
class Employee {
    int eNo;
    String eName;
    float eSalary;

    public Employee(int id,String name,float salary){
        eNo = id;
        eName = name;
        eSalary = salary;
    }

    public String toString(){
        return String.format("%2d %2s %.2f",eNo,eName,eSalary);
    }

    public static void main(String []args){
         
        System.out.print("Enter No. of Employee : "); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee emp[] = new Employee[n];
        System.out.println("Enter no, name, salary of each : "); 
        for(int i=0;i<n;i++)
            emp[i] = new Employee(sc.nextInt(),sc.next(),sc.nextFloat());
        
        System.out.print("Search id: "); 
        int id = sc.nextInt();
        for(int i=0;i<n;i++)
            if(emp[i].eNo == id){
                System.out.println(emp[i]); 
                return;
            }
        System.out.println("Employee not found");
    }

}

/**
Enter No. of Employee : 3
Enter no, name, salary of each :
1 Athul 100000
2 Joel 20000
3 Holmes 40000
Search id: 2
 2 Joel 20000.00
*/
