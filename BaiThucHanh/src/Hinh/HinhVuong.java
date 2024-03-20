package Hinh;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{

    public HinhVuong() {
        ten="hinh vuong";
    }
    public void NhapCanh(){
        System.out.println("nhap canh");
        Scanner sc=new Scanner(System.in);
        dai=rong=sc.nextFloat();
    }
}
