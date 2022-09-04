package bronze5;

import java.util.Scanner;

public class baekjoon10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		int sum = fact(x);
		System.out.println(sum);

	}
	
	static int fact (int x) {
		if (x <= 1) {
			return 1;
		}
		return x * fact(x - 1);
	}

}
