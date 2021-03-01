package domain.person;

public class Person {

    private String name;
    private String surname;
    private Integer age;
    private Address address;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
