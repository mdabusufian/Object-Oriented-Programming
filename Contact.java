class Contact
{
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender;
	public Contact ()
	{}
	public Contact (String personName,String personId,int age,String mobileNumber,char gender)
	{
		this.personName=personName;
		this.personId=personId;
		this.age=age;
		this.mobileNumber=mobileNumber;
		this.gender=gender;
	}
	void setPersonName(String personName)
	{
		this.personName=personName;
	}
	void setPersonId(String personId)
	{
		this.personId=personId;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber=mobileNumber;
	}
	void setGender(char gender)
	{
		this.gender=gender;
	}
	String getPersonName()
	{
		return this.personName;
	}
	String getPersonId()
	{
		return this.personId;
	}
	int getAge()
	{
		return this.age;
	}
	String getMobileNumber()
	{
		return this.mobileNumber;
	}
	char getGender()
	{
		return this.gender;
	} 
	void showPersonInfo()
	{
		System.out.println("Person Name: "+personName);
		System.out.println("Person Id: "+personId);
		System.out.println("Age: "+age);
		System.out.println("Mobile Number: "+mobileNumber);
		System.out.println("Gender: "+gender);
	}
	void detectMobileOperator()
	{
		String obj=mobileNumber;
		char ch1=obj.charAt(0);
		char ch2=obj.charAt(1); 
		char ch3=obj.charAt(2);
		if(ch1 =='0'&&ch2=='1'&&ch3=='7')
		{
			System.out.println(obj+": Grameenphone");
		}
			else if(ch1 =='0'&&ch2=='1'&&ch3=='8')
		{
			System.out.println(obj+": Robi");
		}
		else if(ch1 =='0'&&ch2=='1'&&ch3=='9')
		{
			System.out.println(obj+": Banglalink");
		}
		else
		{
			System.out.println("invalid");
		}
	}
	
}
class Mobile
{
	public String mobileOwnername;
	public String mobileNumber;
	public String mobileBalance;
	public String mobileOSName;
	public boolean lock;
	
	public Mobile()
	{}
	public Mobile(String mobileOwnername,String mobileNumber,String mobileBalance,String mobileOSName,boolean lock)
	{
		this.mobileOwnername=mobileOwnername;
		this.mobileNumber=mobileNumber;
		this.mobileBalance=mobileBalance;
		this.mobileOSName=mobileOSName;
		this.lock=lock;
	}
	void showInfo(){
		System.out.println("Mobile Owner Name:    "+mobileOwnername);
		System.out.println("Mobile Number    :    "+mobileNumber);
		System.out.println("Mobile Balance   :    "+mobileBalance);
		System.out.println("Mobile OS Name   :    "+mobileOSName);
		System.out.println("lock             :    "+lock);
	}
	void recharge(int ammount)
	{
		System.out.println("You have Rechraged :"+ammount);
	}
	void callSomeone(int timeDuration){
		int cost = (timeDuration/60)*1.25;
		System.out.println("Cost is: "+cost);
	}
	
}

class AddressBook extends Contact
{
	public String ownerName;
	public String info;
	public int totalContact;
	public AddressBook()
	{

	}
	public AddressBook(String personName,String personId,int age,String mobileNumber,char gender,String ownerName,String info,int totalContact)
	{
		super(personName,personId,age,mobileNumber,gender);
		this.ownerName=ownerName;
		this.info=info;
		this.totalContact=totalContact;
	}
	void setOwnerName(String ownerName)
	{
		this.ownerName=ownerName;
	}
	void setInfo(String info)
	{
		this.info=info;
	}
	void setTotalContact(int totalContact)
	{
		this.totalContact=totalContact;
	}
	String getOwnerName()
	{
		return this.ownerName;
	}
	String getInfo()
	{
		return this.info;
	}
	int getTotalContact()
	{
		return this.totalContact;
	}
	
	void showAllContactInfo()
	{
		super.showPersonInfo();
		System.out.println("Owner Name   : "+ownerName);
		System.out.println("Info         : "+info);
		System.out.println("Total Contact: "+totalContact);
		
	}
	
	public static void main (String args [])
	{
		Contact c=new Contact("Md Abu Sufian","19-41749-3",21,"01919441248",'M');
		c.showPersonInfo();
	    c.detectMobileOperator();
		
		Mobile m1= new Mobile("Md Abu Sufian","01919441248","2 TAKA","Android", false);
	m1.showInfo();
	m1.recharge(100);
	m1.callSomeone(200);
	
	
	Contact [] listOfContact=new Contact [2];
	Contact c1= new Contact();
	c1.setPersonName("Md Abu Sufian");
	c1.setPersonId("19-41749-3");
	c1.setAge(21);
	c1.setMobileNumber("017950000");
	c1.setGender('M');
	listOfContact[0]=c1;
	for(int i=0; i<listOfContact.length; i++)
		{
			if(listOfContact[i] != null)
			{
				System.out.println("------------------");
				System.out.println(listOfContact[i].getPersonName());
				System.out.println(listOfContact[i].getPersonId());
				System.out.println(listOfContact[i].getAge());
				System.out.println(listOfContact[i].getMobileNumber());
				System.out.println(listOfContact[i].getGender());
			}
			
		}
	AddressBook a = new AddressBook("Md Abu Sufian","19-41749-3",21,"01919441248",'M');
	a.showAllContactInfo();
	
	
	}
}