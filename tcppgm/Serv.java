import java.io.*;
import java.net.*;
 
public class Serv {
 
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(6868)) {
            System.out.println("Server is listening on port " + 6868);
            while (true) {
                Socket socket = serverSocket.accept();
 
                System.out.println("New client connected");
                OutputStream os = socket.getOutputStream();
                os.write("Welcome to Server".getBytes());
                os.close();
            }
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

// Server is listening on port 6868
// New client connected
