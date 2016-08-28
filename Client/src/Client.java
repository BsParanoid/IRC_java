
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client 
{
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private String recvMessage;
    
    void launch()
    {
    	try 
    	{		
    	    socket = new Socket(InetAddress.getLocalHost(),6667);	
    	    System.out.println("Waiting for server accpt connection");
    	    catchMessageToString();
    	    sendMessage("Hi server this is a client");
    	    while (socket != null);
//    	    socket.close();
    	}
    	catch(UnknownHostException e)
    	{	
    	    e.printStackTrace();
    	}
    	catch(IOException e) 
    	{		
    	    e.printStackTrace();
    	}
    }
    void sendMessage(String msg) throws IOException
    {
	out = new PrintWriter(socket.getOutputStream());
	out.println(msg);
	out.flush();
    }
    String catchMessageToString() throws IOException
    {
	in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	recvMessage = in.readLine();
	System.out.println(recvMessage);
	
	return recvMessage;
    }
}