package exercises;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Exercise_5 extends BaseTests {
//Exercise: https://testautomationu.applitools.com/selenium-webdriver-tutorial-java/chapter8.html
    @Test
    public void testLeftAndBottomFrames(){
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFrames();
        String leftText = "LEFT";
        assertEquals(nestedFramesPage.getLeftFrameText(), leftText, "Left text incorrect");

        String bottomText = "BOTTOM";
        assertEquals(nestedFramesPage.getBottomFrameText(), bottomText, "Bottom text incorrect");
    }
}
