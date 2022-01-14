package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


	public class ExtentTestManager {
		
		public ExtentTest test;
		public static ExtentReports report;
		public static String date=new SimpleDateFormat("dd MMMM yyyy").format(new Date());
		public static String FileName = "C:\\Users\\manasa.channamaraju\\git\\UnitTesting\\Calculator\\ExtentReports\\Calculator_"+date+"_"+System.currentTimeMillis()+".html";
		
		public static ExtentReports getInstance() {
	        if (report == null)
	        createInstance();
	        return report;
	    }
	
		public static ExtentReports createInstance() {
			
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(FileName);
			report = new ExtentReports();
			report.attachReporter(htmlReporter);
			htmlReporter.config().setReportName("SingleCode");
			report.setAnalysisStrategy(AnalysisStrategy.TEST);
			report.setSystemInfo("Environment", "Windows");
			report.setSystemInfo("user", "Manasa");		
			return report;
	}
		
		static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer, ExtentTest>();
		static ExtentReports extent = getInstance();
		
		
		public static synchronized ExtentTest getTest() {
			return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
		}

		public static synchronized void endTest() {
			extent.flush();
		}

		public static synchronized ExtentTest startTest(String testName) {
			ExtentTest test = extent.createTest(testName);
			extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
			return test;
		}

}
	