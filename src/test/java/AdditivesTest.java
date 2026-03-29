import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdditivesTest extends saucedemo.Base {

    @DataProvider(name = "loginData")
    public Object[][] getData(){
        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"visual_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},

        };
    }

    @Test(dataProvider = "loginData")
    public void SuccessfullyOrder(String user ,String pass) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.EnterUserName(user);
        LoginPage.EnterPassword(pass);
        LoginPage.ClickLoginBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        boolean isTitleVisible = LoginPage.isProductsTitleDisplayed();
        Assert.assertTrue(isTitleVisible);
        AddItems addItems =new AddItems(driver);
        addItems.ClickFilterBtn();
        addItems.HighToLow();
        addItems.FleeceJacketBtn();
        addItems.CartIconBtn();
        addItems.CheckoutBtn();
        addItems.EnterFirstName("Mohamed");
        addItems.EnterLastName("Refaat");
        addItems.EnterZipPostalCode("123456");
        addItems.ClickContinueBtn();
        addItems.ClickFinishBtn();
        boolean SuccessOrderTitle = addItems.getSuccessMessageText();
        Assert.assertTrue(SuccessOrderTitle);


    }
}
