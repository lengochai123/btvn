package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> TienViet =new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so gia tri tien hien co =");
        int n= Integer.valueOf(sc.nextLine());
        for(int i=0; i<n; i++)
        {
            System.out.println("nhap menh gia thu" + i);
            String menhgia=sc.nextLine();
            TienViet.add(menhgia);
        }
        ArrayList<String> NgoaiTe= new ArrayList<String>();
        System.out.println("nhap so ngoai te hien co =");
        int nt=Integer.valueOf(sc.nextLine());
        for(int i=0; i<nt;i++){
            System.out.println("ngoai te"+i);
            String menhgia=sc.nextLine();
            NgoaiTe.add(menhgia);
        }
        TienViet.addAll(NgoaiTe);
        System.out.println(TienViet);
        String tim=TienViet.get(3);
        System.out.println(tim);
        System.out.println("ban muon rut loai tien nao");
        String tien= sc.nextLine();
        if (TienViet.contains(tien)==false){
            System.out.println("k ton tai loai nay");
        }
        else{
            System.out.println("co loai nay");
        }
    }
    
}
