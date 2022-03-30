public class Nested{
	public static void main(String[] ar){
		new Parent().new Child().display();
		new Parent().print("HI");
	}
}

class Parent{
	void print(Object a){
		System.out.println(a);
	}
	class Child{
		void display(){
			print("This is Child function");
		}
	}
}
