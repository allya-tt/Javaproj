package OOP;

import java.util.Scanner;

public class Main_Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.println("Введите фамилию: ");
        String familyName = scanner.nextLine();
        Person person = new Person(name, middleName, familyName);
        person.printName();
    }
}
