import java.util.Scanner;

public class DZ7octNum3 {
    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        isPrime(number);
    //}
    public static boolean isPrime(int i) {
        boolean a = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                a = false;
            }
        }
        return (a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isPrime(number) == true) {
            System.out.println("Prime");
        } else {
            //String Multipliers = "";
            for (int j = 2; j < (number+1); j++) {
                if (number % j == 0) {
                    while (number % j == 0) {
                        System.out.println(j + " ");
                        number = number/j;
                    }
//                    String Stroka = Integer.toString(j) + "*";
//                    Multipliers = Multipliers + Stroka;

                }
            }
//            int Length = Multipliers.length();
//            String FinalStr = Multipliers.substring(0, Length - 1);
//            System.out.println(FinalStr);
        }
    }
}