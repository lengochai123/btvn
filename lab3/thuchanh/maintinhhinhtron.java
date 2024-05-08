package thuchanh;

public class maintinhhinhtron {
    public static void main(String[] args) {
        TinhHinhTron tinh=new TinhHinhTron();

        tinh.setBanKinh(10);
        float Chuvi=tinh.tinhchuvi();
        float dientich=tinh.tinhdientich();
        System.out.println(Chuvi+" "+dientich);
    }
}
