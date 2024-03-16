package refactor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
		  @Test
		    public void testGetName() {
		        Person person = new Person("Alice", 25);
		        assertEquals("Alice", person.getName());
		    }

		    @Test
		    public void testGetAge() {
		        Person person = new Person("Bob", 30);
		        assertEquals(30, person.getAge());
		    }
		
		
	}


