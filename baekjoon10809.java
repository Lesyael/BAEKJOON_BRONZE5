package bronze5;

import java.util.Scanner;

public class baekjoon10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[26];
		String str = sc.nextLine();
		
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			
			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		
		}
		
	}
	
}
