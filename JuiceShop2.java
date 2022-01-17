package chennai;
public class JuiceShop2 extends JuiceShop
{
String name = "Dhiyan";//overriden field
public static void main(String[] args)
{
JuiceShop2 sk = new JuiceShop2();
sk.register();
System.out.println(sk.name);
}
public void register()//overriden method
{
System.out.println("branch 2 registered");
}
}
