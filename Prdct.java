import java.util.*;
public class Prdct{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the product count: ");
		int n = s.nextInt();
		Product[] ps = new Product[n];
		System.out.print("Enter the Product id,price,name: ");
		for(int i=0;i<n;i++){
			ps[i]=new Product(s.nextInt(),s.nextInt(),s.next());
		}
			
		Product m=Product.getMin();
		if(m!=null)
			System.out.println("Min: "+m);
	}
}



class Product{
	public static int counter;
	private int id,price;
	public String name;
	private static Product min;
	public Product(int a,int b, String s){
		id=a;
		price=b;
		name=s;
		if(min==null)
			min=this;
		else if(min.price>price)
				min = this;
		counter++;
	}

	public static Product getMin(){
		return min;
	}

	public String toString(){
		return "id: "+id+"\nname: "+name+",\nprice: "+price;
	}
}