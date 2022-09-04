package bronze5;

import java.util.Scanner;

public class baekjoon3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] white = new int[6];
		int[] black = {1, 1, 2, 2, 2, 8};
		
		for (int i = 0; i < white.length; i++) {
			white[i] = sc.nextInt();
		}
		
		sc.close();
		
		for (int i = 0; i < white.length; i++) {
			System.out.print((black[i] - white[i]) + " ");
		}
	}

}
