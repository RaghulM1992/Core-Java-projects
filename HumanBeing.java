public class HumanBeing
{
int amount;
public static void main(String[] args)
{
HumanBeing hb1 = new HumanBeing();
hb1.amount = 1000;
hb1.getVeg(200);
HumanBeing hb2 = new HumanBeing();
hb2.amount = 100000;
hb2.getVeg(300);
}
public void getVeg(int amount)
{
System.out.println(this.amount); //refers to non-static global variable
System.out.println(amount); // local variable
}
}

