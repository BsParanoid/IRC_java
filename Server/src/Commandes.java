import java.io.IOException;

public class Commandes extends Server implements Cmd
{
    private String[] bsplit;
    public void callAll(String buffer)
    {
	server(buffer);
	opper(buffer);
	quit(buffer);
	squit(buffer);
	join(buffer);
	part(buffer);
	mode(buffer);
	topic(buffer);
	names(buffer);
	list(buffer);
	invite(buffer);
	kick(buffer);
	version(buffer);
	stats(buffer);
	links(buffer);
	time(buffer);
	connect(buffer);
	trace(buffer);
	admin(buffer);
	info(buffer);
	privmsg(buffer);
	notice(buffer);
	who(buffer);
	whois(buffer);
	whowas(buffer);
	kill(buffer);
	ping(buffer);
	pong(buffer);
	error(buffer);
	away(buffer);
	rehash(buffer);
	restart(buffer);
	summon(buffer);
	users(buffer);
	wallops(buffer);
	userhost(buffer);
	ison(buffer);
    }
    public boolean pass(String buffer, String[] bpass)
    {
	boolean value = false;
	
	bpass = buffer.split(" ");
	if (buffer.length() < bpass[0].length()+2)
	{
	    System.out.println("Please enter a password");
	    value = true;
	}
	else if (buffer.length() > bpass[0].length()+1)
	{
	    if (bpass[0].equals("/PASS"))
	    {
		System.out.println("commande /PASS "+bpass[1]);
		value = false;
	    }
	}
	return false;
    }
    public boolean nick(String buffer, String[] bnick)
    {
	boolean value = false;
	
	bnick = buffer.split(" ");
	if (buffer.length() < bnick[0].length()+2)
	{
	    System.out.println("Please enter a nickname");
	    value = true;
	}
	else if (buffer.length() > bnick[0].length()+1)
	{
	    if (bnick[0].equals("/NICK"))
	    {
		System.out.println("commande /NICK "+bnick[1]);
		value = false;
	    }
	    else
		value = true;
	}
	return value;
    }
    public boolean user(String buffer, String[] buser)
    {
	boolean value = false;
	
	buser = buffer.split(" ");
	if (buffer.length() < buser[0].length()+2)
	{
	    System.out.println("Please enter a user");
	    value = true;
	}
	else if (buffer.length() > buser[0].length()+1)
	{
	    if (buser[0].equals("/USER"))
	    {
		System.out.println("commande /USER "+buser[1]);
		value = false;
	    }
	    else 
		value = true;
	}
	return value;
    }
    public void server(String buffer)
    {
	if (buffer.equals("/SERVER"))
	{
	    System.out.println("commande /SERVER");
	}
    }
    public void opper(String buffer)
    {
	if (buffer.equals("/OPER"))
	{
	    System.out.println("commande /OPER");
	}
    }
    public void quit(String buffer)
    {
	if (buffer.equals("/QUIT"))
	{
	    System.out.println("commande /QUIT");
	}
    }
    public void squit(String buffer)
    {
	if (buffer.equals("/SQUIT"))
	{
	    System.out.println("commande /SQUIT");
	}
    }
    public void join(String buffer)
    {
	if (buffer.equals("/JOIN"))
	{
	    System.out.println("commande /JOIN");
	}
    }
    public void part(String buffer)
    {
	if (buffer.equals("/PART"))
	{
	    System.out.println("commande /PART");
	}
    }
    public void mode(String buffer)
    {
	if (buffer.equals("/MODE"))
	{
	    System.out.println("commande /MODE");
	}
    }
    public void topic(String buffer)
    {
	if (buffer.equals("/TOPIC"))
	{
	    System.out.println("commande /TOPIC");
	}
    }
    public void names(String buffer)
    {
	if (buffer.equals("/NAMES"))
	{
	    System.out.println("commande /NAMES");
	}
    }
    public void list(String buffer)
    {
	if (buffer.equals("/LIST"))
	{
	    System.out.println("commande /LIST");
	}
    }
    public void invite(String buffer)
    {
	if (buffer.equals("/INVITE"))
	{
	    System.out.println("commande /INVITE");
	}
    }
    public void kick(String buffer)
    {
	if (buffer.equals("/KICK"))
	{
	    System.out.println("commande /KICK");
	}
    }
    public void version(String buffer)
    {
	if (buffer.equals("/VERSION"))
	{
	    System.out.println("commande /VERSION");
	}
    }
    public void stats(String buffer)
    {
	if (buffer.equals("/STATS"))
	{
	    System.out.println("commande /STATS");
	}
    }
    public void links(String buffer)
    {
	if (buffer.equals("/LINKS"))
	{
	    System.out.println("commande /LINKS");
	}
    }
    public void time(String buffer)
    {
	if (buffer.equals("/TIME"))
	{
	    System.out.println("commande /TIME");
	}
    }
    public void connect(String buffer)
    {
	if (buffer.equals("/CONNECT"))
	{
	    System.out.println("commande /CONNECT");
	}
    }
    public void trace(String buffer)
    {
	if (buffer.equals("/TRACE"))
	{
	    System.out.println("commande /TRACE");
	}
    }
    public void admin(String buffer)
    {
	if (buffer.equals("/ADMIN"))
	{
	    System.out.println("commande /ADMIN");
	}
    }
    public void info(String buffer)
    {
	if (buffer.equals("/INFO"))
	{
	    System.out.println("commande /INFO");
	}
    }
    public void privmsg(String buffer)
    {
	if (buffer.equals("/PRIVMSG"))
	{
	    System.out.println("commande /PRIVMSG");
	}
    }
    public void notice(String buffer)
    {
	if (buffer.equals("/NOTICE"))
	{
	    System.out.println("commande /NOTICE");
	}
    }
    public void who(String buffer)
    {
	if (buffer.equals("/WHO"))
	{
	    System.out.println("commande /WHO");
	}
    }
    public void whois(String buffer)
    {
	if (buffer.equals("/WHOIS"))
	{
	    System.out.println("commande /WHOIS");
	}
    }
    public void whowas(String buffer)
    {
	if (buffer.equals("/WHOWAS"))
	{
	    System.out.println("commande /WHOWAS");
	}
    }
    public void kill(String buffer)
    {
	if (buffer.equals("/KILL"))
	{
	    System.out.println("commande /KILL");
	}
    }
    public void ping(String buffer)
    {
	if (buffer.equals("/PING"))
	{
	    System.out.println("commande /PING");
	}
    }
    public void pong(String buffer)
    {
	if (buffer.equals("/PONG"))
	{
	    System.out.println("commande /PONG");
	}
    }
    public void error(String buffer)
    {
	if (buffer.equals("/ERROR"))
	{
	    System.out.println("commande /ERROR");
	}
    }
    public void away(String buffer)
    {
	if (buffer.equals("/AWAY"))
	{
	    System.out.println("commande /AWAY");
	}
    }
    public void rehash(String buffer)
    {
	if (buffer.equals("/REHASH"))
	{
	    System.out.println("commande /REHASH");
	}
    }
    public void restart(String buffer)
    {
	if (buffer.equals("/RESTART"))
	{
	    System.out.println("commande /RESTART");
	}
    }
    public void summon(String buffer)
    {
	if (buffer.equals("/SUMMON"))
	{
	    System.out.println("commande /SUMMON");
	}
    }
    public void users(String buffer)
    {
	if (buffer.equals("/USERS"))
	{
	    System.out.println("commande /USERS");
	}
    }
    public void wallops(String buffer)
    {
	if (buffer.equals("/WALLOPS"))
	{
	    System.out.println("commande /WALLOPS");
	}
    }
    public void userhost(String buffer)
    {
	if (buffer.equals("/USERHOST"))
	{
	    System.out.println("commande /USERHOST");
	}
    }
    public void ison(String buffer)
    {
	if (buffer.equals("/ISON"))
	{
	    System.out.println("commande /ISON");
	}
    }
    @Override
    public boolean authentificationNick(String buffer)
    {
	// TODO Auto-generated method stub
	boolean untilFalseNick = true;
	boolean value = true;
	
	while (untilFalseNick)
	{
	    untilFalseNick = nick(buffer, bsplit);
	    if (untilFalseNick == false)
	    {
		value = false;
	    }
	    if (untilFalseNick == true)
	    {
		break;
	    }
	}
	return value;
    }
    @Override
    public boolean authentificationUser(String buffer)
    {
	// TODO Auto-generated method stub
	boolean untilFalseUser = true;
	boolean value = true;
	
	while (untilFalseUser)
	{
	    untilFalseUser = user(buffer, bsplit);
	    if (untilFalseUser == false)
	    {
		value = false;
	    }
	    if (untilFalseUser == true)
	    {
		break;
	    }
	}
	return value;
    }
}
