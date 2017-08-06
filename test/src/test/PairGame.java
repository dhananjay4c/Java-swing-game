package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;



public class PairGame extends JFrame {
	
	JLabel lb1 = new JLabel(" ");
	JLabel lb2 = new JLabel(" ");
	JLabel lb3 = new JLabel(" ");
	JLabel lb4 = new JLabel(" ");
	JLabel lb5 = new JLabel(" ");
	JLabel lb6 = new JLabel(" ");
	JLabel lb7 = new JLabel(" ");
	JLabel lb8 = new JLabel(" ");
	
	JButton b1 = new JButton(" ");
	JButton b2 = new JButton(" ");
	JButton b3 = new JButton(" ");
	JButton b4 = new JButton(" ");
	JButton b5 = new JButton(" ");
	JButton b6 = new JButton(" ");
	JButton b7 = new JButton(" ");
	JButton b8 = new JButton(" ");
	
	static int choice=0;
	
	private JPanel contentPane;
	private final JButton start = new JButton("Start");

	public static void main(String[] args) {
		
					PairGame frame = new PairGame();
					frame.setVisible(true);
	}
	public PairGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lb1.setBounds(10, 173, 152, 122);
		contentPane.add(lb1);
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lb2.setBounds(175, 173, 152, 122);
		contentPane.add(lb2);
		lb3.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lb3.setBounds(339, 173, 152, 122);
		contentPane.add(lb3);
		lb4.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lb4.setBounds(501, 173, 152, 122);
		contentPane.add(lb4);
		lb8.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lb8.setBounds(501, 306, 152, 122);
		contentPane.add(lb8);
		lb7.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lb7.setBounds(339, 306, 152, 122);
		contentPane.add(lb7);
		lb6.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lb6.setBounds(177, 306, 152, 122);
		contentPane.add(lb6);
		lb5.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lb5.setBounds(10, 306, 152, 122);
		contentPane.add(lb5);
		
		JButton b1 = new JButton(" ");
		b1.setBounds(10, 173, 152, 122);
		contentPane.add(b1);
		
		JButton b2 = new JButton(" ");
		b2.setBounds(172, 173, 152, 122);
		contentPane.add(b2);
		
		JButton b3 = new JButton(" ");
		b3.setBounds(339, 173, 152, 122);
		contentPane.add(b3);
		
		JButton b4 = new JButton(" ");
		b4.setBounds(501, 173, 152, 122);
		contentPane.add(b4);
		
		JButton b5 = new JButton(" ");
		b5.setBounds(10, 306, 152, 122);
		contentPane.add(b5);
		
		JButton b6 = new JButton(" ");
		b6.setBounds(177, 306, 152, 122);
		contentPane.add(b6);
		
		JButton b7 = new JButton(" ");
		b7.setBounds(339, 306, 152, 122);
		contentPane.add(b7);
		
		JButton b8 = new JButton(" ");
		b8.setBounds(501, 306, 152, 122);
		contentPane.add(b8);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				randomColler();
				showButton();
			}
		});
		start.setBounds(685, 173, 89, 51);
		
		contentPane.add(start);
	}
	private void setImage(String bi1,String bi2,String bi3,String bi4,String bi5,String bi6,String bi7,String bi8){
		lb1.setIcon(new ImageIcon(PairGame.class.getResource(bi1)));
		lb2.setIcon(new ImageIcon(PairGame.class.getResource(bi2)));
		lb3.setIcon(new ImageIcon(PairGame.class.getResource(bi3)));
		lb4.setIcon(new ImageIcon(PairGame.class.getResource(bi4)));
		lb5.setIcon(new ImageIcon(PairGame.class.getResource(bi5)));
		lb6.setIcon(new ImageIcon(PairGame.class.getResource(bi6)));
		lb7.setIcon(new ImageIcon(PairGame.class.getResource(bi7)));
		lb8.setIcon(new ImageIcon(PairGame.class.getResource(bi8)));
	}
	
	private void randomColler(){
		
		
		switch(choice){
			case 0:
				setImage("honda.jpg", "mogoDB.jpg", "motorola.jpg", "redhet.jpg", "redhet.jpg", "honda.jpg", "mogoDB.jpg", "motorola.jpg");
				choice++;
				break;
			case 1:
				setImage("motorola.jpg", "mogoDB.jpg","redhet.jpg","honda.jpg", "redhet.jpg","motorola.jpg" , "mogoDB.jpg","honda.jpg" );
				choice++;
				break;
			case 2:
				setImage("honda.jpg", "redhet.jpg", "motorola.jpg","mogoDB.jpg" ,"mogoDB.jpg" , "honda.jpg", "redhet.jpg", "motorola.jpg");
				choice++;
				break;
			case 3:
				setImage("mogoDB.jpg","honda.jpg", "motorola.jpg", "redhet.jpg","mogoDB.jpg" , "honda.jpg", "redhet.jpg", "motorola.jpg");
				choice++;
				break;
			case 4:
				setImage("motorola.jpg","mogoDB.jpg", "honda.jpg", "redhet.jpg", "redhet.jpg",  "motorola.jpg", "mogoDB.jpg","honda.jpg");
				choice++;
				break;
			case 5:
				setImage("mogoDB.jpg","honda.jpg", "motorola.jpg", "motorola.jpg", "redhet.jpg", "honda.jpg", "mogoDB.jpg", "redhet.jpg");
				choice++;
				break;
			case 6:
				setImage("redhet.jpg","mogoDB.jpg", "motorola.jpg","honda.jpg" , "redhet.jpg", "honda.jpg","motorola.jpg","mogoDB.jpg");
				choice++;
				break;
			case 7:
				setImage("honda.jpg","mogoDB.jpg", "motorola.jpg", "redhet.jpg","motorola.jpg" , "honda.jpg", "mogoDB.jpg", "redhet.jpg");
				choice++;
				break;
			case 8:
				setImage("redhet.jpg","motorola.jpg","mogoDB.jpg", "redhet.jpg","honda.jpg" , "honda.jpg", "mogoDB.jpg", "motorola.jpg");
				choice++;
				break;
			case 9:
				setImage("mogoDB.jpg","redhet.jpg", "motorola.jpg", "redhet.jpg", "mogoDB.jpg", "honda.jpg","honda.jpg", "motorola.jpg");
				choice=0;
				break;
		}
	}
	private void showButton(){
		/*b1.setVisible(true);
		b2.setVisible(true);
		b3.setVisible(true);
		b4.setVisible(true);
		b5.setVisible(true);
		b6.setVisible(true);
		b7.setVisible(true);
		b8.setVisible(true);*/
		b1.setIcon(new ImageIcon(PairGame.class.getResource("mcd.jpg")));
		System.out.println("ka re chutiya");
	}
}
