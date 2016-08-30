import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClient implements Runnable
{
    private Socket _socketServer;
    private int _nbrclient;
    private ServerSocket _socketServerInstance;
    private BufferedReader _in;
    
    Server server = new Server();
    
    MultiClient(Socket socketServer, int nbrclient, ServerSocket socketServerInstance)
    {
	// TODO Auto-generated constructor stub
	_socketServer = socketServer;
	_nbrclient = nbrclient;
	_socketServerInstance = socketServerInstance;
    }
    @Override
    public void run()
    {
	// TODO Auto-generated method stub
	try 
	{
    	   while (true)
    	   {
    	       _socketServer = _socketServerInstance.accept();
    	       server.sendMessage("Hi client ->"+_nbrclient+" "+_socketServer, _socketServer);
    	       server.sendMessage("Bonjour client XXXXXXXXXXXXXXXXXXXX"+_nbrclient+" "+_socketServer, _socketServer);
    	       server.sendMessage("3 eme msg", _socketServer);
    	       System.out.println("Client nb  "+_nbrclient+ " is connected !");
    	       _nbrclient++;
    	       _in = new BufferedReader(new InputStreamReader(_socketServer.getInputStream()));
    	       Thread read = new Thread(new ThreadRead(_in));
    	       read.start();
    	   }
	}
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
    }
}