public class Stati{
	public static void main(String[] ar){
		new Parent.Child().display();
	}
}

class Parent{
	void print(Object a){
		System.out.println(a);
	}
	static class Child{
		void display(){
			print("This is Child function");
		}
	}

}