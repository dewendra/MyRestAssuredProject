package api.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	
	public void onStart(ITestContext testContext) {
		String repName;
		
		String timeStamp = new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss").format(new Date());// time stamp
		repName = "Test-Report-" + timeStamp + ".html";

		htmlReporter=new ExtentSparkReporter(".\\reports\\"+repName);
		/*
		 * htmlReporter= new ExtentSparkReporter(System.getProperty("user.dir")+
		 * "/test-output/ExtentReport/"+"MyReport.html"); try {
		 * htmlReporter.loadXMLConfig(System.getProperty("user.dir")+
		 * "/extent-config.xml"); } catch (IOException e) { 
		 *  e.printStackTrace(); }
		 */
		
		//htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/ExtentReport/" + repName);
		htmlReporter.config().setDocumentTitle("RestAssured Automation Project");
		htmlReporter.config().setReportName("Pet Store Users API");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "Pet Store Users API");
		extent.setSystemInfo("Tester", "Dewendra Singh");
		extent.setSystemInfo("OS", "Win11");
		extent.setSystemInfo("Browser", "Chrome");
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.createNode(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.PASS, "Test Passed");

	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.createNode(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.FAIL, "Test Failed");
		test.log(Status.FAIL, result.getThrowable().getMessage());

	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.createNode(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP, "Test Skipped");
		test.log(Status.SKIP, result.getThrowable().getMessage());
	}

	public void endReport(ITestContext testContext) {
		extent.flush();
	}
}
