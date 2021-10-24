import java.util.Scanner;

public class zadacha2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = k; i < (m + 1); i ++){
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
