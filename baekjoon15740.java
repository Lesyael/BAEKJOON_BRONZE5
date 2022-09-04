package bronze5;

import java.util.Scanner;
import java.math.BigInteger;

public class baekjoon15740 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();

		sc.close();
		
		System.out.println(a.add(b));
		
	}

}
