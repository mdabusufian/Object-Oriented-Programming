class Shape
{
	int a;
	int b;
	public void calculateArea()
	{}
	
}

class Triangle extends Shape
{
	void setA(int a)
	{
		this.a=a;
	}
	void setB(int b)
	{
		this.b=b;
	}
	public void calculateArea()
	{
		System.out.println((a*b*0.5));
	}
}

class Rectangle extends Shape
{
	void setA(int a)
	{
		this.a=a;
	}
	void setB(int b)
	{
		this.b=b;
	}
	public void calculateArea()
	{
		System.out.println((a*b));
	}
}

class Square extends Rectangle
{
	public void calculateArea()
	{
		System.out.println((a*a));
	}
	
}

class Start
{
	public static void main(String args[])
	{
		Triangle tri =new Triangle();
		Triangle tri1 =new Triangle();
		Rectangle rec =new Rectangle();
		Rectangle rec1 =new Rectangle();
		Square sqr =new Square();
		Square sqr1 =new Square();
		
		tri.setA(111);
		tri.setB(222);
		tri1.setA(333);
		tri1.setB(444);
		
		rec.setA(555);
		rec.setB(666);
		rec1.setA(777);
		rec1.setB(888);
		
		sqr.setA(999);
		sqr1.setA(1010);
		
		System.out.print("AREA OF FIRST TRIANGLE : ");
		tri.calculateArea();
		
		System.out.println("AREA OF SECOND TRIANGLE : ");
		tri1.calculateArea();
		
		System.out.println("AREA OF FIRST RECTANGLE : ");
		rec.calculateArea();
		
		System.out.println("AREA OF SECOND RECTANGLE : ");
		rec1.calculateArea();
		
		System.out.println("AREA OF FIRST SQUARE : ");
		sqr.calculateArea();
		
		System.out.println("AREA OF SECOND SQUARE : ");
		sqr1.calculateArea();
	}
}
