package bronze5;

import java.util.Scanner;

public class baekjoon8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int x = sc.nextInt();
		
		sc.close();
		
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
