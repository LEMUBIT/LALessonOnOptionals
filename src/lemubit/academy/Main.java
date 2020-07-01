package lemubit.academy;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        var person = number(1);
        person.ifPresent(p -> System.out.println(p.name));
    }

    static Optional<Person> number(int position) {
        Person person = null;

        var personList = List.of(
                new Person("Daniel", 12),
                new Person("David", 11),
                new Person("Jack", 30));

        if (position >= 0 && position < personList.size()) {
            person = personList.get(position);
        }

        return Optional.ofNullable(person);
    }
}
