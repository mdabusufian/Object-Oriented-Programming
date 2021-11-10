import java.util.Arrays;
class Shape
{
    private double a1;  
    private double a2;
    public Shape()
	{
		System.out.println("Shape Constructor Called");
	}
    public Shape(double a1,double a2)
    {
		this.a1 =a1;
        this.a2 =a2;
    }
    
	public double area()
	{
		return a1*a2;
	}
}
class Circle extends Shape
{ 
	private double radius;
    public Circle()
	{
		System.out.println("CIRCLE CONSTRUCTOR CALLED");
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		return (3.14156*radius*radius);
	}
}


class Rectangle extends Shape
{
    private double length;
	private double width;
	
	public Rectangle()
	{
		System.out.println("RECTANGLE CONSTRUCTOR CALLED");
	}
	public Rectangle(double length,double width)
	{
		this.length = length;
		this.width = width;
	}
	public double area()
	{
		return (length*width);
	}
}
class Triangle extends Shape
{ 
    private double base;
	private double height;
	
	public Triangle()
	{
		System.out.println("TRIANGLE CONSTRUCTOR CALLED");
	}
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	public double area()
	{
		return ((base*height)/2);
	}
}


public class Polymorphism
{
    public static void main(String[] args)
    {
		Shape[] shape = new Shape[3];
		
		shape[0] = new Circle(2.2);
		shape[1] = new Rectangle(3.3,4.4);
		shape[2] = new Triangle(5.5,6.6);
		
		System.out.println("Circle Area    : "+shape[0].area());
		System.out.println("Rectangle Area : "+shape[1].area());
		System.out.println("Triangle Area  : "+shape[2].area());
    }
}