package org.example.demoqa;

import org.example.core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalWindow extends BaseSeleniumPage {
    //преременные для сохранения полей формы
      static String titlePage;
      static String userName;
      static String userEmail;
      static String userGender;
      static String userMobile;
      static String userDate;
      static String userSubjects;
      static String userHobby;
      static String userPicture;
      static String userAddress;
      static String userStateCity;
    //получение локаторов
    @FindBy(xpath = "//div[@class=\"modal-title h4\"]")
    private WebElement title;
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    private WebElement firstAndLast;
    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    private WebElement email;
    @FindBy(xpath = "//tbody/tr[3]/td[2]")
    private WebElement gender;
    @FindBy(xpath = "//tbody/tr[4]/td[2]")
    private WebElement mobile;
    @FindBy(xpath ="//tbody/tr[5]/td[2]")
    private WebElement date;
    @FindBy(xpath = "//tbody/tr[6]/td[2]")
    private WebElement subjects;
    @FindBy(xpath = "//tbody/tr[7]/td[2]")
    private WebElement hobby;
    @FindBy(xpath = "//tbody/tr[8]/td[2]")
    private WebElement picture;
    @FindBy(xpath = "//tbody/tr[9]/td[2]")
    private WebElement address;
    @FindBy(xpath = "//tbody/tr[10]/td[2]")
    private WebElement stateAndCity;

    public ModalWindow(){
        PageFactory.initElements(driver,this);
    }
    public ModalWindow checkingValue(){
        titlePage=title.getText();
        userName= firstAndLast.getText();
        userEmail = email.getText();
        userGender = gender.getText();
        userMobile = mobile.getText();
        userDate = date.getText();
        userSubjects = subjects.getText();
        userHobby = hobby.getText();
        userPicture = picture.getText();
        userAddress = address.getText();
        userStateCity = stateAndCity.getText();
        return this;
    }

}
