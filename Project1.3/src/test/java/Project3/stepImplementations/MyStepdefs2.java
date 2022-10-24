package Project3.stepImplementations;

import Project3.runner.basicRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MyStepdefs2 {
    @Given("The employee is on the Defect Reporter Page")
    public void theEmployeeIsOnTheDefectReporterPage() throws InterruptedException {
        System.out.println("Begining Step 4");
        basicRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=1");
        Thread.sleep(3000);
        WebElement usernameInput = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/fieldset[1]/input[1]"));
        usernameInput.click();
        usernameInput.clear();
        usernameInput.sendKeys("ryeGuy");
        Thread.sleep(3000);
        WebElement passwordInput = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/fieldset[1]/input[2]"));
        Thread.sleep(3000);
        passwordInput.sendKeys("coolbeans");
        WebElement logInButton = basicRunner.driver.findElement(By.tagName("button"));
        Thread.sleep(3000);
        logInButton.click();
        basicRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=1");
        Thread.sleep(1000);
    }

    @When("The employee selects todays date")
    public void theEmployeeSelectsTodaysDate() throws InterruptedException {
        WebElement dateInput = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/form[@id='defectReport']/input[1] "));
        dateInput.click();
        Thread.sleep(1000);
    }

    @When("The employee types in {string} with")
    public void theEmployeeTypesInWith(String arg0) throws InterruptedException {
         arg0 = "fff";
        WebElement DescriptionInput = basicRunner.driver.findElement(By.xpath(" //body/div[@id='root']/form[@id='defectReport']/textarea[1] "));
        DescriptionInput.click();
        Thread.sleep(1000);
        DescriptionInput.sendKeys(arg0);
        Thread.sleep(1000);
    }

    @When("The employee selects high priority")
    public void theEmployeeSelectsHighPriority() {
            WebElement DescriptionPriority = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/form[@id='defectReport']/input[2]"));
            DescriptionPriority.click();
    }

    @When("The employee selects low severity")
    public void theEmployeeSelectsLowSeverity() {
        WebElement DescriptionSeverity = basicRunner.driver.findElement(By.xpath("//body/div[@id='root']/form[@id='defectReport']/input[3]"));
        DescriptionSeverity.click();
    }

    @When("The employee clicks the report button")
    public void theEmployeeClicksTheReportButton() {
        WebElement reportButton = basicRunner.driver.findElement(By.xpath(" WebElement DescriptionSeverity = basicRunner.driver.findElement(By.xpath(\"//body/div[@id='root']/form[@id='defectReport']/input[3]\"));\n" +
                "        DescriptionSeverity.click();"));
        reportButton.click();
    }

    @Then("No confirmation dialog appears")
    public void noConfirmationDialogAppears() {

             try {
                basicRunner.driver.switchTo().alert();
             }   // try
            catch (NoAlertPresentException Ex) {
                System.out.println(Ex);
                 Assert.assertEquals(1, 2);
             }   // catch
        }




    @Then("There should be a confirmation box")
    public void thereShouldBeAConfirmationBox() {
        boolean confirmationBoxDisplayed = basicRunner.driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]")).isDisplayed();
        if( confirmationBoxDisplayed == true){
            Assert.assertEquals(1,1);
        }else{
            Assert.assertEquals(1, 2);
        }
    }

    @When("The employee clicks Ok")
    public void theEmployeeClicksOk() {
        basicRunner.driver.switchTo().alert().accept();

    }

    @Then("A modal should appear with a Defect ID")
    public void aModalShouldAppearWithADefectID() {
        boolean confirmationBoxDisplayed = basicRunner.driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]")).isDisplayed();
        if( confirmationBoxDisplayed == true){
            Assert.assertEquals(1,1);
        }else{
            Assert.assertEquals(1, 2);
        }
    }

    @When("The employee clicks close")
    public void theEmployeeClicksClose() {
    WebElement closeButton = basicRunner.driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
    closeButton.click();

    }

    @Then("The modal should disappear")
    public void theModalShouldDisappear() {
       List element = basicRunner.driver.findElements(By.cssSelector("body.ReactModal__Body--open:nth-child(2) div.ReactModalPortal:nth-child(5) div.ReactModal__Overlay.ReactModal__Overlay--after-open > div.ReactModal__Content.ReactModal__Content--after-open"));
        if(element.size()>0) {
            Assert.assertEquals(1, 2);
        }else{
            Assert.assertEquals(1, 1);
        }

    }

}
