public class Addition //class declaration
{
public static void main(String[] args)
{
Addition add = new Addition(); //object creation
add.addnum(); // method calling
}
public void addnum() //method definition
{
int a = 10, b = 20;
int c = a + b;
System.out.println(c);
}

}