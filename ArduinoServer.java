import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ArduinoServer {
    public static void main(String[] args) {
        int port = 12345; // Use the same port number as in the Arduino sketch
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter your location");
                String loc= sc.nextLine();
                System.out.println("Gathering information for nearby by buses at"+loc);
                sc.close();

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is waiting for connections...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connection from: " + clientSocket.getInetAddress());

                // Read data from Arduino
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String data = reader.readLine();
                System.out.println("Received data: " + data);

                // Send a response back to Arduino (optional)
                // PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                // writer.println("Message from server");
                
                clientSocket.close();
                serverSocket.close();
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}