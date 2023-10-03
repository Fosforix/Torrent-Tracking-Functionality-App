import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;

public class PScheduler extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PScheduler() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Scheduler");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Enable Scheduler");
        chckbxNewCheckBox.setBounds(13, 40, 151, 23);
        add(chckbxNewCheckBox);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Scheduler Table", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel.setBounds(0, 74, 505, 201);
        add(panel);
        panel.setLayout(null);
        
        table = new JTable();
        table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        table.setOpaque(false);
        table.setSelectionBackground(new Color(0, 120, 215));
        table.setSelectionForeground(new Color(0, 128, 128));
        table.setName("");
        table.setGridColor(new Color(0, 0, 0));
        table.setBackground(new Color(0, 255, 0));
        table.setBorder(new LineBorder(new Color(0, 0, 0)));
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{"", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{"", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"mon", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
        	}
        ));
        table.setBounds(58, 22, 437, 112);
        panel.add(table);
        
        JLabel lblNewLabel = new JLabel("Mon");
        lblNewLabel.setEnabled(false);
        lblNewLabel.setBounds(10, 22, 46, 14);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Tue");
        lblNewLabel_1.setEnabled(false);
        lblNewLabel_1.setBounds(10, 38, 46, 14);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Wed");
        lblNewLabel_1_1.setEnabled(false);
        lblNewLabel_1_1.setBounds(10, 56, 46, 14);
        panel.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Thu");
        lblNewLabel_1_2.setEnabled(false);
        lblNewLabel_1_2.setBounds(10, 72, 46, 14);
        panel.add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_1_3 = new JLabel("Fri");
        lblNewLabel_1_3.setEnabled(false);
        lblNewLabel_1_3.setBounds(10, 89, 46, 14);
        panel.add(lblNewLabel_1_3);
        
        JLabel lblNewLabel_1_4 = new JLabel("Sat");
        lblNewLabel_1_4.setEnabled(false);
        lblNewLabel_1_4.setBounds(10, 105, 46, 14);
        panel.add(lblNewLabel_1_4);
        
        JLabel lblNewLabel_1_5 = new JLabel("Sun");
        lblNewLabel_1_5.setEnabled(false);
        lblNewLabel_1_5.setBounds(10, 120, 46, 14);
        panel.add(lblNewLabel_1_5);
        
        JLabel lblNewLabel_2 = new JLabel("Time:");
        lblNewLabel_2.setEnabled(false);
        lblNewLabel_2.setBounds(58, 145, 86, 14);
        panel.add(lblNewLabel_2);
        
        JPanel panel_2_1 = new JPanel();
        panel_2_1.setEnabled(false);
        panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2_1.setBounds(368, 145, 18, 16);
        panel.add(panel_2_1);
        
        JPanel panel_2_1_1 = new JPanel();
        panel_2_1_1.setEnabled(false);
        panel_2_1_1.setBackground(new Color(255, 128, 192));
        panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2_1_1.setBounds(368, 172, 18, 16);
        panel.add(panel_2_1_1);
        
        JPanel panel_2_1_2 = new JPanel();
        panel_2_1_2.setEnabled(false);
        panel_2_1_2.setBackground(new Color(0, 128, 64));
        panel_2_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2_1_2.setBounds(238, 145, 18, 16);
        panel.add(panel_2_1_2);
        
        JPanel panel_2_1_3 = new JPanel();
        panel_2_1_3.setEnabled(false);
        panel_2_1_3.setBackground(new Color(0, 255, 0));
        panel_2_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2_1_3.setBounds(238, 172, 18, 16);
        panel.add(panel_2_1_3);
        
        JLabel lblNewLabel_3 = new JLabel("Full Speed");
        lblNewLabel_3.setEnabled(false);
        lblNewLabel_3.setBounds(266, 145, 92, 14);
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Limited");
        lblNewLabel_4.setEnabled(false);
        lblNewLabel_4.setBounds(266, 174, 92, 14);
        panel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Turn Off");
        lblNewLabel_5.setEnabled(false);
        lblNewLabel_5.setBounds(396, 145, 74, 14);
        panel.add(lblNewLabel_5);
        
        JLabel lblNewLabel_5_1 = new JLabel("Seeding Only");
        lblNewLabel_5_1.setEnabled(false);
        lblNewLabel_5_1.setBounds(396, 174, 74, 14);
        panel.add(lblNewLabel_5_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Scheduler Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(0, 276, 505, 86);
        add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_6 = new JLabel("Limited upload rate (kB/s):");
        lblNewLabel_6.setEnabled(false);
        lblNewLabel_6.setBounds(16, 24, 156, 14);
        panel_2.add(lblNewLabel_6);
        
        textField = new JTextField();
        textField.setEnabled(false);
        textField.setBounds(210, 21, 80, 20);
        panel_2.add(textField);
        textField.setColumns(10);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Disable DHT when turning off");
        chckbxNewCheckBox_1.setEnabled(false);
        chckbxNewCheckBox_1.setSelected(true);
        chckbxNewCheckBox_1.setBounds(296, 20, 203, 23);
        panel_2.add(chckbxNewCheckBox_1);
        
        textField_1 = new JTextField();
        textField_1.setEnabled(false);
        textField_1.setBounds(210, 52, 80, 20);
        panel_2.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_6_1 = new JLabel("Limited download rate (kB/s):");
        lblNewLabel_6_1.setEnabled(false);
        lblNewLabel_6_1.setBounds(16, 55, 193, 14);
        panel_2.add(lblNewLabel_6_1);
	}
}
