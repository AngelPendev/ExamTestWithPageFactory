package pages;

import core.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateNewUserPage extends BasePage {

static {
    PageFactory.initElements(driver, CreateNewUserPage.class);
}

@FindBy(id = "input-firstname")
    private static WebElement EnterFirstnameField;
@FindBy(id = "input-lastname")
    private static WebElement EnterLastnameField;
@FindBy(id = "input-email")
    private static WebElement EnterEmailField;
@FindBy(id = "input-telephone")
private static WebElement EnterPhoneInputField;

@FindBy(id = "input-password")
private static WebElement PasswordInputField;

@FindBy(id = "input-confirm")
private static WebElement PasswordConfirmField;

@FindBy(xpath = "//input[@name='agree']")
private static WebElement ReadAndAgreeCheckBox;
@FindBy(xpath = "//*[@value='Continue']")
private static WebElement ContinueButton;

public static void writeInFirstNameField(String firstNameInput){
    EnterFirstnameField.sendKeys(firstNameInput);
}
public  static void writeInLastNameField(String lastNameInput) {
    EnterLastnameField.sendKeys(lastNameInput);

}
public static void emailGenerator() {
    String Prefix = RandomStringUtils.randomAlphanumeric(8);
    String Suffix = RandomStringUtils.randomAlphanumeric(4);
    String Domain = RandomStringUtils.randomAlphabetic(3);
    String Email = Prefix + "@" + Suffix + "." + Domain;
    EnterEmailField.sendKeys(Email);
}
public static void phoneGenerator(){
    String phone=RandomStringUtils.randomNumeric(10);
    EnterPhoneInputField.sendKeys(phone);

}
public static void passwordGenerator(){
    String password=RandomStringUtils.randomAlphanumeric(8);
    PasswordInputField.sendKeys(password);
    PasswordConfirmField.sendKeys(password);
}
public static void clickOnReadAndAgreeCheckBox(){
    clickOnElement(ReadAndAgreeCheckBox);
}
public static void continueButtonClick(){
    clickOnElement(ContinueButton);
}









}
