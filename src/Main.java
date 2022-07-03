import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор для решения квадратных уравнений");
        System.out.println("Вид уравнения: ax^2+bx+c=0");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        do {
            System.out.print("Введите число a:");
            double a = scanner.nextDouble();
            if (a == 0) {
                System.out.println("Уравнение теперь не квадратное, а линейное. Решать мы его не будем!");
            } else {
                System.out.print("Введите число b:");
                double b = scanner.nextDouble();
                if (b == 0) {
                    System.out.println("Уравнение является неполным квадратным уравнением");
                }
                System.out.print("Введите число c:");
                double c = scanner.nextDouble();
                if (c == 0) {
                    System.out.println("Уравнение является неполным квадратным уравнением");
                }
                double x1, x2;
                double Dis = b * b - 4 * a * c;
                System.out.println("Дискриминант равен = " + Dis);
                if (Dis == 0 && a != 0) {
                    x1 = -b / (2 * a);
                    System.out.println("Уравнение имеет один корень: x=" + x1);
                } else if (Dis > 0 && a != 0) {
                    x1 = (-b + Math.sqrt(Dis)) / (2 * a);
                    x2 = (-b - Math.sqrt(Dis)) / (2 * a);
                    System.out.println("Уравнение имеет два корня: х1=" + x1 + "; x2=" + x2);
                } else if (Dis < 0 || a == 0) {
                    System.out.println("Уравнение не имеет корней");
                }
            }
           //  String answer = scanner.next();
            //    if (answer.equals("да"));
            //{
            //    System.out.println("Отлично, продолжаем");
            //}   if else {
           //     System.out.println("Все");
            //}

        } while (answer.equals("да"));
    }
}









