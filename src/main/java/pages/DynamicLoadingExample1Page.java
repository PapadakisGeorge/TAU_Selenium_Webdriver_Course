package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadedIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
      //WebDriverWait wait = new WebDriverWait(driver, 5);
      //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadedIndicator)));

        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchFrameException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadedIndicator)));
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }


}
