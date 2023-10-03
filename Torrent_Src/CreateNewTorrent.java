import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateNewTorrent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewTorrent frame = new CreateNewTorrent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreateNewTorrent() {
		setTitle("Create New Torrent");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Select Source", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(25, 28, 394, 155);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(20, 30, 352, 27);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Add directory");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(253, 68, 119, 27);
		panel.add(btnNewButton);
		
		JButton btnAddFile = new JButton("Add file");
		btnAddFile.setFocusPainted(false);
		btnAddFile.setBounds(124, 68, 119, 27);
		panel.add(btnAddFile);
		
		JLabel lblNewLabel = new JLabel("Skip Files:");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBounds(20, 109, 75, 21);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(83, 106, 289, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Other", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(445, 28, 394, 105);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Start seeding");
		chckbxNewCheckBox.setFocusPainted(false);
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(23, 23, 97, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxPreserveFileOrder = new JCheckBox("Preserve file order");
		chckbxPreserveFileOrder.setFocusPainted(false);
		chckbxPreserveFileOrder.setBounds(23, 59, 123, 23);
		panel_1.add(chckbxPreserveFileOrder);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Private torrent");
		chckbxNewCheckBox_1_1.setFocusPainted(false);
		chckbxNewCheckBox_1_1.setBounds(229, 23, 123, 23);
		panel_1.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("Create Encrypted");
		chckbxNewCheckBox_1_1_1.setFocusPainted(false);
		chckbxNewCheckBox_1_1_1.setBounds(229, 59, 159, 23);
		panel_1.add(chckbxNewCheckBox_1_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "TorrentProperties", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBounds(25, 194, 394, 221);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Trackers:");
		lblNewLabel_1.setBounds(10, 23, 69, 26);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Web Seeds:");
		lblNewLabel_2.setBounds(10, 88, 69, 14);
		panel_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Comment:");
		lblNewLabel_3.setBounds(10, 162, 69, 14);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Piece size:");
		lblNewLabel_4.setBounds(10, 191, 69, 14);
		panel_1_1.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"(auto detect)", "16 kB", "32 kB", "64 kB", "128 kB", "256 kB", "512 kB", "1024 kB", "2048 kB", "4096 kB", "8192 kB", "16384 kB"}));
		comboBox_1.setBounds(255, 187, 124, 22);
		panel_1_1.add(comboBox_1);
		
		JTextPane txtpnUdptrackeropenbittorrentcomannounceUdptrackeropentrackrorgannounce = new JTextPane();
		txtpnUdptrackeropenbittorrentcomannounceUdptrackeropentrackrorgannounce.setText("udp://tracker.openbittorrent.com:80/announce\r\n\r\nudp://tracker.opentrackr.org:1337/announce");
		txtpnUdptrackeropenbittorrentcomannounceUdptrackeropentrackrorgannounce.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtpnUdptrackeropenbittorrentcomannounceUdptrackeropentrackrorgannounce.setBounds(89, 23, 290, 57);
		panel_1_1.add(txtpnUdptrackeropenbittorrentcomannounceUdptrackeropentrackrorgannounce);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPane_1.setBounds(89, 88, 290, 57);
		panel_1_1.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPane_2.setBounds(89, 156, 290, 20);
		panel_1_1.add(textPane_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Related", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(445, 144, 394, 138);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Website: ");
		lblNewLabel_5.setBounds(25, 30, 68, 14);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Rss:");
		lblNewLabel_5_1.setBounds(25, 65, 68, 14);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("<html>Similar<br>Torrents:</html>");
		lblNewLabel_5_2.setBounds(25, 90, 68, 37);
		panel_2.add(lblNewLabel_5_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 27, 267, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 62, 267, 20);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(103, 99, 267, 20);
		panel_2.add(textField_3);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreate.setFocusPainted(false);
		btnCreate.setBounds(585, 375, 119, 27);
		contentPane.add(btnCreate);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(176, 176, 176)));
		panel_3.setBackground(new Color(207, 207, 207));
		panel_3.setBounds(445, 337, 394, 27);
		contentPane.add(panel_3);
	}
}
