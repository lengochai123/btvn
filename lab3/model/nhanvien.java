package model;

public class nhanvien {
    protected String ten;
    protected long luong;
    public nhanvien(){
    }
    public nhanvien(String tem){
    this.ten=ten;
    }
    protected String Loainhanvien(){
        return "";
    }
    public void xuatthongtin(){
        System.out.println("nhan vien" + ten);
        System.out.println("loai nhan vien"+ Loainhanvien());
        System.out.println("luong" +luong+"vnd");
    }
}
