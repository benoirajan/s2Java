import java.util.*;

class Alist {
        public static void main(String[] a) {
                ArrayList<String> st = new ArrayList<String>();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Strings, Enter d when finished");
                String c = "a";
                while(!(c=sc.next()).equals("d"))
                    st.add(c);

                System.out.println("Total elements: "+st.size()+"\nElements:");
                for (String s : st)
                        System.out.println(s);
        }
}

/*
Enter Strings, Enter d when finished
Tom
Athul
Joel
d
Total elements: 3
Elements:
Tom
Athul
Joel
*/ 