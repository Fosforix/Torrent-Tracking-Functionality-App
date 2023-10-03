import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class PDisk extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PDisk() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Disk Cache");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Basic Cache Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 137);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("The disk cache is used to keep frequently accessed data in memory to reduce the");
        lblNewLabel.setBounds(16, 24, 489, 14);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("number of reads and writes to the hard drive. µTorrent normally manages the cache");
        lblNewLabel_1.setBounds(16, 38, 489, 14);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("automatically, but you may change it's behavior by modifying these settings.");
        lblNewLabel_2.setBounds(16, 51, 479, 14);
        panel.add(lblNewLabel_2);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Override automatic cache size and specify the size manually (MB):");
        chckbxNewCheckBox.setBounds(13, 78, 404, 23);
        panel.add(chckbxNewCheckBox);
        
        textField = new JTextField();
        textField.setEnabled(false);
        textField.setText("128");
        textField.setBounds(423, 79, 72, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Reduce memory usage when the cache is not needed");
        chckbxNewCheckBox_1.setSelected(true);
        chckbxNewCheckBox_1.setBounds(13, 107, 393, 23);
        panel.add(chckbxNewCheckBox_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Advanced Cache Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(0, 182, 505, 232);
        add(panel_2);
        panel_2.setLayout(null);
        
        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Enable caching of disk writes");
        chckbxNewCheckBox_2.setSelected(true);
        chckbxNewCheckBox_2.setBounds(13, 18, 273, 23);
        panel_2.add(chckbxNewCheckBox_2);
        
        JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Write out untouched blocks every 2 minutes");
        chckbxNewCheckBox_3.setSelected(true);
        chckbxNewCheckBox_3.setBounds(35, 44, 464, 23);
        panel_2.add(chckbxNewCheckBox_3);
        
        JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("Write out finished pieces immediately");
        chckbxNewCheckBox_3_1.setSelected(true);
        chckbxNewCheckBox_3_1.setBounds(35, 70, 464, 23);
        panel_2.add(chckbxNewCheckBox_3_1);
        
        JCheckBox chckbxNewCheckBox_3_1_1 = new JCheckBox("Enable caching of disk reads");
        chckbxNewCheckBox_3_1_1.setSelected(true);
        chckbxNewCheckBox_3_1_1.setBounds(13, 96, 464, 23);
        panel_2.add(chckbxNewCheckBox_3_1_1);
        
        JCheckBox chckbxNewCheckBox_3_1_2 = new JCheckBox("Turn off read caching if the upload speed is low");
        chckbxNewCheckBox_3_1_2.setSelected(true);
        chckbxNewCheckBox_3_1_2.setBounds(35, 122, 464, 23);
        panel_2.add(chckbxNewCheckBox_3_1_2);
        
        JCheckBox chckbxNewCheckBox_3_1_3 = new JCheckBox("Remove old block from the cache");
        chckbxNewCheckBox_3_1_3.setSelected(true);
        chckbxNewCheckBox_3_1_3.setBounds(35, 148, 464, 23);
        panel_2.add(chckbxNewCheckBox_3_1_3);
        
        JCheckBox chckbxNewCheckBox_3_1_4 = new JCheckBox("Increase automatic cache size when cache trashing");
        chckbxNewCheckBox_3_1_4.setBounds(35, 174, 464, 23);
        panel_2.add(chckbxNewCheckBox_3_1_4);
	}

}
