package com.na.collections.list;

import java.util.Scanner;
import java.util.LinkedList;

@SuppressWarnings("resource")

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Tháng 1");
        linkedList.add("Tháng 2");
        linkedList.add("Tháng 3");
        linkedList.add("Tháng 4");
        linkedList.add("Tháng 5");
        linkedList.add("Tháng 6");
        linkedList.add("Tháng 7");
        linkedList.add("Tháng 8");
        linkedList.add("Tháng 9");
        linkedList.add("Tháng 10");
        linkedList.add("Tháng 11");
        linkedList.add("Tháng 12");

        System.out.println("Nhập vào chỉ số của tháng cần lấy (1-12): ");
        int index = scanner.nextInt() - 1;

        if ((index < 0) || (index >= (linkedList.size() - 1))) {
            System.out.println("Chỉ số cần lấy phải lớn hơn 0 và nhỏ hơn "
                + (linkedList.size() - 1));

        } else {
            String node = linkedList.get(index);
            System.out.println("Phần tử có chỉ số = " + index + "trong linkedList là " + node);

            String firstNode = linkedList.getFirst();
            String lastNode = linkedList.getLast();

            System.out.println("\nPhần tử đầu tiên trong danh sách là " + firstNode +
                " ; Phần tử cuối cùng trong danh sách là " + lastNode);
        }
    }
}
