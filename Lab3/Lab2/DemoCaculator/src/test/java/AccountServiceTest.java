
import hoanglx.example.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


public class AccountServiceTest {
    private AccountService accountService;

    @BeforeEach
    void setUp() {
        accountService = new AccountService();
    }

    // Test từ dữ liệu CSV
    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1) // Đọc file test-data.csv, bỏ qua dòng tiêu đề
    void testRegisterAccount_FromCsvFile(String username, String password, String email, boolean expected) {
        // Gọi phương thức registerAccount với các tham số từ CSV
        boolean result = accountService.registerAccount(username, password, email);
        // So sánh kết quả thực tế với kết quả kỳ vọng từ file CSV
        // Nếu không khớp, hiển thị thông báo lỗi với thông tin chi tiết
        assertEquals(expected, result,
                String.format("Registration failed for username=%s, password=%s, email=%s",
                        username, password, email));
    }

    // Test kiểm tra isValidEmail với email hợp lệ
    @Test
    void testIsValidEmail_ValidEmail_ReturnsTrue() {
        // Gọi isValidEmail với email hợp lệ
        boolean result = accountService.isValidEmail("test@example.com");
        // Kiểm tra kết quả phải là true, nếu không thì hiển thị thông báo lỗi
        assertTrue(result, "Valid email should return true");
    }

    // Test kiểm tra isValidEmail với email null
    @Test
    void testIsValidEmail_NullEmail_ReturnsFalse() {
        // Gọi isValidEmail với email null
        boolean result = accountService.isValidEmail(null);
        // Kiểm tra kết quả phải là false, nếu không thì hiển thị thông báo lỗi
        assertFalse(result, "Null email should return false");
    }

    // Test kiểm tra isValidEmail với email rỗng
    @Test
    void testIsValidEmail_EmptyEmail_ReturnsFalse() {
        // Gọi isValidEmail với email rỗng
        boolean result = accountService.isValidEmail("");
        // Kiểm tra kết quả phải là false, nếu không thì hiển thị thông báo lỗi
        assertFalse(result, "Empty email should return false");
    }

    // Test kiểm tra isValidEmail với email không hợp lệ
    @Test
    void testIsValidEmail_InvalidEmailFormat_ReturnsFalse() {
        // Gọi isValidEmail với email không hợp lệ (thiếu dấu chấm trong domain)
        boolean result = accountService.isValidEmail("invalid.email@com");
        // Kiểm tra kết quả phải là false, nếu không thì hiển thị thông báo lỗi
        assertFalse(result, "Invalid email format should return false");
    }
}
