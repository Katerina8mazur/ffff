import java.util.Scanner;

public class PrimeNum {
    static void isPrime(int i) {
        boolean a = true;
        for(int j = 2; j < i; j++){
            if(i % j == 0){
                a = false;
                break;
            }
        }
        if(a == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        isPrime(number);
    }
}
