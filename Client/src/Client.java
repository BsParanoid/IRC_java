
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client 
{
    private Socket _socket;
    private BufferedReader _in;
    private PrintWriter _out;
    private String _recvMessage;
    
    void launch()
    {
    	try 
    	{		
    	    _socket = new Socket(InetAddress.getLocalHost(),6667);	
    	    System.out.println("Waiting for server accpt connection ->socket = "+_socket);
    	    catchMessageToString();
    	    while (_socket != null);
    	    _socket.close();
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
	_out = new PrintWriter(_socket.getOutputStream());
	_out.println(msg);
	_out.flush();
    }
    String catchMessageToString() throws IOException
    {
	_in = new BufferedReader(new InputStreamReader(_socket.getInputStream()));
	_recvMessage = _in.readLine();
	System.out.println(_recvMessage);
	
        return _recvMessage;
    }
}