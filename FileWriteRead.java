import java.util.*;
import java.io.*;

public class FileWriteRead{
	public static void main(String[] args) {
		System.out.println("Enter 1 push, 2 pop");
		Scanner sc=new Scanner(System.in);
		File f = new File("data.txt");
		try{
			FileWriter myWriter = new FileWriter(f);
			myWriter.write("Hello World!");
			myWriter.close();
			Scanner myReader = new Scanner(f);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
            myReader.close();
		}
		catch(Exception e){

		}
	}
}

// Enter the product count: 3
// Enter the Product id,price,name:
// 1 100 A
// 2 80 B
// 3 300 C
// Min: id: 2
// name: B,
// price: 80