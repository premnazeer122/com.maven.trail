import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test
    public void searchForIndia() {
        // Open Google
        driver.get("https://www.google.com");

        // Locate the search input field and enter "India"
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("India");

        // Locate and interact with the search dropdown using Select class
        WebElement searchDropdown = driver.findElement(By.name("btnK"));
        searchDropdown.click();

        // Select the second item (index 1) from the dropdown (as the "India" option is the second one)
        Select select = new Select(driver.findElement(By.name("btnK")));
        select.selectByIndex(1);

        // Assertion: Check the title of the Google search engine
        String expectedTitle = "Google Search";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch!");

  
    }


    @AfterTest
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
