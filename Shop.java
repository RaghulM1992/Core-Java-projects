public class Shop
{
static String name = "Raghul"; //Class specific info
static int doorNo = 123; //Class specific info
int price; //Non-static or object sepcific infor
public static void main(String[] args)
{
System.out.println(Shop.name);
System.out.println(Shop.doorNo);
Shop pencil = new Shop();
Shop note = new Shop();
Shop paper = new Shop();
pencil.price = 5;
note.price = 10;
paper.price = 1;
Shop pen = new Shop();
System.out.println(pencil.price);


}
}
