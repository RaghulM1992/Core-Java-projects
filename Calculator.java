public class Calculator
{
public static void main(String[] args)
{
Calculator calc = new Calculator();
int output = calc.add(); // The value of result will be saved here
System.out.println(output);
calc.subtract(output,5);
}
public int add() //method definition
{
	int no1=10, no2=20;
	int result = no1+no2;
	//System.out.println(result);
	return result; 
}
public void subtract(float no1, int no2)
{
    System.out.println(no1 - no2);
    

}
}
