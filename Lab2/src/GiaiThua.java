import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        do{
            System.out.println("vui long nhap n");
            n=scanner.nextInt();
        }while(n<0);
        double gt=1;
        for(int i=1;i<=n;i++){
            gt=gt*i;
        }
        System.out.println("giai thua cua "+n+" la "+gt);
    }
}
