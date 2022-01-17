package chennai; // javac -d . CTSC.java


import us.CTS; 	//java chennai.CTSC
public class CTSC extends CTS
{
public String head;
public CTSC()
{
this(500);
System.out.println("Chennai CTS");
}
public CTSC(int i)
{
super(i);
System.out.println(i);
}
public static void main(String[] args)
{
CTSC emp = new CTSC();
//CTSC emp = new CTSC(5);
//emp.head = "pqrs";  
//emp.recruit(); 

}
public void recruit()
{
System.out.println(head);

System.out.println(super.head); //super class variable call

super.recruit();//super class method call
}
} 
