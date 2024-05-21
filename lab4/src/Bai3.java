import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

@SuppressWarnings("resource")

class SinhVien {
    private String fullName;
    private float score;

    public String getFullName() {
        return this.fullName;
    }

    public float getScore() {
        return this.score;
    }

    boolean nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        sc.skip("\\R?");
        this.fullName = sc.nextLine().trim();

        if (this.fullName.length() == 0) return false;

        System.out.print("Nhap diem: ");
        this.score = sc.nextInt();

        return true;
    }

    void inThongTin() {
        System.out.println("Ho ten: " + this.fullName);
        System.out.println("Diem: " + this.score);
    }
}

@SuppressWarnings("resource")

class QuanLySinhVien {
    private LinkedList<SinhVien> list = new LinkedList<>();

    public void nhapThongTin() {
        int count = 0;

        while (true) {
            System.out.println("Nhap thong tin của sinh vien thu " + (++count) + ": ");

            SinhVien svTmp = new SinhVien();
            if (svTmp.nhapThongTin() == false) break;

            this.list.add(svTmp);
        }
    }

    public void thiLai() {
        int count = 0;
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getScore() <= 5) {
                ++count;
            }
        }

        System.out.println("So hoc sinh thi lai: " + count);
    }

    public void showMax() {
        float maxScore = Collections.max(
            this.list,
            (a, b) -> (int)(a.getScore() - b.getScore())
        ).getScore();

        System.out.println("Cac sinh vien co diem cao nhat: ");

        for (int i = 0; i < this.list.size(); i++) {
            if (list.get(i).getScore() == maxScore) {
                list.get(i).inThongTin();
                System.out.println();
            }
        }
    }

    public void showEqualName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten can tim: ");
        sc.skip("\\R?");
        String name = sc.nextLine().trim();

        System.out.println("Cac sinh vien co ten la " + name + ": ");

        for (int i = 0; i < this.list.size(); i++) {
            if (Objects.equals(list.get(i).getFullName(), name)) {
                list.get(i).inThongTin();
                System.out.println();
            }
        }
    }
}

public class Bai3 {
    public static void main(String[] args) {
        QuanLySinhVien dssv = new QuanLySinhVien();

        dssv.nhapThongTin();
        dssv.thiLai();
        dssv.showMax();
        dssv.showEqualName();
    }
}
