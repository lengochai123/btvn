package hashset;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class linkedHashset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> HashSet= new LinkedHashSet<String>();
        for(int i=0;i<4;i++){
            System.out.println("nhap vao phan tu thu "+i);
            String ten=sc.nextLine();
            HashSet.add(ten);
        }
        for (String str:HashSet){
            System.out.println(str);
        }        
    }
}
