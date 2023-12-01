package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowse(baseUrl);

    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        WebElement Navigate = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a"));
        Navigate.click();
        String name = driver.findElement(By.xpath("//div[@class='center-2']/div/div[1]/h1")).getText();
        String expectedAnswer = "Computers";
        Assert.assertEquals(name,expectedAnswer);

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        WebElement NavigateElectronics = driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a"));
        NavigateElectronics.click();
        String name = driver.findElement(By.xpath("//div[@class='page category-page']/div[1]/h1")).getText();
        String expectedResult = "Electronics";
        Assert.assertEquals(name,expectedResult);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){
      driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a")).click();
      String name1 =driver.findElement(By.xpath("//div[@class='center-2']/div/div[1]/h1")).getText();String Result = "Apparel";
      String expectedResult ="Apparel";
      Assert.assertEquals(name1,expectedResult);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a")).click();
        String Digital = driver.findElement(By.xpath("//div[@class='page category-page']/div[1]/h1")).getText();
        String expexted = "Digital downloads";
        Assert.assertEquals(Digital,expexted);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a")).click();
        String Books = driver.findElement(By.xpath("//div[@class='page category-page']/div/h1")).getText();
        String expected = "Books";
        Assert.assertEquals(Books,expected);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a")).click();
        String Jewelry =driver.findElement(By.xpath("//div[@class='center-2']/div/div[1]/h1")).getText();
        String expected ="Jewelry";
        Assert.assertEquals(Jewelry,expected);

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a")).click();
        String GiftCards = driver.findElement(By.xpath("//div[@class='page category-page']/div[1]/h1")).getText();
        String expected ="Gift Cards";
        Assert.assertEquals(GiftCards,expected);


    }




}
