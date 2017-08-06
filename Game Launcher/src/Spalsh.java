import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SplashScreen;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.JProgressBar;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Spalsh extends JWindow{
	JProgressBar progressBar = new JProgressBar();
	JLabel loading = new JLabel("Loading...");
	private JPanel contentPane;
	Timer timer;
	boolean isVisible=true;
	final int MAX_PROGRESS=100;
	final int TIME_DELAY=200;
	int currentProgress=1;
	
	

	public static void main(String[] args) {
		
					Spalsh frame = new Spalsh();
					frame.setVisible(true);
					frame.doAnimation();
					
				
	}

	public Spalsh() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 523, 280);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		loading.setForeground(Color.WHITE);
		loading.setFont(new Font("Segoe UI", Font.BOLD, 20));
		loading.setBounds(207, 231, 115, 30);
		contentPane.add(loading);
		
		JLabel label = new JLabel(" ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Spalsh.class.getResource("rou.gif")));
		label.setBounds(38, 0, 439, 250);
		contentPane.add(label);
		progressBar.setForeground(Color.GREEN);
		progressBar.setBounds(0, 272, 523, 8);
		contentPane.add(progressBar);
	}
	void doAnimation(){
		
		ActionListener listener=new ActionListener() {
			
			private int color;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				progressBar.setValue(currentProgress);
				currentProgress++;
				if(currentProgress>=MAX_PROGRESS){
					timer.stop();
					Spalsh.this.setVisible(false);
					Spalsh.this.dispose();
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
					
					loading.setVisible(isVisible);
					isVisible=!isVisible;
					if(isVisible){
						if(color>=5){
							color=1;
						}
						switch(color){
						case 1:
							loading.setForeground(Color.red);
							break;
						case 2:
							loading.setForeground(Color.blue);
							break;
						case 3:
							loading.setForeground(Color.WHITE);
							break;
						case 4:
							loading.setForeground(Color.GREEN);
							break;
						case 5:
							loading.setForeground(Color.pink);
							break;
						}
						color++;
					}
				}
				
			
		};
		timer=new Timer(TIME_DELAY,listener);
		timer.start();
		
	}
}
