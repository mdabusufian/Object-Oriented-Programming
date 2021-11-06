 class Start

{
	public static void main(String args[])
	{
		Human h1 = new Human();
		h1.setName("Sufian");
		h1.setColor("Blue");
		h1.setHeight(5.6);
		h1.setWeight(70);
		h1.setAge(20);
		h1.setDateofbirth("30-10-1999");
		
		
		/*System.out.println("Name is    :"+h1.getName);
		System.out.println("  Color  is  :"+h1.getColor);
		System.out.println("  Height is  :"+h1.getHeight);
		System.out.println("  Weight is  :"+h1.getWeight);
		System.out.println("  Age is     :"+h1.getAge);
		System.out.println("  Date of birth Day is :"+h1.getDateofbirth);*/
		
		Human h2 = new Human("Sufian","Green",5.5,70,22,"30-10-1999");
		h2.showinfo();
	}
	
	
}