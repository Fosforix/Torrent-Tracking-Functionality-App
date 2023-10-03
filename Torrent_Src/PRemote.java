import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class PRemote extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PRemote() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Remote");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JLabel lblNewLabel = new JLabel("µTorrent Remote provides an easly and highly secure way of accessing your client");
        lblNewLabel.setBounds(22, 62, 483, 14);
        add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("through a browser.");
        lblNewLabel_1.setBounds(22, 76, 176, 14);
        add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Just enable the connection below, choose a computer name and password and");
        lblNewLabel_2.setBounds(22, 111, 483, 14);
        add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("remember to leave this computer on.");
        lblNewLabel_3.setBounds(22, 125, 416, 14);
        add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Learn More");
        lblNewLabel_4.setBounds(22, 150, 90, 14);
        add(lblNewLabel_4);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Enable µTorrent Remote access");
        chckbxNewCheckBox.setBounds(13, 210, 276, 23);
        add(chckbxNewCheckBox);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Authentication", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 240, 505, 97);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_5 = new JLabel("Computer");
        lblNewLabel_5.setBounds(16, 23, 67, 14);
        panel.add(lblNewLabel_5);
        
        JLabel lblNewLabel_5_1 = new JLabel("Password");
        lblNewLabel_5_1.setBounds(247, 23, 67, 14);
        panel.add(lblNewLabel_5_1);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(73, 20, 164, 20);
        panel.add(textField);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(304, 20, 164, 20);
        panel.add(textField_1);
        
        JLabel lblNewLabel_6 = new JLabel("* Your computer name can be anything you choose.");
        lblNewLabel_6.setBounds(16, 48, 298, 14);
        panel.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("Status: Not accessible");
        lblNewLabel_7.setBounds(16, 73, 177, 14);
        panel.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("Try our new Android app!");
        lblNewLabel_8.setBounds(22, 359, 207, 14);
        add(lblNewLabel_8);
	}

}
