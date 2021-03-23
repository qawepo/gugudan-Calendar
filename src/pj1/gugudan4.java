package pj1;

import java.util.Scanner;

public class gugudan4 { // 3줄씩 구구단을 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int MAXDAN = 9;
		final int LINE = 3;
		final int MAXINT = 9;
		
		for (int a = 1; a <= MAXDAN; a+=LINE) {
			for (int i = 0; i < LINE; i++) {
				int dan1 = a+i;
				System.out.print(" --" + dan1 + "단 출력--" + " \t");
			}
			System.out.println(" ");
			
			for (int i = 1; i < MAXINT+1; i++) {
				for (int j = 0; j < LINE; j++) {
					int num1 = (a+j);
					System.out.print("ㅣ" + num1 +" x " +i+ " = " +num1*i+ "ㅣ" + " \t");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
