import Base.BaseTest;
import Pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Before
    public void before(){
        loginPage = new LoginPage(getDriver());
    }
    @Test
    public void login(){
        loginPage.login();
    }

}
