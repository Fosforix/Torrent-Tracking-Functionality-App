import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;

public class PPrivacy extends JPanel {

	/**
	 * Create the panel.
	 */
	public PPrivacy() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Privacy");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Privacy", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 284);
        add(panel);
        panel.setLayout(null);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Send detailed info when checking for updates (always anonymous)");
        chckbxNewCheckBox.setSelected(true);
        chckbxNewCheckBox.setBounds(13, 22, 416, 23);
        panel.add(chckbxNewCheckBox);
        
        JLabel lblNewLabel = new JLabel("This clears previously used paths in locations, such as Add New Torrent dialog and");
        lblNewLabel.setBounds(13, 58, 479, 23);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("the Create New Torrent dialog.");
        lblNewLabel_1.setBounds(13, 80, 221, 14);
        panel.add(lblNewLabel_1);
        
        JButton btnNewButton = new JButton("Clear Private Data ");
        btnNewButton.setBounds(244, 92, 239, 23);
        panel.add(btnNewButton);
        
        JLabel lblNewLabel_2 = new JLabel("This removes our ability to personalize advertising you");
        lblNewLabel_2.setBounds(13, 129, 315, 14);
        panel.add(lblNewLabel_2);
        
        JButton btnForgetMe = new JButton("Forget Me ");
        btnForgetMe.setBounds(244, 154, 239, 23);
        panel.add(btnForgetMe);
	}
}
