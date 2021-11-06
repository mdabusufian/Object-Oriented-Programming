class Car
{
	String name;
	String color ;
	String model;
	double yearofUse;
	String ownerName;
	
	public Car()
	
	public Car(String n,String c,String m,double y,String o)
	{
		name = n;
		color = c;
		model = m;
		yearofUse = y;
		ownerName = o;
	public void setName(String n){name = n;}
	public void setColor(String c){color = c;}
	public void setModel(String m){model = m;}
	public void setYearofUse(double y){yearofUse = y;}
	public void setOwnerName(String o){ownerName = o;}
	public String getName(){return name;}
	public String getColor(){return color;}
	public String getModel(){return model;}
	public double getYearofUse(){return yearofUse;}
	public String getOwnerName(){return ownerName;}
	public void showinfo()
	{
		System.out.println("  Name is    :"+h1.getName);
		System.out.println("  Color  is  :"+h1.getColor);
		System.out.println("  Model is   :"+h1.getModel);
		System.out.println("  Year of Use is  :"+h1.getYearofuse);
		System.out.println("  Owner Name is     :"+h1.getOwnerName);
	}


	
}