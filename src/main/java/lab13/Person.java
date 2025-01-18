package lab13;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    private Gender gender;

    public Person(String lastName, String firstName, String middleName, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + " " + gender;
    }
}
