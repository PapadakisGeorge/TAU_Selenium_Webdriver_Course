package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By nestedFrameButton = By.id("Nested Frames");

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public void pressNestedGFrameButton(){
        driver.findElement(nestedFrameButton).click();
    }

    public NestedFramesPage clickNestedFrames(){
        clickLink("Nested Frames");
        return new NestedFramesPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
