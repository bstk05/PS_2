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
	public void TestiValue(){
		MyInteger int0 = new MyInteger(3);
		int0.setiValue(3);
		assertEquals(int0.getiValue(),3);
	}
	
	@Test
	public void TestisEven(){
		MyInteger int1 = new MyInteger(6);
		MyInteger int2 = new MyInteger(7);
		
		assertEquals(int1.isEven(),true);
		assertEquals(int2.isEven(),false);
		
		assertEquals(MyInteger.isEven(6),true);
		assertEquals(MyInteger.isEven(7),false);
		
		assertEquals(MyInteger.isEven(int1),true);
		assertEquals(MyInteger.isEven(int2),false);
	}
	
	@Test
	public void TestisOdd(){
		MyInteger int1 = new MyInteger(6);
		MyInteger int2 = new MyInteger(7);
		
		assertEquals(int1.isOdd(),false);
		assertEquals(int2.isOdd(),true);
		
		assertEquals(MyInteger.isOdd(6),false);
		assertEquals(MyInteger.isOdd(7),true);
		
		assertEquals(MyInteger.isOdd(int1),false);
		assertEquals(MyInteger.isOdd(int2),true);
	}
	
	@Test
	public void TestisPrime(){
		MyInteger int1 = new MyInteger(6);
		MyInteger int2 = new MyInteger(7);
		
		assertEquals(int1.isPrime(),false);
		assertEquals(int2.isPrime(),true);
		
		assertEquals(MyInteger.isPrime(6),false);
		assertEquals(MyInteger.isPrime(7),true);
		
		assertEquals(MyInteger.isPrime(int1),false);
		assertEquals(MyInteger.isPrime(int2),true);
	}
	
	@Test
	public void TestisEquals(){
		MyInteger int3 = new MyInteger(4);
		MyInteger int4 = new MyInteger(5);
		
		assertEquals(int3.isEquals(int3),true);
		assertEquals(int4.isEquals(int3),false);
		
		assertEquals(int3.isEquals(4),true);
		assertEquals(int4.isEquals(4),false);
	}

}
