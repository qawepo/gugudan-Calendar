package pj1;

import java.util.Scanner;

public class GugudanEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result;
		
		for (int x = 2; x <= 9; x++) {
			result = new int[9];
			
			for (int i = 0; i < result.length; i++) {
				int num1 = (i+1);
				result[i] = x * num1;
			}
			
			for (int i = 0; i < result.length; i++) {
				int num1 = (i+1);
				System.out.println(x + " x " + num1 + " = " + result[i]);
			}
			
			System.out.println(" ");
		}
		

	}
}
