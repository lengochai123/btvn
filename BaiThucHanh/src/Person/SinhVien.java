package Person;

import java.util.Scanner;

public class SinhVien extends PersonDemo{
    String masv;
    public void nhapperson(){
            Scanner sc = new Scanner(System.in);
           super.nhapperson();
           System.out.println("masv =");
           masv=sc.nextLine();
        }
        public void ingiatri(){
            super.ingiatri();
            System.out.println(" co masv la"+ masv);
        }
}
// tao class person sau do tao class employee ke thua lai class person tao 2 class la employee parttime vs employee full time ke thua tu lop employee