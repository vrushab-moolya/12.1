package Testpackage;

import api.Apimethods;
import base.Basemethods;
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

}
