import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;

public class PTransfer extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PTransfer() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Transfer Cap");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Enable Transfer Cap");
        chckbxNewCheckBox.setFocusPainted(false);
        chckbxNewCheckBox.setBounds(13, 40, 182, 23);
        add(chckbxNewCheckBox);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Cap Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 70, 505, 197);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Transfer Cap: ");
        lblNewLabel.setEnabled(false);
        lblNewLabel.setBounds(16, 26, 109, 14);
        panel.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setEnabled(false);
        textField.setText("200");
        textField.setBounds(284, 23, 86, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setEnabled(false);
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"MB", "GB"}));
        comboBox.setSelectedIndex(1);
        comboBox.setBounds(380, 22, 49, 22);
        panel.add(comboBox);
        
        JLabel lblNewLabel_1 = new JLabel("Time Period (days):");
        lblNewLabel_1.setEnabled(false);
        lblNewLabel_1.setBounds(16, 59, 133, 14);
        panel.add(lblNewLabel_1);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "5", "10", "15", "20", "25", "30", "31"}));
        comboBox_1.setSelectedIndex(9);
        comboBox_1.setEnabled(false);
        comboBox_1.setBounds(380, 55, 49, 22);
        panel.add(comboBox_1);
        
        JLabel lblNewLabel_2 = new JLabel("Limit Type:");
        lblNewLabel_2.setEnabled(false);
        lblNewLabel_2.setBounds(16, 92, 109, 14);
        panel.add(lblNewLabel_2);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Uploads");
        rdbtnNewRadioButton.setFocusPainted(false);
        rdbtnNewRadioButton.setEnabled(false);
        rdbtnNewRadioButton.setBounds(13, 113, 109, 23);
        panel.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Downloads");
        rdbtnNewRadioButton_1.setFocusPainted(false);
        rdbtnNewRadioButton_1.setEnabled(false);
        rdbtnNewRadioButton_1.setBounds(13, 139, 109, 23);
        panel.add(rdbtnNewRadioButton_1);
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Uploads + Downloads");
        rdbtnNewRadioButton_2.setFocusPainted(false);
        rdbtnNewRadioButton_2.setSelected(true);
        rdbtnNewRadioButton_2.setEnabled(false);
        rdbtnNewRadioButton_2.setBounds(13, 165, 173, 23);
        panel.add(rdbtnNewRadioButton_2);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Usage history for selected period:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel_2.setBounds(0, 268, 505, 167);
        add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("Uploaded:");
        lblNewLabel_3.setBounds(16, 26, 106, 14);
        panel_2.add(lblNewLabel_3);
        
        JLabel lblNewLabel_3_1 = new JLabel("Downloaded:");
        lblNewLabel_3_1.setBounds(16, 51, 106, 14);
        panel_2.add(lblNewLabel_3_1);
        
        JLabel lblNewLabel_3_1_1 = new JLabel("Uploaded + Downloaded:");
        lblNewLabel_3_1_1.setBounds(16, 76, 162, 14);
        panel_2.add(lblNewLabel_3_1_1);
        
        JLabel lblNewLabel_3_2 = new JLabel("Time period:");
        lblNewLabel_3_2.setBounds(16, 101, 106, 14);
        panel_2.add(lblNewLabel_3_2);
        
        JButton btnNewButton = new JButton("Reset History");
        btnNewButton.setFocusPainted(false);
        btnNewButton.setBounds(13, 126, 120, 23);
        panel_2.add(btnNewButton);
        
        JLabel lblNewLabel_4 = new JLabel("124 MB");
        lblNewLabel_4.setBounds(284, 26, 89, 14);
        panel_2.add(lblNewLabel_4);
        
        JLabel lblNewLabel_4_1 = new JLabel("13 GB");
        lblNewLabel_4_1.setBounds(284, 51, 89, 14);
        panel_2.add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_4_2 = new JLabel("13.2 GB");
        lblNewLabel_4_2.setBounds(284, 76, 89, 14);
        panel_2.add(lblNewLabel_4_2);
        
        JLabel lblNewLabel_4_1_1 = new JLabel("Last 31 Days");
        lblNewLabel_4_1_1.setBounds(284, 101, 89, 14);
        panel_2.add(lblNewLabel_4_1_1);
	}
}
