import java.util.Scanner;

public class Ngay {

    public static void main(String agre[]) {
        Scanner scanner = new Scanner(System.in);
        int date=scanner.nextInt();
        switch (date) {
            case 0:System.out.println("Chu nhat");
            break;
            case 1:System.out.println("thu 2");
            break;
            case 2:System.out.println("thu 3");
            break;
            case 3:System.out.println("thu 4");
            break;
            case 4:System.out.println("thu 5");
            break;
            case 5:System.out.println("thu 6");
            break;
            case 6:System.out.println("thu 7");
            break;
        
            default:System.out.println("khong co ngay nay");
                break;
        }
    }
}