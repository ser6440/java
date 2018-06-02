package JavaLang;

import java.util.Calendar;
import java.util.Date;

public class JavaUtilTest {
	public static void main(String[] args) {
		//java.util: 기본 패키지는 아닌데
		//사용하기 편한 클래스들을 많이 제공한다.
		//Date, Calendar, StringTokenizer(문자열 잘라주기), Scanner
		
		//Date: 시간을 저장할 수 있는 클래스
		
		Date date = new Date();
//		System.out.println(date.getMonth());
//		date.setMonth(11);	//date: month > 0~11
//		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		System.out.println(cal.getTime());
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.DAY_OF_YEAR);
		
		//날짜 바꾸기 Calendar set()메서드 이용
		//set(종류,시간);
		cal.set(Calendar.YEAR, 2017);	//연도 셋팅
		cal.set(Calendar.MONTH, 11);	//month 셋팅
		date = cal.getTime();
	
		//시간가져오기get(종류)
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		Date d1 = new Date(cal.getTimeInMillis());
	}
}
