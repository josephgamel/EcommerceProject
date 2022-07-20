package Pages;

import StepDefinitions.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P00RegistrationPage {

    By registerLink = By.cssSelector("a[class=\"ico-register\"]");
    By gender = By.xpath("//input[@value='M'] ");



    By FirstName = By.id("FirstName");
    By LastName = By.id("LastName");
    By Email = By.id("Email");
    By Company = By.id("Company");
    By Newsletter = By.id("Newsletter");
    By Password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By ConfirmRegistrationBTN = By.id("register-button");
    By logOut = By.className("ico-logout");


    public void clickRegister() {

        TestBase.wait.until(ExpectedConditions.visibilityOfElementLocated(registerLink));
        TestBase.driver.findElement(registerLink).click();
    }

    public void selectGender() {

        //   wait.until(ExpectedConditions.visibilityOfElementLocated(registerLink);
        TestBase.driver.findElement(gender).click();
    }

    public void setFirstName(String firstName)
    {
        TestBase.driver.findElement(FirstName).sendKeys(firstName);
    }

    public void setLastName(String lastName)
    {
        TestBase.driver.findElement(LastName).sendKeys(lastName);
    }

    public void setEmail(String email)
    {
        TestBase.driver.findElement(Email).sendKeys(email);
    }

    public void setCompany(String company)
    {
        TestBase.driver.findElement(Company).sendKeys(company);
    }

    public void enableNewsletter() {


        TestBase.driver.findElement(Newsletter).click();
    }

    public void setPassword(String password)
    {
        TestBase.driver.findElement(Password).sendKeys(password);
    }

    public void setConfirmPassword(String password)
    {
        TestBase.driver.findElement(ConfirmPassword).sendKeys(password);
    }


    public void confirmRegistration() {

        //   wait.until(ExpectedConditions.visibilityOfElementLocated(registerLink);
        TestBase.driver.findElement(ConfirmRegistrationBTN).click();
    }
    public void clickLogOut() {


        TestBase.driver.findElement(logOut).click();
    }
}
