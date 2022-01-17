public class SuperMarket
{
static String name = "muthu"; 
static int doorNo = 1234; 
int price, discount; //object specific variables
String brand; //object specific variables
// Special Nature 
// Constructor should be with same name of our class name
// Constructors wont have return datatype
// Constructor will be called automatically when objects are created

// Constructor Overloading  - no. of arguments / order of arg.
  
public static void main(String[] args)
{
SuperMarket prod1 = new SuperMarket(100, 20, "ABCD"); // this - prod1
SuperMarket prod2 = new SuperMarket(200, 30, "BCD"); // this - prod2
SuperMarket prod3 = new SuperMarket(10, "PQR"); //this - prod3
SuperMarket prod4 = new SuperMarket("XYZ", 20);
SuperMarket prod5 = new SuperMarket();
  prod1.buy(); //this - prod1
  prod2.buy(); 
}
public void buy()
{
  System.out.println(price); 
  System.out.println(discount); 
  System.out.println(brand); 
}
  public SuperMarket(int price, int discount, String brand)
{
  System.out.println("Check"); 
  this.price = price; // price = i; 
  this.discount = discount; // this - global non-static variables
  this.brand = brand; // this refers to current object of same class
}
public SuperMarket(int price, String brand)
{
  this.price = price; 
  this.brand = brand; 
}
public SuperMarket(String brand, int price)
{
  this.price = price; 
  this.brand = brand; 
}
public SuperMarket()
{
System.out.println("Zero Arguments Constructor");   
}
}
