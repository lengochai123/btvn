import java.util.Scanner;

public class SoNhoNhatTrongHaiSo {
    public static void main(String[] args) {
        int sothunhat, sothuhai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so thu nhat"); 
        sothunhat = scanner.nextInt();
        System.out.println("nhap vao so thu hai ");
        sothuhai =scanner.nextInt();
    int sonhonhat = sothunhat;
    if (sothunhat>sothuhai)
        sonhonhat = sothuhai;
        System.out.println(sonhonhat);
}
}