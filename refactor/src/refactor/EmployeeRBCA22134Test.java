package refactor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeRBCA22134Test {

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
	
	    public void testDaCalculation() {
	        // Create an instance of the Employee class
			EmployeeRBCA22134 employee = new EmployeeRBCA22134("John", "Manager", 50000);

	        // Test the calculation of DA
assertEquals(5000, employee.getDa(), 0.001); // DA should be 10% of basic salary
}


	}


