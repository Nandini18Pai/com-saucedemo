package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * /**
 *  * 1. Setup chrome browser
 *  * 2. Open URL
 *  * 3. Print the title of the page
 *  * 4. Print the current url
 *  * 5. Print the page source
 *  * 6. Enter the email to email field
 *  * 7. Enter the password to password field
 *  * 8. Close the browser
 *
 */
public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println(" Wrong Browse name");
        }
        driver.get(baseUrl); // Open URL
        driver.manage().window().maximize(); // MaximiseBrowser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25)); //   Implicit wait to Drive
        System.out.println(" Title of  Page: " + driver.getTitle()); // Print the title of the page
        System.out.println(" Current URL : " + driver.getCurrentUrl()); //  Print the current url
        System.out.println("Page Source: " + driver.getPageSource());  // Print the page source
        WebElement usernameField = driver.findElement(By.id("user-name")); //  Enter the username to username field.
        usernameField.sendKeys("standard_user");  // action
        WebElement passwordField = driver.findElement(By.id("password")); // Enter the password to password field
        passwordField.sendKeys("secret_sauce");// action
        driver.close(); //Close the browser
    }
}




