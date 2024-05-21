package com.na.collections.set;

import java.util.TreeSet;
import java.util.Scanner;

@SuppressWarnings("resource")

public class TreeSetExp1 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);

        System.out.println("Các phần tử trong treesetInteger: ");
        System.out.println(treeSetInteger);
        System.out.println("Nhập phân tử cần thêm: ");
        number = scanner.nextInt();

        if (treeSetInteger.contains(number)) {
            System.out.println("Phần tử " + number + " đã tồn tại!");
        } else {
            treeSetInteger.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử trong treesetInteger sau khi thêm: ");
            System.out.println(treeSetInteger);
        }
    }
}
