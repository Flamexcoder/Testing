package Test;

import com.sun.jdi.ThreadReference;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Protivana {

    @FindBy(how= How.XPATH, using = "//a[@class='shop_btn btn_shadow py-2 px-4 px-lg-5 text-white d-inline-block h5 mb-0 shopnowbtn']")
    static WebElement shopnowbutton ;

    @FindBy(how= How.XPATH, using = "//a[@id='chocolateflavors']")
    static WebElement choclateaddtocart;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
   static WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
    static WebElement firstname;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
    static WebElement lastname;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Address']")
    static WebElement address;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Zip Code']")
    static WebElement zipcode;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Phone Number']")
    static WebElement phonenumber;

//    public static void take_screenshot() throws IOException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        System.setProperty(
//                "webdriver.chrome.driver",
//                "C:/selenium Webdriver/Chrome Driver/chromedriver.exe");
//        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshot, new File("D:\\Yammy"+ Math.random() +".jpg"));
//        System.out.println("screen captured  o yeah..");
//
//    }


void classanddrivers() throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    WebDriver driver = new ChromeDriver();
    System.setProperty(
            "webdriver.chrome.driver",
            "C:/selenium Webdriver/Chrome Driver/chromedriver.exe");
    driver.manage().window().maximize();

    Protivana pgfactory = PageFactory.initElements(driver, Protivana.class);
    Actions actions = new Actions(driver);

        driver.get("http://test.protivana.com/");
        Thread.sleep(3000);



    shopnowbutton.click();
    Thread.sleep(3000);


    choclateaddtocart.click();
    Thread.sleep(3000);


driver.navigate().to("http://test.protivana.com/checkout?id=0");
Thread.sleep(3000);

//    WebElement email= driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys("vikrant@innovanathinklabs.com");
//    WebElement firstname= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstname.sendKeys("Vikrant");
   // WebElement lastname= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastname.sendKeys("singh");
    //WebElement address= driver.findElement(By.xpath("//input[@placeholder='Address']"));
        address.sendKeys("D 41 SN Tower");
    //WebElement zipcode= driver.findElement(By.xpath("//input[@placeholder='Zip Code']"));
        zipcode.sendKeys("302004");
    //WebElement phonenumber= driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
        phonenumber.sendKeys("7414076128");
        Thread.sleep(3000);

        WebElement statedrpdwn= driver.findElement(By.xpath("//select[@id='floatingSelectState']"));
        Select statedropdown= new Select(statedrpdwn);
        statedropdown.selectByValue("Rajasthan");
        Thread.sleep(3000);

        WebElement citydrpdwn = driver.findElement(By.xpath("//select[@id='floatingSelectCity']"));
        Select citydropdown = new Select(citydrpdwn);
        citydropdown.selectByValue("Kota");
        Thread.sleep(3000);

        WebElement paynowbutton = driver.findElement(By.xpath("//button[@id='payNow']"));
        paynowbutton.click();
        Thread.sleep(3000);

        // IFrame
        driver.switchTo().frame("Easebuzz-Checkout");
                Thread.sleep(3000);
        WebElement Upipaybutton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[4]/div/div[3]"));
            Upipaybutton.click();
            Thread.sleep(3000);
        WebElement Upiradiobutton = driver.findElement(By.xpath("//input[@value='vpa']"));
            Upiradiobutton.click();
            Thread.sleep(3000);
        WebElement upiId = driver.findElement(By.xpath("//input[@placeholder='Enter your UPI ID']"));
        upiId.sendKeys("success@easebuzz");
        Thread.sleep(3000);
        WebElement checkoutbutton = driver.findElement(By.xpath("//button[@class='pay-btn']"));
        checkoutbutton.click();
        Thread.sleep(3000);

        //driver.navigate().to('http://test.protivana.com/Success');
         driver.getCurrentUrl();
    Thread.sleep(1000);
    TakesScreenshot screenshot= ((TakesScreenshot)driver);
    File ss = new File("D:\\Yammy"+ Math.random() +".jpg");
    System.out.println(ss.getAbsolutePath());
    System.out.println(ss.getName());





    Thread.sleep(1000);







        driver.quit();
}





}
