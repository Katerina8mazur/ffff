import java.util.Scanner;

public class КРном2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество целых чисел:");
        int x = scanner.nextInt();
        int[] array = new int[x];
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            x = scanner.nextInt();
            array[i] = x;
        }
        for (int i = 0; i < array.length; i++) {
            if (proverka(array[i])){
                flag = 1;
                System.out.println("YES");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("NO");
        }
    }
    public static boolean proverka(int x) {
        while (x != 0) {
            if ((x%10)%2 != 0) {
                return false;
            } else {
                x = x / 10;
            }
        }
        return true;
    }
}
