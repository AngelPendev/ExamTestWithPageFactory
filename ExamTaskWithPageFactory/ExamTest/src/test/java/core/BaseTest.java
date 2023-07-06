package core;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Browser;

public abstract class BaseTest {

    @BeforeClass
    public void setUpBrowser(){
        Browser.setUp();
    }

    @AfterClass

    public void tearDownBrowser() {
        Browser.tearDown();
    }
}
