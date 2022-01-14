package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import utilities.*;

import com.epam.tat.module4.Calculator;


public class CalculatorTest {
	
	private Calculator cal;
	public ExtentTest test= ExtentTestManager.getTest();
	
	@DataProvider (name = "data-provider")
    public Object[][] sqrtData(){
		return new Object[][] {{81}};
	}

	@BeforeMethod
	public void setUp() {
		cal = new Calculator();
	}
	
	@Test()
	public void testAdd() { 
	int a = 15; int b = 20; 
	int expectedResult = 35;
	long result = cal.sum(a, b);
	Assert.assertEquals(expectedResult, result);
	}
	
	@Test()
	public void testSubtract() {
	int a = 25; int b = 20; 
	int expectedResult = 5; 
	long result = cal.sub(a, b);
	Assert.assertEquals(expectedResult, result);
	}
	
	@Test(dataProvider = "data-provider")
	public void testSqrt(double a) {
	double expectedResult = 9; 
	double result = cal.sqrt(a);
	Assert.assertEquals(expectedResult, result); 
	}
	
	@Test()
	public void testMultiply() {
	int a = 25; int b = 10; 
	int expectedResult = 250; 
	long result = cal.mult(a, b);
	Assert.assertEquals(expectedResult, result);
	}
	
	@Test()
	public void testPower() {
	double a = 5; double b = 3; 
	double expectedResult = 125; 
	double result = cal.pow(a, b);
	Assert.assertEquals(expectedResult, result);
	}
	
	@AfterTest
	public void getClassName() {
		System.out.println(cal.getClass().getSimpleName()+" executed successfully");
	}
}
