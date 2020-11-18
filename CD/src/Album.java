import java.util.Scanner;

public class Album {
    protected int maCD;
    protected String tenCD;
    protected String casy;
    protected int soBH;
    protected double giaTien;
    protected Scanner input = new Scanner(System.in);

    protected void __Input() {
        System.out.println("Nhập mã CD: ");
        maCD = input.nextInt();
        System.out.println("Nhập tên CD: ");
        tenCD = input.next();
        System.out.println("Nhập tên ca sỹ: ");
        casy = input.next();
        System.out.println("Nhập số bài hát: ");
        soBH = input.nextInt();
        System.out.println("Nhập giá tiền: ");
        giaTien = input.nextDouble();
    }

    public void __Output() {
        System.out.printf("%-10d %-20s %-20s %-20d %-40.1f \n", maCD, tenCD, casy, soBH, giaTien);
    }

    public Album() {
    }

    public Album(int maCD, String tenCD, String casy, int soBH, double giaTien) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.casy = casy;
        this.soBH = soBH;
        this.giaTien = giaTien;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCasy() {
        return casy;
    }

    public void setCasy(String casy) {
        this.casy = casy;
    }

    public int getSoBH() {
        return soBH;
    }

    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

}
