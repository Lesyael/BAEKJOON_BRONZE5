package bronze5;

import java.util.Scanner;

public class baekjoon2738 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] a = new int[n][m];
		
		for (int x = 0; x < 2; x++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] += sc.nextInt();
				}
			}
		}
		sc.close();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
			
		}

	}

}
