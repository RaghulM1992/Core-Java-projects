package hometown;
public class Neighbour //Another class within same package
{
public static void main(String[] args)
{
Parent parent = new Parent();
System.out.println(parent.name); // parrent protected variable call
parent.call(); // parrent protected method call
parent.giveSweets();
}
}

