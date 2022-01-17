package chennai;
import hometown.Parent; //different package
public class Child extends Parent //but child of parent class
{
public static void main(String[] args)
{
Child child = new Child();
System.out.println(child.name);//Protected Variable call
child.call(); //Protected method call
//child.giveSweets();
}
}
