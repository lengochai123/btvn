import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("resource")

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> fruits = new HashSet<>();

        while (true) {
            System.out.print("Nhap ten trai cay can them: ");

            sc.skip("\\R?");
            String currFruit = sc.nextLine().trim();

            if (currFruit.length() == 0) break;

            fruits.add(currFruit);
        }

        System.out.println("So phan tu cua HashSet: " + fruits.size());
        System.out.println("Cac phan tu trong HashSet: " + fruits);

        System.out.print("\nNhap ten trai cay can tim: ");
        sc.skip("\\R?");
        String str = sc.nextLine().trim();

        if (fruits.contains(str)) {
            System.out.println(str + " co ton tai trong HashSet");
        }
        else {
            System.out.println(str + " khong ton tai trong HashSet");
        }




        System.out.print("\nNhap so luong: ");
        int n = sc.nextInt();

        ArrayList<String> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.print("\nNhap phan tu thu " + (i + 1) + ": ");
            sc.skip("\\R?");
            arr.add(sc.nextLine().trim());
        }

        fruits.addAll(arr);

        Iterator<String> iter = fruits.iterator();

        System.out.print("\nCac phan tu sau khi them: [" + (iter.hasNext() ? iter.next() : ""));
        while (iter.hasNext()) {
            System.out.print(", " + iter.next());
        }
        System.out.println("]");





        for (String s: arr) {
            fruits.remove(s);
        }

        System.out.println("Cac phan tu sau khi xoa: " + fruits);
    }
}
