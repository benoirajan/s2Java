import java.io.*;
import java.util.*;


public class Exam{
	public static void main(String[] args) {
		System.out.print("Enter a String: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();

		try{
			OutputStream os=new FileOutputStream("File.txt");
			os.write(s.getBytes());
			os.close();

			InputStream in=new FileInputStream("File.txt");
			byte[] b=new byte[1024];
			int i=0;
			while((i=in.read(b))!=-1)
				System.out.print(new String(b,0,i));
			in.close();
		} catch(Exception e){}
	}
}