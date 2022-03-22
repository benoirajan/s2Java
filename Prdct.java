import java.util.*;
public class Prdct{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int n = 5;
		Product[] ps = new Product[n];
		for(int i=0;i<n;i++)
			ps[i]=new Product(s.nextInt(),s.nextInt(),s.next());
		Product m=Product.getMin();
		if(m!=null)
			System.out.println("Min: "+m);
	}
}



class Product{
	private int id,price;
	public String name;
	private static Product min;
	public Product(int a,int b, String s){
		id=a;
		price=b;
		name=s;
		if(min!=null && min.price>price)
				min = this;
		else min = this;
	}

	public static Product getMin(){
		return min;
	}

	public String toString(){
		return id+", name:"+name+", p:"+price;
	}
}