import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

@SuppressWarnings("resource")

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array.add(sc.nextInt());
        }

        System.out.println("Mang: " + array);
        System.out.println("Gia tri lon nhat: " + Collections.max(array));

        System.out.print("Nhap gia tri can xoa: ");
        int tmp = sc.nextInt();
        array.removeIf(x -> (x == tmp));
        System.out.println("Mang sau khi xoa: " + array);

        Collections.sort(array);
        System.out.println("Mang sau khi sap xep: " + array);
    }
}
