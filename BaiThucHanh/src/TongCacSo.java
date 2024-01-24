import java.util.Scanner;

public class TongCacSo {
    public static void main(String[] args) {
        TongCacSo tongCacSo = new TongCacSo(); 

        Scanner scanner = new Scanner(System.in);
        System.err.println("Nhap n:");
        int n = scanner.nextInt();

        if (n > 0) {
            int t = tongCacSo.tinhTong(n);
            System.out.println("tong cac chu so cua n" + n + " la " + t);
        } else {
            System.out.println("Nhap lai n");
        }

        scanner.close(); 
    }

    public int tinhTong(int dem) {
        int tong = 0;
        while (dem != 0) {
            tong += dem % 10;
            dem /= 10; 
        }
        return tong;
    }
}