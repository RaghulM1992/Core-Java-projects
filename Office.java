package tamilnadu.chennai;
//default access
public class Office
{
public int travel = 100; //default variable
public static void main(String[] args)
{
Office oa = new Office();
oa.provideSnacks();
System.out.println(oa.travel);
}
public void provideSnacks() //default method
{
System.out.println("Snacks");
}
public void provideSalary()
{
System.out.println("salary credited");
}
}
