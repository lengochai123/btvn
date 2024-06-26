package com.na.collections.list;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("ví dụ sử dụng phương thức addAll()");
        System.out.println("----------------------------------");

        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);

        System.out.println("\nví dụ sử dụng phương thức retainAll()");
        System.out.println("---------------------------------------");

        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");

        listA.retainAll(listB);

        System.out.print("listA:");
        showList(listA);

        System.out.println("\nvi dụ sử dụng phương thức removeAll()");
        System.out.println("---------------------------------------");

        list.removeAll(listB);

        System.out.print("list:");
        showList(list);
    }

    public static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.print("\t" + obj + ",");
        }

        System.out.println();
    }
}
