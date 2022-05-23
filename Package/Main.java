import graphics.*;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        System.out.println("Enter 2 no.s: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt();
        System.out.printf("Rectangle(%d,%d)=%d\n",a,b,Rectangle.area(a,b));
        System.out.printf("Circle(%d)=%f\n",a,Circle.area(a));
        System.out.printf("Triangle(%d,%d)=%f\n",a,b,Triangle.area(a,b));
    }
}
/**
5 2
Rectangle(5,2)=10
Circle(5)=78.539816
Triangle(5,2)=5.000000
*/