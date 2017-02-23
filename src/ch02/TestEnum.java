package ch02;
/**
 * @author: wuke 
 * @date  : 2017年2月15日 下午7:55:03
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