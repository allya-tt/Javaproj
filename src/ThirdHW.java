import java.util.Scanner;
public class ThirdHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        int sumDidgits = 0;
        int oddDidgits = 0;
        int maxDigit = 0;
        while (a > 0) {
            sumDidgits = sumDidgits + a % 10;
            if (checkNumber(a%10)) {
                oddDidgits = oddDidgits + a%10;
            }
            if (a%10 >= maxDigit) {
                maxDigit = a%10;
            }
            a /= 10;
        }
        System.out.println("Сумма цифр числа = " + sumDidgits);
        System.out.println("Сумма нечетных цифр числа = " + oddDidgits);
        System.out.println("Максимальная цифра числа = " + maxDigit);

    }
    public static boolean checkNumber(int a) {
        return (a % 2 != 0);
    }
}
