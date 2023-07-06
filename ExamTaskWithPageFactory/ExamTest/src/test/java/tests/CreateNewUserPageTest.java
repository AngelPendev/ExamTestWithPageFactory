package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.AccountConfirmationPage;
import pages.HomePage;
import pages.CreateNewUserPage;



public class CreateNewUserPageTest extends BaseTest {

    @Test
    public static void newUserRegistrationTest(){

        HomePage.goToUrlPage();
        HomePage.clickOnMyAccountButton();
        HomePage.clickOnRegisterButton();
        CreateNewUserPage.writeInFirstNameField("Angel");
        CreateNewUserPage.writeInLastNameField("Pendev");
        CreateNewUserPage.emailGenerator();
        CreateNewUserPage.phoneGenerator();
        CreateNewUserPage.passwordGenerator();
        CreateNewUserPage.clickOnReadAndAgreeCheckBox();
        CreateNewUserPage.continueButtonClick();
        AccountConfirmationPage.waitForSuccessRegistrationTextToAppear("Your Account Has Been Created!");

    }
}
