package observerPattern;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import jsrlog.JsrLog;

public class SwingObserverExzample {
	
	JFrame frame;
	
	public static void main(String[] args) {
		JsrLog.logout("JSR LOG\n");
		SwingObserverExzample exzample = new SwingObserverExzample();
		exzample.go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton btn = new JButton("Should I do it");
		btn.addActionListener(new AngelListener());
		btn.addActionListener(new DevilListener());
		
		frame.getContentPane().add(BorderLayout.CENTER, btn);
		
//		JPanel panel  = new JPanel();
//		panel.add(frame);
//		panel.show();
	}
	
	class AngelListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JsrLog.logout("Don't do it, you might regret it!\n");
		}		
	}
	
	class DevilListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JsrLog.logout("Come on, do it!\n");
		}		
	}
}
