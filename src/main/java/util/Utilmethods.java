package util;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;

public class Utilmethods {
    public static void responsetime(String url){
        System.out.println("time taken to fetch the response is "+get(url).timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
        int statuscode=given().when().get(url).getStatusCode();
        System.out.println("The status code is " +statuscode);
        given().when().get(url).then().assertThat().statusCode(200);
    }
}
