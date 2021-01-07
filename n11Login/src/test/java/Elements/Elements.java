package Elements;

import org.openqa.selenium.By;

public class Elements {

    public static By btnSignIn = By.className("btnSignIn"); //Anasayfadaki Giriş yap butonu
    public static By userNameField = By.id("email");  // kullanıcı adı alanı
    public static By passwordField = By.id("password"); // şifre alanı
    public static By loginButton = By.id("loginButton"); // Giriş ekranındaki giriş butonu
    public static By accountBtn = By.xpath("//a[@class=\'menuTitle\']"); // Anasayfada bulunan hesabım butonu
    public static By accountName = By.className("userName"); // hesap sayfasındaki hesap adı alanı
    public static By btnHolder = By.className("btnHolder"); // n11 e ilk girişteki onay kutucuğunun 'Tamam' butonu.
}
