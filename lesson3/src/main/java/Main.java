import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
телефонных номеров. В этот телефонный справочник с помощью метода add() можно
добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
справочника.*/
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Рифнур", "88888888888");
        phoneBook.add("Рифнур", "88888888881");
        phoneBook.add("Рифнур", "81888888111");
        phoneBook.add("Рифнур", "82222222222");
        phoneBook.add("Вахитов", "82222222222");

        System.out.println(phoneBook);


    }

    static class PhoneBook {
        private Map<String, Set<String>> entries;

        @Override
        public String toString() {
            return "PhoneBook{" + "entries=" + entries +                   '}';
        }

        public PhoneBook() {
            this.entries = new HashMap<>();
        }

        public void add(String surname, String phone) {
            Set<String> entry = entries.getOrDefault(surname, new HashSet<>());
            entry.add(phone);
            entries.put(surname, entry);
        }

        public Set<String> get(String surname) {
            return entries.get(surname);
        }

    }
}
