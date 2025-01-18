package lab13;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(
                "Зубенко",
                "Михаил",
                "Петрович",
                Gender.Male
        );

        System.out.println(person.toString());
    }
}
