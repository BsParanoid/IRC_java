import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.PasswordAuthentication;
import java.net.Socket;

public class ThreadRead implements Runnable
{
    private BufferedReader _in;
    private String _recvMessage = null;
    private boolean UntilFalse = true;
    private boolean Isthatfalse = true;
    
    protected Cmd cmd = new Commandes();
    
    public ThreadRead(BufferedReader in)
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
	    while (UntilFalse)
	    {
		_recvMessage = _in.readLine();
		if (Isthatfalse == true)
		{
		    Isthatfalse = cmd.authentification(_recvMessage);
		}
		cmd.callAll(_recvMessage);
		/*
		if (_recvMessage != null)
		{
		    System.out.println(_recvMessage);
		}
		*/
		if (_recvMessage == null)
		{
		    UntilFalse = false;
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