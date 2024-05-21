import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

@SuppressWarnings("resource")

class SinhVien2 {
    private String fullName;
    private String className;

    public String getFullName() {
        return this.fullName;
    }

    public String getClassName() {
        return this.className;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        sc.skip("\\R?");
        this.fullName = sc.nextLine().trim();

        System.out.print("Nhap lop: ");
        sc.skip("\\R?");
        this.className = sc.nextLine().trim();
    }

    public void inThongTin() {
        System.out.println("Ho ten: " + this.fullName);
        System.out.println("Lop: " + this.className);
    }
}

@SuppressWarnings("resource")

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nNhap so luong: ");
        int n = sc.nextInt();

        HashMap<Integer, SinhVien2> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ": ");

            System.out.print("Nhap ma sinh vien: ");
            int msv = sc.nextInt();

            SinhVien2 sv = new SinhVien2();
            sv.nhapThongTin();

            hashMap.put(msv, sv);
        }
        
        System.out.print("Nhap ten lop can tim: ");
        sc.skip("\\R?");
        String className = sc.nextLine();

        System.out.println("\nCac hoc sinh thuoc lop " + className + ": ");

        hashMap.forEach((msv, sv) -> {
            if (Objects.equals(sv.getClassName(), className)) {
                System.out.println(msv + " - " + sv.getFullName());
            }
        });

        System.out.print("\nNhap ma sinh vien can tim: ");
        int msv = sc.nextInt();

        if (hashMap.containsKey(msv)) {
            hashMap.get(msv).inThongTin();
        }
        else {
            System.out.println("Khong tim thay");
        }
    }
}
