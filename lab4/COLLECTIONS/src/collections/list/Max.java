package com.na.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("resource")

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Nhập số phần tử của ArrayList: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            number = scanner.nextInt();
            arrListInteger.add(number);
        }

        int max = arrListInteger.get(0);

        for (int i = 1; i < arrListInteger.size(); i++) {
            if (arrListInteger.get(i) > max) {
                max = arrListInteger.get(i);
            }
        }

        System.out.println("Phần tử lớn nhất trong arrListInteger là: " + max);
    }
}
