package ch03Array;

import java.util.Arrays;

/**
 * @author: wuke 
 * @date  : 2017��2��23�� ����4:00:45
 * Title  : IrregularArray
 * Description : ����������
 */
public class IrregularArray {

	public static void main(String[] args) {
		int[][] irregularArr = new int[3][];
		for(int n = 0; n < irregularArr.length; n++)
			irregularArr[n] = new int[n + 1];
		
		// ��ֵ
		for(int i = 0; i < irregularArr.length; i++)
			for(int j = 0; j < irregularArr[i].length; j++)
				irregularArr[i][j] = i + j;
		
		// ��ӡ
		System.out.println(Arrays.deepToString(irregularArr));
	}
}
