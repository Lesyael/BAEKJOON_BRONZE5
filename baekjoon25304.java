package bronze5;

import java.util.Scanner;

public class baekjoon25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int type = sc.nextInt();
		int sum2 = 0;
		
		for (int i = 0, price, count; i < type; i++) {
			price = sc.nextInt();
			count = sc.nextInt();
			
			sum2 += price * count;
		}
		
		sc.close();
		
		if (sum == sum2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
