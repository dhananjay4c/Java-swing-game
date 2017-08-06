package com.Sudoku;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sudoku extends JFrame {

	private JPanel contentPane;
	JButton reset = new JButton("RESET");
	JButton imageb1 = new JButton("");
	JButton imageb2 = new JButton("");
	JButton imageb3 = new JButton("");
	JButton imageb4 = new JButton("");
	JButton b1 = new JButton("");
	JButton b2 = new JButton("");
	JButton b3 = new JButton("");
	JButton b4 = new JButton("");
	JButton b5 = new JButton("");
	JButton b6 = new JButton("");
	JButton b7 = new JButton("");
	JButton b8 = new JButton("");
	JButton b9 = new JButton("");
	JButton b10 = new JButton("");
	JButton b11 = new JButton("");
	JButton b12 = new JButton("");
	JButton b13 = new JButton("");
	JButton b14 = new JButton("");
	JButton b15 = new JButton("");
	JButton b16 = new JButton("");
	String imagename;
	String btn1;
	String btn2;
	String btn4;
	String btn6;
	String btn8;
	String btn9;
	String btn11;
	String btn12;
	String btn13;
	String btn14;
	String btn15;
	public static void main(String[] args) {
		
					Sudoku frame = new Sudoku();
					frame.setVisible(true);
				
	}

	
	public Sudoku() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,1360, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		imageb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				imagename="kos.png";
			}
		});
		
		
		imageb1.setIcon(new ImageIcon(Sudoku.class.getResource("kos.png")));
		imageb1.setBounds(10, 126, 149, 115);
		contentPane.add(imageb1);
		imageb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				imagename="pizzahut.png";
			}
		});
		
		
		imageb2.setIcon(new ImageIcon(Sudoku.class.getResource("pizzahut.png")));
		imageb2.setBounds(10, 269, 149, 115);
		contentPane.add(imageb2);
		imageb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				imagename="twitter.png";
			}
		});
		
		
		imageb3.setIcon(new ImageIcon(Sudoku.class.getResource("twitter.png")));
		imageb3.setBounds(10, 406, 149, 115);
		contentPane.add(imageb3);
		imageb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				imagename="loading.png";
			}
		});
		
		
		imageb4.setIcon(new ImageIcon(Sudoku.class.getResource("loading.png")));
		imageb4.setBounds(10, 544, 149, 115);
		contentPane.add(imageb4);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b1.setIcon(new ImageIcon(Sudoku.class.getResource(imagename)));
				btn1=imagename;
			}
		});
		
		
		b1.setBounds(297, 126, 149, 115);
		contentPane.add(b1);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b2.setIcon(new ImageIcon(Sudoku.class.getResource(imagename)));
				btn2=imagename;
				win();
			}
		});
		
		
		b2.setBounds(297, 269, 149, 115);
		contentPane.add(b2);
		
		
		b3.setIcon(new ImageIcon(Sudoku.class.getResource("loading.png")));
		b3.setBounds(297, 406, 149, 115);
		contentPane.add(b3);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b4.setIcon(new ImageIcon(Sudoku.class.getResource(imagename)));
				btn4=imagename;
				win();
			}
		});
		
		
		b4.setBounds(297, 544, 149, 115);
		contentPane.add(b4);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b8.setIcon(new ImageIcon(Sudoku.class.getResource(imagename)));
				btn8=imagename;
				win();
			}
		});
		
		
		b8.setBounds(524, 544, 149, 115);
		contentPane.add(b8);
		
		
		b7.setIcon(new ImageIcon(Sudoku.class.getResource("pizzahut.png")));
		b7.setBounds(524, 406, 149, 115);
		contentPane.add(b7);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b6.setIcon(new ImageIcon(Sudoku.class.getResource(imagename)));
				btn6=imagename;
				win();
			}
		});
		
		
		b6.setBounds(524, 269, 149, 115);
		contentPane.add(b6);
		
		
		b5.setIcon(new ImageIcon(Sudoku.class.getResource("twitter.png")));
		b5.setBounds(524, 126, 149, 115);
		contentPane.add(b5);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b9.setIcon(new ImageIcon(Sudoku.class.getResource(imagename)));
				btn9=imagename;
				win();
			}
		});
		
		
		b9.setBounds(741, 126, 149, 115);
		contentPane.add(b9);
		
		
		b10.setIcon(new ImageIcon(Sudoku.class.getResource("loading.png")));
		b10.setBounds(741, 269, 149, 115);
		contentPane.add(b10);
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b11.setIcon(new ImageIcon(Sudoku.class.getResource(imagename)));
				btn11=imagename;
				win();
			}
		});
		
		
		b11.setBounds(741, 406, 149, 115);
		contentPane.add(b11);
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b12.setIcon(new ImageIcon(Sudoku.class.getResource(imagename)));
				btn12=imagename;
				win();
			}
		});
		
		
		b12.setBounds(741, 544, 149, 115);
		contentPane.add(b12);
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b13.setIcon(new ImageIcon(Sudoku.class.getResource(imagename)));
				btn13=imagename;
				win();
			}
		});
		
		
		b13.setBounds(966, 126, 149, 115);
		contentPane.add(b13);
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b14.setIcon(new ImageIcon(Sudoku.class.getResource(imagename)));
				btn14=imagename;
				win();
			}
		});
		
		
		b14.setBounds(966, 269, 149, 115);
		contentPane.add(b14);
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b15.setIcon(new ImageIcon(Sudoku.class.getResource(imagename)));
				btn15=imagename;
				win();
			}
		});
		
		
		b15.setBounds(966, 406, 149, 115);
		contentPane.add(b15);
		
		
		b16.setIcon(new ImageIcon(Sudoku.class.getResource("kos.png")));
		b16.setBounds(966, 544, 149, 115);
		contentPane.add(b16);
		
		
		reset.setFont(new Font("Tahoma", Font.BOLD, 40));
		reset.setBounds(1153, 70, 181, 70);
		contentPane.add(reset);
	}
	void win()
	{
		if(b1.equals("kos.png")&&b2.equals("twitter.png")&&b4.equals("pizzahut.png")
				&&b6.equals("kos.png")&&b8.equals("loading.png")&&b9.equals("pizzahut.png")&&b11.equals("kos.png")
				&&b12.equals("twitter.png")&&b13.equals("loading.png")&&b14.equals("pizzahut.png")&&b15.equals("twitter.png"))
		{
			JOptionPane.showMessageDialog(this, "you win");
						}
	}
}
