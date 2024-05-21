import java.util.LinkedList;
import java.util.Scanner;

@SuppressWarnings("resource")

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) % 2 == 0) {
                sum += list.get(i);
            }
        }

        System.out.println("Tong cac so chan: " + sum);
    }
}
