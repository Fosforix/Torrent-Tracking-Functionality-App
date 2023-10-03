import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class AddRSSFeed extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JCheckBox chckbxNewCheckBox_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRSSFeed frame = new AddRSSFeed();
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
	public AddRSSFeed() {
		setTitle("Add RSS Feed");
		setIconImage(Toolkit.getDefaultToolkit().getImage("\\\\HOME\\home\\ac568\\Desktop\\Piug\\Proiect\\social_style_3_rss-512-1.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(378, 317, 99, 33);
		contentPane.add(btnNewButton);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFocusPainted(false);
		btnOk.setBounds(260, 317, 99, 33);
		contentPane.add(btnOk);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Feed", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(24, 28, 453, 106);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Custom Alias:");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setEnabled(chckbxNewCheckBox.isSelected());
			}
		});
		chckbxNewCheckBox.setFocusPainted(false);
		chckbxNewCheckBox.setBounds(15, 63, 119, 23);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("Feed URL:");
		lblNewLabel.setBounds(21, 31, 80, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(136, 28, 296, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(136, 64, 296, 20);
		panel.add(textField_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Subscription", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(24, 153, 453, 106);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		rdbtnNewRadioButton = new JRadioButton("Do not automatically download all items");
		rdbtnNewRadioButton.setFocusPainted(false);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_1.setSelected(false);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_1.setSelected(false);
			}
		});
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(15, 27, 225, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Automatically download all items published in feed");
		rdbtnNewRadioButton_1.setFocusPainted(false);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox_1.setEnabled(rdbtnNewRadioButton_1.isSelected());
				rdbtnNewRadioButton.setSelected(false);
			}
		});
		rdbtnNewRadioButton_1.setBounds(15, 53, 304, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		chckbxNewCheckBox_1 = new JCheckBox("Use smart episode filter");
		chckbxNewCheckBox_1.setFocusPainted(false);
		chckbxNewCheckBox_1.setEnabled(false);
		chckbxNewCheckBox_1.setBounds(41, 76, 155, 23);
		panel_1.add(chckbxNewCheckBox_1);
	}
}
