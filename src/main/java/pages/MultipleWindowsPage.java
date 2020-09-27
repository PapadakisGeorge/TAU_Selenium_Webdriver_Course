package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

    private WebDriver driver;
    By clickHereLink = By.linkText("Click Here");

    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }

    public void setClickHere(){
        driver.findElement(clickHereLink).click();
    }
}
