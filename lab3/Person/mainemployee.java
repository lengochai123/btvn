package Person;
import Person.employee;
import Person.employeeft;
import Person.employeept;
public class mainemployee {
    public static void main(String[] args) throws Exception{
        employee nhanvien=new employee();
        nhanvien.nhapemployee();
        nhanvien.ingiatri();

        employeeft nhanvienEmployeeft=new employeeft();
        nhanvienEmployeeft.EmployeeFullTime();
        nhanvienEmployeeft.tinhluonngft();
        nhanvienEmployeeft.inluongtrongthang();

        employeept nhanvienEmployeept= new employeept();
        nhanvienEmployeept.EmployeePartTime();
        nhanvienEmployeept.tinhluongpt();
        nhanvienEmployeept.inluongtrongthang();
    }
}
