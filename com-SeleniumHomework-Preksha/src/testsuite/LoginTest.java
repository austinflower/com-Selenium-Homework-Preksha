package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowse(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        driver.findElement(By.className("ico-login")).click();
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
        String ExpectedText = "Welcome, Please Sign In!";

        Assert.assertEquals(actualText,ExpectedText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();
        WebElement emailLoginField = driver.findElement(By.id("Email"));
        emailLoginField.sendKeys("tomsmith@aol.com");

        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        String actualText = driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).getText();
        String ExpectedText = "Log out";
        Assert.assertEquals(actualText,ExpectedText);
    }
    @Test
    public void verifyTheErrorMessage(){
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("tomsmith@alo.com");
        driver.findElement(By.id("Password")).sendKeys("1234567");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        String actualErrorMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        String expectedErrorMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);




    }


}
