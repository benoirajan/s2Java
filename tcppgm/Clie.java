import java.net.*;
import java.io.*;
 
public class Clie {
 
    public static void main(String[] args) {

 
        try (Socket socket = new Socket("localhost", 6868)) {
 
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
 
            String s = reader.readLine();
            System.out.println(s);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

// Welcome to Server