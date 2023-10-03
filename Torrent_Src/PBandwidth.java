import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class PBandwidth extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public PBandwidth() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Bandwidth");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Global Upload Rate Limiting", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 84);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Maximum upload rate (kB/s): [0: unlimited]");
        lblNewLabel.setBounds(16, 21, 240, 14);
        panel.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setText("0");
        textField.setBounds(351, 18, 144, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setEnabled(false);
        textField_1.setText("0");
        textField_1.setColumns(10);
        textField_1.setBounds(351, 49, 144, 20);
        panel.add(textField_1);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Alternate upload rate when not downloading (kB/s):");
        chckbxNewCheckBox.setFocusPainted(false);
        chckbxNewCheckBox.setBounds(13, 48, 332, 23);
        panel.add(chckbxNewCheckBox);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Global Download Rate Limiting", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(0, 131, 505, 47);
        add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Maximum download rate (kB/s): [0: unlimited]");
        lblNewLabel_1.setBounds(16, 21, 334, 14);
        panel_2.add(lblNewLabel_1);
        
        textField_2 = new JTextField();
        textField_2.setText("0");
        textField_2.setColumns(10);
        textField_2.setBounds(351, 18, 144, 20);
        panel_2.add(textField_2);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(null, "Global Rate Limit Options", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_3.setBounds(0, 182, 505, 108);
        add(panel_3);
        panel_3.setLayout(null);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Apply rate limit to transport overhead");
        chckbxNewCheckBox_1.setFocusPainted(false);
        chckbxNewCheckBox_1.setBounds(13, 21, 375, 23);
        panel_3.add(chckbxNewCheckBox_1);
        
        JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Apply rate limit to uTP connections");
        chckbxNewCheckBox_1_1.setFocusPainted(false);
        chckbxNewCheckBox_1_1.setSelected(true);
        chckbxNewCheckBox_1_1.setBounds(13, 47, 232, 23);
        panel_3.add(chckbxNewCheckBox_1_1);
        
        JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("Stop transfers on user interaction");
        chckbxNewCheckBox_1_1_1.setFocusPainted(false);
        chckbxNewCheckBox_1_1_1.setBounds(13, 73, 299, 23);
        panel_3.add(chckbxNewCheckBox_1_1_1);
        
        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new TitledBorder(null, "Number of Connections", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_4.setBounds(0, 294, 505, 123);
        add(panel_4);
        panel_4.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("Global maximum number of connections:");
        lblNewLabel_2.setBounds(16, 21, 236, 14);
        panel_4.add(lblNewLabel_2);
        
        textField_3 = new JTextField();
        textField_3.setText("200");
        textField_3.setColumns(10);
        textField_3.setBounds(351, 18, 144, 20);
        panel_4.add(textField_3);
        
        JLabel lblNewLabel_2_1 = new JLabel("Maximum number of connected peers per torrent:");
        lblNewLabel_2_1.setBounds(16, 46, 333, 14);
        panel_4.add(lblNewLabel_2_1);
        
        textField_4 = new JTextField();
        textField_4.setText("50");
        textField_4.setColumns(10);
        textField_4.setBounds(351, 43, 144, 20);
        panel_4.add(textField_4);
        
        JLabel lblNewLabel_2_1_1 = new JLabel("Number of upload slots per torrent:");
        lblNewLabel_2_1_1.setBounds(16, 71, 333, 14);
        panel_4.add(lblNewLabel_2_1_1);
        
        textField_5 = new JTextField();
        textField_5.setText("4");
        textField_5.setColumns(10);
        textField_5.setBounds(351, 68, 144, 20);
        panel_4.add(textField_5);
        
        JCheckBox chckbxNewCheckBox_1_1_1_1 = new JCheckBox("Use additional upload slots if upload speed < 90%");
        chckbxNewCheckBox_1_1_1_1.setFocusPainted(false);
        chckbxNewCheckBox_1_1_1_1.setSelected(true);
        chckbxNewCheckBox_1_1_1_1.setBounds(26, 92, 299, 23);
        panel_4.add(chckbxNewCheckBox_1_1_1_1);
	}

}
