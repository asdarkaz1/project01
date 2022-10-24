package Project3.stepImplementations;

import Project3.runner.basicRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyStepdefs {
    @Given("The tester is on the Home Page")
    public void theTesterIsOnTheHomePage() throws InterruptedException {
        System.out.println("Scenario 3");
        basicRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=0");
        Thread.sleep(1000);
    }

    @Then("The tester can can see only defects assigned to them")
    public void theTesterCanCanSeeOnlyDefectsAssignedToThem() {
        boolean visible = basicRunner.driver.findElement(By.xpath("//h3[contains(text(),'My Defects')]")).isDisplayed();
        if(visible){
            Assert.assertEquals( 1,1);
        }else{
            Assert.assertEquals(1, 2);
        }
    }

    @When("The tester changes to defect to any status")
    public void theTesterChangesToDefectToAnyStatus() throws InterruptedException {
        WebElement statusButton
                = basicRunner.driver.
                findElement(By.xpath("//body[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]"));
        statusButton.click();
        Thread.sleep(1000);
        WebElement statusButton2
                = basicRunner.driver.
                findElement(By.xpath("//body[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]"));
        statusButton.click();
        Thread.sleep(1000);
    }

    @Then("The tester should see the defect has a different status")
    public void theTesterShouldSeeTheDefectHasADifferentStatus() {
        boolean isAcceptedThere = basicRunner.driver.findElement(By.xpath("//body[1]/div[1]/ul[1]/li[2]/div[1]/span[1]/p[1]/b[2]")).equals("Accepted");

                if(isAcceptedThere == true){
                    Assert.assertEquals(1, 2);
                }else{
                    Assert.assertEquals(1, 1);
                }

    }
}
