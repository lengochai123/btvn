import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao chuoi khong qua 80 ki tu ");
        String chuoi = scanner.nextLine();

        if (chuoi.length() > 80) {
            System.out.println("chuoi qua dai vui long nhap lai(khong qua 80 ki tu)");
            return;
        }

        System.out.print("nhap vao ki tu can yeu cau ");
        char kyTu = scanner.next().charAt(0);

        int index = -1;
        int soLanXuatHien = 0;

        do {
            index = chuoi.indexOf(kyTu, index + 1);
            if (index != -1) {
                soLanXuatHien++;
            }
        } while (index != -1);

        System.out.println("so lan xuat hien cua ki tu '" + kyTu + "' trong chuoi " + soLanXuatHien);

        scanner.close();
    }
}

