package Testpackage;

import api.Apimethods;
import base.Basemethods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import util.Utilmethods;

public class Sample {
    @Test
    public void test1(){
        String url="https://reqres.in/api/users?page=2";
        Basemethods.getmethod(url);
        String first_name= "vrushab";
        String last_name= "patil";
        Apimethods.postmethod(first_name,last_name);
        Utilmethods.responsetime(url);

    }

    @org.testng.annotations.Test
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
