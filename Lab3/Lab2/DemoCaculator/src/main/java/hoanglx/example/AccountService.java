package hoanglx.example;

public class AccountService {
    public boolean registerAccount(String username, String password, String email) {
        if (username == null || username.isEmpty()) {
            return false;
        }
        if (password == null || password.length() <= 6) {
            return false;
        }
        if (!isValidEmail(email)) {
            return false;
        }
        return true;
    }

    public boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        // Sửa regex để yêu cầu domain có ít nhất một dấu chấm
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,}$";
        return email.matches(emailRegex);
    }
}
