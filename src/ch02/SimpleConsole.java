package ch02;

import java.io.Console;

/**
 * @author: wuke 
 * @date  : 2017��2��16�� ����10:06:06
 * Title  : simpleConsole
 * Description : ������
 */
public class SimpleConsole {

	public static void main(String[] args) {
		Console cons = System.console();
		String userName = cons.readLine("User name: ");
		char[] passwd = cons.readPassword("Password: ");
		
		System.out.println("Your name is " + userName + ", and your password is " + passwd + "!");
	}
}
