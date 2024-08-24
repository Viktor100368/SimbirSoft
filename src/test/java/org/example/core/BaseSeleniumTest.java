package org.example.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.*;

import java.time.Duration;

public abstract class BaseSeleniumTest {
    protected WebDriver driver;
    @Before
    // настройки chromeDrivera
    public void setUp(){
        WebDriverManager.chromedriver().setup();// берем актуальный chromeDriver
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        BaseSeleniumPage.setDriver(driver);
    }
    @After
    public void tireDown(){

        driver.close();
        driver.quit();
    }
}
