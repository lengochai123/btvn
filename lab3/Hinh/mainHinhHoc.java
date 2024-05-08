package Hinh;
import Hinh.HinhChuNhat;
import Hinh.HinhTron;
import Hinh.HinhTru;
import Hinh.HinhVuong;
public class mainHinhHoc {
    public static void main(String[] args) throws Exception{
        HinhTron hinhtron=new HinhTron();
        hinhtron.xuatten();
        hinhtron.nhapbankinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inchuvi();
        hinhtron.indientich();

        HinhTru hinhtru=new HinhTru();
        hinhtru.xuatten();
        hinhtru.nhapchieucao();
        hinhtru.tinhthetich();
        hinhtru.inthetich();

        HinhChuNhat hinhchunhat=new HinhChuNhat();
        hinhchunhat.xuatten();
        hinhchunhat.nhapchieudai();
        hinhchunhat.nhapchieurong();
        hinhchunhat.tinhchuvi();
        hinhchunhat.tinhdientich();
        hinhchunhat.inchuvi();
        hinhchunhat.indientich();

        HinhVuong hinhvuong=new HinhVuong();
        hinhvuong.xuatten();
        hinhvuong.NhapCanh();
        hinhvuong.tinhchuvi();
        hinhvuong.tinhdientich();
        hinhvuong.inchuvi();
        hinhvuong.indientich();
}
}
