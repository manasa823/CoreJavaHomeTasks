package tests;

import org.testng.annotations.BeforeMethod;

import com.epam.tat.module4.Calculator;

import org.testng.Assert;
import org.testng.annotations.*;

public class NegativeTests {
	
	@DataProvider(name="data")
	public Object[][] addData(){
		return new Object[][] {{10,-14}};
	}

	private Calculator cal;

	@BeforeMethod
	public void setUp() {
		cal = new Calculator();
	}
	
	@Test(expectedExceptions = NumberFormatException.class,groups = "Exception")
	public void testDivideByZero() { 
	long a = 15; long b = 0;
	cal.div(a, b);
	}
	
	@Test(dataProvider = "data")
	public void testNAdd(long a,long b) {
		long expectedResult = 4;
		long result = cal.sum(a, b);
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test()
	public void testNSin() {
		double a=90;
		long expectedResult = 1;
		double result = cal.sin(a);
		System.out.println(result);
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test(groups="Non-Negative")
	public void testNPos() {
		long a=90;
		boolean expectedResult = true;
		boolean result = cal.isPositive(a);
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test()
	public void testNCos() {
		double a=0;
		double expectedResult = 1;
		double result = cal.cos(a);
		Assert.assertEquals(expectedResult, result);
	}
	
	
}
