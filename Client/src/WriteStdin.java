import java.io.PrintWriter;
import java.util.Scanner;

public class WriteStdin implements Runnable
{   
    private Scanner _sc;
    private String _message;
    private PrintWriter _out;
    
    public WriteStdin(PrintWriter out)
    {
	// TODO Auto-generated constructor stub
	_out = out;
    }
    @Override
    public void run()
    {
	// TODO Auto-generated method stub
	_sc = new Scanner(System.in);
	  
	  while (true)
	  {
	      System.out.println("Votre message :");
	      _message = _sc.nextLine();
	      _out.println(_message);
	      _out.flush();
	  }
    }
}
