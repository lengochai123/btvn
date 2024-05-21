package linkedlisst;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedList <String> lk=new LinkedList<>();
        for (int i=1;i<13;i++){
        lk.add("thang "+ i);}
        System.out.println("nhap phan tu muon lay");
        int index=sc.nextInt();
        if ((index<0)||(index>lk.size()-1)){
            System.out.println("chỉ số cần lấy phải lớn hơn 0 và nhỏ hơn"+ (lk.size()-1));
        }else{
            String node= lk.get(index);
            System.out.println(index+" "+node);
        }
        String nodedau=lk.getFirst();
        String nodecuoi=lk.getLast();
        System.out.println("pt dau "+nodedau+" pt cuoi "+nodecuoi);
    }
}
