package bronze5;

import java.util.Scanner;

public class baekjoon2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		for (int i = 0; i < 5; i++) {
			num += Math.pow(sc.nextInt(), 2);
		}
		
		sc.close();
		
		System.out.println(num % 10);

	}

}
