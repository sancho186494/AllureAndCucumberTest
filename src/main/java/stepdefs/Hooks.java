package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static managers.InitManager.*;

public class Hooks {
    @Before
    public void setUp() {
        initFramework();
    }

    @After
    public void tearDown() {
        utils.AllureUtils.addScreenShot();
        quit();
    }
}
