import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PBitTorrent extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PBitTorrent() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("BitTorrent");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "BitTorrent Features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 185);
        add(panel);
        panel.setLayout(null);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Enable DHT Network");
        chckbxNewCheckBox.setSelected(true);
        chckbxNewCheckBox.setBounds(13, 18, 206, 23);
        panel.add(chckbxNewCheckBox);
        
        JCheckBox chckbxShowConfirmationDialog = new JCheckBox("Enable DHT for new torrents");
        chckbxShowConfirmationDialog.setSelected(true);
        chckbxShowConfirmationDialog.setBounds(13, 44, 206, 23);
        panel.add(chckbxShowConfirmationDialog);
        
        JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Enable Local Peer Discovery");
        chckbxNewCheckBox_1_1.setSelected(true);
        chckbxNewCheckBox_1_1.setBounds(13, 70, 206, 23);
        panel.add(chckbxNewCheckBox_1_1);
        
        JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("Enable bandwidth management [uTP]");
        chckbxNewCheckBox_1_1_1.setSelected(true);
        chckbxNewCheckBox_1_1_1.setBounds(13, 96, 240, 23);
        panel.add(chckbxNewCheckBox_1_1_1);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Ask tracker for scrap information");
        chckbxNewCheckBox_1.setSelected(true);
        chckbxNewCheckBox_1.setBounds(258, 18, 241, 23);
        panel.add(chckbxNewCheckBox_1);
        
        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Enable UDP tracker support");
        chckbxNewCheckBox_2.setSelected(true);
        chckbxNewCheckBox_2.setBounds(13, 122, 187, 23);
        panel.add(chckbxNewCheckBox_2);
        
        JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("Enable Peer Exchange");
        chckbxNewCheckBox_1_2.setSelected(true);
        chckbxNewCheckBox_1_2.setBounds(258, 44, 241, 23);
        panel.add(chckbxNewCheckBox_1_2);
        
        JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("Limit local peer bandwidth");
        chckbxNewCheckBox_1_3.setBounds(258, 70, 241, 23);
        panel.add(chckbxNewCheckBox_1_3);
        
        JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("Enable Altruistic Mode");
        chckbxNewCheckBox_1_4.setBounds(258, 96, 241, 23);
        panel.add(chckbxNewCheckBox_1_4);
        
        JCheckBox chckbxNewCheckBox_1_4_1 = new JCheckBox("Enable protocol enhancements");
        chckbxNewCheckBox_1_4_1.setSelected(true);
        chckbxNewCheckBox_1_4_1.setBounds(258, 122, 241, 23);
        panel.add(chckbxNewCheckBox_1_4_1);
        
        JLabel lblNewLabel = new JLabel("IP/Hostname to report to tracker:");
        lblNewLabel.setBounds(16, 152, 206, 14);
        panel.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setBounds(258, 149, 237, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Protocol Encryption", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(0, 240, 505, 52);
        add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Outgoing:");
        lblNewLabel_1.setBounds(16, 24, 76, 14);
        panel_2.add(lblNewLabel_1);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Disabled", "Enabled", "Forced"}));
        comboBox.setBounds(117, 20, 134, 22);
        panel_2.add(comboBox);
        
        JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Allow incoming legacy connections");
        chckbxNewCheckBox_3.setSelected(true);
        chckbxNewCheckBox_3.setBounds(258, 20, 241, 23);
        panel_2.add(chckbxNewCheckBox_3);
	}

}
