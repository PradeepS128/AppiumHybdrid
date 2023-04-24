package Report;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport_ {

public static ExtentReports extentReport()
{
	LocalDateTime dateTime=LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("\"yyyy-MM-dd HH:mm:ss\"");
	String dateTime_ = dateTime.format(formatter);


File file=new File("D:\\New folder\\Java Automation\\AppiumHybdrid____\\Report\\3Eco.html");
ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(file);
extentSparkReporter.config().setDocumentTitle("3Eco Mobile Automation Report");
extentSparkReporter.config().setReportName("3Eco Mobile Automation");
extentSparkReporter.config().setTimelineEnabled(true);


ExtentReports extentReports=new ExtentReports();
extentReports.attachReporter(extentSparkReporter);
extentReports.getStats();
extentReports.setSystemInfo("Enviroment", "Test");
extentReports.setSystemInfo("Name of the project", "3Eco");
extentReports.setSystemInfo("Test Engineer", "Pradeep");
extentReports.setSystemInfo("Execution date and time",""+dateTime_+"");


return extentReports;
}

}
