import java.util.Scanner;
public class katyasfirstprogram2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        while (true) {
            int x = scanner.nextInt();
            if (x == 0) {
                break;
            }
            s = s + x;
        }
        System.out.println(s);
    }
}

