import java.util.Scanner;

public class AverageHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нижнюю границу диапазона: ");
        int lowRange = scanner.nextInt();
        System.out.println("Введите верхнюю границу диапазона: ");
        int upperRange = scanner.nextInt();
        int sum = 0;
        int evenSum = 0;
        int evenCount = 0;
        int count = 0;
        for (int i = lowRange; i <= upperRange; i++) {
            if (i%2 == 0) {
                evenSum = evenSum + i;
                ++evenCount;}
            sum = sum + i;
            ++count;
        }
        float avg = (float) sum / count;
        System.out.println("Среднее арифметическое диапазона чисел с " + lowRange + " по " + upperRange + " = " + avg);
        float evenAvg = (float) evenSum / (evenCount);
        System.out.println("Среднее арифметическое диапазона только четных чисел с " + lowRange + " по " + upperRange + " = " + evenAvg);
    }
}
