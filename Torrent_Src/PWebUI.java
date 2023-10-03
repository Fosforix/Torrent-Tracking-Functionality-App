import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class PWebUI extends JPanel {
	private JTextField txtAdmin;
	private JTextField textField;
	private JTextField txtGuest;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public PWebUI() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Web UI");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Enable Web UI");
        chckbxNewCheckBox.setBounds(13, 40, 272, 23);
        add(chckbxNewCheckBox);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Authentication", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 70, 505, 84);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Username:");
        lblNewLabel.setEnabled(false);
        lblNewLabel.setBounds(16, 22, 73, 14);
        panel.add(lblNewLabel);
        
        txtAdmin = new JTextField();
        txtAdmin.setEnabled(false);
        txtAdmin.setText("admin");
        txtAdmin.setBounds(99, 19, 102, 20);
        panel.add(txtAdmin);
        txtAdmin.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Password:");
        lblNewLabel_1.setEnabled(false);
        lblNewLabel_1.setBounds(211, 22, 73, 14);
        panel.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (textField.getText().equals("●●●●●●●●●●●") && chckbxNewCheckBox.isSelected()) {
        			textField.setText("");
                }
        	}
        });
        textField.setName("");
        textField.setText("●●●●●●●●●●●");
        textField.setEnabled(false);
       
        
        
        
        textField.setEnabled(false);
        textField.setBounds(294, 19, 190, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Enable guest account with username");
        chckbxNewCheckBox_1.setEnabled(false);
        chckbxNewCheckBox_1.setBounds(13, 49, 236, 23);
        panel.add(chckbxNewCheckBox_1);
        
        txtGuest = new JTextField();
        txtGuest.setEnabled(false);
        txtGuest.setText("guest");
        txtGuest.setBounds(294, 50, 190, 20);
        panel.add(txtGuest);
        txtGuest.setColumns(10);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Connectivity", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(0, 154, 505, 103);
        add(panel_2);
        panel_2.setLayout(null);
        
        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Alternative listening port (default is the connection port):");
        chckbxNewCheckBox_2.setEnabled(false);
        chckbxNewCheckBox_2.setBounds(13, 22, 374, 23);
        panel_2.add(chckbxNewCheckBox_2);
        
        textField_1 = new JTextField();
        textField_1.setEnabled(false);
        textField_1.setText("8080");
        textField_1.setBounds(391, 23, 93, 20);
        panel_2.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Allow access only from these IPs (separate multiple entries with a comma):");
        lblNewLabel_2.setEnabled(false);
        lblNewLabel_2.setBounds(16, 52, 397, 14);
        panel_2.add(lblNewLabel_2);
        
        textField_2 = new JTextField();
        textField_2.setBounds(13, 72, 471, 20);
        panel_2.add(textField_2);
        textField_2.setColumns(10);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(null, "Download directories", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_3.setBounds(0, 260, 505, 186);
        add(panel_3);
        panel_3.setLayout(null);
        
        JButton btnNewButton = new JButton("Add");
        btnNewButton.setEnabled(false);
        btnNewButton.setBounds(395, 22, 89, 23);
        panel_3.add(btnNewButton);
        
        JButton btnRemove = new JButton("Remove");
        btnRemove.setEnabled(false);
        btnRemove.setBounds(395, 56, 89, 23);
        panel_3.add(btnRemove);
        
        textField_3 = new JTextField();
        textField_3.setBounds(13, 23, 372, 152);
        panel_3.add(textField_3);
        textField_3.setColumns(10);
	}
}
