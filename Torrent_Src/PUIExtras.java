import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class PUIExtras extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public PUIExtras() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("UI Extras");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Speed Popup List [Separate multiple values with a comma]", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 108);
        add(panel);
        panel.setLayout(null);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Override automatic speed pop up list");
        chckbxNewCheckBox.setBounds(13, 18, 338, 23);
        panel.add(chckbxNewCheckBox);
        
        JLabel lblNewLabel = new JLabel("Upload speed list:");
        lblNewLabel.setEnabled(false);
        lblNewLabel.setBounds(38, 48, 124, 14);
        panel.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setText("0,5,10,15,20,30,40,50,100,150,200,300,400,500");
        textField.setEnabled(false);
        textField.setBounds(172, 45, 323, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setText("0,5,10,15,20,30,40,50,100,150,200,300,400,500");
        textField_1.setEnabled(false);
        textField_1.setBounds(172, 76, 323, 20);
        panel.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblDownloadSpeedList = new JLabel("Download speed list:");
        lblDownloadSpeedList.setEnabled(false);
        lblDownloadSpeedList.setBounds(38, 79, 124, 14);
        panel.add(lblDownloadSpeedList);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Persistent Labels [Separate multiple labels with a | character]", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(0, 151, 505, 54);
        add(panel_2);
        panel_2.setLayout(null);
        
        textField_2 = new JTextField();
        textField_2.setBounds(10, 24, 485, 20);
        panel_2.add(textField_2);
        textField_2.setColumns(10);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(null, "Search Engines [Format: name|URL]", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_3.setBounds(0, 205, 505, 128);
        add(panel_3);
        panel_3.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 24, 485, 93);
        panel_3.add(scrollPane);
        
        JTextPane txtpnSmartSearchhttpsmediaadawarecomtorrentscannerlpsearchphppbtq = new JTextPane();
        txtpnSmartSearchhttpsmediaadawarecomtorrentscannerlpsearchphppbtq.setText("Smart Search|https://media.adaware.com/torrentscanner/lp/search.php?p=bt&q=");
        scrollPane.setViewportView(txtpnSmartSearchhttpsmediaadawarecomtorrentscannerlpsearchphppbtq);
	}
}
