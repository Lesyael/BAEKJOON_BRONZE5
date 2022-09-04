package bronze5;

import java.util.Scanner;

public class baekjoon2744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();		
		
		sc.close();
		
		char[] manyCh = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			manyCh[i] = str.charAt(i);
			
			if (manyCh[i] >= 'a' && manyCh[i] <= 'z') {
				System.out.print(Character.toUpperCase(manyCh[i]));
			} else {
				System.out.print(Character.toLowerCase(manyCh[i]));
			}
		
		}
		
	}

}
