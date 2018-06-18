public class Person {
    String firstName;
    String lasttName;
    int age;
    int pesel;

    public Person(String firstName, String lasttName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {
        if (firstName.length() < 2 || firstName == null) throw new NameUndefinedException();
        if (lasttName.length() < 2 || lasttName == null) throw new NameUndefinedException();
        if (age<1)throw new IncorrectAgeException();
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
