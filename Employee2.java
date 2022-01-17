package tamilnadu.madurai;
import tamilnadu.chennai.Office; //importing a package
public class Employee2
{
public static void main(String[] args)
{
Employee2 emp = new Employee2();
emp.wfh();
Office off = new Office();
System.out.println(off.travel);
off.provideSnacks();
off.provideSalary();
}

public void wfh()
{
System.out.println("working from home");
}
}
