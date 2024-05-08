package Person;

import java.util.Scanner;

public class employeeft extends employee{
    public float bonus;
    public void EmployeeFullTime() {
        super.nhapemployee();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so tien thuong");
        bonus=sc.nextFloat();
    }
    public void tinhluonngft(){
        super.nhapemployee();
        salaryinmonth=salary+bonus;
    }
    public void inluongtrongthang(){
        super.ingiatri();
        System.out.println("co luong trong thang la"+salaryinmonth);
    }
}
