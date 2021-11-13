class Person
{
	String name=" ";
	String email=" @aiub.edu";
	Person()
	{

	}
	void showPerson()
	{
    System.out.println("Printing person.......");
	System.out.println("Name :"+name);
	System.out.println("Email id="+email);
}
}
class Student extends Person
{
	private String studentid;
	private String admissionDate;
	Student()
	{

	}
	Student(String studentid, String admissionDate)
	{
		this.studentid=studentid;
		this.admissionDate=admissionDate;
	}
	public void setStudentid(String studentid){this.studentid=studentid;}
	public String getStudentid(){return studentid;}
	public void setAdmissiondate(String admissionDate){this.admissionDate=admissionDate;}
	public String getAdmissiondate(){return admissionDate;}

	void showStudent()
	{
		System.out.println("Printing Student......");
		System.out.println("Id = "+studentid);
		System.out.println("Admission Date ="+admissionDate);
		System.out.println("Name = "+name);
		System.out.println("Email="+email);
	}
	
	
}
class Teacher extends Person
{
	private String employeeID;
	private String joiningDate;
	
	Teacher()
	{

	}
	Teacher(String employeeID,String joiningDate)
	{
		this.employeeID=employeeID;
		this.joiningDate=joiningDate;
	}
	public void setEmployeeId(String employeeID){this.employeeID=employeeID;}
	public String getEmployeeId(){return employeeID;}
	public void setJoiningDate(String joiningDate){this.joiningDate=joiningDate;}
	public String getJoiningDate(){return joiningDate;}
    void showTeacher()
    {
    	System.out.println("Teacher info......");
		System.out.println("ID = "+employeeID);
		System.out.println("JoiningDate Date ="+joiningDate);
		System.out.println("Name = "+name);
		System.out.println("Email="+email);
    }
	}


public class Encapsulation
{
	public static void main(String[]args)
{
    Person p=new Person();
    Student s=new Student(" ","13/01/2015");
    Teacher t=new Teacher("41-74564-2","21/05/2001");
    p.showPerson();
    s.showStudent();
    t.showTeacher();
    

}
}