package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Steps {
    private WebDriver driver;
    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws
            Throwable
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mushu\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

        // Initialize the WebDriver
        driver = new FirefoxDriver();

        // Set implicit wait to handle dynamic elements

        System.out.println("User is on the login page");
        driver.get("http://www.demo.guru99.com/v4");
    }
    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable
    {
        WebElement userId = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        userId.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        password.sendKeys("12345678");

        System.out.println("This step enter the Username and Password on the login page.");
    }
    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable
    {
        WebElement resetButton = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]"));
        resetButton.click();
        System.out.println("This step click on the Reset button.");
    }

}