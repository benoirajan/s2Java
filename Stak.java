import java.util.*;

public class Stak {
	public static void main(String args[]) {
		Stack<Integer> stk = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("1:Push 2:Pop 3:Display");
        int ch = 1;
		while (0<ch&&ch<4){
            System.out.print(">");
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					System.out.print("Enter element: ");
					stk.push(sc.nextInt());
					break;
				case 2:
					if (stk.isEmpty())
						System.out.println("Stack is empty!");
					else {
						System.out.println("Element poped : " + stk.pop());
					}
					break;
				case 3:
					if (stk.isEmpty())
						System.out.println("Stack is empty!");
					else
						System.out.println("Stack elements : " + stk);
			}
		}
	}
}

/*
1:Push 2:Pop 3:Display
>1
Enter element: 1
>1
Enter element: 2
>1
Enter element: 3
>3
Stack elements : [1, 2, 3]
>2
Element poped : 3
>3
Stack elements : [1, 2]
>4
*/ 