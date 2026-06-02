import java.io.*;
import java.net.*;

public class Q35_TCPClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader in =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter out =
                    new PrintWriter(socket.getOutputStream(), true);

            out.println("Hello from Client!");

            String serverReply = in.readLine();
            System.out.println("Server: " + serverReply);

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
