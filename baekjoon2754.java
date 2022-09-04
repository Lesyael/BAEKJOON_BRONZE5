package bronze5;

import java.util.Scanner;

public class baekjoon2754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String score = sc.next();
		
		sc.close();
		
		if (score.equalsIgnoreCase("A+")) {
			System.out.println(4.3);
		} else if (score.equalsIgnoreCase("A0")) {
			System.out.println(4.0);
		} else if (score.equalsIgnoreCase("A-")) {
			System.out.println(3.7);
		} else if (score.equalsIgnoreCase("B+")) {
			System.out.println(3.3);
		} else if (score.equalsIgnoreCase("B0")) {
			System.out.println(3.0);
		} else if (score.equalsIgnoreCase("B-")) {
			System.out.println(2.7);
		} else if (score.equalsIgnoreCase("C+")) {
			System.out.println(2.3);
		} else if (score.equalsIgnoreCase("C0")) {
			System.out.println(2.0);
		} else if (score.equalsIgnoreCase("C-")) {
			System.out.println(1.7);
		} else if (score.equalsIgnoreCase("D+")) {
			System.out.println(1.3);
		} else if (score.equalsIgnoreCase("D0")) {
			System.out.println(1.0);
		} else if (score.equalsIgnoreCase("D-")) {
			System.out.println(0.7);
		} else {
			System.out.println(0.0);
		}
		
	}
	
}
