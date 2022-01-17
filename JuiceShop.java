package chennai;
public final class JuiceShop //final class
{
String name = "Raghul"; 
public static void main(String[] args)
{
JuiceShop sk = new JuiceShop();
sk.prepareJuice(20);
sk.prepareJuice();
sk.name = "Dhanu";
}
public void prepareJuice() //First method
{
System.out.println("without sugar");
}
public void prepareJuice(int sugar) //overloaded method
{
System.out.println(sugar);
}
public void register() //Final method
{
System.out.println("branch 1 registered");
}
}


