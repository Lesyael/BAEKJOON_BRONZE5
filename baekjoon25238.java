package bronze5;

import java.util.Scanner;

public class baekjoon25238 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int aP = (int)(a * ((100 - b) / 100.0));
		
		if (aP < 100) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
