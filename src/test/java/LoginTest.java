import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends saucedemo_ui.Base {

    @Test
public void SuccessfulLogin() throws InterruptedException {
driver.get("https://www.saucedemo.com/");
     LoginPage LoginPage = new LoginPage(driver);
    LoginPage.EnterUserName("standard_user");
    LoginPage.EnterPassword("secret_sauce");
    LoginPage.ClickLoginBtn();
        boolean isTitleVisible = LoginPage.isProductsTitleDisplayed();
        Assert.assertTrue(isTitleVisible);
        }
    @Test
    public void InvalidPassword(){
        driver.get("https://www.saucedemo.com/");
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.EnterUserName("standard_user");
        LoginPage.EnterPassword("secret_sauce12");
        LoginPage.ClickLoginBtn();
        String expectedError = "Epic sadface: Username and password do not match any user in this service";
        String actualError = LoginPage.getErrorMessageText();
        Assert.assertEquals(actualError, expectedError, "The error message is not correct!");    }
    @Test
    public void EmptyFields(){
        driver.get("https://www.saucedemo.com/");
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.EnterUserName("");
        LoginPage.EnterPassword("");
        LoginPage.ClickLoginBtn();
        String expectedError = "Epic sadface: Username is required";
        String actualError = LoginPage.getErrorMessageText();
        Assert.assertEquals(actualError, expectedError, "The error message is not correct!");
    }
    @Test
    public void InvalidUsername(){
        driver.get("https://www.saucedemo.com/");
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.EnterUserName("standard_user12");
        LoginPage.EnterPassword("secret_sauce");
        LoginPage.ClickLoginBtn();
        String expectedError = "Epic sadface: Username and password do not match any user in this service";
        String actualError = LoginPage.getErrorMessageText();
        Assert.assertEquals(actualError, expectedError, "The error message is not correct!");
    }
    @Test
    public void LockedOutUser(){
        driver.get("https://www.saucedemo.com/");
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.EnterUserName("locked_out_user");
        LoginPage.EnterPassword("secret_sauce");
        LoginPage.ClickLoginBtn();
        String expectedError = "Epic sadface: Sorry, this user has been locked out.";
        String actualError = LoginPage.getErrorMessageText();
        Assert.assertEquals(actualError, expectedError, "The error message is not correct!");
    }
    @Test
    public void EmptyUsername(){
        driver.get("https://www.saucedemo.com/");
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.EnterUserName("");
        LoginPage.EnterPassword("secret_sauce");
        LoginPage.ClickLoginBtn();
        String expectedError = "Epic sadface: Username is required";
        String actualError = LoginPage.getErrorMessageText();
        Assert.assertEquals(actualError, expectedError, "The error message is not correct!");
    }
    @Test
    public void EmptyPassword(){
        driver.get("https://www.saucedemo.com/");
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.EnterUserName("standard_user");
        LoginPage.EnterPassword("");
        LoginPage.ClickLoginBtn();
        String expectedError = "Epic sadface: Password is required";
        String actualError = LoginPage.getErrorMessageText();
        Assert.assertEquals(actualError, expectedError, "The error message is not correct!");
    }
}
