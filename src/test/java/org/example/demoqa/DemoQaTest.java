package org.example.demoqa;


import org.example.core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.Test;


public class DemoQaTest extends BaseSeleniumTest {
    ModalWindow page;

    @Test
    public void demoQa() {
        String title = "Thanks for submitting the form";

        MainPage page = new MainPage();
        page.runTest(StaticValue.first, StaticValue.last, StaticValue.email,
                StaticValue.number, StaticValue.photo, StaticValue.text)
                                            .openBackPage().checkingValue();
        Assert.assertEquals(title, ModalWindow.titlePage);
        Assert.assertEquals(StaticValue.first+" "+StaticValue.last, ModalWindow.userName);
        Assert.assertEquals(StaticValue.email, ModalWindow.userEmail);
        Assert.assertEquals(StaticValue.gender, ModalWindow.userGender);
        Assert.assertEquals(StaticValue.number, ModalWindow.userMobile);
        Assert.assertEquals(StaticValue.day+" "+StaticValue.month+"," +
                StaticValue.year, ModalWindow.userDate);
        Assert.assertEquals(StaticValue.hobby, ModalWindow.userHobby);
        String res = StaticValue.photo.substring(30);
        Assert.assertEquals(res, ModalWindow.userPicture);
        Assert.assertEquals(StaticValue.text, ModalWindow.userAddress);
    }
}
