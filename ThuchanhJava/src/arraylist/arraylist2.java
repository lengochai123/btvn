package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> mang =new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so gia tri=");
        int n= Integer.valueOf(sc.nextLine());
        for(int i=0; i<n; i++){
            int ptu=sc.nextInt();
            mang.add(ptu);
        }
        int max=mang.get(0);
        for (int i=1; i<mang.size();i++){
            if (mang.get(i)>max);
            max=mang.get(i);
        }
        System.out.println(max);
    }
}
