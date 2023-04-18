package Report;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport_
{

public static ExtentReports extentReport()
{
File file=new File("D:\\New folder\\Java Automation\\AppiumHybdrid____\\Report\\3Eco.html");
ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(file);
extentSparkReporter.config().setDocumentTitle("AppiumTesting__Results");
extentSparkReporter.config().setReportName("AppiumResults");

ExtentReports extentReports=new ExtentReports();
extentReports.attachReporter(extentSparkReporter);
extentReports.setSystemInfo("Tester", "Pradeep");
return extentReports;
}

}
