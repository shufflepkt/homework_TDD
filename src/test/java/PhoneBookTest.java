import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PhoneBookTest {
    @Test
    public void addTest() {
        String name = "Ivan", phoneNumber = "+79059999999";
        int expected = 1;
        var phoneBook = new PhoneBook();

        var result = phoneBook.add(name, phoneNumber);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void findByNumberTest() {
        var phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "+79059999999");
        phoneBook.add("Sergey", "+79058888888");
        phoneBook.add("Alexey", "+79055555555");
        String expectedName = "Sergey";
        String expectedPhoneNumber = "+79058888888";

        String result = phoneBook.findByNumber(expectedPhoneNumber);

        Assertions.assertEquals(expectedName, result);
    }

    @Test
    public void findByNameTest() {
        var phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "+79059999999");
        phoneBook.add("Sergey", "+79058888888");
        phoneBook.add("Alexey", "+79055555555");
        String expectedName = "Sergey";
        String expectedPhoneNumber = "+79058888888";

        String result = phoneBook.findByName(expectedName);

        Assertions.assertEquals(expectedPhoneNumber, result);
    }

    @Test
    public void printAllNamesTest() {
        var phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "+79059999999");
        phoneBook.add("Sergey", "+79058888888");
        phoneBook.add("Alexey", "+79055555555");
        List<String> expected = Arrays.asList("Alexey", "Ivan", "Sergey");

        List<String> result = phoneBook.printAllNames();

        Assertions.assertLinesMatch(expected, result);
    }
}
