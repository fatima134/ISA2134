package refactor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DogTest {

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
	public void test() {
		 Dog dog1 = new Dog("Buddy", "Labrador");
	        Dog dog2 = new Dog("Max", "German Shepherd");

	        // Set attributes using setter methods
	        dog1.setName("Buddy Jr.");
	        dog2.setBreed("Golden Retriever");

	        // Test the updated values using getter methods
	        assertEquals("Buddy Jr.", dog1.getName());
	        assertEquals("Labrador", dog1.getBreed());

	        assertEquals("Max", dog2.getName());
	        assertEquals("Golden Retriever", dog2.getBreed());
	    }
	
		
	}


