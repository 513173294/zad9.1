public class Person {
    String firstName;
    String lasttName;
    int age;
    int pesel;

    public Person(String firstName, String lasttName, int age, int pesel) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.age = age;
        this.pesel = pesel;
    }

      @Override
    public String toString() {
        return firstName + ", " + lasttName + ", " + age + ", " + pesel;
    }


}
