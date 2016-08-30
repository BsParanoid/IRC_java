
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.PrintWriter;


public class Server
{
    private InetAddress _localAddress;
    private BufferedReader _in;
    private PrintWriter _out;
    private String _recvMessage;
    private int _numPort = 6667;
    private int _nbrUser = 3;
    protected int _nbrclient = 1;
    protected ServerSocket _socketServerInstance;
    protected Socket _socketServer;
    
    Server(String s)
    {
	System.out.println("Récup des adress local et serveur " + s);
    }
    public Server()
    {
	// TODO Auto-generated constructor stub
    }
    void launchServer()
    {
	try
	{
	    _localAddress = InetAddress.getLocalHost();
	    _socketServerInstance = new ServerSocket(_numPort, _nbrUser, _localAddress);
	    Thread threadClient = new Thread(new MultiClient(_socketServer, _nbrclient, _socketServerInstance));
	    System.out.println("Server is running listening on port ->  "+_socketServerInstance.getLocalPort());
	    threadClient.start();
	    while(_socketServer != null);
	}
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
    }
    void sendMessage(String msg) throws IOException
    {
	_out = new PrintWriter(_socketServer.getOutputStream());
	_out.println(msg);
	_out.flush();
    }
    void sendMessage(String msg,Socket s) throws IOException
    {
	_out = new PrintWriter(s.getOutputStream());
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