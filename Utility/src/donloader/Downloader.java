package donloader;

import java.awt.EventQueue;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.portable.InputStream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Downloader extends JFrame {

	private JPanel contentPane;
	private JTextField url;
	private JTextField path;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Downloader frame = new Downloader();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Downloader() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblDspDowndoader = new JLabel("DSP Downdoader");
		lblDspDowndoader.setHorizontalAlignment(SwingConstants.CENTER);
		lblDspDowndoader.setBounds(224, 11, 152, 19);
		contentPane.add(lblDspDowndoader);
		
		JLabel lblEnterTheUrl = new JLabel("Enter the url here");
		lblEnterTheUrl.setBounds(10, 40, 127, 14);
		contentPane.add(lblEnterTheUrl);
		
		JButton btnDoenload = new JButton("Doenload");
		btnDoenload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					downloder();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDoenload.setBounds(366, 212, 89, 23);
		contentPane.add(btnDoenload);
		
		JButton btnCancle = new JButton("cancle");
		btnCancle.setBounds(256, 212, 89, 23);
		contentPane.add(btnCancle);
		
		url = new JTextField();
		url.setBounds(10, 57, 668, 20);
		contentPane.add(url);
		url.setColumns(10);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		progressBar.setBounds(0, 255, 688, 7);
		contentPane.add(progressBar);
		
		JLabel lblEnterTheStorage = new JLabel("Enter the storage path");
		lblEnterTheStorage.setBounds(10, 85, 127, 14);
		contentPane.add(lblEnterTheStorage);
		
		path = new JTextField();
		path.setBounds(10, 110, 668, 20);
		contentPane.add(path);
		path.setColumns(10);
	}
	private void downloder() throws IOException{
		String urlid=url.getText();
		String pathid=path.getText();
		URL urlob= new URL(urlid);
		URLConnection connection=urlob.openConnection();
		connection.connect();
		InputStream is=(InputStream) connection.getInputStream();
		String fileName=urlid.substring(urlid.lastIndexOf("/"));
		BufferedInputStream bi=new BufferedInputStream(is);
		FileOutputStream fo=new FileOutputStream(pathid+fileName);
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		int singleByte=bi.read();
		while(singleByte!=-1){
			bo.write(singleByte);
			bi.read();
		}
		System.out.println("file is downloaded");
		
	}
}
