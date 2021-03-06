package BaseTests;

import managers.InitManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    void testPrepare() {
        InitManager.initFramework();
    }

    @AfterEach
    void testClose() {
        InitManager.quit();
    }
}
