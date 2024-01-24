import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestHomework16 {

    @Test
    public void registrationNavigation() {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDrivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://qa.koel.app/");


        driver.quit();
    }
}