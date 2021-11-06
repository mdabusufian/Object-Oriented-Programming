class Cat
{
	String name;
	String color ;
	double height;
	double weight;
	
	public Cat()
	
	public Cat(String n,String c, double h,double w)
	{
		name = n;
		color = c;
		height = h;
		weight = w;
	}
	public void setName(String n){name = n;}
	public void setColor(String c){color = c;}
	public void setHeight(double h){height = h;}
	public void setWeight(double w){weight = w;}
	public String getName(){return name;}
	public String getColor(){return color;}
	public double getHeight(){return height;}
	public double getWeight(){return weight;}
	public void showinfo()
	{
		System.out.println("  Name is    :"+c1.getName);
		System.out.println("  Color  is  :"+c1.getColor);
		System.out.println("  Height is  :"+c1.getHeight);
		System.out.println("  Weight is  :"+c1.getWeight);
	}

}