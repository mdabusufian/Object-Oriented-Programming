import java.lang.*;

class Human
{
	String name;
	String color ;
	double height;
	double weight;
	double age;
	String dateofbirth;
	
	public Human()
	{
		
	}
	public Human(String n,String c, double h,double w,double a,String db)
	{
		name = n;
		color = c;
		height = h;
		weight = w;
		age = a;
		dateofbirth = db;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setColor(String c)
	{
		color = c;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	public void setWeight(double w)
	{
		weight = w;
	}
	public void setAge(double a)
	{
		age = a;
	}
	public void setDateofbirth(String db)
	{
		dateofbirth = db;
	}
	public String getName()
	{
		return name;
	}
	public String getColor()
	{
		return color;
	}
	public double getHeight()
	{
		return height;
	}
	public double getWeight()
	{
		return weight;
	}
	public double getAge()
	{
		return age;
	}
	public String getDateofbirth()
	{
		return dateofbirth;
	}
	public void showinfo()
	{
		System.out.println("Name is :"+name);
		System.out.println("Color is :"+color);
		System.out.println("Height is :"+height);
		System.out.println("Weight is :"+weight);
		System.out.println("Age is :"+age);
		System.out.println("Date of birth Day is :"+dateofbirth);
	}


	
}