package Person;

import java.util.Scanner;

public class employeept extends employee{
    public float hoursWorked;

    public void EmployeePartTime() {
        super.nhapemployee();
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so h lam");
        hoursWorked=sc.nextFloat();
    }
    public void tinhluongpt() {
        super.nhapemployee();
        salaryinmonth=salary*hoursWorked;
    }
    public void inluongtrongthang(){
        super.ingiatri();
        System.out.println("co luong trong thang la"+salaryinmonth);
    }
}

