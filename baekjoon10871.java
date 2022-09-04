package bronze5;

import java.util.Scanner;

public class baekjoon10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[count];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}
