package bronze5;

import java.util.Scanner;

public class baekjoon5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int student[] = new int[31];
		
		for (int i = 1, j; i < 29; i++) {
			j = sc.nextInt();
			
			student[j] = 1;
		}
		
		sc.close();
		
		for (int i = 1; i < student.length; i++) {
			if (student[i] != 1) {
				System.out.println(i);
			}
		}
	}

}
