import java.util.Scanner;

public class TBCCacSo {
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
    double t=0;
    for (int i=0;i<n;i++){
        t=t+Mang[i];
    }
    System.out.println("tbc la"+t/2);
    }
}
