//11, 23-5-22
import java.util.*;  
interface Shape{
    public double area();
    public double perimeter();
}
class Circle implements Shape{
    int r;
    public double area(){
        return Math.PI*r*r;
    }
    public double perimeter(){
        return 2*Math.PI*r;
    }
    Circle(int r){
        this.r=r;
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.print("Circle radius : ");
        Circle c =new Circle(s.nextInt());
        System.out.printf("area=%.2f,perimeter=%.2f\n",c.area(),c.perimeter());
        
        System.out.print("Rectangle a,b: ");
        Rectangle r =new Rectangle(s.nextInt(),s.nextInt());
        System.out.printf("area=%.2f,perimeter=%.2f",r.area(),r.perimeter());
    }
}

class Rectangle implements Shape{
    int a,b;
    Rectangle(int i,int j){
        a=i;
        b=j;
    }
	public double area(){
        return a*b;
    }
    public double perimeter(){
        return 2*(a+b);
    }
}

/**
Circle radius : 3
area=28.27,perimeter=18.85
Rectangle a,b: 3 4
area=12.00,perimeter=14.00
*/
