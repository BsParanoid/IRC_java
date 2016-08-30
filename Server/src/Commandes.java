
public class Commandes extends Server implements Cmd
{
    public void pass(String buffer)
    {
	if (buffer.equals("/PASS"))
	{
	    System.out.println("commande /PASS");
	}
    }
    void nick(String buffer)
    {
	if (buffer.equals("/NICK"))
	{
	    System.out.println("commande /NICK");
	}
    }
    void user(String buffer)
    {
	if (buffer.equals("/USER"))
	{
	    System.out.println("commande /USER");
	}
    }
    void server(String buffer)
    {
	if (buffer.equals("/SERVER"))
	{
	    System.out.println("commande /SERVER");
	}
    }
    void opper(String buffer)
    {
	if (buffer.equals("/OPER"))
	{
	    System.out.println("commande /OPER");
	}
    }
    void quit(String buffer)
    {
	if (buffer.equals("/QUIT"))
	{
	    System.out.println("commande /QUIT");
	}
    }
    void squit(String buffer)
    {
	if (buffer.equals("/SQUIT"))
	{
	    System.out.println("commande /SQUIT");
	}
    }
    void join(String buffer)
    {
	if (buffer.equals("/JOIN"))
	{
	    System.out.println("commande /JOIN");
	}
    }
    void part(String buffer)
    {
	if (buffer.equals("/PART"))
	{
	    System.out.println("commande /PART");
	}
    }
    void mode(String buffer)
    {
	if (buffer.equals("/MODE"))
	{
	    System.out.println("commande /MODE");
	}
    }
    void topic(String buffer)
    {
	if (buffer.equals("/TOPIC"))
	{
	    System.out.println("commande /TOPIC");
	}
    }
    void names(String buffer)
    {
	if (buffer.equals("/NAMES"))
	{
	    System.out.println("commande /NAMES");
	}
    }
    void list(String buffer)
    {
	if (buffer.equals("/LIST"))
	{
	    System.out.println("commande /LIST");
	}
    }
    void invite(String buffer)
    {
	if (buffer.equals("/INVITE"))
	{
	    System.out.println("commande /INVITE");
	}
    }
    void kick(String buffer)
    {
	if (buffer.equals("/KICK"))
	{
	    System.out.println("commande /KICK");
	}
    }
    void version(String buffer)
    {
	if (buffer.equals("/VERSION"))
	{
	    System.out.println("commande /VERSION");
	}
    }
    void stats(String buffer)
    {
	if (buffer.equals("/STATS"))
	{
	    System.out.println("commande /STATS");
	}
    }
    void links(String buffer)
    {
	if (buffer.equals("/LINKS"))
	{
	    System.out.println("commande /LINKS");
	}
    }
    void time(String buffer)
    {
	if (buffer.equals("/TIME"))
	{
	    System.out.println("commande /TIME");
	}
    }
    void connect(String buffer)
    {
	if (buffer.equals("/CONNECT"))
	{
	    System.out.println("commande /CONNECT");
	}
    }
    void trace(String buffer)
    {
	if (buffer.equals("/TRACE"))
	{
	    System.out.println("commande /TRACE");
	}
    }
    void admin(String buffer)
    {
	if (buffer.equals("/ADMIN"))
	{
	    System.out.println("commande /ADMIN");
	}
    }
    void info(String buffer)
    {
	if (buffer.equals("/INFO"))
	{
	    System.out.println("commande /INFO");
	}
    }
    void privmsg(String buffer)
    {
	if (buffer.equals("/PRIVMSG"))
	{
	    System.out.println("commande /PRIVMSG");
	}
    }
    void notice(String buffer)
    {
	if (buffer.equals("/NOTICE"))
	{
	    System.out.println("commande /NOTICE");
	}
    }
    void who(String buffer)
    {
	if (buffer.equals("/WHO"))
	{
	    System.out.println("commande /WHO");
	}
    }
    void whois(String buffer)
    {
	if (buffer.equals("/WHOIS"))
	{
	    System.out.println("commande /WHOIS");
	}
    }
    void whowas(String buffer)
    {
	if (buffer.equals("/WHOWAS"))
	{
	    System.out.println("commande /WHOWAS");
	}
    }
    void kill(String buffer)
    {
	if (buffer.equals("/KILL"))
	{
	    System.out.println("commande /KILL");
	}
    }
    void ping(String buffer)
    {
	if (buffer.equals("/PING"))
	{
	    System.out.println("commande /PING");
	}
    }
    void pong(String buffer)
    {
	if (buffer.equals("/PONG"))
	{
	    System.out.println("commande /PONG");
	}
    }
    void error(String buffer)
    {
	if (buffer.equals("/ERROR"))
	{
	    System.out.println("commande /ERROR");
	}
    }
    void away(String buffer)
    {
	if (buffer.equals("/AWAY"))
	{
	    System.out.println("commande /AWAY");
	}
    }
    void rehash(String buffer)
    {
	if (buffer.equals("/REHASH"))
	{
	    System.out.println("commande /REHASH");
	}
    }
    void restart(String buffer)
    {
	if (buffer.equals("/RESTART"))
	{
	    System.out.println("commande /RESTART");
	}
    }
    void summon(String buffer)
    {
	if (buffer.equals("/SUMMON"))
	{
	    System.out.println("commande /SUMMON");
	}
    }
    void users(String buffer)
    {
	if (buffer.equals("/USERS"))
	{
	    System.out.println("commande /USERS");
	}
    }
    void wallops(String buffer)
    {
	if (buffer.equals("/WALLOPS"))
	{
	    System.out.println("commande /WALLOPS");
	}
    }
    void userhost(String buffer)
    {
	if (buffer.equals("/USERHOST"))
	{
	    System.out.println("commande /USERHOST");
	}
    }
    void ison(String buffer)
    {
	if (buffer.equals("/ISON"))
	{
	    System.out.println("commande /ISON");
	}
    }
}
