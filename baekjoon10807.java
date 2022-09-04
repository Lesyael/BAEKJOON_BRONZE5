package bronze5;

import java.util.Scanner;

public class baekjoon10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] num = new int[count];
		count = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int cheak = sc.nextInt();
		
		sc.close();
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] == cheak) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
