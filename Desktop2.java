package india.south;
import korea.south.Samsung;
public class Desktop2 extends Samsung
{
public static void main(String[] args)
{
Desktop2 dt = new Desktop2();
dt.makeQuality();
dt.giveWarranty();
//dt.research(); //calling a private method from parent class
System.out.println(dt.pinNo);
dt.changePin();
}
}

