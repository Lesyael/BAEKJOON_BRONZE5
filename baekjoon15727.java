package bronze5;

import java.util.Scanner;

public class baekjoon15727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		if (x % 5 == 0) {
			System.out.println(x / 5);
		} else {
			System.out.println((x / 5) + 1);
		}
	}

}
