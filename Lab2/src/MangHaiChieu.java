import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int c,h;
        do {
            System.out.println("nhap vao so hang");
            h=scanner.nextInt();
            System.out.println("nhap so cot");
            c=scanner.nextInt(); 
        } while (h<0 && c<0);
        int A[][]=new int[h][c];
        for (int i=0;i<h;i++){
            for(int j=0;j<c;j++){
            System.out.println("nhap phan tu thu ["+i+","+j+"]");
            A[i][j]= scanner.nextInt();
            }
        }
        int L=A[0][0];
        for (int i=0;i<h;i++){
            for(int j=0;j<c;j++){
                if(A[i][j]>L)
                L=A[i][j];
            }
        }
        System.out.println("so lon nhat trong mang la"+L);
    }
}
