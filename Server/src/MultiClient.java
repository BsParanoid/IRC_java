import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClient implements Runnable
{
    private Socket _socketServer;
    private int _nbrclient;
    private ServerSocket _socketServerInstance;
    
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
    	       _socketServer.close();
    	   }
	}
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
    }
}