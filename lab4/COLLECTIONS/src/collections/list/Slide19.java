package com.na.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Slide19 {
    public static void main(String[] args) {
        ArrayList<Float> arrListFloat = new ArrayList<>();
    
        arrListFloat.add(8.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);
    
        Iterator<Float> iterator = arrListFloat.iterator();
    
        System.out.println("Các phần tử có trong arrListFloat là: ");
    
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
}
