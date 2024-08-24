package org.example.core;

import org.openqa.selenium.WebDriver;
//применяем насторйки ко всем page файлам
public abstract class BaseSeleniumPage {
    protected static WebDriver driver;
    public static void setDriver(WebDriver webDriver ){
        driver= webDriver;
    }
}
