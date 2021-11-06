 class Start

{
	public static void main(String args[])
	{
		Building h1 = new Building();
		b1.setName("Cosmic");
		b1.setAddrsss("army Society uttara");
		b1.setEngineer name("Sufian");
		b1.setSize(1500);
		b1.setOwnerName("NTIslam");
		b1.setPermitNo(13514);
		b1.setlicenseNo(1500);
		
		
		/*System.out.println("  Name is    :"+b1.getName);
		System.out.println("  Addrss  is  :"+b1.getAddress);
		System.out.println("  Engineer name is   :"+b1.getEngineerName);
		System.out.println("  Size is  :"+b1.getSize);
		System.out.println("  Owner Name is     :"+b1.getOwnerName);
		System.out.println("  Permit No is  :"+b1.getPermitNo);
		System.out.println("  license No is  :"+b1.getlicenseNo);*/
		
		Building b2 = new Building("Cosmic","army Society uttara","Sufian",1500,"NTIslam",13514,1500);
		b2.showinfo();
	}
	
	
}