 class Start

{
	public static void main(String args[])
	{
		Duck d1 = new Duck();
		d1.setName("Pipi");
		d1.setColor("White");
		d1.setHeight(1.1);
		d1.setWeight(2);
		
		
		/*System.out.println("Name is    :"+d1.getName);
		System.out.println("  Color  is  :"+d1.getColor);
		System.out.println("  Height is  :"+d1.getHeight);
		System.out.println("  Weight is  :"+d1.getWeight);*/
		
		Duck d2 = new Duck("Pipi","White",1.1,2);
		d2.showinfo();
	}
	
	
}