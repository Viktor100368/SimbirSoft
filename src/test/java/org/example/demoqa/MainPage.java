package org.example.demoqa;

import org.example.core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MainPage extends BaseSeleniumPage {
    //полвученме локаторов
    Actions action = new Actions(driver);
    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(css = "input[id=\"userEmail\"]")
    private WebElement mail;
    @FindBy(xpath = "//label[text()='Male']")
    private WebElement gender;
    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement userNumber;
    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement date;
    @FindBy(xpath = "//option[@value='1980']")
    private WebElement year;
    @FindBy(xpath = "//option[@value='7']")
    private WebElement month;
    @FindBy(xpath = "//div[contains(text(),'20')]")
    private WebElement day;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement file;
    @FindBy(xpath = "//textarea[@placeholder=\"Current Address\"]")
    private WebElement text;
    @FindBy(xpath = "//div[@class=\"subjects-auto-complete__control css-yk16xz-control\"]")
    private WebElement subjects;
    @FindBy(xpath = "//label[@for=\"hobbies-checkbox-2\"]")
    private WebElement hobbies;
    @FindBy(xpath = "//div[contains(text(),'Select State')]")
    private WebElement state;
    @FindBy(xpath = "//div[contains(text(),'Select City')]")
    private WebElement city;
    @FindBy(id = "submit")
    private WebElement submit;





    public MainPage(){
        driver.get(StaticValue.url );
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        PageFactory.initElements(driver,this);
    }
    public MainPage runTest(String first,String last,String email,
    String number,String photo,String str){
        firstName.sendKeys(first);
        lastName.sendKeys(last);
        mail.sendKeys(email);
        gender.click();
        userNumber.sendKeys(number);
        date.click();
        year.click();
        month.click();
        day.click();
        file.sendKeys(photo);
        text.sendKeys(str);
        action.moveToElement(subjects).click().sendKeys(" ")
                .pause(Duration.ofMillis(300)).sendKeys(Keys.ENTER).perform();
        hobbies.click();
        action.moveToElement(state).click().pause(Duration.ofMillis(300))
                .sendKeys(Keys.ENTER).perform();
        action.moveToElement(city).click().pause(Duration.ofMillis(300))
                .sendKeys(Keys.ENTER).perform();
        //submit.submit();

        return this;
    }
    public ModalWindow openBackPage(){
        submit.submit();
        return new ModalWindow();
    }


}
