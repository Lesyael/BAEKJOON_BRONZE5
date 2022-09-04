package bronze5;

import java.util.Scanner;

public class baekjoon14928 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
        
		sc.close();
		
		long temp = 0;
        
        for (int i = 0; i < input.length(); i++) {
        	temp = (temp * 10 + (input.charAt(i) - '0')) % 20000303;
        }
        
        System.out.println(temp);
	}

}
