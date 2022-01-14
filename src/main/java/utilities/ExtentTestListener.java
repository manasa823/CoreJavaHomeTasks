package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ExtentTestListener implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		String cname = (result.getInstanceName()).trim();
		ExtentTestManager.startTest(cname);
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*** Executed test successfully...");
		ExtentTestManager.getTest().log(Status.PASS, MarkupHelper.createLabel(" Test Case PASSED", ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*** Test execution failed...");
		ExtentTestManager.getTest().log(Status.FAIL, MarkupHelper.createLabel(" Test case FAILED due to below issues:", ExtentColor.RED)); // to add name in extent report
		ExtentTestManager.getTest().fail(result.getThrowable());
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test skipped...");
		ExtentTestManager.getTest().log(Status.SKIP, MarkupHelper.createLabel(" Test Case SKIPPED", ExtentColor.ORANGE));
		ExtentTestManager.getTest().skip(result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("*** Test Suite " + context.getName() + " started ***");
		ExtentTestManager.startTest("<b>Test Suite - "+context.getName()+"<b>");
		ExtentTestManager.getTest().createNode("<b>Test Suite - "+context.getName()+"<b>");
	}

	public void onFinish(ITestContext context) {
		ExtentTestManager.endTest();
		ExtentTestManager.getInstance().flush();	
	}
}
