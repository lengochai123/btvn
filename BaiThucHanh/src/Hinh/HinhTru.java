package Hinh;
import java.util.Scanner; 
public class HinhTru extends HinhTron {
    public HinhTru() {
        ten="hinh tru";
    }
    float chieucao;
    public void nhapchieucao(){
        nhapbankinh();
        System.out.print("chieu cao =");
        Scanner sc=new Scanner(System.in);
        chieucao=sc.nextFloat();
    }
    public void tinhthetich(){
        tinhDienTich();
        thetich=dientich*chieucao;
    }
}
