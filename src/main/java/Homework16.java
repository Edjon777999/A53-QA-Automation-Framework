import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework16 {

    @Test
    public void registrationNavigation() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eduard\\FRAMEWORK FILES\\bdd-koel-automation\\node_modules\\chromedriver\\lib\\chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://qa.koel.app/");



        // Close the browser
        driver.quit();
    }
}