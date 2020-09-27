package exercises;

import base.BaseTests;
import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class Exercise_2 extends BaseTests {
    //Exercise: https://testautomationu.applitools.com/selenium-webdriver-tutorial-java/chapter4.3.html

    @Test
    public void testRetrievePassword(){
        var forgetPasswordPage = homePage.clickForgotPassword();
        forgetPasswordPage.enterEmail("tau@example.com");
        var emailSentPage = forgetPasswordPage.clickRetrievePassword();

        assertEquals(emailSentPage.getMessage(), "Your e-mail's been sent!", "Message is incorrect");

    }
}
