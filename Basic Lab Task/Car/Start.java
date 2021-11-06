 class Start

{
	public static void main(String args[])
	{
		Car h1 = new Car();
		c1.setName("Toyota");
		c1.setColor("Black");
		c1.setModel("Allion");
		c1.setYearofUse(10);
		c1.setOwnerName("Sufian");
		
		
		/*System.out.println(" Name is    :"+h1.getName);
		System.out.println("  Color  is  :"+h1.getColor);
		System.out.println("  Model is   :"+h1.getModel);
		System.out.println("  Year of Use is  :"+h1.getYearofuse);
		System.out.println("  Owner Name is     :"+h1.getOwnerName);*/
		
		Car c2 = new Car("Toyota","Black","Allion",10,"Sufian");
		c2.showinfo();
	}
	
	
}