import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[3];
        System.out.println("podaj imie");
        String name = scanner.nextLine();
        if (name == null) throw new NameUndefinedException();
        else if (name.length() < 2) {
            throw new NameUndefinedException();
        }

        System.out.println("podaj nazwisko");
        String surName = scanner.nextLine();
        if (surName == null) throw new NameUndefinedException();
        else if (surName.length() < 2) {
            throw new NameUndefinedException();
        }
        System.out.println("podaj wiek");
        int age = scanner.nextInt();
        if (age<1)throw new IncorrectAgeException();

        System.out.println("podaj pesel");
        int pesel = scanner.nextInt();
        Person person = new Person(name, surName, age, pesel);
        String per = person.toString();
        System.out.println("to wyszlo");
        System.out.println(per);
    }
}
