import java.util.Scanner;

public class КРном3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int count = scanner.nextInt();
        int[] array = new int[count];
        int x = 0;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count10 = 0;
        for (int i = 0; i < array.length; i++) {
            x = scanner.nextInt();
            array[i] = x;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count0 += 1;
            }
            if (array[i] == 1) {
                count1 += 1;
            }
            if (array[i] == 2) {
                count2 += 1;
            }
            if (array[i] == 3) {
                count3 += 1;
            }
            if (array[i] == 4) {
                count4 += 1;
            }
            if (array[i] == 5) {
                count5 += 1;
            }
            if (array[i] == 6) {
                count6 += 1;
            }
            if (array[i] == 7) {
                count7 += 1;
            }
            if (array[i] == 8) {
                count8 += 1;
            }
            if (array[i] == 9) {
                count9 += 1;
            }
            if (array[i] == 10) {
                count10 += 1;
            }
        }
        System.out.println("0: " + count0 + " times");
        System.out.println("1: " + count1 + " times");
        System.out.println("2: " + count2 + " times");
        System.out.println("3: " + count3 + " times");
        System.out.println("4: " + count4 + " times");
        System.out.println("5: " + count5 + " times");
        System.out.println("6: " + count6 + " times");
        System.out.println("7: " + count7 + " times");
        System.out.println("8: " + count8 + " times");
        System.out.println("9: " + count9 + " times");
        System.out.println("10: " + count10 + " times");
    }
}
