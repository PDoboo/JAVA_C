package P03.enums;

import java.util.Calendar;

public class EnumWeekEx { 

	public static void main(String[] args) {
		Week today=null;//today에는 Week라는 변수가 있다는뜻
//		int a =0;
		Calendar cal= Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//1~7
		switch(week) {
		case 1: today =Week.SUNDAY;
		break;
		case 2: today =Week.MONDAY;
		break;
		case 3: today =Week.TUESDAY;
		break;
		case 4: today =Week.WENDEDAY;
		break;
		case 5: today =Week.THUSDAY;
		break;
		case 6: today =Week.FIRDAY;
		break;
		case 7: today =Week.SATUDAY;
		break;
		
		
		}
	   System.out.println("오늘은:"+today+"입니다");
	   if(today == Week.SUNDAY)//일요일이면 true로 적용되어 "일요일은 러닝" 출력됨
		   System.out.println("일요일은 러닝");
	   else
		   System.out.println("코딩공부");
	}

}
