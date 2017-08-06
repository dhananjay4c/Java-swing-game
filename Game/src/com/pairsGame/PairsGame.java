package com.pairsGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PairsGame extends JFrame {

	private JPanel contentPane;
	JButton b1 = new JButton(" ");
	JButton b2 = new JButton(" ");
	JButton b3 = new JButton(" ");
	JButton b4 = new JButton(" ");
	JButton b5 = new JButton(" ");
	JButton b6 = new JButton(" ");
	JButton b7 = new JButton(" ");
	JButton b8 = new JButton(" ");
	static int choice=0;
	 String first="hello";
	 String Second="hi";
	boolean istrue;
	JButton fbtn;
	JButton sbtn;
	private final JButton btnStart = new JButton("start");
	private int YES_NO_OPTION;
	
	public static void main(String[] args) {
		
					PairsGame frame = new PairsGame();
					frame.setVisible(true);
				
	}

	
	public PairsGame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				askToClose();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(350, 150, 733, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getIcon(b1);
			}
		});
		
		
		b1.setBounds(55, 177, 143, 128);
		contentPane.add(b1);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getIcon(b2);
			}
		});
		
		
		b2.setBounds(212, 177, 143, 128);
		contentPane.add(b2);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getIcon(b3);
			}
		});
		
		
		b3.setBounds(369, 177, 143, 128);
		contentPane.add(b3);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getIcon(b4);
			}
		});
		
		
		b4.setBounds(525, 177, 143, 128);
		contentPane.add(b4);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getIcon(b5);
			}
		});
		
		
		b5.setBounds(57, 310, 143, 128);
		contentPane.add(b5);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getIcon(b6);
			}
		});
		
		
		b6.setBounds(214, 310, 143, 128);
		contentPane.add(b6);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getIcon(b7);
			}
		});
		
		
		b7.setBounds(371, 310, 143, 128);
		contentPane.add(b7);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getIcon(b8);
			}
		});
		
		
		b8.setBounds(527, 310, 143, 128);
		contentPane.add(b8);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				enableTrue();
				randomColler();
			}
		});
		btnStart.setBounds(78, 93, 89, 23);
		
		contentPane.add(btnStart);
	}
	private void setImage(String bi1,String bi2,String bi3,String bi4,String bi5,String bi6,String bi7,String bi8){
		b1.setIcon(new ImageIcon(PairsGame.class.getResource(bi1)));
		b2.setIcon(new ImageIcon(PairsGame.class.getResource(bi2)));
		b3.setIcon(new ImageIcon(PairsGame.class.getResource(bi3)));
		b4.setIcon(new ImageIcon(PairsGame.class.getResource(bi4)));
		b5.setIcon(new ImageIcon(PairsGame.class.getResource(bi5)));
		b6.setIcon(new ImageIcon(PairsGame.class.getResource(bi6)));
		b7.setIcon(new ImageIcon(PairsGame.class.getResource(bi7)));
		b8.setIcon(new ImageIcon(PairsGame.class.getResource(bi8)));
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
	
	
	private void check(){
		if(first.trim().length()!=0&&Second.trim().length()!=0){
			if(first.equals(Second)){
				fbtn.setEnabled(false);
				sbtn.setEnabled(false);
				
			}
		}
		
	}
	private void getIcon(JButton bt){
		if(istrue){
			fbtn=bt;
			String firPath=bt.getIcon().toString();
			first=firPath.substring(firPath.lastIndexOf("/"));
		}else{
			sbtn=bt;
			String SecPath=bt.getIcon().toString();
			Second=SecPath.substring(SecPath.lastIndexOf("/"));
		}
		istrue=!istrue;
		check();
	}
	private void enableTrue(){
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		
	}
	private void askToClose(){
		int choice=JOptionPane.showConfirmDialog(this, "Do You Want To Colse","Tic Tac Toe", YES_NO_OPTION);
		if(choice==JOptionPane.YES_OPTION){
			this.dispose();
		}
		else{
			return;
		}
	}
}
