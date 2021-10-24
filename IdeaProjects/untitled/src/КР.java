import java.util.Scanner;

public class КР {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        pow(a,n);
    }
    static void pow (int a, int n) {
        int stepen = a;
        for (int i = 1; i < n; i++) {
            a *= stepen;
        }
        System.out.println(a);
    }
}
