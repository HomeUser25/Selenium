package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(css = "#user-name")
    private WebElement userField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = "#login-button")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setUserField(String user) {
        userField.clear();
        userField.sendKeys(user);
    }

    public void setPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginBtn.click();
    }

    public void login(String user, String password) throws InterruptedException {
        setUserField(user);
        Thread.sleep(1000);
        setPasswordField(password);
        Thread.sleep(1000);
        clickLoginButton();
    }
}