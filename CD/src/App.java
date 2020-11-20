
import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);
    private static boolean flag = true;

    public static void main(String[] args) throws Exception {
        Album arrAlbum[] = new Album[0];
        int option, n = 0;
        do {
            System.out.println("Hey you, What do you want ?");
            System.out.println("1.Nhập thông tin CD \n" + "2.Xuất danh sách Album.\n" + "3.Tính tổng giá tiền \n"
                    + "4.Tổng số lượng CD \n" + "5.Sắp xếp giảm dần theo giá tiền\n"
                    + "6.Sắp xếp tăng dần theo tựa CD\n" + "7.Nhập tên CD cần xóa\n" + "Nhập số khác để thoát");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Nhập số lượng CD: ");
                    n = input.nextInt();
                    arrAlbum = new Album[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thứ " + (i + 1) + ": ");
                        arrAlbum[i] = new Album();
                        __Input(arrAlbum[i]);
                    }
                    break;
                case 2:
                    if (arrAlbum.length == 0) {
                        System.out.println("Album trống, chọn 1 để nhập thông tin CD");
                    } else {
                        System.out.printf("%-10s %-20s %-20s %-20s %-40s \n", "Mã CD", "Tên CD", "Tên ca sỹ",
                                "Số bài hát", "Giá tiền");
                        for (int i = 0; i < n; i++) {
                            __Output(arrAlbum[i]);
                        }
                    }
                    break;
                case 3:
                    // if (arrAlbum.length == 0) {
                    // System.out.println("Album trống, chọn 1 để nhập thông tin CD");
                    // } else {
                    // double sum = 0;
                    // for (int i = 0; i < n; i++) {
                    // sum += arrAlbum[i].giaTien;
                    // }
                    // System.out.println("Tổng giá tiền: " + sum);
                    // }

                    __Sum(arrAlbum, n);
                    break;
                case 4:
                    System.out.println(arrAlbum.length);
                    break;
                case 5:
                    // if (arrAlbum.length == 0) {
                    // System.out.println("Album trống, chọn 1 để nhập thông tin CD");
                    // } else {
                    // Album temp = arrAlbum[0];
                    // for (int i = 0; i < n - 1; i++) {
                    // for (int j = i + 1; j < n; j++) {
                    // if (arrAlbum[i].giaTien < arrAlbum[j].giaTien) {
                    // temp = arrAlbum[j];
                    // arrAlbum[j] = arrAlbum[i];
                    // arrAlbum[i] = temp;
                    // }
                    // }
                    // }
                    // System.out.println("Sắp xếp hoàn tất, nhấn 2 để xem lại danh sách.");
                    // }

                    __SortMoney(arrAlbum, n);
                    break;
                case 6:
                    // if (arrAlbum.length == 0) {
                    // System.out.println("Album trống, chọn 1 để nhập thông tin CD");
                    // } else {
                    // Album temp = arrAlbum[0];
                    // for (int i = 0; i < n - 1; i++) {
                    // for (int j = i + 1; j < n; j++) {
                    // if (arrAlbum[i].tenCD.compareTo(arrAlbum[j].tenCD) > 0) {
                    // temp = arrAlbum[j];
                    // arrAlbum[j] = arrAlbum[i];
                    // arrAlbum[i] = temp;
                    // }
                    // }
                    // }
                    // System.out.println("Sắp xếp hoàn tất, nhấn 2 để xem lại danh sách.");
                    // }

                    __SortName(arrAlbum, n);
                    break;
                case 7:
                    // System.out.println("Nhập tên CD muốn xóa: ");
                    // String nameRemove = input.next();
                    // for (int i = 0; i < n; i++) {
                    // if (arrAlbum[i].tenCD.equals(nameRemove)) {
                    // for (int j = i; j < n - 1; j++) {
                    // arrAlbum[j] = arrAlbum[i + 1];
                    // i++;
                    // }
                    // System.out.println("Xóa thành công, nhấn 2 để xem lại danh sách.");
                    // break;
                    // } else {
                    // System.out.println("Không có tên CD cần xóa. ");
                    // break;
                    // }
                    // }
                    // n--;
                    __Remove(arrAlbum, n);
                    break;
                default:
                    System.out.println("GoodBye, See you again!");
                    flag = false;
                    break;
            }
        } while (flag);

    }

    protected static void __Input(Album album) {
        System.out.println("Nhập mã CD: ");
        album.maCD = input.nextInt();
        System.out.println("Nhập tên CD: ");
        album.tenCD = input.next();
        System.out.println("Nhập tên ca sỹ: ");
        album.casy = input.next();
        System.out.println("Nhập số bài hát: ");
        album.soBH = input.nextInt();
        System.out.println("Nhập giá tiền: ");
        album.giaTien = input.nextDouble();
    }

    public static void __Output(Album album) {
        System.out.printf("%-10d %-20s %-20s %-20d %-40.1f \n", album.maCD, album.tenCD, album.casy, album.soBH,
                album.giaTien);
    }

    public static void __Sum(Album arrAlbum[], int n) {
        if (arrAlbum.length == 0) {
            System.out.println("Album trống, chọn 1 để nhập thông tin CD");
        } else {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arrAlbum[i].giaTien;
            }
            System.out.println("Tổng giá tiền: " + sum);
        }

    }

    public static void __SortMoney(Album arrAlbum[], int n) {
        if (arrAlbum.length == 0) {
            System.out.println("Album trống, chọn 1 để nhập thông tin CD");
        } else {
            Album temp = arrAlbum[0];
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arrAlbum[i].giaTien < arrAlbum[j].giaTien) {
                        temp = arrAlbum[j];
                        arrAlbum[j] = arrAlbum[i];
                        arrAlbum[i] = temp;
                    }
                }
            }
            System.out.println("Sắp xếp hoàn tất, nhấn 2 để xem lại danh sách.");
        }
    }

    public static void __SortName(Album arrAlbum[], int n) {
        if (arrAlbum.length == 0) {
            System.out.println("Album trống, chọn 1 để nhập thông tin CD");
        } else {
            Album temp = arrAlbum[0];
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arrAlbum[i].tenCD.compareTo(arrAlbum[j].tenCD) > 0) {
                        temp = arrAlbum[j];
                        arrAlbum[j] = arrAlbum[i];
                        arrAlbum[i] = temp;
                    }
                }
            }
            System.out.println("Sắp xếp hoàn tất, nhấn 2 để xem lại danh sách.");
        }
    }

    public static void __Remove(Album arrAlbum[], int n) {
        System.out.println("Nhập tên CD muốn xóa: ");
        String nameRemove = input.next();
        for (int i = 0; i < n; i++) {
            if (arrAlbum[i].tenCD.equals(nameRemove)) {
                for (int j = i; j < n - 1; j++) {
                    arrAlbum[j] = arrAlbum[i + 1];
                    i++;
                }
                System.out.println("Xóa thành công, nhấn 2 để xem lại danh sách.");
                break;
            } else {
                System.out.println("Không có tên CD cần xóa. ");
                break;
            }
        }
        n--;
    }
}
