import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class PPaired extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PPaired() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Paired Devices");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Paired Devices", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 217);
        add(panel);
        panel.setLayout(null);
        
        table = new JTable();
        table.setEnabled(false);
        table.setShowGrid(false);
        table.setShowHorizontalLines(false);
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"Name", "Date Added", null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        	},
        	new String[] {
        		"New column", "New column", "New column"
        	}
        ));
        table.setBounds(10, 31, 485, 160);
        panel.add(table);
        
        JButton btnNewButton = new JButton("Forget Paired Devices");
        btnNewButton.setBounds(354, 272, 141, 23);
        add(btnNewButton);
	}

}
