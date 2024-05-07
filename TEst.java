       // package Test;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.apache.commons.io.FileUtils;
        import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.interactions.Actions;
        import org.testng.annotations.Test;


        import org.openqa.selenium.TakesScreenshot;

        import java.io.File;
        import java.util.concurrent.TimeUnit;


  /*      public class TEst {
        @Test
            public static void Launch () throws InterruptedException {



            Actions action = new Actions(driver);


                WebDriverManager.chromedriver().setup();
                WebDriver driver  = new ChromeDriver();
                    System.setProperty(
                            "webdriver.chrome.driver",
                            "C:/selenium Webdriver/Chrome Driver/chromedriver.exe");
                        driver.manage().window().maximize();
                    // Instantiate a ChromeDriver class.


                // Maximize the browser


                 Launch Website
            WebElement homepageurl =driver.get("https://puja.anytimeastro.com/");
            WebElement allproducturl = driver.get("https://puja.anytimeastro.com/products");
              Thread.sleep(3000);
            WebElement locator = driver.findElement(By.xpath("//div[@class='col-12 text-center mt-4']//a"));
            locator.click();
            Thread.sleep(5000);
            WebElement pricebutton = driver.findElement(By.cssSelector("div[class='414498 col-md-3 col-6'] h3"));
          "(//div[@class='box-text']/span)[7]"))



            driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);


            String Price= pricebutton.getText();
            System.out.println("Desired Text :"+Price);



             ALert box dismiss on the login page

            driver.get("https://puja.anytimeastro.com/login");

            WebElement textbox= driver.findElement(By.xpath("//input[@placeholder='Enter Email']"));
            textbox.click();

            textbox.sendKeys("vikrant@innovanathinklabs.com");
            WebElement OTPbutton= driver.findElement(By.xpath("//button[@class='site-btn-sm get-password-btn']"));
            OTPbutton.click();
            Thread.sleep(3000);
            WebElement submitbutton = driver.findElement(By.xpath("//button[@class='site-btn login-password-verify-btn']"));
            submitbutton.click();
            Thread.sleep(3000);
                driver.switchTo().alert().dismiss();


         Add product to cart
           driver.get("https://puja.anytimeastro.com/");
            Thread.sleep(3000);

           WebElement chooseoption = driver.findElement(By.xpath("(//li[@class='414508']/div/div/a)[1]"));
           chooseoption.click();
           Thread.sleep(3000);

           driver.navigate().to("https://puja.anytimeastro.com/product/krishna-puja-to-get-rid-of-planetary-afflictions-family-issues-185");
            Thread.sleep(5000);
           WebElement cartbutton = driver.findElement(By.xpath("//button[@class='btn1 me-3 product-add-to-cart-button']"));
           cartbutton.click();
           Thread.sleep(3000);



                 driver.quit();
            }
        }
*/