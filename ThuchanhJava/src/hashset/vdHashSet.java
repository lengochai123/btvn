package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class vdHashSet {
    public static void main(String[] args) {
        int number;
        HashSet <Integer> hs=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0; i<n;i++){
            System.out.println("nhap phan tu thu"+i);
            int pt=sc.nextInt();
            hs.add(pt);  
        }
        System.err.println(hs);
        number=sc.nextInt();
        if (!hs.contains(number)){
            hs.add(number);
            System.out.println("hashset moi la"+ hs);
        }else{
            System.out.println(number + "đa co trong hashset");
        }
        System.out.println("nhap phan tu muon xoa");
        int deletenumber=sc.nextInt();
        if (hs.contains(deletenumber)){
            hs.remove(deletenumber);
            System.out.println("hashset moi la"+ hs);
        }else{
            System.out.println(deletenumber + " khong co trong hashet");
        }
    }
}
