import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нижнюю границу диапазона: ");
        int a = scanner.nextInt();
        System.out.println("Введите верхнюю границу диапазона: ");
        int b = scanner.nextInt();
        int sum = 0;
        int evenSum = 0;
        int evenCount = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i%2 == 0) {
                evenSum = evenSum + i;
                ++evenCount;}
            sum = sum + i;
            ++count;
        }
//        int i = a;
//        while (i <= b) {
//            if (i%2 == 0) {
//                evenSum = evenSum + i;
//            ++evenCount;}
//            sum = sum + i;
//            ++count;
//            ++i;
//        }
        float avg = (float) sum / count;
        System.out.println("Среднее арифметическое диапазона чисел с " + a + " по " + b + " = " + avg);
        float evenAvg = (float) evenSum / (evenCount);
        System.out.println("Среднее арифметическое диапазона только четных чисел с " + a + " по " + b + " = " + evenAvg);
    }
}
