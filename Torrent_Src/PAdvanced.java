import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class PAdvanced extends JPanel {
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PAdvanced() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Advanced");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Advanced Options [WARNING: Do not modify!]", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 223);
        add(panel);
        panel.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(367, 24, 128, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Filter:");
        lblNewLabel.setBounds(326, 27, 39, 14);
        panel.add(lblNewLabel);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 55, 485, 131);
        panel.add(scrollPane);
        
        table = new JTable();
        table.setShowGrid(false);
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"bt.allow_same_ip", "false", null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
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
        		"Name", "Value", ""
        	}
        ));
        scrollPane.setViewportView(table);
        
        JLabel lblNewLabel_1 = new JLabel("Value:");
        lblNewLabel_1.setBounds(10, 197, 46, 14);
        panel.add(lblNewLabel_1);

	}
}
