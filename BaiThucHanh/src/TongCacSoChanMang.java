import java.util.Scanner;

public class TongCacSoChanMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
    do {
        System.out.println("nhap vao n");
        n=scanner.nextInt();
    } while (n<0);
    int Mang[]=new int[n];
    System.out.println("nhap cac phan tu cua mang");
    for (int i=0;i<n;i++){
        System.out.println("nhap phan tu thu"+i);
        Mang[i]=scanner.nextInt();
    }
    double tong=0;
    for(int i=0;i<n;i++){
        if(Mang[i]%2==0)
        tong=tong+Mang[i];
    }
    System.out.println("tong cac so chan trong mang la"+tong);
}
}