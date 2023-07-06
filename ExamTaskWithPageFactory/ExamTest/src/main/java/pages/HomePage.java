package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

private static final String HomePageUrl="http://shop.pragmatic.bg/";

@FindBy(xpath = "//span[text()='My Account']")
    private static WebElement myAccountButton;
@FindBy(xpath = "//*[text()='Register']")
    private static WebElement RegisterButton;

static {
    PageFactory.initElements(driver,HomePage.class);
}

public static void goToUrlPage(){
    driver.get(HomePageUrl);
}

public static void clickOnMyAccountButton(){
    clickOnElement(myAccountButton);
}
public static void clickOnRegisterButton(){
    clickOnElement(RegisterButton);
}

}
