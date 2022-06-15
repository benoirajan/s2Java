public class Tred {
	public static void main(String args[]) {
		new Fibno(5);
		new Even(5);
	}
}
class Fibno extends Thread {
	int n;

	Fibno(int n) {
        super();
		this.n = n;
        start();
	}

	public void run() {
		int f1 = 0, f2 = 1, f3;
		if (n > 3) {
			try {
				System.out.println("f : " + f1);
				System.out.println("f : " + f2);
				for (int i = 3; i <= n; i++) {
					f3 = f1 + f2;
					System.out.println("f : " + f3);
					f1 = f2;
					f2 = f3;
					Thread.sleep(500);
				}
			} catch (InterruptedException q) {}
		}
	}
}

class Even extends Thread {
	int n;

	Even(int n) {
        super();
		this.n = n;
		start();
	}

	public void run() {
		try {
			for (int i = 0; i <= n; i++) {
                System.out.println("e : " + i*2);
                Thread.sleep(500);
			}
		} catch (InterruptedException q) {}
	}
}

/*
f : 0
e : 0
f : 1
f : 1
e : 2
f : 2
e : 4
f : 3
e : 6
e : 8
e : 10
*/