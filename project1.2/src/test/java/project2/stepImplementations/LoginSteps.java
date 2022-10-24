package project2.stepImplementations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import project2.runners.basicRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps{


     @Given("The employee is on the login page")
    public void the_employee_is_on_the_login_page() throws InterruptedException {
         basicRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=0");
         System.out.println("Line 28 was called!");
         Thread.sleep(3000);
     }
    @When("The employee types in g8tor into the username input")
    public void the_employee_types_in_g8tor_into_the_username_input() throws InterruptedException {
        WebElement usernameInput = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/fieldset[1]/input[1]"));
        usernameInput.click();
        usernameInput.clear();
        System.out.println("Line 37 was called!");
        usernameInput.sendKeys("g8tor");
        Thread.sleep(3000);

    }
    @When("The employee types in chomp! into the password input")
    public void the_employee_types_in_chomp_into_the_password_input() throws InterruptedException {
        WebElement passwordInput = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/fieldset[1]/input[2]"));
        Thread.sleep(3000);
        System.out.println("Line 44 was called!");
        passwordInput.sendKeys("chomp!!");
     }
    @When("The employee clicks on the login button")
    public void the_employee_clicks_on_the_login_button() throws InterruptedException {
        WebElement logInButton = basicRunner.driver.findElement(By.tagName("button"));
        Thread.sleep(3000);
        logInButton.click();
     }
    @Then("The employee should see an alert saying they have the wrong password")
    public void the_employee_should_see_an_alert_saying_they_have_the_wrong_password() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        String actualurl = basicRunner.driver.getCurrentUrl();
        Assert.assertEquals(actualurl, "https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=0");
    }

    @When("The employee types in sicEmDawgs into the username input")
    public void theEmployeeTypesInSicEmDawgsIntoTheUsernameInput() {
        basicRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=0");
        WebElement usernameInput = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/fieldset[1]/input[1]"));
        usernameInput.click();
        usernameInput.clear();
        usernameInput.sendKeys("sicEmDawgs");
    }

    @When("The employee types in natchamps into the password input")
    public void theEmployeeTypesInNatchampsIntoThePasswordInput() throws InterruptedException {
        WebElement passWordInput = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/fieldset[1]/input[2]"));
        passWordInput.click();
        passWordInput.clear();
        Thread.sleep(3000);
        passWordInput.sendKeys("natchamps");
    }

    @Then("The employee should see an alert saying no user with that username found")
    public void theEmployeeShouldSeeAnAlertSayingNoUserWithThatUsernameFound() {
        String actualurl = basicRunner.driver.getCurrentUrl();
        Assert.assertEquals(actualurl, "https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=0");


    }
}
