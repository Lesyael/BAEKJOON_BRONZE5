package bronze5;

import java.util.Scanner;

public class baekjoon10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(x + y);
		}
		
		sc.close();

	}

}
