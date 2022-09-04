package bronze5;

import java.util.Scanner;

public class baekjoon11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		int count = sc.nextInt();
		
		for (int i = 1; i <= count; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			System.out.println("Case #"+ i + ": " + (x + y));
		}
		
		sc.close();

	}

}
