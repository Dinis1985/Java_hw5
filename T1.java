// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что 1 человек может иметь несколько телефонов

import java.util.HashMap;
import java.util.List;

public class T1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Иванов");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Иванов", List.of("1234", "4321"));
        phoneBook.put("Петров", List.of("3456", "6543"));
        phoneBook.put("Сидоров", List.of("5678", "8765"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}