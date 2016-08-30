
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
    private String _recvMessage = null;
    
    void launch()
    {
    	try 
    	{		
    	    _socket = new Socket(InetAddress.getLocalHost(),6667);
    	    System.out.println("Waiting for server accpt connection ->socket = "+_socket);
    	    _in = new BufferedReader(new InputStreamReader(_socket.getInputStream()));
    	    Thread threadRecv = new Thread(new ThreadRecv(_in));
    	    threadRecv.start();
    	    _out = new PrintWriter(_socket.getOutputStream());
    	    Thread write = new Thread(new WriteStdin(_out));
    	    write.start();
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
    String catchMessageToString(BufferedReader in) throws IOException
    {
	_recvMessage = in.readLine();
	System.out.println(_recvMessage);
	
	return _recvMessage;
    }
}