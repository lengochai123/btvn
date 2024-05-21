package com.na.collections.set;

import java.util.HashSet;
import java.util.Scanner;

@SuppressWarnings("resource")

public class HashAdd {
    public static void main(String[] args) {
        int number;

        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("thêm các phần tử vào hashSetInteger");

        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);

        System.out.println("Các phần tử trong hashSetInteger: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhập phân tử cần thêm: ");
        number = scanner.nextInt();

        if (hashSetInteger.contains(number)) {
            System.out.println("Phần tử " + number + "đã tồn tại!");
        } else {
            hashSetInteger.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử trong hashSetInteger sau khi thêm: ");
            System.out.println(hashSetInteger);
        }
    }
}
