import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        if (name.equals("")) {
            System.out.println("Привет, Неизвестный!");
        } else {
        System.out.println("Привет, " + name + "!");}
        //        int i = a;
//        while (i <= b) {
//            if (i%2 == 0) {
//                evenSum = evenSum + i;
//            ++evenCount;}
//            sum = sum + i;
//            ++count;
//            ++i;
//        }
    }

}
