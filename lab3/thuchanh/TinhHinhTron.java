package thuchanh;
public class TinhHinhTron {
    private final float PI=3.14f;
    private float bankinh;
    public float getBanKinh(){
        return bankinh;
    }
    public float setBanKinh(float bankinh){
        return this.bankinh=bankinh;
    }
    public float tinhchuvi(){
        return 2*bankinh*PI;
    }
    public float tinhdientich(){
        return PI*bankinh*bankinh;
    }  
}
