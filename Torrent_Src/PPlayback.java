import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PPlayback extends JPanel {

	/**
	 * Create the panel.
	 */
	public PPlayback() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Playback");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Choose your external media player", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 80);
        add(panel);
        panel.setLayout(null);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"µTorrent Player", "Default Media Player ", "Windows Media Player", "Browse.."}));
        comboBox.setBounds(28, 40, 450, 22);
        panel.add(comboBox);
        
        JLabel lblNewLabel = new JLabel("%1 stands for the command which is the chosen streamable file outputted by");
        lblNewLabel.setBounds(29, 135, 476, 14);
        add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("the build-in local loopback http server. You could add extra parameters for the");
        lblNewLabel_1.setBounds(29, 149, 476, 14);
        add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("player you selected.");
        lblNewLabel_2.setBounds(29, 163, 168, 14);
        add(lblNewLabel_2);
	}

}
