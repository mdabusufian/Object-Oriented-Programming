public class Account
{
	private String accName;
	private String acid;
	private int balance;
	
	public Account()
	{}
	public Account(String accName, String acid, int balance)
	{
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}
	
	public void setAccName(String accName)
	{
		this.accName = accName;
	}
	public String getAccName()
	{
		return accName;
	}
	
	public void setAcid(String acid)
	{
		this.acid = acid;
	}
	public String getAcid(){
		return acid;
	}
	
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public int getBalance()
	{
		return balance;
	}
	
	public void deposite(int amount)
	{
		balance += amount;
		System.out.println("You have deposited BDT:  " +amount);
		System.out.println("Your new balance is BDT: " +balance);
	}
	
	public void withdraw(int amount)
	{
		if(balance>=amount+500)
		{
			balance-=amount;
			System.out.println("You have withdrawn BDT:  " +amount);
			System.out.println("Your new balance is BDT: " +balance);
		}
		else
		{
			System.out.println("Sorry. You do not have enough money.");
		}
	}
	public void showInfo()
	{
		System.out.println("Account Name: " +accName);
		System.out.println("Account ID:   "   +acid);
		System.out.println("Account balance BDT: " +balance);
	}
	
}

public class MainActivityA
{
	public static void main(String[] args){
		Account ac1 = new Account ("Farhan", "19-41749-3", 1000);
		Account ac2 = new Account ("Farhana", "19-41749-2", 2000);
		
		ac1.showInfo();
		ac1.deposite(500);
		ac1.withdraw(500);
		ac1.showInfo();
		
		ac2.showInfo();
		ac2.deposite(1000);
		ac2.withdraw(1000);
		ac2.showInfo();
	}  
}
public class Book{
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
	
	public Book(){
		
	}
	public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy){
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCopy = bookCopy;
	}
	
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	public String getBookName(){
		return bookName;
	}
	
	public void setBookAuthor(String bookAuthor){
		this.bookAuthor = bookAuthor;
	}
	public String getBookAuthor(){
		return bookAuthor;
	}
	
	public void setBookId(String bookId){
		this.bookId = bookId;
	}
	public String getBookId(){
		return bookId;
	}
	public void setBookType(String bookType){
		this.bookType = bookType;
	}
	public String getBookType(){
		return bookType;
	}
	public void setBookCopy(int bookCopy){
		this.bookCopy= bookCopy;
	}
	public int getBookCopy(){
		return bookCopy;
	}
	
	public void showInfo()
	{
		System.out.println("\nName of the book: " +bookName);
		System.out.println("Name of the author of the book: " +bookAuthor);
		System.out.println("ID of the book: " +bookId);
		System.out.println("Type of the book: " +bookType);
		System.out.println("Copy of the books: " +bookCopy);
	} 
}
public class MainActivityA
{
	public static void main(String[] args){
        Book book1 = new Book ("Himu", "Humayun Ahmed","19417493","Romantic",2);
		Book book2 = new Book ("Bristi O Meghomala", "Humayun Ahmed", "19417492","Romantic",5);
		
		book1.showInfo();
		
		book2.showInfo();
	}
}

public class Contact
{
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender;
	
	public Contact()
	{}
	public Contact(String personName, String personId, int age, String mobileNumber,char Gender){
		this.personName = personName;
		this.personId = personId;
		this.age=age;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}
	
	public void setPersonName(String personName){
		this.personName = personName;
	}
	public String getPersonName(){
		return personName;
	}
	
	public void setPersonId(String personId){
		this.personId = personId;
	}
	public String getPersonID(){
		return personId;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber = mobileNumber;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public void setGender(char gender){
		this.gender= gender;
	}
	public char getGender(){
		return gender;
	}

		
	public void showInfo()
	{
		System.out.println("Name of the Person: " +personName);
		System.out.println("Person's Id: " +personId);
		System.out.println("Age Of the person: " +age);
		System.out.println("Person's Mobile Number: " +mobileNumber);
		System.out.println("Person's Gender: " +gender);
	} 
}
public class MainActivityA{
	public static void main(String[] args)
	{
		Contact c1 = new Contact ("Sufian", "19-41749-3",19,"01555555511",'M');
		Contact c2 = new Contact ("Istiaq", "19-41749-2",19,"01345678912",'M');
		
        c1.showInfo();
		c2.showInfo();
		
	}
}
public class Mobile
{
	private String mobileOwnerName;
	private String mobileNumber;
	private int mobileBalance;
	private String mobileOSName;
	private boolean lock;
	
	public Mobile()
	{}
	public Mobile(String mobileOwnerName, String mobileNumber, int mobileBalance, String mobileOSName, boolean lock)
	{
		this.mobileOwnerName = mobileOwnerName;
		this.mobileNumber = mobileNumber;
		this.mobileBalance = mobileBalance;
		this.mobileOSName = mobileOSName;
		this.lock = lock;
	}
	
	public void setMobileOwnerName(String mobileOwnerName)
	{
		this.mobileOwnerName = mobileOwnerName;
	}
	public String getMobileOwnerName()
	{
		return mobileOwnerName;
	}
	
	public void setMobileNumber(String MobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	public String getMobileNumber()
	{
		return mobileNumber;
	}
	
	public void setMobileBalance(int mobileBalance)
	{
		this.mobileBalance = mobileBalance;
	}
	public int getMobileBalance()
	{
		return mobileBalance;
	}
	
	public void setMobileOSName(String mobileOSName)
	{
		this.mobileOSName = mobileOSName;
	}
	public String getMobileOSName()
	{
		return mobileOSName;
	}
	
	public void setLock(boolean lock)
	{
		this.lock = lock;
	}
	public boolean getLock(){
		return lock;
	}
	
	public boolean Lock(boolean L)
	{
		
		if(L == lock)
		{
			System.out.println("The phone is locked");
			return true;
		}
		else
		{
			System.out.println("The phone is not locked");
			return false;
		}
	}
	
	
	public void showInfo()
	{
		System.out.println("Mobile owner name: " +mobileOwnerName);
		System.out.println("Mobile Number: " +mobileNumber);
		System.out.println("Mobile balance: " +mobileBalance);
		System.out.println("Mobile OS name: " +mobileOSName);
		System.out.println("Lock condition of the mobile: " +lock);
	}
	
	public void recharge(int amount){
		mobileBalance += amount;
		System.out.println("Recharged BDT: " +amount);
		System.out.println("New total mobile balance: " +mobileBalance);
	}
	
	public void callSomeone(int timeDuration){
		mobileBalance -= timeDuration;
		System.out.println("Call charge BDT: " +timeDuration);
		System.out.println("Total mobile balance: " +mobileBalance);
	}
}
public class MainActivityM{
	public static void main(String[] args){
		
		Mobile m1 = new Mobile("Sufian", "01555555511", 35, "IOS", true);
		Mobile m2 = new Mobile("Istiaq", "01345678912", 40, "IOS", false);
		
		m1.showInfo();
		m1.recharge(35);
		m1.callSomeone(20);
		
		m2.showInfo();
		m2.recharge(40);
		m2.callSomeone(25);
	}
}
import java.io.*; 
  

class Book
{ 
    private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
      
    public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy){
        this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCopy = bookCopy;
	}
    public String getBookName() 
    { 
        return this.bookName; 
    } 
    public String getBookAuthor() 
    { 
        return this.bookAuthor; 
    } 	
	public String getBookId() 
    { 
        return this.bookId; 
    } 
	public String getBookType() 
    { 
        return this.bookType; 
    } 
	public int getBookCopy() 
    { 
        return this.bookCopy; 
    }
	
} 

class Library 
{ 
    private String libName;
	private String libAddress;
	int n = 3;
	Book[] books = new Book[n];
	private int totalBook;  
      
    public Library(String libName, String libAddress, int totalBook, int b){
		this.libName = libName;
		this.libAddress = libAddress;
		this.totalBook = totalBook;
		this.n = b;
	}
      
    public String getLibName() 
    { 
        return this.libName; 
    } 
    public String getLibAddress() 
    { 
        return this.libAddress; 
    } 	
	public int getTotalBook() 
    { 
        return totalBook= n; 
    } 
	public void setBook(Book b){
		for(int i = 0; i<books.length; i++){
			if(books[i] == null){
				books[i]=b;
				break;
} 
		}
	}
	
}
class Association  
{ 
    public static void main (String[] args)  
    { 
          Book book1 = new Book("Himu","Humayun Ahmed","19417493","Romantic",200); 
		  Book book2 = new Book("Bristi O Meghomala", "Humayun Ahmed", "19417492","Romantic",300);  
          Library lib1 = new Library("Pathok","Uttara",500,1000); 
		  Library lib2 = new Library("Bissow Sahitto","Uttara",300,600); 
	   
				System.out.println("Library name: " +lib1.getLibName()+""+"library");
				System.out.println("Library Address: " +lib1.getLibAddress());
				System.out.println("Total books: " +lib1.getTotalBook());
				System.out.println("Name of the book: " +book1.getBookName());
				System.out.println("Name of the book author: " +book1.getBookAuthor());
				System.out.println("ID of the book: " +book1.getBookId());
				System.out.println("Type of the book: " +book1.getBookType());
				System.out.println("Copy of the books: " +book1.getBookCopy()+"copy");	
                System.out.println("    ");
                System.out.println("Library name: " +lib2.getLibName()+""+"library");
				System.out.println("Library Address: " +lib2.getLibAddress());
				System.out.println("Total books: " +lib2.getTotalBook());
				System.out.println("Name of the book: " +book2.getBookName());
				System.out.println("Name of the book author: " +book2.getBookAuthor());
				System.out.println("ID of the book: " +book2.getBookId());
				System.out.println("Type of the book: " +book2.getBookType());
				System.out.println("Copy of the books: " +book2.getBookCopy()+"copy");	

	} 
}
import java.io.*; 

class Contact
{ 
    private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private String detect;
	private char gender;
      
    public Contact(String personName,String personId,int age,String mobileNumber,String detect,char gender){
        this.personName = personName;
		this.personId = personId;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.detect=detect;
		this.gender = gender;
	}
    public String getPersonName() 
    { 
        return this.personName; 
    } 
    public String getPersonId() 
    { 
        return this.personId; 
    } 	
	public int getAge() 
    { 
        return this.age; 
    } 
	public String getMobileNumber() 
    { 
        return this.mobileNumber; 
    } 
	public String getDetect() 
    { 
        return this.detect; 
    } 
	public char getGender() 
    { 
        return this.gender; 
    }
	
} 

class AddressBook
{ 
    private String ownerName;
	int n = 3;
	Contact[] listofContact = new Contact[n];
	private int totalContact;  
      
    public AddressBook(String ownerName,int totalContact, int b){
		this.ownerName = ownerName;
		this.totalContact = totalContact;
		this.n = b;
	}
      
    public String getOwnerName() 
    { 
        return this.ownerName; 
    }	
	public int getTotalContact() 
    { 
        return totalContact= n; 
    } 
	public void setContact(Contact b)
	{
		for(int i = 0; i<listofContact.length; i++)
		{
			if(listofContact[i] == null)
			{
				listofContact[i]=b;
				break;
			} 
		}
	}
}
class Association  
{ 
    public static void main (String[] args)  
    { 
          Contact contact1 = new Contact("Sufian","21",25,"01555555511","Teletalk",'M'); 
		  Contact contact2 = new Contact("Fardin","22",26,"01714556255","GP",'M'); 
		  Contact contact3 = new Contact("Abedin","23",27,"01955845155","Banglalink",'M'); 
		  Contact contact4 = new Contact("Sadman","24",28,"01621545555","Airtel",'M'); 
          AddressBook ab1 = new AddressBook("Sufian",150,150); 
		  AddressBook ab2 = new AddressBook("Fardin",160,160);
		  AddressBook ab3 = new AddressBook("Abedin",170,170);
		  AddressBook ab4 = new AddressBook("Sadman",180,180);
				
				System.out.println("Owner Name: " +ab1.getOwnerName());
				System.out.println("Person Name: " +contact1.getPersonName());
				System.out.println("Person ID: " +contact1.getPersonId());
				System.out.println("Person Age: " +contact1.getAge());
				System.out.println("Mobile Number: " +contact1.getMobileNumber());
				System.out.println("Operator  : " +contact1.getDetect());
				System.out.println("Person's Gender: " +contact1.getGender());
				System.out.println("Total Contact: " +ab1.getTotalContact());
				System.out.println(" ");
				
				System.out.println("Owner Name: " +ab2.getOwnerName());
				System.out.println("Person Name: " +contact2.getPersonName());
				System.out.println("Person ID: " +contact2.getPersonId());
				System.out.println("Person Age: " +contact2.getAge());
				System.out.println("Mobile Number: " +contact2.getMobileNumber());
				System.out.println("Operator  : " +contact2.getDetect());
				System.out.println("Person's Gender: " +contact2.getGender());
				System.out.println("Total Contact: " +ab2.getTotalContact());
				System.out.println(" ");
				
				System.out.println("Owner Name: " +ab3.getOwnerName());
				System.out.println("Person Name: " +contact3.getPersonName());
				System.out.println("Person ID: " +contact3.getPersonId());
				System.out.println("Person Age: " +contact3.getAge());
				System.out.println("Mobile Number: " +contact3.getMobileNumber());
				System.out.println("Operator  : " +contact3.getDetect());
				System.out.println("Person's Gender: " +contact3.getGender());
				System.out.println("Total Contact: " +ab3.getTotalContact());
				System.out.println(" ");
				
				System.out.println("Owner Name: " +ab4.getOwnerName());
				System.out.println("Person Name: " +contact4.getPersonName());
				System.out.println("Person ID: " +contact4.getPersonId());
				System.out.println("Person Age: " +contact4.getAge());
				System.out.println("Mobile Number: " +contact4.getMobileNumber());
				System.out.println("Operator  : " +contact4.getDetect());
				System.out.println("Person's Gender: " +contact4.getGender());
				System.out.println("Total Contact: " +ab4.getTotalContact());
				System.out.println(" ");	} 
}

public class Account
	{
		static Transaction transaction[] = new Transaction[100] ;
		static int totalNumberOfTransaction = 0;

		private String accName;
		private String acid;
		private int balance;
		Account (){
			accName = "Sufian";
			acid = "19-41749-3";
			balance = 250;
		}
		Account(String accName,String acid,int balance){
			accName = accName;
			acid = acid;
			balance = balance;
		}
		public void setAccName(String accName){
			this.accName = accName;
			}
		public void setAcid(String acid){
			this.acid = acid;
			}
		public void setBalance(int balance){
			this.balance = balance;
			}
		public String getAccName(){
			return accName;
			}
		public String getAcid(){
			return acid;
			}
		public int getBalance(){
			return balance;
			}

		public int deposit(int amount){
			balance += amount;
			System.out.println("After the deposit in the "+accName+" account the balance is :"+balance);
			return balance;
		}
		public int withdraw(int amount){
			if(amount > balance)
				return -1;
		
		else{
			balance -= amount;
			System.out.println("After the withdraw from the "+accName+" account the balance :"+balance);
		}
			return balance;
		}
			public void addTransaction(Account sender, Account receiver, int amount){
			transaction[totalNumberOfTransaction] = new Transaction(sender , receiver,  amount);
			totalNumberOfTransaction++;
		}
		public void showAllTransaction(){
		for(int i = 0; i<totalNumberOfTransaction; i++){
			transaction[i].showInfo();
		}
		}
		public void transfer(int amount, Account receiver){
			int x = this.withdraw(amount);
			if(x == -1) System.out.println("Insufficient balance.Try again later ");
			if(x != -1){
			addTransaction(this, receiver, amount);
			int y = receiver.deposit(amount);
			System.out.println("Final status after transfer...");
			System.out.println("Total Balance of "+this.accName+" is: "+this.balance);
			System.out.println("Total Balance of "+receiver.accName+" is: "+receiver.balance);
			}

		}
		public void showInfo(){
			System.out.println("Account Name :" + accName);
			System.out.println("Account id :" + acid);
			System.out.println("Balance :" + balance);
}}



import java.util.Scanner;

public class MainActivityT{
public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			Account sender = new Account();
			Account receiver = new Account();

			sender.setAccName("Sufian");
			sender.setAcid("S55");
			sender.setBalance(90000);
			receiver.setAccName("Mahbub");
			receiver.setAcid("M56");
			receiver.setBalance(5000);

			loop : while(true){
				System.out.println("#Press 1 for deposit \n#Press 2 for withdraw \n#Press 3 for transiction\n#Press 4 for showing info\n#Press 5 for exit...");
			int x = input.nextInt();
			switch(x){
				case 1:
					System.out.println("To which account you want to deposit? Press 1 for sender /n 2 for receiver...");
					int a = input.nextInt();
					System.out.println("What amount you want to deposit?");
					int b = input.nextInt();
					if(a == 1){
						sender.deposit(b);
					}
					else{
						receiver.deposit(b);
					}
					System.out.println();
					break;

				case 2:
					System.out.println("From which account you want to withdraw? Press 1 for sender / 2 for receiver...");
					int c = input.nextInt();
					System.out.println("What amount you want to withdraw?");
					int d = input.nextInt();
					if(c == 1){
						int e = sender.withdraw(d);
						if(e == -1) System.out.println("Insufficient balance.Try again later");
					}
					else{
						int f = receiver.withdraw(d);
						if(f == -1) System.out.println("Insufficient balance.Try again later");

					}
					System.out.println();
					break;

				case 3:
					System.out.println("From which account you want to transfer? Press 1 for sender / 2 for receiver...");
					int g = input.nextInt();
					System.out.println("What you want to transfer this amount ?");
					int h = input.nextInt();
					System.out.println();
					if(g == 1){
						sender.transfer(h,receiver);
					}
					else {
						receiver.transfer(h,sender);
					}
					System.out.println();
					break;

				case 4 :
					System.out.println("Sender account");
					sender.showInfo();
					System.out.println("receiver account");
					receiver.showInfo();
					System.out.println();
					break;
				case 5 :
					break loop;
			}
		}
			sender.showAllTransaction();
}

}





public class Transaction
{
Account sender;
Account receiver;
int amount;
Transaction()
{
sender = new Account();
receiver = new Account();
amount = 200;
}
Transaction(Account sender, Account receiver, int amount)
{
this.sender = sender;
this.receiver = receiver;
this.amount = amount;
}
public void setSender(Account sender){
	this.sender = sender;
	}
public void setReceiver(Account receiver){
	this.receiver = receiver;
	}
public void showInfo()
{
System.out.println("....Transaction history....");
System.out.println("Transacted amount :" +amount);
System.out.println("Sender Account name :" +sender.getAccName());
System.out.println("Sender Account id :" +sender.getAcid());
    System.out.println("Receiver Account name :" +receiver.getAccName());
System.out.println("Receiver Account id :" +receiver.getAcid());
System.out.println();

}
}
import java.util.Scanner;

public class MainActivityT
{
public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			Account sender = new Account();
			Account receiver = new Account();

			sender.setAccName("Sufian");
			sender.setAcid("S55");
			sender.setBalance(90000);
			receiver.setAccName("Mahbub");
			receiver.setAcid("M56");
			receiver.setBalance(5000);
			
			loop : while(true){
				System.out.println("#Press 1 for deposit \n#Press 2 for withdraw \n#Press 3 for transiction\n#Press 4 for showing info\n#Press 5 for exit...");
			int x = input.nextInt();
			switch(x){
				case 1:
					System.out.println("To which account you want to deposit? Press 1 for sender /n 2 for receiver...");
					int a = input.nextInt();
					System.out.println("What amount you want to deposit?");
					int b = input.nextInt();
					if(a == 1){
						sender.deposit(b);
					}
					else{
						receiver.deposit(b);
					}
					System.out.println();
					break;

				case 2:
					System.out.println("From which account you want to withdraw? Press 1 for sender / 2 for receiver...");
					int c = input.nextInt();
					System.out.println("What amount you want to withdraw?");
					int d = input.nextInt();
					if(c == 1){
						int e = sender.withdraw(d);
						if(e == -1) System.out.println("Insufficient balance.Try again later");
					}
					else{
						int f = receiver.withdraw(d);
						if(f == -1) System.out.println("Insufficient balance.Try again later");

					}
					System.out.println();
					break;

				case 3:
					System.out.println("From which account you want to transfer? Press 1 for sender / 2 for receiver...");
					int g = input.nextInt();
					System.out.println("What amount you want to transfer?");
					int h = input.nextInt();
					System.out.println();
					if(g == 1){
						sender.transfer(h,receiver);
					}
					else {
						receiver.transfer(h,sender);
					}
					System.out.println();
					break;

				case 4 :
					System.out.println("Sender account");
					sender.showInfo();
					System.out.println("receiver account");
					receiver.showInfo();
					System.out.println();
					break;
				case 5 :
					break loop;
			}
		}
			sender.showAllTransaction();
}

}
