package OOP;

import OOP.Main_Person;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;
    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
            System.out.println("Имя было изменено");
        }
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        if (!(middleName.length() == 0)) {
            this.middleName = middleName;
            System.out.println("Фамилия была изменена");
        }
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(){
        if (!(familyName.length() == 0)) {
            this.familyName = familyName;
            System.out.println("Отчество было изменено");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (!(age < 0) && !(age == this.age)) {
            this.age = age;
            System.out.println("Возраст был изменен");
        }
    }
    @Override
    public String toString(){
        return "{" + familyName + " " + name + " " + middleName + "}";
    }
    public void printName() {
        System.out.println("Name = " + name);
    }
    public void printBirthAge() {
        System.out.println("The year of birth is " + (2023-age));
    }
    public int getBirthYear() {
        return (2023-age);
    }
}
