import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int soHang = scanner.nextInt();

        System.out.print("Nhap so cot cua ma tran: ");
        int soCot = scanner.nextInt();

        int[][] maTran = new int[soHang][soCot];

        System.out.println("Nhap cac phan tu cho ma tran:");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("MaTran[" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextInt();
            }
        }

        int max = maTran[0][0];

        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                }
            }
        }

        System.out.println("Phan tu lon nhat trong ma tran: " + max);

        scanner.close();
    }
}

