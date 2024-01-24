
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework16 {

    @Test
    public void registrationNavigation() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eduard\\FRAMEWORK FILES\\bdd-koel-automation\\node_modules\\chromedriver\\lib\\chromedriver");
        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://qa.koel.app/");


            WebElement registrationLink = driver.findElement(By.linkText("Register"));
            registrationLink.click();


            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("register"), "URL does not contain 'register'");


        } finally {

            driver.quit();
        }
    }
}