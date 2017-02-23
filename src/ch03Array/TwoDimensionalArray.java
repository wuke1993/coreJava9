package ch03Array;

import java.util.Arrays;

/**
 * @author: wuke 
 * @date  : 2017年2月23日 上午11:06:28
 * Title  : TwoDimensionalArray
 * Description : 
 */
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] a = { 
				{ 16, 4, 2, 4 }, 
				{ 54, 2, 34, 5 }, 
				{ 5, 3, 22, 3 },
				{ 4, 55, 2, 4 } 
		};
		
		for(int[] row : a)
			for(int value : row)
				System.out.print(value + "  ");
		System.out.println();
		
		System.out.println(Arrays.deepToString(a));
		
		System.out.println(Arrays.toString(a));
	}
}
/**
 * 16  4  2  4  54  2  34  5  5  3  22  3  4  55  2  4  
 * [[16, 4, 2, 4], [54, 2, 34, 5], [5, 3, 22, 3], [4, 55, 2, 4]]
 * [[I@15db9742, [I@6d06d69c, [I@7852e922, [I@4e25154f]
 */