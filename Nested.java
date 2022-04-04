public class Nested{
	public static void main(String[] ar){
		new Parent().new Child().display();
		new Parent().print("HI");
		new Parent().inFunCls();
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

/**
 *It used for test class in a function 
 */
	public void inFunCls(){
		class InFunCls{
			public void test(){
				System.out.println("InFunCls");
			}
		}
		new InFunCls().test();
	}
}