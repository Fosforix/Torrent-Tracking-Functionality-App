import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PUI extends JPanel {

	/**
	 * Create the panel.
	 */
	public PUI() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("UI Settings");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Display Options", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 124);
        add(panel);
        panel.setLayout(null);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Confirm when deleting torrents");
        chckbxNewCheckBox.setFocusPainted(false);
        chckbxNewCheckBox.setSelected(true);
        chckbxNewCheckBox.setBounds(13, 18, 193, 23);
        panel.add(chckbxNewCheckBox);
        
        JCheckBox chckbxShowConfirmationDialog = new JCheckBox("Show confirmation dialog on exit");
        chckbxShowConfirmationDialog.setFocusPainted(false);
        chckbxShowConfirmationDialog.setSelected(true);
        chckbxShowConfirmationDialog.setBounds(13, 44, 193, 23);
        panel.add(chckbxShowConfirmationDialog);
        
        JCheckBox chckbxShowCurrentSpeed = new JCheckBox("Show current speed in title bar");
        chckbxShowCurrentSpeed.setFocusPainted(false);
        chckbxShowCurrentSpeed.setBounds(13, 70, 193, 23);
        panel.add(chckbxShowCurrentSpeed);
        
        JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Use fine grained file priorities");
        chckbxNewCheckBox_2_1.setFocusPainted(false);
        chckbxNewCheckBox_2_1.setBounds(13, 96, 181, 23);
        panel.add(chckbxNewCheckBox_2_1);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Confirm when deleting trackers");
        chckbxNewCheckBox_1.setFocusPainted(false);
        chckbxNewCheckBox_1.setBounds(251, 18, 248, 23);
        panel.add(chckbxNewCheckBox_1);
        
        JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Alternate list background colors");
        chckbxNewCheckBox_1_1.setFocusPainted(false);
        chckbxNewCheckBox_1_1.setBounds(251, 44, 228, 23);
        panel.add(chckbxNewCheckBox_1_1);
        
        JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("Show speed limits in the status bar");
        chckbxNewCheckBox_1_2.setFocusPainted(false);
        chckbxNewCheckBox_1_2.setBounds(251, 70, 206, 23);
        panel.add(chckbxNewCheckBox_1_2);
        
        JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("Confirm exit if critical seeder");
        chckbxNewCheckBox_1_3.setFocusPainted(false);
        chckbxNewCheckBox_1_3.setSelected(true);
        chckbxNewCheckBox_1_3.setBounds(251, 96, 228, 23);
        panel.add(chckbxNewCheckBox_1_3);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "System Tray", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(0, 168, 505, 100);
        add(panel_2);
        panel_2.setLayout(null);
        
        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Minimize button minimizes uT to tray");
        chckbxNewCheckBox_2.setFocusPainted(false);
        chckbxNewCheckBox_2.setBounds(13, 18, 217, 23);
        panel_2.add(chckbxNewCheckBox_2);
        
        JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Close button closes uT to tray");
        chckbxNewCheckBox_3.setFocusPainted(false);
        chckbxNewCheckBox_3.setSelected(true);
        chckbxNewCheckBox_3.setBounds(13, 44, 193, 23);
        panel_2.add(chckbxNewCheckBox_3);
        
        JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Show balloon notifications in tray");
        chckbxNewCheckBox_4.setFocusPainted(false);
        chckbxNewCheckBox_4.setSelected(true);
        chckbxNewCheckBox_4.setBounds(13, 70, 193, 23);
        panel_2.add(chckbxNewCheckBox_4);
        
        JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Always show track icon");
        chckbxNewCheckBox_5.setFocusPainted(false);
        chckbxNewCheckBox_5.setSelected(true);
        chckbxNewCheckBox_5.setBounds(251, 18, 181, 23);
        panel_2.add(chckbxNewCheckBox_5);
        
        JCheckBox chckbxNewCheckBox_5_1 = new JCheckBox("Single click on tray icon to open ");
        chckbxNewCheckBox_5_1.setFocusPainted(false);
        chckbxNewCheckBox_5_1.setBounds(251, 44, 193, 23);
        panel_2.add(chckbxNewCheckBox_5_1);
        
        JCheckBox chckbxNewCheckBox_5_2 = new JCheckBox("Always activate when clicked");
        chckbxNewCheckBox_5_2.setFocusPainted(false);
        chckbxNewCheckBox_5_2.setSelected(true);
        chckbxNewCheckBox_5_2.setBounds(251, 70, 181, 23);
        panel_2.add(chckbxNewCheckBox_5_2);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(null, "When Adding Torrents", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_3.setBounds(0, 269, 505, 76);
        add(panel_3);
        panel_3.setLayout(null);
        
        JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Don't start the download automatically");
        chckbxNewCheckBox_6.setFocusPainted(false);
        chckbxNewCheckBox_6.setBounds(13, 18, 227, 23);
        panel_3.add(chckbxNewCheckBox_6);
        
        JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Show options to change the name and location of the torrent data");
        chckbxNewCheckBox_7.setFocusPainted(false);
        chckbxNewCheckBox_7.setSelected(true);
        chckbxNewCheckBox_7.setBounds(13, 44, 395, 23);
        panel_3.add(chckbxNewCheckBox_7);
        
        JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Active the program window");
        chckbxNewCheckBox_8.setFocusPainted(false);
        chckbxNewCheckBox_8.setSelected(true);
        chckbxNewCheckBox_8.setBounds(251, 18, 237, 23);
        panel_3.add(chckbxNewCheckBox_8);
        
        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new TitledBorder(null, "Actions for Double Click", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_4.setBounds(0, 347, 505, 76);
        add(panel_4);
        panel_4.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("For seeding torrents:");
        lblNewLabel.setBounds(13, 21, 145, 14);
        panel_4.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("For downloading torrents:");
        lblNewLabel_1.setBounds(13, 46, 145, 14);
        panel_4.add(lblNewLabel_1);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Show Properties", "Start/Stop", "Open Folder", "Show Download Bar", "Play"}));
        comboBox.setSelectedIndex(2);
        comboBox.setBounds(251, 17, 244, 22);
        panel_4.add(comboBox);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Show Properties", "Start/Stop", "Open Folder", "Show Download Bar", "Play"}));
        comboBox_1.setBounds(251, 42, 244, 22);
        panel_4.add(comboBox_1);
	}
}
