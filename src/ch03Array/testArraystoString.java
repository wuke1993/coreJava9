package ch03Array;
import java.util.Arrays;

/**
 * @author: wuke 
 * @date  : 2017年2月22日 下午9:33:33
 * Title  : testArraytoString
 * Description : 
 */
public class testArraystoString {

	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i = 0; i < 5; i++)
			a[i] = i;
		
		for(int temp : a)
			System.out.print(temp + "  ");
		System.out.println();
		
		System.out.println(a.toString()); // [I@2a139a55
		
		System.out.println(Arrays.toString(a)); // [0, 1, 2, 3, 4]

	}
}
