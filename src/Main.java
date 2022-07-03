import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("����������� ��� ������� ���������� ���������");
        System.out.println("��� ���������: ax^2+bx+c=0");
        Scanner scanner = new Scanner(System.in);
        String needContinue;
        do {


            System.out.print("������� ����� a:");
            double a = scanner.nextDouble();
            if (a == 0) {
                System.out.println("��������� ������ �� ����������, � ��������. ������ �� ��� �� �����!");
            } else {
                System.out.print("������� ����� b:");
                double b = scanner.nextDouble();
                if (b == 0) {
                    System.out.println("��������� �������� �������� ���������� ����������");
                }
                System.out.print("������� ����� c:");
                double c = scanner.nextDouble();
                if (c == 0) {
                    System.out.println("��������� �������� �������� ���������� ����������");
                }
                double x1, x2;
                double Dis = b * b - 4 * a * c;
                System.out.println("������������ ����� = " + Dis);
                if (Dis == 0 && a != 0) {
                    x1 = -b / (2 * a);
                    System.out.println("��������� ����� ���� ������: x=" + x1);
                } else if (Dis > 0 && a != 0) {
                    x1 = (-b + Math.sqrt(Dis)) / (2 * a);
                    x2 = (-b - Math.sqrt(Dis)) / (2 * a);
                    System.out.println("��������� ����� ��� �����: �1=" + x1 + "; x2=" + x2);
                } else if (Dis < 0 || a == 0) {
                    System.out.println("��������� �� ����� ������");
                }
            }
            System.out.print("����������? ������� �� ��� ���: ");
            needContinue = scanner.next();
            if (needContinue.equals("��")) {
                System.out.println("�������, ����������");
            } else {
            System.out.println("���");
            }

        } while (!needContinue.equals("���"));
            // ����
        }
}









