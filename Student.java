public class Student
{
int mark1, mark2; // fields - global variables
public static void main(String[] args)
{
Student s1 = new Student();
s1.calculateTotal(); // calling stmt
}
public void calculateTotal()
{
	int m1 = 90, m2 = 100; //local variables
	int result = m1+m2;
	System.out.println(result);
}
	
}
