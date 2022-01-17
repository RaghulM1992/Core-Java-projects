public class GroceryShop
{
static String name = "Raghul";
static int doorNo = 9999;
public static void main(String[] args)
{
GroceryShop gs = new GroceryShop();
float balance = gs.buy(100);
gs.comeBack(balance);
}

public int buy(int no1)
{
int no2 = no1/2;
return no2;
}

public void comeBack(float no1)
{
System.out.println("Balance is "+no1);
System.out.println("Name: "+GroceryShop.name);
System.out.println("doorNo: "+GroceryShop.doorNo);
}
}