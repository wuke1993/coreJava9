package ch02;
/**
 * @author: wuke 
 * @date  : 2017��2��15�� ����7:55:03
 * Title  : TestEnum
 * Description : 
 */
public class TestEnum {
	
    enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};
    
	public static void main(String[] args) {
		Size s = Size.SMALL;
		
		System.out.println(s);
	}
}