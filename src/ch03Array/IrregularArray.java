package ch03Array;

import java.util.Arrays;

/**
 * @author: wuke 
 * @date  : 2017年2月23日 下午4:00:45
 * Title  : IrregularArray
 * Description : 不规则数组
 */
public class IrregularArray {

	public static void main(String[] args) {
		int[][] irregularArr = new int[3][];
		for(int n = 0; n < irregularArr.length; n++)
			irregularArr[n] = new int[n + 1];
		
		// 赋值
		for(int i = 0; i < irregularArr.length; i++)
			for(int j = 0; j < irregularArr[i].length; j++)
				irregularArr[i][j] = i + j;
		
		// 打印
		System.out.println(Arrays.deepToString(irregularArr));
	}
}
