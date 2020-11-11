import java.util.Scanner;

public class student {
    private static int code;
    private static String name;
    private static float lt, th, result;

    // Nhập
    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã số sv: ");
        code = sc.nextInt();
        System.out.println("Nhập tên sv: ");
        name = sc.next();
        System.out.println("Nhập điểm lý thuyết: ");
        lt = sc.nextInt();
        System.out.println("Nhập điểm thực hành: ");
        th = sc.nextInt();
    }

    // Tính điểm trung bình
    public static float averaged() {
        return result = (lt + th) / 2;
    }

    // Xuất
    public static void output() {
        System.out.println("Mã số sinh viên: " + code);
        System.out.println("Họ và tên: " + name);
        System.out.println("Điểm Lý Thuyết: " + lt);
        System.out.println("Điểm Thực Hành: " + th);
        System.out.println("Điểm trung bình: " + result);
    }

}
