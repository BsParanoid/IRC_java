import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreadRecv implements Runnable
{
    private BufferedReader _in;
    private String _recvMessage; //= null;
    boolean vrai = true;
    
    Client client = new Client();
    
    public ThreadRecv(BufferedReader in)
    {
	// TODO Auto-generated constructor stub
	_in = in;
    }
    @Override
    public void run()
    {
	// TODO Auto-generated method stub
	try
	{
	    while (vrai)
	    {
		_recvMessage = _in.readLine();
		if (_recvMessage != null)
		{
		    System.out.println(_recvMessage);
		}
		else if (_recvMessage == null)
		{
		    vrai = false;
		}
	    }
	}
	catch (IOException e) 
	{
	    // TODO: handle exception
	    e.printStackTrace();
	}
    }
}