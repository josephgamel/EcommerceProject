package Pages;



import StepDefinitions.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class P01ResetPasswordPage {


    By logOut = By.className("ico-logout");
    By logIn = By.className("ico-login");
    By forgetPassword = By.cssSelector("a[href=\"/passwordrecovery\"]");
    By emailFieled = By.id("Email");
    By recoveryBtn = By.name("send-email");
    By alertMessage = By.className("close");




    public void clickLogIn() {
        TestBase.wait.until(ExpectedConditions.visibilityOfElementLocated(logIn));
        TestBase.driver.findElement(logIn).click();
    }

    public void clickForgetPassword()
    {
        TestBase.driver.findElement(forgetPassword).click();
    }

    public void setEmail(String email)
    {
        TestBase.driver.findElement(emailFieled).sendKeys(email);
    }
    public void clickRecoveryBtn()
    {
        TestBase.driver.findElement(recoveryBtn).click();
    }

    public void closeAlertMessage()
    {
        TestBase.wait.until(ExpectedConditions.visibilityOfElementLocated(alertMessage));
        TestBase.driver.findElement(alertMessage).click();
    }




}
