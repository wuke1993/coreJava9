package ch06InterfaceAndInnerClass.innerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * @author: wuke 
 * @date  : 20170523 15:14:05
 * Title  : InnerClassTest
 * Description : This program demonstrates the use of inner classes.
 */
public class InnerClassTest {

	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(100,true);
		clock.start();
		
		// keep program running until user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}

/**
 * Title: TalkingClock
 * Description: A clock that prints the time in regular intervals.
 * @author wuke
 * @date 20170523 15:25:21
 */
class TalkingClock {
	private int interval;
	private boolean beep;
	
	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}
	
	/**
	 * Starts the clock.
	 */
	public void start() {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	/**
	 * Title: TimePrinter
	 * Description: InnerClass
	 * @author wuke
	 * @date 20170523 15:23:20
	 */
	public class TimePrinter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			Date now = new Date();
			System.out.println("At the tone, the time is " + now);
			if(beep)
				Toolkit.getDefaultToolkit().beep();
		}
		
	}
}