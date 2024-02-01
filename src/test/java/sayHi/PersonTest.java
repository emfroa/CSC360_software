package sayHi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest 
{
	Person romeo;
	Person juliet;
	
	@BeforeEach
	void setUp() throws Exception
	{
		romeo = new Person("Romeo", "Mon", 15);
		juliet = new Person("Juliet", "Cap", 13);
	}
	
	@Test
	void test() 
	{
		assertEquals("Person: Romeo Mon, 15", romeo.toString());
		
	}
	
	@Test
	void testPerson()
	{
		Person child = romeo.makePerson(juliet);
		assertEquals(romeo.getFname(), child.getFname());
		assertEquals(romeo.getLname(), child.getLname());
		assertEquals(0, child.getAge());

	}

}
