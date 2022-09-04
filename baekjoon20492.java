package bronze5;

import java.util.Scanner;

public class baekjoon20492 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int reward = sc.nextInt();
				
		sc.close();
		
		System.out.println((int)(reward * 0.78) + " " + ((int)((reward * 0.8) + ((reward * 0.2) * 0.78))));
		
	}

}
