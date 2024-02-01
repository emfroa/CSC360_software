package sayHi;

public class Person 
{
	String fname;
	String lname;
	int age;
	
	Person(String fname, String lname, int age){
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public int getAge() 
	{
		return this.age;
	}
	
	public String getFname() 
	{
		return this.fname;
	}
	
	public String getLname() 
	{
		return this.lname;
	}
	
	@Override
	public String toString() 
	{
		return "Person: " + fname + " " + lname +", "+ age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public Person makePerson(Person that) 
	{
		Person child = new Person(this.fname, that.lname, 0);
		return child;
	}
}
