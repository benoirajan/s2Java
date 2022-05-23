//9, 23-5-22
import java.util.*;  
class Overload {
    
    //sq
    static int area(int a){
        return a*a;
    }

    //rect
    static int area(int a ,int b){
        return a*b;
    }

    //triangle
    static float area(float a,float b){
        return .5f*a*b;
    }

    public static void main(String []args){
         
        System.out.print("square 'a': "); 
        Scanner sc = new Scanner(System.in);
        System.out.println(area(sc.nextInt()));
        System.out.print("rectangle'a b': "); 
        System.out.println(area(sc.nextInt(),sc.nextInt()));
        System.out.print("triangle 'a b': "); 
        System.out.println(area(sc.nextFloat(),sc.nextFloat()));
    }

}

/**
square 'a': 4
16
rectangle'a b': 4 3
12
triangle 'a b': 2 4
4.0
*/
