package base;

import static io.restassured.RestAssured.*;

public class Basemethods {
    public static void getmethod(String url)
    {
        given().queryParam("users","page=2").get(url).then().log().all();
        System.out.println("The headers in the response is "+get(url).then().extract().headers());
        System.out.println("The content type of response is "+get(url).then().extract().contentType());

    }
}
