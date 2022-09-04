package bronze5;

import java.util.Scanner;

public class baekjoon25372 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		String password;
		
		for (int i = 0; i < count; i++) {
			password = sc.next();
			
			if (password.length() >= 6 && password.length() <= 9) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
		sc.close();

	}

}
