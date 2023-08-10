public class Secondex {
    public static void main(String[] args) {
        for (int i = 100; i>=1; i--){
            if (checkNumber(i) == true) {
                System.out.println(i);
            }
        }
    }
    public static boolean checkNumber(int a){
        return (a % 4 == 0);
    }
}
