package stepdefs;

import Utilities.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver driver;

    public Hooks(TestContext context){
        driver = context.getDriver();
    }



    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){
       driver.quit();
    }
}
