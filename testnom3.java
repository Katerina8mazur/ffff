import java.util.Scanner;

public class testnom3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        int pastNum = scanner.nextInt();;
        while (pastNum != 0){
            int newNum = scanner.nextInt();
            if (newNum == 0){
                break;
            }
            if (newNum > pastNum) {
                a++; // последовательность возр
            } else if (newNum < pastNum) {
                b++; // последовательность убыв
            }
            pastNum = newNum;
        }
        if (a == 0 && b == 0) {
            System.out.println("=");
        } else if (a == 0){
            System.out.println("<");
        } else if (b == 0){
            System.out.println(">");
        } else {
            System.out.println("!");
        }
    }
}
