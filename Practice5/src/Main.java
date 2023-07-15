import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Set<String>> phoneBook = new HashMap<>();

        addPhone(phoneBook, "Иванов", "+7911000000");
        addPhone(phoneBook, "Иванов", "+7911333333");
        addPhone(phoneBook, "Иванов", "+7912444444");
        addPhone(phoneBook, "Петров", "+7899111111");
        addPhone(phoneBook, "Дмитрий", "+7899111111");
        removePhone(phoneBook, "Иванов", "+7911333333");
        printPhoneBook(phoneBook);
    }

    public static void addPhone(Map<String, Set<String>> phoneBook, String name, String phone) {
        Set<String> phones = phoneBook.get(name);
        if (phones == null) {
            phones = new HashSet<>();
            phoneBook.put(name, phones);
        }
        phones.add(phone);
    }
    public static void removePhone(Map<String, Set<String>> phoneBook, String name, String phone) {
        Set<String> phones = phoneBook.get(name);
        if (phones != null) {
            phones.remove(phone);
            if (phones.isEmpty()) {
                phoneBook.remove(name);
            }
        }
    }

    public static void printPhoneBook(Map<String, Set<String>> phoneBook) {
        List<Map.Entry<String, Set<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(entries, (e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));
        for (Map.Entry<String, Set<String>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
