package Hinh;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{

    
    public HinhChuNhat() {
        ten="hinh chu nhat";
    }
    float dai,rong;
    public void nhapchieudai(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap chieudai");
        dai=sc.nextFloat();
    }
    public void nhapchieurong(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap chieudai");
        rong=sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi=(dai+rong)*2;
    }
    public void tinhdientich(){
        dientich=dai*rong;
    }
}
