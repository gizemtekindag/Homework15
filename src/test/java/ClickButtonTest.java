import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

public class ClickButtonTest {

    WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testClickButton() {

        driver.get("https://demoqa.com/elements");


        WebElement buttonsOption = driver.findElement(By.xpath("//span[text()='Buttons']"));
        buttonsOption.click();


        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeButton.click();


        WebElement message = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
        String expectedMessage = "You have done a dynamic click";
        assertEquals(expectedMessage, message.getText());
    }

    @After
    public void tearDown() {

        driver.quit();
    }
}
