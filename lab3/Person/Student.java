package Person;
import java.util.Scanner;

public class Student {
    String masv;
    String fullname;
    String gioitinh;
    String diachi;
    int tuoi;
    int namsinh;
    float diem;
    float A,B,C;
    final float nhanA = 0.6f;
    final float nhanB = 0.3f;
    final float nhanC = 0.1f;

    public void nhapGiaTri () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma sinh vien : ");
        masv = sc.nextLine();
        System.out.print("nhap ho va ten sinh vien : ");
        fullname = sc.nextLine();
        System.out.print("nhap gioi tinh : ");
        gioitinh =sc.nextLine();
        System.out.print("nhap dia chi thuong tru : ");
        diachi = sc.nextLine();
        System.out.print("nhap nam sinh : ");
        namsinh = sc.nextInt();
        System.out.print("nhap diem A : ");
        A = sc.nextFloat();
        System.out.print("nhap diem B : ");
        B = sc.nextFloat();
        System.out.print("nhap diem C : ");
        C = sc.nextFloat();
    }

    public int Tinhtuoi () {
      
       tuoi = 2024 - namsinh;
        return tuoi;
    }

    public float tinhDiem() {
        diem = A * nhanA + B * nhanB + C * nhanC;
        return diem;
    }
    
    public void doiDiem () {
        if(diem >= 0 && diem<= 4){
            System.out.print("Diem ma ban dat duoc la diem F" );
           }

        if(diem >= 4 && diem<= 6){
            System.out.print("Diem ma ban dat duoc la diem C" );
           }

        if(diem >= 6 && diem<= 8){
            System.out.print("Diem ma ban dat duoc la diem B" );
           }

        if(diem >= 8 && diem<= 10){
        System.out.print("Diem ma ban dat duoc la diem A" );
       }
    }
    public void inGiaTri() {
        System.out.print(" ma sinh vien : " + masv);
        System.out.print(" \nho va ten sinh vien : " + fullname);
        System.out.print(" \ngioi tinh : " + gioitinh);
        System.out.print(" \nnam sinh : " + namsinh);
        System.out.print(" \ndia chi : "+ diachi);
    }

    
}
