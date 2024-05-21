package com.na.collections.set;

import java.util.HashSet;
import java.util.Scanner;

@SuppressWarnings("resource")

public class Hash {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");

        System.out.println("Các phần tử trong hashSetString: ");
        System.out.println(hashSetString);

        System.out.println("Nhập phân tử cần xóa: ");
        scanner.skip("\\R?");
        name = scanner.nextLine();

        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xóa thành công!");
            System.out.println("Các phần tử còn lại trong hashSetString: ");
            System.out.println(hashSetString); 
        } else {
            System.out.println("Xóa không thành công!");
        }
    }
}
