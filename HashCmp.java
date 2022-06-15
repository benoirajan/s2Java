import java.util.*;

public class HashCmp {
  public static void main(String[] args) {
    HashSet<String> hs = get();
    HashSet<String> hs1 = get();
    //System.out.println("hs = " + hs);
    System.out.println("hs == hs1 " + hs.equals(hs1));
  } 
  public static HashSet<String> get(){
    HashSet<String> hs = new HashSet<String>();
    System.out.println("Enter Strings. Type done when done");
    String c = "a";
    Scanner sc = new Scanner(System.in);
    while(!(c=sc.next()).equals("done"))
        hs.add(c);
      return hs;
  }
}

/*
Enter Strings. Type done when done
Apple
Orange
done
Enter Strings. Type done when done
Apple
Orange
done
hs == hs1 true
*/ 