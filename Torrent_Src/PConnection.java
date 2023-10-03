import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PConnection extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public PConnection() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Connection");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Listening Port", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 126);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Port used for incoming connections:");
        lblNewLabel.setBounds(16, 26, 230, 14);
        panel.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Random Port");
        btnNewButton.setFocusPainted(false);
        btnNewButton.setBounds(363, 22, 124, 23);
        panel.add(btnNewButton);
        
        textField = new JTextField();
        textField.setBounds(256, 23, 86, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Enable UPnP port mapping");
        chckbxNewCheckBox.setFocusPainted(false);
        chckbxNewCheckBox.setSelected(true);
        chckbxNewCheckBox.setBounds(13, 66, 186, 23);
        panel.add(chckbxNewCheckBox);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Randomize port each start");
        chckbxNewCheckBox_1.setFocusPainted(false);
        chckbxNewCheckBox_1.setBounds(256, 66, 243, 23);
        panel.add(chckbxNewCheckBox_1);
        
        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Enable NAT-PMP port mapping");
        chckbxNewCheckBox_2.setFocusPainted(false);
        chckbxNewCheckBox_2.setSelected(true);
        chckbxNewCheckBox_2.setBounds(13, 92, 211, 23);
        panel.add(chckbxNewCheckBox_2);
        
        JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Add Windows Firewall exception");
        chckbxNewCheckBox_3.setFocusPainted(false);
        chckbxNewCheckBox_3.setSelected(true);
        chckbxNewCheckBox_3.setBounds(256, 92, 243, 23);
        panel.add(chckbxNewCheckBox_3);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Proxy Server", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(0, 169, 505, 136);
        add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Type: ");
        lblNewLabel_1.setBounds(13, 26, 46, 14);
        panel_2.add(lblNewLabel_1);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"(none)", "Socks4", "Socks5", "HTTPS", "HTTP"}));
        comboBox.setBounds(82, 22, 84, 22);
        panel_2.add(comboBox);
        
        JLabel lblNewLabel_1_1 = new JLabel("Proxy:");
        lblNewLabel_1_1.setEnabled(false);
        lblNewLabel_1_1.setBounds(209, 26, 39, 14);
        panel_2.add(lblNewLabel_1_1);
        
        textField_1 = new JTextField();
        textField_1.setEnabled(false);
        textField_1.setColumns(10);
        textField_1.setBounds(256, 23, 113, 20);
        panel_2.add(textField_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Port:");
        lblNewLabel_1_1_1.setEnabled(false);
        lblNewLabel_1_1_1.setBounds(379, 26, 46, 14);
        panel_2.add(lblNewLabel_1_1_1);
        
        textField_2 = new JTextField();
        textField_2.setEnabled(false);
        textField_2.setText("8080");
        textField_2.setColumns(10);
        textField_2.setBounds(426, 23, 69, 20);
        panel_2.add(textField_2);
        
        JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Authentication");
        chckbxNewCheckBox_4.setFocusPainted(false);
        chckbxNewCheckBox_4.setEnabled(false);
        chckbxNewCheckBox_4.setBounds(13, 54, 113, 23);
        panel_2.add(chckbxNewCheckBox_4);
        
        textField_3 = new JTextField();
        textField_3.setEnabled(false);
        textField_3.setColumns(10);
        textField_3.setBounds(256, 54, 61, 20);
        panel_2.add(textField_3);
        
        JLabel lblNewLabel_1_1_2 = new JLabel("Username:");
        lblNewLabel_1_1_2.setEnabled(false);
        lblNewLabel_1_1_2.setBounds(184, 58, 69, 14);
        panel_2.add(lblNewLabel_1_1_2);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("Password:");
        lblNewLabel_1_1_1_1.setEnabled(false);
        lblNewLabel_1_1_1_1.setBounds(327, 58, 61, 14);
        panel_2.add(lblNewLabel_1_1_1_1);
        
        textField_4 = new JTextField();
        textField_4.setEnabled(false);
        textField_4.setColumns(10);
        textField_4.setBounds(393, 55, 102, 20);
        panel_2.add(textField_4);
        
        JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("Use Proxy for hostname lookups");
        chckbxNewCheckBox_4_1.setFocusPainted(false);
        chckbxNewCheckBox_4_1.setEnabled(false);
        chckbxNewCheckBox_4_1.setBounds(13, 80, 356, 23);
        panel_2.add(chckbxNewCheckBox_4_1);
        
        JCheckBox chckbxNewCheckBox_4_1_1 = new JCheckBox("Use proxy for peer-to-peer connections");
        chckbxNewCheckBox_4_1_1.setFocusPainted(false);
        chckbxNewCheckBox_4_1_1.setEnabled(false);
        chckbxNewCheckBox_4_1_1.setBounds(13, 106, 356, 23);
        panel_2.add(chckbxNewCheckBox_4_1_1);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(null, "Proxy Privacy", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_3.setBounds(0, 306, 505, 101);
        add(panel_3);
        panel_3.setLayout(null);
        
        JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Disable all local DNS lookups");
        chckbxNewCheckBox_5.setFocusPainted(false);
        chckbxNewCheckBox_5.setEnabled(false);
        chckbxNewCheckBox_5.setBounds(13, 18, 170, 23);
        panel_3.add(chckbxNewCheckBox_5);
        
        JCheckBox chckbxNewCheckBox_5_1 = new JCheckBox("Disable features that leak identifying information");
        chckbxNewCheckBox_5_1.setFocusPainted(false);
        chckbxNewCheckBox_5_1.setEnabled(false);
        chckbxNewCheckBox_5_1.setBounds(13, 44, 335, 23);
        panel_3.add(chckbxNewCheckBox_5_1);
        
        JCheckBox chckbxNewCheckBox_5_1_1 = new JCheckBox("Disable connections unsupported by the proxy");
        chckbxNewCheckBox_5_1_1.setFocusPainted(false);
        chckbxNewCheckBox_5_1_1.setEnabled(false);
        chckbxNewCheckBox_5_1_1.setBounds(13, 70, 306, 23);
        panel_3.add(chckbxNewCheckBox_5_1_1);
	}

}
