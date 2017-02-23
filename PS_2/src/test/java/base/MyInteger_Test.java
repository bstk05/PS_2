package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

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
	public void TestMyInteger() {
		
		MyInteger int1 = new MyInteger();
		boolean dExpectedodd = false;
		boolean dExpectedeven = true;
		boolean dExpectedPrime = false;
		
		assertEquals(int1.isOdd(),dExpectedodd);
		
		assertEquals(int1.isEven(),dExpectedeven);
		
		assertEquals(int1.isPrime(),dExpectedPrime);
	}

}
