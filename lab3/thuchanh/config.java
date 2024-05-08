package thuchanh;

public class config {
    public static final int slhinhmin=0;
    public static final int slhinhmax=5;
    public static final float PI=3.14f;
    public static final float inch_cm=2.54f;
    public static final int Donvicm=1;
    public static final int donviinch=2;
    public static int donVi=Donvicm;
    public static float cmtoinch(float cm){
        float inch=cm/inch_cm;
        return inch;
    }
    public static float inchtocm(float inch){
        float cm=inch*inch_cm;
        return cm;
    }
}

