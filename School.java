public class School
{
static int a = 100;
public static void main(String[] args)
{
  byte b = 126; 
  System.out.println(b); 
School st1 = new School(); // dynamic 
School st2 = new School(); 
st2.buySnacks(10); //Passing values as arguments
st1.takeAnswerSheet(); //Represents School

}
public void buySnacks(int purse)
{
  System.out.println("Buying Snacks"); 
  System.out.println(purse); 
}
public void takeAnswerSheet()
{
System.out.println(School.a); 
}

}
