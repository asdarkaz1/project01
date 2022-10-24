package Project3.stepImplementations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import Project3.runner.basicRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class assignDefectSteps {
    SoftAssert softassert = new SoftAssert();
    SoftAssert softassert2 = new SoftAssert();
    @Given("The manager is logged in as a manager")
    public void the_manager_is_logged_in_as_a_manager() throws InterruptedException {
        System.out.println("Scenario 1");
        basicRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=0");
        Thread.sleep(500);
        WebElement usernameInput = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/fieldset[1]/input[1]"));
        usernameInput.click();
        usernameInput.clear();
        usernameInput.sendKeys("g8tor");
        Thread.sleep(500);
        WebElement passwordInput = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/fieldset[1]/input[2]"));
        Thread.sleep(500);
        passwordInput.sendKeys("chomp!");
        WebElement logInButton = basicRunner.driver.findElement(By.tagName("button"));
        logInButton.click();
        Thread.sleep(500);
    }

    @Given("The manager is on the home page")
    public void the_manager_is_on_the_home_page() {
        String actualurl = basicRunner.driver.getCurrentUrl();
     }

    @Then("The manager should see pending defects")
    public void the_manager_should_see_pending_defects() {

        boolean pendingDefects = basicRunner.driver.findElement(By.xpath("//thead/tr/th[1]")).isDisplayed();
        if(pendingDefects){
            softassert.assertEquals(1,1);
        }else{
            softassert.assertEquals(1,0);
        }

     }

    @When("The manager clicks on the select button for a defect")
    public void the_manager_clicks_on_the_select_button_for_a_defect() throws InterruptedException {
        WebElement login = basicRunner.driver.findElement(By.xpath("//tbody//tr//td//button"));
        login.click();
        Thread.sleep(1000);
     }

@Then("The defect description should appear in bold")
public void the_defect_description_should_appear_in_bold() throws InterruptedException {
    boolean pendingDefects = basicRunner.driver.findElement(By.xpath("//thead/tr/th[2]")).isDisplayed();
    if(pendingDefects){
        softassert2.assertEquals(1,1);
    }else{
        softassert2.assertEquals(1,0);
    }
    Thread.sleep(1000);
    }

@When("The manager selects an tester from the drop down")
public void the_manager_selects_an_tester_from_the_drop_down() throws InterruptedException {

        WebElement selector = basicRunner.driver.findElement(By.xpath(" //body/div[@id='root']/div[1]/input[1]"));
        selector.click();
        Thread.sleep(1000);
         }

@When("The manager clicks assign")
public void the_manager_clicks_assign() {

                                       }

@Then("The defect should disappear from the list")
public void the_defect_should_disappear_from_the_list() {
        // Write code here that turns the phrase above into concrete actions
         }

        @Given("The assigned tester is on their home page")
public void the_assigned_tester_is_on_their_home_page() throws InterruptedException {
            System.out.println("Scenario 2");
            basicRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=0");
            Thread.sleep(500);
            WebElement usernameInput = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/fieldset[1]/input[1]"));
            usernameInput.click();
            usernameInput.clear();
            usernameInput.sendKeys("ryeGuy");
            Thread.sleep(500);
            WebElement passwordInput = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/fieldset[1]/input[2]"));
            Thread.sleep(500);
            passwordInput.sendKeys("coolbeans");
            WebElement logInButton = basicRunner.driver.findElement(By.tagName("button"));
            logInButton.click();
            Thread.sleep(500);

        }

@Then("The tester should see the pending defect")
public void the_tester_should_see_the_pending_defect() throws InterruptedException {
    boolean pendingDefects = basicRunner.driver.findElement(By.xpath( "//b[contains(text(),'Pending')]")).isDisplayed();
    System.out.println("Test 1 done.");
   if(pendingDefects) {
       Assert.assertEquals(1,1);
   }else{
       Assert.assertEquals(1, 2);
   }

   Thread.sleep(1000);

    }


}
