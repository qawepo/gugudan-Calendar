package pj1;

import java.util.Scanner;

public class Calendar1 {

	public static void main(String[] args) {
		CalendarMethod1 cal = new CalendarMethod1();
		Scanner sc = new Scanner(System.in);

		cal.prompt();
		System.out.println("해당하는 년도를 입력하세요.");
		cal.prompt();
		int year = sc.nextInt();
		System.out.println();
		
		while (true) {
			cal.prompt();
			System.out.println("해당하는 달을 입력하세요. ");
			System.out.println("   ( 해당 년도를 바꾸시려면 '0' 을 입력하세요 )");
			System.out.println("   ( 종료하려면 '-1' 을 입력하세요 )");
			cal.prompt();
			int mon = sc.nextInt();
			
			if (mon == -1) {
				cal.prompt();
				System.out.print("END.");
				break;
			}			
			if (mon == 0) {
				cal.prompt();
				System.out.println("해당하는 년도를 입력하세요.");
				cal.prompt();
				year = sc.nextInt();
				System.out.println();
				continue;
			}
			if (mon > 12 | mon < 1) {
				System.out.println("");
				cal.prompt();
				System.out.println("해당하는 달이 없습니다.\n");
				continue;
			}
			
//			cal.prompt();
//			System.out.println("첫번째 요일을 입력하세요. (SU, MO, WE, TH, FR, SA)");
//			System.out.println("   ( 잘못된값 입력시 기본값은 일요일입니다. )");
//			cal.prompt();
//			String weekday = sc.next();
//			cal.getCalendar4(mon, weekday, year); 
//		Calendar4 메소드에서 요일을 입력받는 코드
			
			
			cal.getCalendar5(mon, year);

		}
		sc.close();
	}
}
