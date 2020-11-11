import java.util.Scanner;

public class Calculator {
    public static float a, b, result;

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a:");
        a = sc.nextFloat();
        System.out.println("Nhập số b:");
        b = sc.nextFloat();
    }

    public static void calculator() {
        result = (-b / a);
    }

    public static void output() {
        System.out.println("Kết Quả là: " + result);
    }
}
