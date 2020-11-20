import java.util.Scanner;

public class Album {
    protected int maCD;
    protected String tenCD;
    protected String casy;
    protected int soBH;
    protected double giaTien;
    protected Scanner input = new Scanner(System.in);

    public Album() {
    }

    public Album(int maCD, String tenCD, String casy, int soBH, double giaTien) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.casy = casy;
        this.soBH = soBH;
        this.giaTien = giaTien;
    }

}
