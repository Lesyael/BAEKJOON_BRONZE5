package bronze5;

import java.util.Scanner;

public class baekjoon2420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		sc.close();
		
		long z = Math.abs(x - y);
		
		System.out.println(z);
	}

}
