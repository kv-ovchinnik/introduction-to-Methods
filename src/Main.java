
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*  System.out.print("Введите два числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        int c = Math.Sum(a, b);
        System.out.println("%d + %d = %d".formatted(a, b, c));
        System.out.println("%d - %d = %d".formatted(a, b, Math.Diff(a, b)));
        System.out.println("%d * %d = %d".formatted(a, b, Math.Prod(a, b)));
        System.out.println("%d / %d = %f".formatted(a, b, Math.Div(a, b)));*/

        System.out.print("Введите factorial: ");
        int f = sc.nextInt();
        System.out.println("Факториал числа " + f + " равен: " + "%d".formatted(Factorial.Fact(f)));

        System.out.print("Введите число возводимое в степень: ");
        int s = sc.nextInt();
        System.out.print("Введите в какую степень возвести: ");
        int ss = sc.nextInt();
        System.out.println("ОТвет: " + s + " в степени " + ss + " = "+ "%d".formatted(Math.Step(s, ss)));

    }

}

/*class Math {
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
    }*/


     class Factorial {
         static int Fact(int f) {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result = result * i;
            }
            return result;
        }
    }
     class Math {
         static  int Step (int s, int ss){
             int result = 1;
             for (int i = 1; i <= ss; i++){
                 result = result * s;
             }
                     return result;

         }



     }


