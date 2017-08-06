package com.TicTacToe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ComputerTicTacToe extends JFrame {

	private JPanel contentPane;
	boolean isTrue;
	JButton b1 = new JButton(" ");
	JButton b2 = new JButton(" ");
	JButton b3 = new JButton(" ");
	JButton b4 = new JButton(" ");
	JButton b5 = new JButton(" ");
	JButton b6 = new JButton(" ");
	JButton b7 = new JButton(" ");
	JButton b8 = new JButton(" ");
	JButton b9 = new JButton(" ");
	private int YES_NO_OPTION;
	
	
	public static void main(String[] args) {
		
					ComputerTicTacToe frame = new ComputerTicTacToe();
					frame.setVisible(true);
				
	}

	public ComputerTicTacToe() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				askToClose();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(350, 150, 658, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doXandZero(b1);
			}
		});
		
		
		b1.setFont(new Font("Georgia", Font.BOLD, 50));
		b1.setBounds(163, 194, 89, 59);
		contentPane.add(b1);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doXandZero(b2);
			}
		});
		
		
		b2.setFont(new Font("Georgia", Font.BOLD, 50));
		b2.setBounds(274, 194, 89, 59);
		contentPane.add(b2);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doXandZero(b3);
			}
		});
		
		
		b3.setFont(new Font("Georgia", Font.BOLD, 50));
		b3.setBounds(389, 194, 89, 59);
		contentPane.add(b3);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doXandZero(b5);
			}
		});
		
		
		b5.setFont(new Font("Georgia", Font.BOLD, 50));
		b5.setBounds(274, 264, 89, 59);
		contentPane.add(b5);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doXandZero(b4);
			}
		});
		
		
		b4.setFont(new Font("Georgia", Font.BOLD, 50));
		b4.setBounds(163, 264, 89, 59);
		contentPane.add(b4);
		
		
		b7.setFont(new Font("Georgia", Font.BOLD, 50));
		b7.setBounds(163, 334, 89, 59);
		contentPane.add(b7);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doXandZero(b8);
			}
		});
		
		
		b8.setFont(new Font("Georgia", Font.BOLD, 50));
		b8.setBounds(274, 334, 89, 59);
		contentPane.add(b8);
		
		
		b9.setFont(new Font("Georgia", Font.BOLD, 50));
		b9.setBounds(389, 334, 89, 59);
		contentPane.add(b9);
		
		
		b6.setFont(new Font("Georgia", Font.BOLD, 50));
		b6.setBounds(389, 264, 89, 59);
		contentPane.add(b6);
	}
	private void doXandZero(JButton bt){
		if(bt.getText().trim().length()==0){
			
				bt.setText("0");
				ComputerPlay();
				winLoose();
				
		}
	}
	private boolean checkBlank(JButton bt){
		if(bt.getText().trim().length()==0){
			return true;
		}else{
			return false;
		}
	}
	private void ComputerPlay(){
			
		//*******************one set logic*********************************************************
			if(b5.getText().equals("0")){
				if(checkBlank(b1)){
					b1.setText("X");
				}
			}
		
			if(b2.getText().equals("0")){
				if(checkBlank(b8)){
					b8.setText("X");
				}
			}
			
			if(b4.getText().equals("0")){
				if(checkBlank(b6)){
					b6.setText("X");
				}
			}
			
			if(b3.getText().equals("0")){
				if(checkBlank(b7)){
					b7.setText("X");
				}
			}
		//*******************reverse of one set logic************************************************
			if(b1.getText().equals("0")){
				if(checkBlank(b5)){
					b5.setText("X");
				}
			}
		
			if(b2.getText().equals("0")){
				if(checkBlank(b8)){
					b8.setText("X");
				}
			}
			
			if(b4.getText().equals("0")){
				if(checkBlank(b6)){
					b6.setText("X");
				}
			}
			
			if(b3.getText().equals("0")){
				if(checkBlank(b7)){
					b7.setText("X");
				}
			}
	}
	private boolean isRowBlank(JButton bt1,JButton bt2,JButton bt3){
		if(checkBlank(bt1)&&checkBlank(bt2)&&checkBlank(bt3)){
			return false;
		}else{
			return true;
		}
	}
	
	private boolean isRowMatch(JButton bt1,JButton bt2,JButton bt3){
		if(isRowBlank(bt1, bt2, bt3)){
			if(bt1.getText().equals(bt2.getText())&&bt2.getText().equals(bt3.getText())){
				return true;
			}
			else{
				return false;
			}
		}else{
		return false;
		}
	}
	private void winLoose(){
		if(isRowMatch(b1, b2, b3)){
			SayMassage(b1);
		}else
		if(isRowMatch(b4, b5, b6)){
			SayMassage(b4);
		}else
		if(isRowMatch(b7, b8, b9)){
			SayMassage(b7);
		}else
		if(isRowMatch(b1, b4, b7)){
			SayMassage(b1);
		}else
		if(isRowMatch(b2, b5, b8)){
			SayMassage(b2);
		}else
		if(isRowMatch(b3, b6, b9)){
			SayMassage(b3);
		}else
		if(isRowMatch(b1, b5, b9)){
			SayMassage(b1);
		}else
		if(isRowMatch(b3, b5, b7)){
			SayMassage(b3);
		}
	}
	
	private void SayMassage(JButton bt){
		JOptionPane.showMessageDialog(this, "Game Over "+"'"+bt.getText()+"'"+" is Winner");
		reset();
		
	}
	private void reset(){
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
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
