package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon2338 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		
		sc.close();
		
		System.out.println(n.add(m));
		System.out.println(n.subtract(m));
		System.out.println(n.multiply(m));
		
	}

}
