import java.util.Scanner;

public class TinhTongCacSo {
    public static void main(String[] args) {
    int number, sum = 0;
    Scanner scanner = new Scanner(System.in);      
    do {
     System.out.print("nhap so nguyen bat ki: ");
       number = scanner.nextInt();
       sum += number;
   } while (sum < 100); 
     System.out.println("Tong cac so nguyen vua nhap = "+sum);
    } }


