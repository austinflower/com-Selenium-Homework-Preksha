package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowse(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
      driver.findElement(By.xpath("//div[@class='header-links']/ul/li[1]/a")).click();
      String Register = driver.findElement(By.xpath("//div[@class='page registration-page']/div[1]/h1")).getText();
      String expected = "Register";
        Assert.assertEquals(Register,expected);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        driver.findElement(By.xpath("//div[@class='header-links']/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Tommy");
        driver.findElement(By.id("LastName")).sendKeys("Smith");
        WebElement dropDown = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(dropDown);
        select.selectByValue("2");

       WebElement dropDown2 = driver.findElement(By.name("DateOfBirthMonth"));
       Select select1 = new Select(dropDown2);
       select1.selectByValue("5");

        WebElement dropDown3 = driver.findElement(By.name("DateOfBirthYear"));
        Select select2 = new Select(dropDown3);
        select2.selectByValue("1980");
        driver.findElement(By.id("Email")).sendKeys("tommysmith@aolaol.com");
        driver.findElement(By.id("Password")).sendKeys("123456789");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
        driver.findElement(By.id("register-button")).click();

        String confirmRegister = driver.findElement(By.className("result")).getText();
        String expected2 = "Your registration completed";
        Assert.assertEquals(confirmRegister,expected2);


    }

}








