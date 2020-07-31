package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    @FindBy(xpath = "//span[@class='lg-menu__text'][text()='Ипотека']")
    private WebElement ipotekaMenu;

    @FindBy(xpath = "//div[@class='lg-menu ']//a[text()='Ипотека на готовое жильё']")
    private WebElement ipotekaLink;

    public StartPage selectIpotekaMenu() {
        action.moveToElement(ipotekaMenu).build().perform();
        ipotekaLink.isDisplayed();
        return this;
    }

    public IpotekaPage ipotekaClickLink() {
        ipotekaLink.click();
        return pageManager.getIpotekaPage();
    }
}
