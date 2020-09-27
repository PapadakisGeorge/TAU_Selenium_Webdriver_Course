package exercises;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class Exercise_3 extends BaseTests {
    //Exercise https://testautomationu.applitools.com/selenium-webdriver-tutorial-java/chapter6.html

    @Test
    public void sliderToFour() {
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.clickSlider();
        String sliderNumberGoal = "4";
        horizontalSliderPage.setSliderValue(sliderNumberGoal);
    }

}
