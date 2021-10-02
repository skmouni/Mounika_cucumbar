package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    static WebDriver driver;
    @Given("openbrowser")
    public void openbrowser() {
        System.out.println("hello");
        System.setProperty("webdriver","drivers/chromedriver.exe");
            driver=new ChromeDriver();
    }

    @When("enter the url {string}")
    public void enterTheUrl(String url) {
      driver.get(url);
    }

    @And("click on my account")
    public void clickOnMyAccount() {
        driver.findElement(By.xpath("//a[text()='My Account']")).click();
        
    }

    @And("enter rigister user name and password")
    public void enterRigisterUserNameAndPassword() {
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("mouni");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("46364");

        
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        driver.findElement(By.xpath("//*[@name='login']")).click();

        
    }

    @Then("user mustbe sucessesfully login to the webpage")
    public void userMustbeSucessesfullyLoginToTheWebpage() {
    }
}
