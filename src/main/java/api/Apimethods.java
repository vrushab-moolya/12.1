package api;

import static io.restassured.RestAssured.*;

public class Apimethods {
    public static void postmethod(String first_name,String last_name){
        String url="https://reqres.in/api/users?page=2";
        given().log().all().body(first_name ).post(url).then().log().all();
        given().log().all().body(last_name).post(url).then().log().all();

    }


}
