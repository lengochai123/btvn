package Person;

import java.util.Scanner;

public class employee extends Person{
    public String employeeID;
    public float salary,salaryinmonth;
    public void nhapemployee(){
        super.nhapperson();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id ");
        employeeID=sc.nextLine();
        System.out.println("salary ");
        salary=sc.nextFloat();
    }
    public void ingiatri(){
        super.ingiatri();
        System.out.println("co ma nhan vien "+employeeID+"co muc luong la"+salary);
    }
}
