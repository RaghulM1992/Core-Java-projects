package korea.south;
public class Desktop extends Samsung
{
public static void main(String[] args)
{
Desktop dt = new Desktop();
dt.makeQuality();
dt.giveWarranty();
//dt.research(); //calling a private method from parent class
System.out.println(dt.pinNo);
dt.changePin();
}
}
