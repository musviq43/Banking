package org.example;////package org.example;
////
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.firefox.FirefoxDriver;
////import java.time.Duration;
////public class Main {
////    public static void main(String[] args) {
////                // Set the path to the ChromeDriver executable.
////        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mushu\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
////                // Create a ChromeDriver instance.
////                WebDriver driver = new FirefoxDriver();
////
////                // Open a website.
////                driver.get("https://www.saucedemo.com/");
////
////                // Find and enter login credentials (you can replace these with valid credentials).
////                WebElement usernameField = driver.findElement(By.id("user-name"));
////                usernameField.sendKeys("standard_user");
////
////                WebElement passwordField = driver.findElement(By.id("password"));
////                passwordField.sendKeys("secret_sauce");
////
////                WebElement loginButton = driver.findElement(By.id("login-button"));
////                loginButton.click();
////
////                WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
////                addToCart.click();
////
////
////
////
////                // Wait for a few seconds to let the search results load (you can use explicit waits for better reliability).
//////                try {
//////                    Thread.sleep(5000); // Sleep for 5 seconds.
//////                } catch (InterruptedException e) {
//////                    e.printStackTrace();
//////                }
////
////                // Close the browser.
////                driver.quit();
////            }
////        }
////package org.example;
////
////import com.google.common.annotations.VisibleForTesting;
////import org.junit.Assert;
////import org.junit.Before;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.firefox.FirefoxDriver;
////import org.openqa.selenium.interactions.Actions;
//
////public class Main {
////
////    @org.junit.Test
////    public void test() throws Exception{
////        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mushu\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
////
////        // Initialize ChromeDriver
////        WebDriver driver = new FirefoxDriver();
////        driver.get("https://the-internet.herokuapp.com/upload");
//
////Locating upload filebutton
////        WebElement upload =driver.findElement(By.id("drag-drop-upload"));
////        Thread.sleep(2000);
////
////
////        upload.sendKeys("C:\\Users\\Mushu\\Desktop\\CV_QA.pdf");
////        Thread.sleep(2000);
////
////
////        WebElement submit =driver.findElement(By.id("file-submit"));
////        submit.click();
////        Thread.sleep(2000);
////
////        String actualMessage = driver.findElement(By.xpath("/html/body/h1")).getText();
////        Assert.assertNotEquals("Internal Server Error", actualMessage);
////
////        WebElement sourceElement =driver.findElement(By.id("drag-drop-upload"));
////        Thread.sleep(2000);
////
////
////        sourceElement.sendKeys("C:\\Users\\Mushu\\Desktop\\CV_QA.pdf");
////        Thread.sleep(2000);
////        WebElement dragupload =driver.findElement(By.id("drag-drop-upload"));
////
////
////
////
////
////
////        driver.quit();
////    }
////}
//package org.example;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import java.time.Duration;
//import org.testng.annotations.Test;
//public class Main {
////
//    @org.testng.annotations.Test
//    public void test() throws Exception{
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mushu\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
//
//        // Initialize ChromeDriver
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://the-internet.herokuapp.com/upload");
//
////Locating upload filebutton
//        WebElement upload =driver.findElement(By.id("drag-drop-upload"));
//        Thread.sleep(2000);
//
//
//        upload.sendKeys("C:\\Users\\Mushu\\Desktop\\CV_QA.pdf");
//        Thread.sleep(2000);
//
//
//        WebElement submit =driver.findElement(By.id("file-submit"));
//        submit.click();
//        Thread.sleep(2000);
//
//        String actualMessage = driver.findElement(By.xpath("/html/body/h1")).getText();
//        Assert.assertNotEquals("Internal Server Error", actualMessage);
//
//        WebElement sourceElement =driver.findElement(By.id("drag-drop-upload"));
//        Thread.sleep(2000);
//
//
//        sourceElement.sendKeys("C:\\Users\\Mushu\\Desktop\\CV_QA.pdf");
//        Thread.sleep(2000);
//        WebElement dragupload =driver.findElement(By.id("drag-drop-upload"));
//
//
//
//
//
//
//        driver.quit();
//    }
//}
//import java.net.MalformedURLException;
//
//import java.net.URL;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.AppiumDriver;
//
//import io.appium.java_client.android.AndroidDriver;
//
//public class AppiumTestcase {
//
//    public static void main(String[] args) {
//
////Set the Desired Capabilities
//        AppiumDriver<MobileElement> driver;
//
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//
//        caps.setCapability("deviceName", "Galaxy A50");
//
//        caps.setCapability("udid", "R58N917RMNR"); //Give Device ID  caps.setCapability("platformName", "Android");
//
//        caps.setCapability("platformName", "Android");
//
//        caps.setCapability("platformVersion", "13.0");
//
//        caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
//
//        caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
//
//        caps.setCapability("noReset", "true");
//
////Instantiate Appium Driver
//
//        try {
//
//            AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
//
//        } catch (MalformedURLException e) {
//
//            System.out.println(e.getMessage());
//
//        }
//
//    }
//
//}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Banking {
    public WebDriver webDriver;
    public WebDriverWait webDriverWait;

    @BeforeClass
    public void initializeWebDriver() {
        System.out.println("Initializing  browser");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mushu\\Downloads\\geckodriver-v0.33.0-win64");
        webDriver = new FirefoxDriver();
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @Test(priority = 1)
    public void performCustomerLogin() {
        WebElement loginButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")));
        loginButton.click();

        Select customerSelector = new Select(webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"userSelect\"]"))));
        customerSelector.selectByValue("1");

        WebElement loginSubmitButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/form/button")));
        loginSubmitButton.click();
    }

    @Test(priority = 2)
    public void performTransactions() {
        WebElement transactionsButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]")));
        transactionsButton.click();
    }

    @Test(priority = 3)
    public void performDeposit() {
        WebElement depositButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")));
        depositButton.click();

        WebElement depositInputField = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")));
        depositInputField.sendKeys("1000");

        WebElement depositSubmitButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")));
        depositSubmitButton.click();
    }

    @Test(priority = 4)
    public void performWithdrawal() {
        WebElement withdrawalButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")));
        withdrawalButton.click();

        WebElement withdrawalInputField = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")));
        withdrawalInputField.sendKeys("1000");

        WebElement withdrawalSubmitButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")));
        withdrawalSubmitButton.click();
    }

    @Test(priority = 5)
    public void interactWithCustomerCare() {
        WebElement customerCareButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a")));
        customerCareButton.click();

        WebElement nameInputField = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"name\"]")));
        nameInputField.sendKeys("Mushvig");

        WebElement emailInputField = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
        emailInputField.sendKeys("m.iskandarov@gmail.com");

        WebElement phoneInputField = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"phone\"]")));
        phoneInputField.sendKeys("0506484886");

        WebElement messageInputField = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"message\"]")));
        messageInputField.sendKeys("Experiencing issues with login.");

        WebElement submitButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[5]/td[2]/input")));
        submitButton.click();
    }

    @Test(priority = 6)
    public void initiateBankManagerLogin() {
        WebElement bankManagerButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")));
        bankManagerButton.click();
    }

    @Test(priority = 7)
    public void addNewCustomer() {
        WebElement addCustomerButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")));
        addCustomerButton.click();

        WebElement firstNameInputField = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")));
        firstNameInputField.sendKeys("Hey");

        WebElement lastNameInputField = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")));
        lastNameInputField.sendKeys("Peter");

        WebElement pinInputField = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")));
        pinInputField.sendKeys("737373");

        WebElement submitButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")));
        submitButton.click();
    }

    @Test(priority = 8)
    public void openNewAccount() {
        WebElement openAccountButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")));
        openAccountButton.click();

        Select customerNameDropdown = new Select(webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"userSelect\"]"))));
        customerNameDropdown.selectByValue("1");

        Select currencyDropdown = new Select(webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"currency\"]"))));
        currencyDropdown.selectByValue("1");

        WebElement submitButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/button")));
        submitButton.click();
    }

    @Test(priority = 9)
    public void viewCustomers() {
        WebElement customersButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[3]")));
        customersButton.click();

        WebElement viewDetailsButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[5]/button")));
        viewDetailsButton.click();
    }

    @AfterClass
    public void closeWebDriver() {
        webDriver.close();
    }
}



