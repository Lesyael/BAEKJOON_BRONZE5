package bronze5;

import java.util.Scanner;

public class baekjoon14645 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int station = sc.nextInt();
		@SuppressWarnings("unused")
		int people = sc.nextInt();
		
		for (int i = 0, in, out; i < station; i++) {
			in = sc.nextInt();
			out = sc.nextInt();
			
			people += in + out;
		}
		
		sc.close();
		
		System.out.println("ºñ¿ÍÀÌ");
		
	}

}
