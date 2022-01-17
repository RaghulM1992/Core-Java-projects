class Add
{ 
	int a;
	int b;

	Add(int x,int y)// parametrized constructor 
	{
		a=x;
		b=y;
	}
	void sum(Add A1) // object  'A1' passed as parameter in function 'sum'
	{ 
		int sum1=A1.a+A1.b;
		System.out.println("Sum of a and b :"+sum1);
	}
}