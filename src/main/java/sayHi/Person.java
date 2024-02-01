package sayHi;

public class Person 
{
	String fname;
	String lname;
	int age;
	
	
	/**
	 * @param fname
	 * @param lname
	 * @param age
	 */
	public Person(String fname, String lname, int age) 
	{
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}


	public String getFname() 
	{
		return fname;
	}


	public void setFname(String fname) 
	{
		this.fname = fname;
	}


	public String getLname() 
	{
		return lname;
	}


	public void setLname(String lname) 
	{
		this.lname = lname;
	}


	public int getAge() 
	{
		return age;
	}


	public void setAge(int age) 
	{
		this.age = age;
	}


	@Override
	public String toString() 
	{
		return "Person: " + fname + " " + lname +", "+ age;
	}

	
	public Person makePerson(Person that) throws UnderAgeException
	{
		if(age < 18 || that.age < 18) 
		{
			throw new UnderAgeException();
		}
		
		Person child = new Person(this.fname, that.lname, 0);
		return child;
	}
	
	public static void main(String[] args) 
	{
		Person r = new Person("Romeo", "Mon", 15);
		System.out.println("R " + r);
	}
}
