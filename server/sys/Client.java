import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException{
		
	 int temp;
	 
	 //create a socket
	 Socket s = new Socket("127.0.0.1", 8001);
	 
	 //receive value from server
	 Scanner sc1 = new Scanner(s.getInputStream());
	 temp = sc1.nextInt();
	 
   System.out.println(temp); // print the value which is from server
		
	//s.close();   for button to close connect
	}
}
