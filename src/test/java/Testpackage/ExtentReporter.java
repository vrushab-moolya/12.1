package Testpackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;

public class ExtentReporter {
    @Test
    public void apiTest(){
        ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/test.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reporter);
        ExtentTest logger = extent.createTest("apitest");
        logger.log(Status.INFO,"API CALL");
        logger.log(Status.PASS,"API TEST PASSED");
        extent.flush();

    }

}
