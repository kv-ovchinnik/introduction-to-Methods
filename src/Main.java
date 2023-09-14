
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите два числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = Math.Sum(a, b);
        System.out.println("%d + %d = %d".formatted(a, b, c));
        System.out.println("%d - %d = %d".formatted(a, b, Math.Diff(a, b)));
        System.out.println("%d * %d = %d".formatted(a, b, Math.Prod(a, b)));
        System.out.println("%d / %d = %f".formatted(a, b, Math.Div(a, b)));
    }

}

class Math {
    static int Sum(int a, int b) {
        int c = a + b;
        return c;

    }

    static int Diff(int a, int b) {
        return a - b;
    }

    static int Prod(int a, int b) {
        return a * b;
    }

    static double Div(int a, int b) {
        return (double) a / b;
    }
}