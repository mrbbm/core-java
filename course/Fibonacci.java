import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        int k = 0, a = 1, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.printf("%d %d ", a, b);

        while (k < n) {
            k = a + b;
            if (k > n) {
                break;
            }
            System.out.printf("%d ", k);
            a = b;
            b = k;
        }
    }
}