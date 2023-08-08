import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int a = 5;
        int b = a + 5;
//        System.out.println("The sum of a and b is " + (a + b));
//        System.out.println(a>4);
        //String s1 = "Hello";
        String s2 = "world";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first string: ");
        String s1 = scanner.nextLine();
        int lenght1 = s1.length();
        int lenght2 = s2.length();
        System.out.println("Are the strings the same? - " + (s1.equals(s2)));
    }

}
