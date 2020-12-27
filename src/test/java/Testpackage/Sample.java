package Testpackage;

import api.Apimethods;
import base.Basemethods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;
import util.Utilmethods;

public class Sample {
    @Test
    public void test1(){
        //website to test
        String url="https://reqres.in/api/users?page=2";


        //extent report
        ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/test.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reporter);

        //base package
        ExtentTest logger1 = extent.createTest("base package test");
        Basemethods.getmethod(url);
        logger1.log(Status.INFO,"base package");
        logger1.log(Status.PASS,"base package passed");
        extent.flush();

        //api package
        ExtentTest logger2 = extent.createTest("api package test");
        String first_name= "vrushab";
        String last_name= "patil";
        Apimethods.postmethod(first_name,last_name);
        logger2.log(Status.INFO,"api package");
        logger2.log(Status.PASS,"api package passed");
        extent.flush();


        //util package
        ExtentTest logger3 = extent.createTest("util package test");
        Utilmethods.responsetime(url);
        logger3.log(Status.INFO,"util package");
        logger3.log(Status.PASS,"util package passed");
        extent.flush();

    }

}
