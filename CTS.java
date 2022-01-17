package us;
public class CTS //java us.CTS
{
public String head;
public CTS()
{
System.out.println("CTS head office");
}
public CTS(int i)
{
System.out.println("From parent" + i);
}
public static void main(String[] args)
{
CTS emp = new CTS(); 
emp.head = "Abcd"; 
System.out.println(emp.head); 
}
public void recruit()
{
System.out.println("US Recruitment");
}
}
//super - instance of super class 
