import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class PQueue extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public PQueue() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Queueing");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Queue Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 86);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Maximum number of active torrents (upload or download):");
        lblNewLabel.setBounds(16, 26, 341, 14);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Maximum number of active downloads:");
        lblNewLabel_1.setBounds(16, 59, 239, 14);
        panel.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setText("8");
        textField.setBounds(406, 23, 86, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setText("5");
        textField_1.setBounds(406, 56, 86, 20);
        panel.add(textField_1);
        textField_1.setColumns(10);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Seeding Goal (Default Values)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(0, 132, 505, 140);
        add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("Minimum ratio (%):");
        lblNewLabel_2.setBounds(16, 26, 127, 14);
        panel_2.add(lblNewLabel_2);
        
        textField_2 = new JTextField();
        textField_2.setText("200");
        textField_2.setBounds(406, 23, 86, 20);
        panel_2.add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setText("0");
        textField_3.setBounds(406, 54, 86, 20);
        panel_2.add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setText("0");
        textField_4.setBounds(406, 85, 86, 20);
        panel_2.add(textField_4);
        textField_4.setColumns(10);
        
        JLabel lblNewLabel_2_1 = new JLabel("Minimum seeding time (minutes):");
        lblNewLabel_2_1.setBounds(16, 57, 203, 14);
        panel_2.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_2_2 = new JLabel("Minimum number of available seeds:");
        lblNewLabel_2_2.setBounds(16, 88, 224, 14);
        panel_2.add(lblNewLabel_2_2);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Seeding tasks have higher priority than downloading tasks");
        chckbxNewCheckBox.setFocusPainted(false);
        chckbxNewCheckBox.setBounds(13, 109, 341, 23);
        panel_2.add(chckbxNewCheckBox);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(null, "When \u00B5Torrent Reaches the Seeding Goal", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_3.setBounds(0, 274, 505, 58);
        add(panel_3);
        panel_3.setLayout(null);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Limit the upload rate to (kB/s): [0 = stop]");
        chckbxNewCheckBox_1.setFocusPainted(false);
        chckbxNewCheckBox_1.setBounds(13, 26, 271, 23);
        panel_3.add(chckbxNewCheckBox_1);
        
        textField_5 = new JTextField();
        textField_5.setText("4");
        textField_5.setColumns(10);
        textField_5.setBounds(409, 27, 86, 20);
        panel_3.add(textField_5);
	}
}
