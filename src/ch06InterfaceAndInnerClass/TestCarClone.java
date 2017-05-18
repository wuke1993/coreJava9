package ch06InterfaceAndInnerClass;

import java.util.Date;

/**
 * @author: wuke 
 * @date  : 2017年5月2日 下午6:08:36
 * Title  : TestClone
 * Description : 
 */
public class TestCarClone {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		try {
			Car benz = new Car("benz", 1000000, date);
		
			System.out.println(benz.toString());
			
			Car benz1 = benz.clone();
			
			date.setTime(11111111);
			
			System.out.println(benz1.toString());
			System.out.println(benz.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
/*
 * 
 */