package bronze5;

import java.util.Scanner;

public class baekjoon14652 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num = sc.nextInt();
		
		sc.close();
		
		System.out.println((num / m) + " " + (num % m));
		
	}

}
