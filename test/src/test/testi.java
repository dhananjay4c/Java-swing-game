package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class testi extends JFrame {

	private JPanel contentPane;
	String first="hi";
	String second="hello";
	boolean isTrue;
	JButton fbtn;
	JButton sbtn;
	Timer timer;
	final int TIME_DELY=10000;
	
	public static void main(String[] args) {
		
					testi frame = new testi();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public testi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnStart = new JButton("start");
		btnStart.setBounds(124, 93, 89, 23);
		contentPane.add(btnStart);
		
		JLabel label = new JLabel(" ");
		label.setBounds(111, 46, 120, 117);
		contentPane.add(label);
		
		
	}
	private void check(){
		if(first.trim().length()!=0&&second.trim().length()!=0){
			if(first.equals(second)){
				fbtn.setEnabled(false);
				sbtn.setEnabled(false);
				
			}
		}
		
	}
}
