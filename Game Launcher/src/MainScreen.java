import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.TicTacToe.ComputerTicTacToe;
import com.TicTacToe.TicTacToeSingleUser;
import com.pairsGame.PairsGame;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainScreen extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				
	}

	public MainScreen() {
		setBackground(new Color(0, 0, 205));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(0, 0, 0));
		setJMenuBar(menuBar);
		
		JMenu mnGame = new JMenu("Game  |");
		mnGame.setFont(new Font("MoolBoran", Font.BOLD, 25));
		mnGame.setForeground(new Color(255, 255, 255));
		mnGame.setBackground(new Color(0, 0, 0));
		menuBar.add(mnGame);
		
		JMenu mnTicTacToe = new JMenu("Tic Tac Toe");
		mnTicTacToe.setFont(new Font("MoolBoran", Font.PLAIN, 20));
		mnGame.add(mnTicTacToe);
		
		JMenuItem mntmSingleUser = new JMenuItem("Single User");
		mntmSingleUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ComputerTicTacToe frame = new ComputerTicTacToe();
				frame.setVisible(true);
				
			}
		});
		mntmSingleUser.setFont(new Font("MoolBoran", Font.PLAIN, 15));
		mnTicTacToe.add(mntmSingleUser);
		//*************************************create action performed for dual user **************************************************************
		JMenuItem mntmDoulUser = new JMenuItem("Doul User");
		mntmDoulUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TicTacToeSingleUser frame = new TicTacToeSingleUser();
				frame.setVisible(true);
			}
		});
		mntmDoulUser.setFont(new Font("MoolBoran", Font.PLAIN, 15));
		mnTicTacToe.add(mntmDoulUser);
		
		JMenu mnLogoQuiz = new JMenu("Logo Quiz");
		mnLogoQuiz.setFont(new Font("MoolBoran", Font.PLAIN, 20));
		mnGame.add(mnLogoQuiz);
		
		JMenuItem mntmLogoQuiz = new JMenuItem("Logo Quiz");
		mntmLogoQuiz.setFont(new Font("MoolBoran", Font.PLAIN, 15));
		mnLogoQuiz.add(mntmLogoQuiz);
		
		JMenu mnSudoku = new JMenu("Sudoku");
		mnSudoku.setFont(new Font("MoolBoran", Font.PLAIN, 20));
		mnGame.add(mnSudoku);
		
		JMenuItem mntmSudoku = new JMenuItem("Sudoku");
		mntmSudoku.setFont(new Font("MoolBoran", Font.PLAIN, 15));
		mnSudoku.add(mntmSudoku);
		
		JMenu mnPairGame = new JMenu("Pair Game");
		mnPairGame.setFont(new Font("MoolBoran", Font.PLAIN, 20));
		mnGame.add(mnPairGame);
		// ****************************Create action listionar for pairs game**************************************************************
		JMenuItem mntmPairGame = new JMenuItem("Pair Game");
		mntmPairGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PairsGame frame = new PairsGame();
				frame.setVisible(true);
			}
		});
		mntmPairGame.setFont(new Font("MoolBoran", Font.PLAIN, 15));
		mnPairGame.add(mntmPairGame);
		
		JMenu mnUtilities = new JMenu("Utilities  |");
		mnUtilities.setForeground(Color.WHITE);
		mnUtilities.setFont(new Font("MoolBoran", Font.BOLD, 25));
		mnUtilities.setBackground(Color.BLACK);
		menuBar.add(mnUtilities);
		
		JMenu mnDownloder = new JMenu("Downloder");
		mnDownloder.setFont(new Font("MoolBoran", Font.PLAIN, 20));
		mnUtilities.add(mnDownloder);
		
		JMenuItem mntmDownloder = new JMenuItem("Downloder");
		mntmDownloder.setFont(new Font("MoolBoran", Font.PLAIN, 15));
		mnDownloder.add(mntmDownloder);
		
		JMenu mnCopyTool = new JMenu("Copy Tool");
		mnCopyTool.setFont(new Font("MoolBoran", Font.PLAIN, 20));
		mnUtilities.add(mnCopyTool);
		
		JMenuItem mntmCopyTool = new JMenuItem("Copy Tool");
		mntmCopyTool.setFont(new Font("MoolBoran", Font.PLAIN, 15));
		mnCopyTool.add(mntmCopyTool);
		
		JMenu mnContectUs = new JMenu("Contect us  |");
		mnContectUs.setForeground(Color.WHITE);
		mnContectUs.setFont(new Font("MoolBoran", Font.BOLD, 25));
		mnContectUs.setBackground(Color.BLACK);
		menuBar.add(mnContectUs);
		
		JMenu mnContect = new JMenu("Contect");
		mnContect.setFont(new Font("MoolBoran", Font.PLAIN, 20));
		mnContectUs.add(mnContect);
		
		JMenuItem mntmContect = new JMenuItem("Contect");
		mntmContect.setFont(new Font("MoolBoran", Font.PLAIN, 15));
		mnContect.add(mntmContect);
		
		JMenu mnAboutUs = new JMenu("About us  |");
		mnAboutUs.setForeground(Color.WHITE);
		mnAboutUs.setFont(new Font("MoolBoran", Font.BOLD, 25));
		mnAboutUs.setBackground(Color.BLACK);
		menuBar.add(mnAboutUs);
		
		JMenu mnAbout = new JMenu("About ");
		mnAbout.setFont(new Font("MoolBoran", Font.PLAIN, 20));
		mnAboutUs.add(mnAbout);
		
		JMenuItem mntmAbout = new JMenuItem("About ");
		mntmAbout.setFont(new Font("MoolBoran", Font.PLAIN, 15));
		mnAbout.add(mntmAbout);
		
		JMenu mnAboutUs_1 = new JMenu("Exit");
		mnAboutUs_1.setForeground(Color.WHITE);
		mnAboutUs_1.setFont(new Font("MoolBoran", Font.BOLD, 25));
		mnAboutUs_1.setBackground(Color.BLACK);
		menuBar.add(mnAboutUs_1);
		
		JMenu menu_1 = new JMenu("About ");
		menu_1.setFont(new Font("MoolBoran", Font.PLAIN, 20));
		mnAboutUs_1.add(menu_1);
		
		JMenuItem menuItem = new JMenuItem("About ");
		menuItem.setFont(new Font("MoolBoran", Font.PLAIN, 15));
		menu_1.add(menuItem);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblA = new JLabel("A");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setIcon(new ImageIcon(MainScreen.class.getResource("game.gif")));
		lblA.setBounds(10, 11, 1330, 671);
		contentPane.add(lblA);
	}
}
