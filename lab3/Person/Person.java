package Person;

import java.util.Scanner;

public class Person {
    public String name;
    public int age;
    public void nhapperson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ten");
        name=sc.nextLine();
        System.out.println("tuoi");
        age=sc.nextInt();
    }
    public void ingiatri(){
        System.out.println(name+" nam nay "+age+" tuoi ");
    }
}

