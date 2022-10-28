package fibonacciWithRicursiveMethod;

import java.util.Scanner;

public class Main {
	
	static int fibonacci(int number) {
		if(number==1||number==2) {
			return 1;
		}
		return fibonacci(number-1)+fibonacci(number-2);
	}

	public static void main(String[] args) {
		int number;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Fibonacci serisinin kaçýncý elemanýný görmek istesiniz: ");
		number=scan.nextInt();
		
		System.out.println("Fibonacci serisisinin "+number+". elemaný: "+fibonacci(number));
	}

}
