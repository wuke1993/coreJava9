package ch04Class;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author: wuke 
 * @date  : 2017��2��23�� ����8:36:57
 * Title  : TestCalendar
 * Description : 
 */
public class TestCalendar {

	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		int month = now.get(Calendar.MONTH);
		int weekday = now.get(Calendar.DAY_OF_WEEK);
		
		GregorianCalendar deadline = new GregorianCalendar();
		deadline.set(Calendar.YEAR, 2001);
		deadline.set(Calendar.MONTH, Calendar.APRIL);
		deadline.set(Calendar.DAY_OF_MONTH, 15);
		deadline.set(2001, Calendar.APRIL, 15);
		
		deadline.add(Calendar.MONTH, 3);
		
		GregorianCalendar myBirthday = new GregorianCalendar(1993, Calendar.JULY, 28);
		int dayOfWeek = myBirthday.get(Calendar.DAY_OF_WEEK);
		System.out.println("�������ǣ�" + dayOfWeek); // �������ǣ�4, �����ǵ�һ��
	}
}