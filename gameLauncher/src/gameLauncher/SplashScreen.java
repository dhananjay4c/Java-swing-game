package gameLauncher;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Font;

public class SplashScreen extends JWindow {

	private JPanel contentPane;

	public static void main(String[] args) {
		
					SplashScreen frame = new SplashScreen();
					frame.setVisible(true);
	}
	public SplashScreen() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		progressBar.setBounds(0, 286, 588, 7);
		contentPane.add(progressBar);
		
		JLabel lblLoading = new JLabel("Loading...");
		lblLoading.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 20));
		lblLoading.setBounds(248, 246, 131, 29);
		contentPane.add(lblLoading);
		
		JLabel label = new JLabel(" ");
		label.setIcon(new ImageIcon(SplashScreen.class.getResource("game.gif")));
		label.setBounds(0, 0, 588, 293);
		contentPane.add(label);
	}
	//void 
}
