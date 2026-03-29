import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItems {
    WebDriver driver;
    By filter = By.xpath("//*[@data-test='product-sort-container']");
    By H_price =By.xpath("//*[text()='Price (high to low)']");
    By AddToCartFleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By CartIcon = By.className("shopping_cart_link");
    By Checkout = By.id("checkout");
    By Firstname = By.id("first-name");
    By Lastname = By.id("last-name");
    By ZipPostalCode = By.id("postal-code");
    By ContinueBtn = By.id("continue");
    By FinishBtn = By.id("finish");
    By SuccessfulOrder =By.xpath("//*[text()='Thank you for your order!']");

    public AddItems(WebDriver driver) {this.driver=driver;}
    public void ClickFilterBtn (){driver.findElement(filter).click();}
    public void HighToLow (){driver.findElement(H_price).click();}
    public void FleeceJacketBtn (){driver.findElement(AddToCartFleeceJacket).click();}
    public void CartIconBtn (){driver.findElement(CartIcon).click();}
    public void CheckoutBtn (){driver.findElement(Checkout).click();}
    public void EnterFirstName (String FirstN){driver.findElement(Firstname).sendKeys(FirstN);}
    public void EnterLastName (String LastN){driver.findElement(Lastname).sendKeys(LastN);}
    public void EnterZipPostalCode (String Code){driver.findElement(ZipPostalCode).sendKeys(Code);}
    public void ClickContinueBtn (){driver.findElement(ContinueBtn).click();}
    public void ClickFinishBtn (){driver.findElement(FinishBtn).click();}
    public boolean getSuccessMessageText (){ return driver.findElement(SuccessfulOrder).isDisplayed();}






}
