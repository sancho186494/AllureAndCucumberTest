package utils;

import io.qameta.allure.Attachment;
import managers.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AllureUtils {
    @Attachment(value = "screenshot", type = "image/png")
    public static byte[] addScreenShot() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
