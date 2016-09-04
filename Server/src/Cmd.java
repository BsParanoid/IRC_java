import java.io.IOException;

public interface Cmd
{
    public boolean authentificationNick(String buffer);
    public boolean authentificationUser(String buffer);
    public void callAll(String buffer);
    public boolean pass(String buffer, String[] bpass);
    public boolean nick(String buffer, String[] bnick);
    public boolean user(String buffer, String[] buser);
    public void server(String buffer);
    public void opper(String buffer);
    public void quit(String buffer);
    public void squit(String buffer);
    public void join(String buffer);
    public void part(String buffer);
    public void mode(String buffer);
    public void topic(String buffer);
    public void names(String buffer);
    public void list(String buffer);
    public void invite(String buffer);
    public void kick(String buffer);
    public void version(String buffer);
    public void stats(String buffer);
    public void links(String buffer);
    public void time(String buffer);
    public void connect(String buffer);
    public void trace(String buffer);
    public void admin(String buffer);
    public void info(String buffer);
    public void privmsg(String buffer);
    public void notice(String buffer);
    public void who(String buffer);
    public void whois(String buffer);
    public void whowas(String buffer);
    public void kill(String buffer);
    public void ping(String buffer);
    public void pong(String buffer);
    public void error(String buffer);
    public void away(String buffer);
    public void rehash(String buffer);
    public void restart(String buffer);
    public void summon(String buffer);
    public void users(String buffer);
    public void wallops(String buffer);
    public void userhost(String buffer);
    public void ison(String buffer);
}
