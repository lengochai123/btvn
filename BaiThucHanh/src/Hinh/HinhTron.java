package Hinh;
import java.util.Scanner;

public class HinhTron extends HinhHoc{
    public HinhTron() {
        ten="hinh tron";
    }
    float bankinh;
    public void nhapbankinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh : ");
        bankinh = sc.nextFloat();
    }
    public void tinhChuVi () {
        chuvi = 2 * PI * bankinh;
    }
    public void tinhDienTich () {
        dientich = PI * bankinh * bankinh;
    }
}

