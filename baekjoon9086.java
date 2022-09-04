package bronze5;

import java.util.Scanner;

public class baekjoon9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		String str;
		
		for (int i = 0; i < count; i++) {
			str = sc.next();
			
			System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
		}
		
		sc.close();

	}

}
