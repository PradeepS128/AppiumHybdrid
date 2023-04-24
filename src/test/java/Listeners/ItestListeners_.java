package Listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Report.ExtentReport_;
import _Utility.BaseClass;
import io.appium.java_client.AppiumDriver;

public class ItestListeners_ extends BaseClass implements ITestListener
{

	ExtentReports extentReport=ExtentReport_.extentReport();
	ExtentTest extentTest;
	ThreadLocal<ExtentTest> local=new ThreadLocal<>();

	@Override
	public void onTestStart(ITestResult result) {
		extentTest=extentReport.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		extentTest.log(Status.PASS, ""+result.getMethod().getMethodName()+"");
		extentTest.getStatus();
		extentTest.info(""+result.getMethod().getMethodName()+ ""+""+result.getMethod().getSuccessPercentage()+"");	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, ""+result.getMethod().getMethodName()+"");

		extentTest.getStatus();


		extentTest.fail(result.getThrowable());

		try {
			driver=(AppiumDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e)
		{

		}

		String filepath=null;
		try {
			filepath=getScreenshot(result.getMethod().getMethodName(),driver);
		} catch (IOException e)
		{

		}
		extentTest.addScreenCaptureFromPath(filepath,result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReport.flush();
	}

}
