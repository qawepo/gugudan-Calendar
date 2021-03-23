package pj1;

import java.util.Scanner;

public class GugudanEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//8,9단
		System.out.println("입력");
		int num = sc.nextInt();
		System.out.println("입력한 값 : " + num);
		if (num <2) {
			System.out.println("2보다 낮음");
			System.out.println("재입력");
			num = sc.nextInt();
		}else if (num > 9) {
			System.out.println("9보다 큼");
			System.out.println("재입력");
			num = sc.nextInt();
		}else {
		System.out.println(" ");
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " x " + i + " = " +   num*i);
			
		}
		}
		
		
	
	sc.close();   }
}
