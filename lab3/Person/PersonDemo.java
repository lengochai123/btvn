package Person;

import java.util.Scanner;

public class PersonDemo {
        String name;
        int age,year;
        public void nhapperson(){
            Scanner sc = new Scanner(System.in);
            System.out.println("ten");
            name=sc.nextLine();
            System.out.println("nhap nam sinh");
            year=sc.nextInt();
        }
        public int tinhtuoi(){
            age=2024 - year;
            return age;
        }
        public void ingiatri(){
            System.out.print(name +" sinh nam "+ year);
        }
        public void capnhat(int newage){
            this.age=newage;
            System.out.println("tuoi cua ban da duoc sua lai thanh"+newage);
        }
    }