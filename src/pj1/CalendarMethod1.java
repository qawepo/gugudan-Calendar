package pj1;

public class CalendarMethod1 {
	
	final int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	final int[] leapdays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	final String[] WEEKDAYNAME = { "SU", "MO", "TU", "WE", "TH", "FR",  "SA" };
	final String line = "--------------------------------------------------";
	final String weekdayss = "일\t월\t화\t수\t목\t금\t토";
	
	public void getMaxDays1(int month) {

		if (month > 12 | month < 1) {
			System.out.println("해당하는 달이 없습니다.");
		}

		System.out.println("해당하는 달의 최대 일수는 " + days[(month - 1)] + "입니다");

	}
	
	public void getMaxDays2(int month) {
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("해당하는 달의 최대 일수는 31입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("해당하는 달의 최대 일수는 30입니다.");
			break;
		case 2:
			System.out.println("해당하는 달의 최대 일수는 28입니다.");
			break;
		default:
			System.out.println("해당하는 달이 없습니다.");
			break;
		}

	}

	public void getMaxDays3(int month) {
		 if(month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
			 System.out.println("해당하는 달의 최대 일수는 31입니다.");
		 }else if(month == 4 |month == 6 |month == 9 |month == 11) {
			 System.out.println("해당하는 달의 최대 일수는 30입니다.");
		 }else if(month == 2) {
			 System.out.println("해당하는 달의 최대 일수는 28입니다.");
		 }else {
			 System.out.println("해당하는 달이 없습니다.");
		 }
	}

	public void getCalendar1(int month) {
		final int MD = days[(month-1)];
		final int WD = 7;
		System.out.println("");
		System.out.println("## " + month + "월의 달력입니다.");
		System.out.println(weekdayss);
		System.out.println(line);
		for (int i = 1; i < MD; i+=WD) {
			if(i > MD) {
				break;
			}
			for (int j = 0; j < WD; j++) {
				if((i+j) > MD) {
					break;
				}
				System.out.print((i+j) + " \t");
			}
			System.out.println("");
		}
		System.out.println(line);
		System.out.println("");
	}
	
	public void getCalendar2(int month) {
		final int MD = days[(month-1)];
		final int WD = 7;
		System.out.println("");
		System.out.println("## " + month + "월의 달력입니다.");
		System.out.println(weekdayss);
		System.out.println(line);
		for (int i = 1; i <= MD; i++) {
			System.out.print(i + " \t");
			if(i%WD == 0) {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println(line);
		System.out.println("");
	}
	
	public void getCalendar3(int month) {
		final int MD = leapdays[month-1];
		final int WD = 7;       
		System.out.println("");
		System.out.println("## " + month + "월의 달력입니다.");
		System.out.println(weekdayss);
		System.out.println(line);
		for (int i = 1; i <= MD; i++) {
			System.out.print(i + " \t");
			if(i%WD == 0) {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println(line);
		System.out.println("");
	}
	
	public void getCalendar4(int month, String weekday, int year) {
		CalendarMethod1 cal1 = new CalendarMethod1();
		
		final int LMD = leapdays[month-1];
		final int MD = days[month-1];
		final int WD = 7;
		int FWD = cal1.weekParseDay(weekday);
		
		System.out.println("");
		cal1.prompt();
		System.out.println(month + "월의 달력입니다.");
		System.out.println(weekdayss);
		System.out.println(line);
		
		if(cal1.leapYears(year)) {
			for (int j = 0; j < FWD; j++) {
				System.out.print(" \t");
			}
			for (int i = 1; i <= LMD; i++) {
				System.out.print(i + " \t");
				if((i+FWD)%WD == 0) {
					System.out.println("");
				}
			}
		
			System.out.println("");
			System.out.println(line);
			System.out.println("");
		}else {
			for (int j = 0; j < FWD; j++) {
				System.out.print(" \t");
			}
			for (int i = 1; i <= MD; i++) {
				System.out.print(i + " \t");
				if((i+FWD)%WD == 0) {
					System.out.println("");
				}
			}
			
			System.out.println("");
			System.out.println(line);
			System.out.println("");
		}
	}
	
	public void getCalendar5(int month, int year) {
		CalendarMethod1 cal2 = new CalendarMethod1();
		
		final int LMD = leapdays[month-1];
		final int MD = days[month-1];
		final int WD = 7;
		
		int FWD;
		int wdint;
		String weekday;
		
		
		wdint = cal2.calendarCount(year, month);
		weekday = WEEKDAYNAME[wdint];
		FWD = cal2.weekParseDay(weekday);
		
		
		System.out.println("");
		cal2.prompt();
		System.out.println(year + "년 " + month + "월의 달력입니다.");
		System.out.println(weekdayss);
		System.out.println(line);
		
		if(cal2.leapYears(year)) {
			for (int j = 0; j < FWD; j++) {
				System.out.print(" \t");
			}
			for (int i = 1; i <= LMD; i++) {
				System.out.print(i + " \t");
				if((i+FWD)%WD == 0) {
					System.out.println("");
				}
			}
		
			System.out.println("");
			System.out.println(line);
			System.out.println("");
		}else {
			for (int j = 0; j < FWD; j++) {
				System.out.print(" \t");
			}
			for (int i = 1; i <= MD; i++) {
				System.out.print(i + " \t");
				if((i+FWD)%WD == 0) {
					System.out.println("");
				}
			}
			
			System.out.println("");
			System.out.println(line);
			System.out.println("");
		}
	}
	
	public boolean leapYears(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public int weekParseDay(String str) {
		int fwd;
		
		if(str.equals("SU")) {
			fwd = 0;
		}else if(str.equals("MO")) {
			fwd = 1;
		}else if(str.equals("TU")) {
			fwd = 2;
		}else if(str.equals("WE")) {
			fwd = 3;
		}else if(str.equals("TH")) {
			fwd = 4;
		}else if(str.equals("FR")) {
			fwd = 5;
		}else if(str.equals("SA")) {
			fwd = 6;
		}else {
			fwd = 0;
		}
		return fwd;
	}
	
	public int calendarCount(int year, int month) {
		CalendarMethod1 cal = new CalendarMethod1();
		
		final int stdyear = 1;
		final int stdmonth = 1;
		final int stdweekday = 1; // 서기 1년/1월/1일 = Monday
		
		int count = 0;
		int wdint;
		
		for (int i = stdyear; i < year; i++) {
			int del;
			if(cal.leapYears(i)){
				del = 366;
			}else {
				del = 365;
			}
			count = count + del;
		}
		for (int i = stdmonth; i < month; i++) {
			int del;
			if(cal.leapYears(year)) {
				del = leapdays[i-1];
			}else {
				del = days[i-1];
			}
			count = count + del;
		}
		wdint = (count+stdweekday) % 7;
		
		return wdint;
	}
	
	public void prompt() {
		final String pt = ">> ";
		System.out.print(pt);
	}	
}
