import java.util.Scanner;
public class tot{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        long a = 2147483647;
        long b = a;
        long begin = 0;
        long end = a;
        while (true) {
            if ((begin + end) == 1) {
                a = (begin + end) / 2 + 1;
            } else {
                a = (begin + end) / 2;
            }

            System.out.println("The expected number is greater than " + a + " 2-it is equal to him; 1-yes; 0-no, less");
            res = scanner.nextInt();

            if (res == 2) {
                System.out.println("Number guessed!");
                break;
            }
            if (res == 1) {
                begin = a;
            }
            if (res == 0) {
                end = a;
            }
        }
    }
}
