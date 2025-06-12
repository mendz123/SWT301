import org.junit.jupiter.api.Test;
import xhoang.example.InsecureLogin;

class InsecureLoginTest {
    @Test
    void testLoginSuccess() {
        InsecureLogin.login("admin", "123456");

    }

    @Test
    void stLoginFail() {
        InsecureLogin.login("user", "wrongpassword");
    }

    @Test
    void testPrintUserInfo() {
        InsecureLogin insecureLogin = new InsecureLogin();
        insecureLogin.printUserInfo("John Doe");
    }

}
