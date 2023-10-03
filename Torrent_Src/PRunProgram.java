import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class PRunProgram extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PRunProgram() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Run Program");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Run Program", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 402);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Run this program when a torrent finishes:");
        lblNewLabel.setBounds(16, 26, 283, 14);
        panel.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setBounds(13, 45, 442, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton = new JButton("New button");
        btnNewButton.setBounds(465, 44, 30, 23);
        panel.add(btnNewButton);
        
        JLabel lblRunThisProgram = new JLabel("Run this program when a changes state:");
        lblRunThisProgram.setBounds(16, 76, 283, 14);
        panel.add(lblRunThisProgram);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(13, 93, 442, 20);
        panel.add(textField_1);
        
        JButton btnNewButton_1 = new JButton("New button");
        btnNewButton_1.setBounds(465, 92, 30, 23);
        panel.add(btnNewButton_1);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(16, 124, 479, 267);
        panel.add(scrollPane);
        
        JTextPane txtpnYouCanUse = new JTextPane();
        txtpnYouCanUse.setEditable(false);
        txtpnYouCanUse.setText("You can use the following parameters:\r\n\r\n%F - Name of downloaded file (for single file torrents)\r\n%D - Directory where files are saved\r\n%N - Title of torrent\r\n%P - Previous state of torrent\r\n%L - Label\r\n%T - Tracker\r\n%M - Status message string (same as status column)\r\n%I - hex encoded info-hash\r\n%S - State of torrent\r\n%K - kind of torrent (single|multi)\r\n\r\nWhere State is one of:\r\n\r\nError - 1\r\nChecked - 2\r\nPaused - 3\r\nSuper seeding - 4\r\nSeeding - 5\r\nDownloading - 6\r\nSuper seed [F] - 7\r\nSeeding [F] - 8\r\nDownloading [F] - 9\r\nQueued seed - 10\r\nFinished - 11\r\nQueued - 12\r\nStopped - 13\r\nQueued - 12\r\nPreallocating - 17\r\nDownloading Metadata - 18\r\nConnecting to Peers - 19\r\nMoving - 20\r\nFlushing - 21\r\nNeed DHT - 22\r\nFinding Peers - 23\r\nResolving - 24\r\nWriting - 25");
        scrollPane.setViewportView(txtpnYouCanUse);
	}
}
