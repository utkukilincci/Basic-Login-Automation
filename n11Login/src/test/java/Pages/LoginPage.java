package Pages;

import Base.BasePage;
import static Elements.Elements.*;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login(){
        String username = "utku.kilincci01@gmail.com";
        String password = "0556244uk";
        String accName = "utku kılınçcı";
        /**
         * Aşağıdaki kod,
         * n11 anasayfaya gidildiğine, kabul edilmesi gereken bir pencere
         * çıkıyor. Onu kapatmak için.
         */
        clickElement(btnHolder);

        waitToClickable(btnSignIn);
        clickElement(btnSignIn);
        waitToClickable(loginButton);
        sendKeys(userNameField,username);
        sendKeys(passwordField,password);
        clickElement(loginButton);
        waitToClickable(accountBtn);
        clickElement(accountBtn);
        assertText(accountName,accName);
        return new LoginPage(driver);
    }
}
