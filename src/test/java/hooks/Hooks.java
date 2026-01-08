package hooks;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("Test Started");
    }

    @After
    public void teardown(){
        if(DriverManager.getDriver()!=null){
            DriverManager.quitDriver();
        }
    }
}
