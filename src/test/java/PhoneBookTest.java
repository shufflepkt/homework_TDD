import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void addTest() {
        String name = "Ivan", phoneNumber = "+79059999999";
        int expected = 1;
        var phoneBook = new PhoneBook();

        var result = phoneBook.add(name, phoneNumber);

        Assertions.assertEquals(expected, result);
    }
}
