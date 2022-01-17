Public class Laptop
{
static int price; // ref variable declaration
int price2;
public static main(string[] args)
{
Laptop mouse = new Laptop()
mouse.price2 = "Raghul";
Laptop keyboard = New Laptop();
keyboard.price = 1000;
Laptop.price = 40000;
keyboard.on(); //static method
mouse.click;  //non-static / instance method
}
public static void on(int a)
{
    System.out.println("on my laptop");
}
public void click(int b)
{
    System.out.println("Click using mouse");
return b;
}
}
