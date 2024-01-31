import java.util.Scanner;

public class HienThiKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int so=0,hoa=0,thuong=0;
        System.out.print("Nhap vao 1 chuoi ");
        String chuoi = scanner.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            if(kyTu>=48 && kyTu<=57){
            so++;
        }
        if(kyTu>=65&&kyTu<=90){
            hoa++;
        }
        if(kyTu>=97 && kyTu<=122 ){
            thuong++;
        }
                
    }
    System.out.println("so ki tu so la"+so);
    System.out.println("so ki tu hoa la"+hoa);
    System.out.println("so ki tu thuong la"+thuong);
}
}

