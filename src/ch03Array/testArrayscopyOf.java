package ch03Array;
import java.util.Arrays;

/**
 * @author: wuke 
 * @date  : 2017��2��22�� ����9:56:47
 * Title  : testArrayscopyOf
 * Description : 
 */
public class testArrayscopyOf {

	public static void main(String[] args) {
		int[] smallPrimes = {2,3,5,7,11,13};
		int[] luckyNumbers = smallPrimes; // ������������ͬһ������
		luckyNumbers[5] = 12; // now smallPrimes is also 12
		System.out.println("array smallPrimes: " + Arrays.toString(smallPrimes) + "   " + smallPrimes.toString());
		System.out.println("array luckyNumbers: " + Arrays.toString(luckyNumbers) + "   " + luckyNumbers.toString());
		
		int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length); // ֵ����
		copiedLuckyNumbers[5] = 13;
		System.out.println("array luckyNumbers: " + Arrays.toString(luckyNumbers) + "   " + luckyNumbers.toString());
		System.out.println("array copiedLuckyNumbers: " + Arrays.toString(copiedLuckyNumbers) + "   " + copiedLuckyNumbers.toString());
	}
}
/**
 * array smallPrimes: [2, 3, 5, 7, 11, 12]   [I@2a139a55
 * array luckyNumbers: [2, 3, 5, 7, 11, 12]   [I@2a139a55
 * array luckyNumbers: [2, 3, 5, 7, 11, 12]   [I@2a139a55
 * array copiedLuckyNumbers: [2, 3, 5, 7, 11, 13]   [I@15db9742
 * 
 */