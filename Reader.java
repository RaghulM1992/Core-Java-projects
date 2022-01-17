public class Reader
{
public static void main(String[] args)
{
Library librarian = new Library();
librarian.lendBooks();
librarian.getSalary();
System.out.println(librarian.salary);
System.out.println(librarian.mFee);
}
}
