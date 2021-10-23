import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner scanner  = new Scanner (System.in);
		double sum=0;
		int count = 0;
		while (true) {
			number= scanner.nextDouble();
			if (number ==0) {
				break;
			}
			count++;
			sum+=number;
		}
        System.out.printeln("Average: " +sum / count);
    }		
}
																																																																																																																															