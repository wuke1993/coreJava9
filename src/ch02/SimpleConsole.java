package ch02;

import java.io.Console;

/**
 * @author: wuke 
 * @date  : 2017年2月16日 上午10:06:06
 * Title  : simpleConsole
 * Description : 有问题
 */
public class SimpleConsole {

	public static void main(String[] args) {
		Console cons = System.console();
		String userName = cons.readLine("User name: ");
		char[] passwd = cons.readPassword("Password: ");
		
		System.out.println("Your name is " + userName + ", and your password is " + passwd + "!");
	}
}
