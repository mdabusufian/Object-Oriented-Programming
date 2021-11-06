 class Start

{
	public static void main(String args[])
	{
		Dog d1 = new Dog();
		d1.setName("Tommy");
		d1.setColor("White");
		d1.setHeight(3.2);
		d1.setWeight(15);
		
		
		/*System.out.println("Name is    :"+d1.getName);
		System.out.println("  Color  is  :"+d1.getColor);
		System.out.println("  Height is  :"+d1.getHeight);
		System.out.println("  Weight is  :"+d1.getWeight);*/
		
		Dog d2 = new Dog("Tommy","White",3.2,15);
		d2.showinfo();
	}
	
	
}