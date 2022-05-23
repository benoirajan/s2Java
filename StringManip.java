//6, 21-5-22
import java.util.Scanner;

public class StringManip{
    public static void main(String[] args) {
        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("concatination : " +s.concat(" Mathew"));
        System.out.println("Length = "+s.length());
        System.out.println("1'st chareacter  = "+s.charAt(0));
        System.out.println("Index of character 's': " + s.indexOf('s'));
        System.out.println("is a in it :"+s.contains("a"));
        System.out.println("is ends with e : "+s.endsWith("e"));
        System.out.println("replace a with e' : "+s.replaceAll("a","e"));
        System.out.println("lower : "+s.toLowerCase());
        System.out.println("upper : "+s.toUpperCase());
}
}

/**
Enter The String
Manu
concatination : Manu Mathew
Length = 4
1'st chareacter  = M
Index of character 's': -1
is a in it :true
is ends with e : false
replace a with e' : Menu
lower : manu
upper : MANU
*/
