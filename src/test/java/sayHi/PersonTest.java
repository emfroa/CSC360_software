package sayHi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest 
{
	Person romeo;
	Person juliet;
	Person theCoolerRomeo;
	Person Y;
	
	@BeforeEach
	void setUp() throws Exception
	{
		romeo = new Person("Romeo", "Mon", 15);
		juliet = new Person("Juliet", "Cap", 13);
		theCoolerRomeo = new Person("Cooler", "Romeo", 54);
		Y = new Person("I", "Give", 54);
	}
	
	@Test
	void test() 
	{
		assertEquals("Person: Romeo Mon, 15", romeo.toString());
		
	}
	
	@Test
	void testPerson()
	{
		assertThrows(UnderAgeException.class, () -> {
			romeo.makePerson(juliet);
		});
		
		assertThrows(UnderAgeException.class, () -> {
			theCoolerRomeo.makePerson(juliet);
		});
		
		Person child;
		try {
			child = theCoolerRomeo.makePerson(Y);
			assertEquals(theCoolerRomeo.getFname(), child.getFname());
			assertEquals(Y.getLname(), child.getLname());
			assertEquals(0, child.getAge());
			
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("");
		}
		

	}

}
