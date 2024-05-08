package Person;

import java.util.Scanner;

public class NhanVien {
    String maNV;
    String tenNV;
    String quequanNV;
    int namsinhNV;
    int tuoi,songaydilam;
    float luong;
    final float tienluong = 300000f;
    final float baohiem = 500000f;
    final float tienthuong = 400000f;

    public void nhapGiaTri () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma nhan vien : ");
        maNV = sc.nextLine();
        System.out.print("nhap ten nhan vien : ");
        tenNV = sc.nextLine();
        System.out.print("nhap que quan nhan vien : ");
        quequanNV = sc.nextLine();
        System.out.print("nhap nam sinh nhan vien : ");
        namsinhNV = sc.nextInt();
        System.out.print("nhap so ngay di lam cua nhan vien : ");
        songaydilam = sc.nextInt();
        
    }

    public int tinhTuoiNhanVien () {
        tuoi = 2024 - namsinhNV;
        return tuoi;
    }

    public float tinhLuongNhanVien () {
    if(songaydilam > 28) {
        luong = tienluong * songaydilam - baohiem + tienluong;
    }else {
        luong = tienluong * songaydilam - baohiem;
    }
        return luong;
    }

    public void inGiaTri() {
        System.out.print(" ma nhan vien : " + maNV);
        System.out.print(" \nho va ten  : " + tenNV);
        System.out.print(" \nque quan: " + quequanNV);
        System.out.print(" \nnam sinh : " + namsinhNV);

    }

}
