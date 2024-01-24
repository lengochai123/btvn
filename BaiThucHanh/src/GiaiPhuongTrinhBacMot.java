 import java.util.Scanner;

public class GiaiPhuongTrinhBacMot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao he so a:");
        double a = scanner.nextDouble();

        System.out.println("Nhap vao he so b:");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la x = " + x);
        }

        scanner.close();
    }
}

