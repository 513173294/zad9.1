import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//

        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[1];


        int i = 0;
        int age = 0;
        String name = null;
        String surName = null;
        System.out.println("podaj imie: ");
        while (i < people.length)

            try {
                name = scanner.nextLine();
                if (name.length() < 2 || name == null) throw new NameUndefinedException();

            } catch (NameUndefinedException e) {
                System.out.println("Podales za krotkie imie");
            i=0;
                break;
            }

        try {
            System.out.println("podaj nazwisko");
            surName = scanner.nextLine();
            if (surName.length() < 2 || surName == null) throw new NameUndefinedException();
        } catch (NameUndefinedException e) {
            System.out.println("podales za krotkie nazwisko");


        }
        System.out.println("podaj wiek");
        try {
            age = scanner.nextInt();
            if (age < 1) throw new IncorrectAgeException();
        } catch (IncorrectAgeException ex) {
            System.out.println("podales za niski wiek");

        }
        System.out.println("podaj pesel");
        int pesel = scanner.nextInt();
        Person person = new Person(name, surName, age, pesel);
        people[i] = person;
        System.out.println(person);


    }
}
