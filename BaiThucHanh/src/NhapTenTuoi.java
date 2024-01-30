import java.util.Scanner;

public class NhapTenTuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();

        System.out.print("Nhập năm sinh của bạn: ");
        int namSinh = scanner.nextInt();

        int tuoi = 2024 - namSinh;

        if (tuoi < 16) {
            System.out.println("Bạn " + ten + " ở độ tuổi vị thành niên.");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Bạn " + ten + " ở độ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn " + ten + " đã già.");
        }

        scanner.close();
    }
}
