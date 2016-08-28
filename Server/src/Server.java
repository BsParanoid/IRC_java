
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
    private InetAddress localAddress;
    private InetAddress serverAddress;
    private ServerSocket socketServerInstance;
    private Socket socketServer;
    private BufferedReader in;
    private PrintWriter out;
    private String recvMessage;
    
    Server(String statut)
    {
	System.out.println("Récup des adress local et serveur " + statut);
    }
    void getAddr()
    {
	try 
	{
	    localAddress = InetAddress.getLocalHost();
	    System.out.println("L'adresse locale est : "+localAddress); 
	    
	    serverAddress = InetAddress.getByName("www.siteduzero.com");
	    System.out.println("L'adresse du serveur du site du zéro est : "+serverAddress);
	}
	catch(UnknownHostException e) 
	{	
	    e.printStackTrace();
	}
    }
    void launchServer()
    {
	try
	{
	    socketServerInstance = new ServerSocket(6667);
	    System.out.println("Server is running listening on port ->  "+socketServerInstance.getLocalPort());
	    socketServer = socketServerInstance.accept();
	    System.out.println("A client just connected ");
	    sendMessage("You are connected on the server using port -> " +socketServerInstance.getLocalPort());
	    catchMessageToString();
	    while(socketServer != null);
//	    socketServerInstance.close();
//	    socketServer.close();
	}
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
    }
    void sendMessage(String msg) throws IOException
    {
	out = new PrintWriter(socketServer.getOutputStream());
	out.println(msg);
	out.flush();
    }
    String catchMessageToString() throws IOException
    {
	in = new BufferedReader(new InputStreamReader(socketServer.getInputStream()));
	recvMessage = in.readLine();
	System.out.println(recvMessage);
	
	return recvMessage;
    }
}