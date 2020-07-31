package pages;

import managers.PageManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static managers.DriverManager.*;

public class BasePage {

    protected PageManager pageManager = PageManager.getPageManager();
    protected Actions action = new Actions(getDriver());
    protected JavascriptExecutor js = (JavascriptExecutor) getDriver();

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }



    static void insertValue(WebElement element, String value) {
        element.click();
        for (int j = 0; j < 5; j++) {
            element.clear();
            for (int i = 0; i < value.length(); i++) {
                element.sendKeys(String.valueOf(value.charAt(i)));
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (element.getAttribute("value").equals(value))
                break;
        }
    }

    static void inputValues(WebElement element, String value) {
        element.click();
        for (int i = 0; i < 20; i++) {
            element.sendKeys(Keys.BACK_SPACE);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        element.sendKeys(value);
    }

    //delete space-char 99 999 => 99999
    static String makePriceNormal(String value) {
        String normal = "";
        String[] temp = value.split(" ");
        for (String s : temp) {
            normal += s;
        }
        return normal;
    }

    static String getParamXpath(String param, String tempXpath) {
        String xpath = "";
        String[] temp = tempXpath.split("\\$\\$");
        xpath = xpath + temp[0] + param + temp[1];

        return xpath;
    }

}
