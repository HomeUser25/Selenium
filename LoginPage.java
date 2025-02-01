package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(css="#user-name")
    private WebElement userField;

    @FindBy(css="#password")
    private WebElement passwordField;

    @FindBy(css="#user-name")
    private WebElement loginBtn;


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void login (String user , String password ) throws InterruptedException {

       driver.findElement(By.cssSelector("#user-name")).clear();
       driver.findElement(By.cssSelector("#user-name")).sendKeys(user);
       Thread.sleep(1000);
       driver.findElement(By.cssSelector("#user-name")).clear();
       driver.findElement(By.cssSelector("#password")).sendKeys(password);
       Thread.sleep(1000);
       driver.findElement(By.cssSelector("#login-button")).click();




    }

}
