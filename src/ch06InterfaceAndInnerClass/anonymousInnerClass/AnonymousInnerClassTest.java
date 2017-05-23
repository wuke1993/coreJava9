package ch06InterfaceAndInnerClass.anonymousInnerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * @author: wuke 
 * @date  : 2017年5月23日 下午3:33:18
 * Title  : AnonymousInnerClassTest
 * Description : This program demonstrates anonymous inner classes.
 */
public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock();
		clock.start(1000, true);
		
		// keep program running until user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

/**
 * Title: TalkingClock
 * Description: A clock that prints the time in regular intervals.
 * @author wuke
 * @date 20170523 15:45:02
 */
class TalkingClock {
	public void start(int interval, boolean beep) {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				if(beep)
					Toolkit.getDefaultToolkit().beep();
			}
		};
		Timer t = new Timer(interval, listener);
		t.start();
	}
}