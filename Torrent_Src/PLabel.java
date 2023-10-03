import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PLabel extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public PLabel() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Label");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Use Label and Directory Rules");
        chckbxNewCheckBox.setBounds(142, 40, 260, 23);
        add(chckbxNewCheckBox);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Auto Label", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 70, 505, 145);
        add(panel);
        panel.setLayout(null);
        
        table = new JTable();
        table.setBorder(new LineBorder(new Color(0, 0, 0)));
        table.setShowGrid(false);
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"Label", "Definition", null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        	},
        	new String[] {
        		"New column", "New column", "New column"
        	}
        ));
        table.setBounds(10, 28, 485, 80);
        panel.add(table);
        
        JLabel lblNewLabel = new JLabel("Label:");
        lblNewLabel.setBounds(10, 119, 46, 14);
        panel.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setBounds(68, 116, 86, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Contains:");
        lblNewLabel_1.setBounds(164, 119, 57, 14);
        panel.add(lblNewLabel_1);
        
        textField_1 = new JTextField();
        textField_1.setBounds(231, 116, 162, 20);
        panel.add(textField_1);
        textField_1.setColumns(10);
        
        JButton btnNewButton = new JButton("-");
        btnNewButton.setBounds(454, 115, 41, 23);
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("+");
        btnNewButton_1.setBounds(403, 115, 41, 23);
        panel.add(btnNewButton_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Label-Directory Mapping", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(0, 215, 505, 231);
        add(panel_2);
        panel_2.setLayout(null);
        
        table_1 = new JTable();
        table_1.setShowGrid(false);
        table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        table_1.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"Label", "Directory", null},
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
        table_1.setBounds(10, 27, 485, 160);
        panel_2.add(table_1);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(10, 198, 78, 22);
        panel_2.add(comboBox);
        
        JButton btnNewButton_1_1 = new JButton("+");
        btnNewButton_1_1.setBounds(454, 198, 41, 23);
        panel_2.add(btnNewButton_1_1);
        
        JButton btnNewButton_1_2 = new JButton("+");
        btnNewButton_1_2.setBounds(403, 198, 41, 23);
        panel_2.add(btnNewButton_1_2);
        
        JButton btnNewButton_1_3 = new JButton("...");
        btnNewButton_1_3.setBounds(352, 198, 41, 23);
        panel_2.add(btnNewButton_1_3);
        
        textField_2 = new JTextField();
        textField_2.setBounds(98, 199, 244, 20);
        panel_2.add(textField_2);
        textField_2.setColumns(10);
	}

}
