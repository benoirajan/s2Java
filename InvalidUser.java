//6, 21-5-22
import java.util.Scanner;

public class InvalidUser extends Exception{
    public static void main(String[] args) {
        System.out.println("Enter The password");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try{
            if(!s.equals("abc!@#"))
                throw new InvalidUser();
        }
        catch(Exception e){
            e.printStackTrace();
        }
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
