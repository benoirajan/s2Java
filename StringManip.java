//21-5-22
import java.util.Arrays;
import java.util.Scanner;

public class StringSort{
    public static void main(String[] args){
        System.out.print("Size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Strings:");
        String[] s = new String[n];
        for(int i=0;i<n;i++)
            s[i]=sc.next();
        Arrays.sort(s,String.CASE_INSENSITIVE_ORDER);
        
        System.out.println("Sorted strings:");
        for(String i : s)
            System.out.println(i);
    }
}

/**
Size: 3
Strings:
B  
V
A
Sorted strings:
A
B
V
*/
