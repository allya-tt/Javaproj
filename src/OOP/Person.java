package OOP;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    public Person(String name, String middleName, String familyName) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
        }
        System.out.println("Имя было изменено");
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        if (!(middleName.length() == 0)) {
            this.middleName = middleName;
        }
        System.out.println("Фамилия была изменена");
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(){
        if (!(familyName.length() == 0)) {
            this.familyName = familyName;
        }
        System.out.println("Отчество было изменено");
    }
    @Override
    public String toString(){
        return "{" + familyName + " " + name + " " + middleName + "}";
    }
}
