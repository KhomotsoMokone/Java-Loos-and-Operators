import java.io.IOException;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 */

/**
 * @author MR RK MOKONE
 * @see Main class
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		for(int k =1; k<65535; k+=3)
		{
		   
			Socket socket = null;  // Creating the socket 
			try {
				 socket = new Socket("localhost", k);
	
				 
				 System.out.println("Program connected to localhost port: " + k);
				 System.out.println("Local port of the connection: " + socket.getLocalPort());
				 System.out.println("Remote port of the connection: " + k);
			
				    	
			}// catch(ConnectException e)
			//{
				//System.out.println("Could not connect to localhost port:" + k);
			//}
			catch (UnknownHostException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				System.out.println("Could not connect to localhost port:" + k);
			}finally {
				if(socket != null)
				{
					try {
						socket.close();
						//Closing the socket
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			
		}
		
		try {
			InetAddress netadress = InetAddress.getLocalHost();
			
			System.out.println("The computer ID adress is " + netadress.getHostAddress());
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
