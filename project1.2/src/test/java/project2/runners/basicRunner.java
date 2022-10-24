package project2.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@CucumberOptions(features = "classpath:features", glue="project2.stepImplementations")
public class basicRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeMethod//Will run before each cucumber scenario
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        System.out.println("SetUp method is called!");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }






            }







