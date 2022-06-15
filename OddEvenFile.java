import java.io.*;

public class OddEvenFile {
	public static void main(String args[]) {
		BufferedReader br;
		try {

			OutputStream od = new FileOutputStream("odd.txt");
			OutputStream ev = new FileOutputStream("even.txt");
			br = new BufferedReader(new FileReader("nums.txt"));
            System.out.println("nums.txt");
            String s = "";
            
			while ((s = br.readLine()) != null) {
                System.out.println(s);
				if (Integer.parseInt(s) % 2 == 0)
					ev.write((s + "\n").getBytes());
				else
					od.write((s + "\n").getBytes());
			}
			ev.close();
			od.close();
            br.close();

            System.out.println("odd.txt");
            InputStream in=new FileInputStream("odd.txt");
			byte[] b=new byte[1024];
			int i=0;
			while((i=in.read(b))!=-1)
				System.out.print(new String(b,0,i));
			in.close();

            System.out.println("even.txt");
            in=new FileInputStream("even.txt");
            while((i=in.read(b))!=-1)
				System.out.print(new String(b,0,i));
			in.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}


/*
nums.txt
1
2
3
4
5
6
odd.txt
1
3
5
even.txt
2
4
6
*/ 