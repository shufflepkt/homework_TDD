import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();
    public int add(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, phoneNumber);
        }
        return phoneBook.size();
    }

    public String findByNumber(String phoneNumber) {
        if (!phoneBook.containsValue(phoneNumber)) {
            return null;
        }

        Optional<String> name = phoneBook
                .entrySet()
                .stream()
                .filter(e -> phoneNumber.equals(e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

        return name.orElse(null);
    }

    public String findByName(String name) {
        if (!phoneBook.containsKey(name)) {
            return null;
        }
        return phoneBook.get(name);
    }
}
