package xhoang.example;

import java.util.logging.Logger;

interface LoginHandler {
    void login(String username, String password); // Added return type 'void'
}

class LoginHandlerImpl implements LoginHandler {
    private static final Logger logger = Logger.getLogger(LoginHandlerImpl.class.getName());

    public void login(String username, String password) {
        logger.info("Logging in with username: " + username + ", password: " + password);
    }
}

public class InterfaceNamingInconsistencyExample {
    public static void main(String[] args) {
        LoginHandler handler = new LoginHandlerImpl();
        handler.login("user123", "pass456");
    }
}