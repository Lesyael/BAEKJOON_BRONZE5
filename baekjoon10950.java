package bronze5;

import java.util.Scanner;

public class baekjoon10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for (int i = 0, x, y; i < count; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			System.out.println(x + y);
		}
		
		sc.close();

	}

}
