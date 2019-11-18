package pages;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-13  */
public class SignIPageMap {
    public WebElement signinButton;
    public WebElement passwordInput;
    public WebElement emailInput;

    public WebElement getSigninButton() {

        return Driver.getBrowser().findElement(By.id("signInSubmit-input"));
    }

    public void setSigninButton(WebElement signinButton) {
        this.signinButton = signinButton;
    }

    public WebElement getPasswordInput() {
        return Driver.getBrowser().findElement(By.id("ap_password"));
    }

    public void setPasswordInput(WebElement passwordInput) {
        this.passwordInput = passwordInput;
    }

    public WebElement getEmailInput() {
        return Driver.getBrowser().findElement(By.id("ap_email"));
    }

    public void setEmailInput(WebElement emailInput) {
        this.emailInput = emailInput;
    }
}
