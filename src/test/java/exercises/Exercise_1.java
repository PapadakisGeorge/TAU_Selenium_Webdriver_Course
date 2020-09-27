package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise_1 {
    //Exercise: https://testautomationu.applitools.com/selenium-webdriver-tutorial-java/chapter3.html

    private WebDriver driver;

    public void setUp(){



        //We open Chrome and find the site "https://the-internet.herokuapp.com".
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        //We find and click the "Shifting Content" link.
        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();

        //We find and click the "Menu Element" link.
        WebElement menuElementLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElementLink.click();

        //We find the menu elements, get a list of them and count how many there are.

        List<WebElement> menuElements = driver.findElements(By.tagName("li"));
        int numberOfMenuElements;
        numberOfMenuElements = menuElements.size();
        System.out.println("Number of menu elements is " + numberOfMenuElements);

        //We close Chrome.
        driver.quit();
    }


    public static void main(String[] args){
        Exercise_1 exercise_1 = new Exercise_1();
        exercise_1.setUp();
    }


}
