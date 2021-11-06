class Building
{
	String name;
	String address ;
	String engineerName;
	double size;
	String ownerName;
	String PermitNo;
	String licenseNo;
	
	public Building()
	
	public Building(String n,String a,String en,double s,String o,String p,String l)
	{
		name = n;
		address = a;
		engineerName = en;
		size = s;
		ownerName = o;
		permitNo  = p;
		licenseNo = l;
	public void setName(String n){name = n;}
	public void setAddress(String a){address = a;}
	public void setEngineerName(String en){engineerName = en;}
	public void setSize(double s){size = s;}
	public void setOwnerName(String o){ownerName = o;}
	public void setPermitNo(String p){PermitNo = p;}
	public void setlicenseNo(String l){licenseNo = l;}
	public String getName(){return name;}
	public String getAddress(){return address;}
	public String getEngineerName(){return EngineerName;}
	public double getSize(){return size;}
	public String getOwnerName(){return ownerName;}
	public double getPermitNo(){return PermitNo;}
	public double getlicenseNo(){return licenseNo;}
	public void showinfo()
	{
		System.out.println("  Name is    :"+b1.getName);
		System.out.println("  Addrss  is  :"+b1.getAddress);
		System.out.println("  Engineer name is   :"+b1.getEngineerName);
		System.out.println("  Size is  :"+b1.getSize);
		System.out.println("  Owner Name is     :"+b1.getOwnerName);
		System.out.println("  Permit No is  :"+b1.getPermitNo);
		System.out.println("  license No is  :"+b1.getlicenseNo);
		
	}


	
}