import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class PDirectories extends JPanel {
	private JTextField textField;
	private JButton btnNewButton;
	private JTextField textField_1;
	private JCheckBox chckbxNewCheckBox_1;
	private JButton btnNewButton_1;
	private JCheckBox chckbxNewCheckBox_1_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_2_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JTextField textField_4;
	private JButton btnNewButton_2_2;

	/**
	 * Create the panel.
	 */
	public PDirectories() {
		setLayout(null);
        setBounds(145,11,505,446);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        add(panel_1);
        
        JLabel lblPrivacy = new JLabel("Directories");
        lblPrivacy.setForeground(Color.WHITE);
        lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPrivacy.setBounds(10, 0, 121, 27);
        panel_1.add(lblPrivacy);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Location of Downloaded Files", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(0, 44, 505, 162);
        add(panel);
        panel.setLayout(null);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Put new downloads in:");
        chckbxNewCheckBox.setFocusPainted(false);
        chckbxNewCheckBox.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField.setEnabled(chckbxNewCheckBox.isSelected());
        		btnNewButton.setEnabled(chckbxNewCheckBox.isSelected());
        	}
        });
        chckbxNewCheckBox.setBounds(13, 20, 182, 23);
        panel.add(chckbxNewCheckBox);
        
        textField = new JTextField();
        textField.setEnabled(false);
        textField.setBounds(34, 50, 422, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        btnNewButton = new JButton("New button");
        btnNewButton.setFocusPainted(false);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Select a folder where you want to store active downloads: ");
			    int result = fileChooser.showOpenDialog(null);
			    if (result == JFileChooser.APPROVE_OPTION) {
			        File selectedFile = fileChooser.getSelectedFile();
			        
			    }}
        });
        btnNewButton.setEnabled(false);
        btnNewButton.setBounds(466, 49, 29, 23);
        panel.add(btnNewButton);
        
        JCheckBox chckbxMoveCompletedDownloads = new JCheckBox("Move completed downloads to:");
        chckbxMoveCompletedDownloads.setFocusPainted(false);
        chckbxMoveCompletedDownloads.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		chckbxNewCheckBox_1.setEnabled(chckbxMoveCompletedDownloads.isSelected());
        		textField_1.setEnabled(chckbxMoveCompletedDownloads.isSelected());
        		btnNewButton_1.setEnabled(chckbxMoveCompletedDownloads.isSelected());
        		chckbxNewCheckBox_1_1.setEnabled(chckbxMoveCompletedDownloads.isSelected());
        	}
        });
        chckbxMoveCompletedDownloads.setBounds(13, 75, 202, 23);
        panel.add(chckbxMoveCompletedDownloads);
        
        chckbxNewCheckBox_1 = new JCheckBox("Append the torrent's label");
        chckbxNewCheckBox_1.setFocusPainted(false);
        chckbxNewCheckBox_1.setEnabled(false);
        chckbxNewCheckBox_1.setBounds(267, 75, 169, 23);
        panel.add(chckbxNewCheckBox_1);
        
        textField_1 = new JTextField();
        textField_1.setEnabled(false);
        textField_1.setColumns(10);
        textField_1.setBounds(34, 105, 422, 20);
        panel.add(textField_1);
        
        btnNewButton_1 = new JButton("New button");
        btnNewButton_1.setFocusPainted(false);
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Select a folder");
			    int result = fileChooser.showOpenDialog(null);
			    if (result == JFileChooser.APPROVE_OPTION) {
			        File selectedFile = fileChooser.getSelectedFile();
			        
			    }
        	}
        });
        btnNewButton_1.setEnabled(false);
        btnNewButton_1.setBounds(466, 104, 29, 23);
        panel.add(btnNewButton_1);
        
        chckbxNewCheckBox_1_1 = new JCheckBox("Only move from the default download directory");
        chckbxNewCheckBox_1_1.setFocusPainted(false);
        chckbxNewCheckBox_1_1.setSelected(true);
        chckbxNewCheckBox_1_1.setEnabled(false);
        chckbxNewCheckBox_1_1.setBounds(34, 132, 279, 23);
        panel.add(chckbxNewCheckBox_1_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Location of .torrents", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(0, 208, 505, 202);
        add(panel_2);
        panel_2.setLayout(null);
        
        JCheckBox chckbxStoretorrentsIn = new JCheckBox("Store .torrents in:");
        chckbxStoretorrentsIn.setFocusPainted(false);
        chckbxStoretorrentsIn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField_2.setEnabled(chckbxStoretorrentsIn.isSelected());
        		btnNewButton_2.setEnabled(chckbxStoretorrentsIn.isSelected());
        		
        	}
        });
        chckbxStoretorrentsIn.setBounds(13, 20, 182, 23);
        panel_2.add(chckbxStoretorrentsIn);
        
        textField_2 = new JTextField();
        textField_2.setEnabled(false);
        textField_2.setColumns(10);
        textField_2.setBounds(34, 50, 422, 20);
        panel_2.add(textField_2);
        
        btnNewButton_2 = new JButton("New button");
        btnNewButton_2.setFocusPainted(false);
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Select a folder");
			    int result = fileChooser.showOpenDialog(null);
			    if (result == JFileChooser.APPROVE_OPTION) {
			        File selectedFile = fileChooser.getSelectedFile();
			        
			    }
        	}
        });
        btnNewButton_2.setEnabled(false);
        btnNewButton_2.setBounds(466, 49, 29, 23);
        panel_2.add(btnNewButton_2);
        
        JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Move .torrents for finished jobs to:");
        chckbxNewCheckBox_2_1.setFocusPainted(false);
        chckbxNewCheckBox_2_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField_3.setEnabled(chckbxNewCheckBox_2_1.isSelected());
        		btnNewButton_2_1.setEnabled(chckbxNewCheckBox_2_1.isSelected());
        		
        	}
        });
        chckbxNewCheckBox_2_1.setBounds(13, 77, 182, 23);
        panel_2.add(chckbxNewCheckBox_2_1);
        
        textField_3 = new JTextField();
        textField_3.setEnabled(false);
        textField_3.setColumns(10);
        textField_3.setBounds(34, 107, 422, 20);
        panel_2.add(textField_3);
        
        btnNewButton_2_1 = new JButton("New button");
        btnNewButton_2_1.setFocusPainted(false);
        btnNewButton_2_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Select a folder");
			    int result = fileChooser.showOpenDialog(null);
			    if (result == JFileChooser.APPROVE_OPTION) {
			        File selectedFile = fileChooser.getSelectedFile();
			        
			    }
        	}
        });
        btnNewButton_2_1.setEnabled(false);
        btnNewButton_2_1.setBounds(466, 106, 29, 23);
        panel_2.add(btnNewButton_2_1);
        
        JCheckBox chckbxNewCheckBox_2_1_1 = new JCheckBox("Automatically load .torrents from:");
        chckbxNewCheckBox_2_1_1.setFocusPainted(false);
        chckbxNewCheckBox_2_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		chckbxNewCheckBox_2.setEnabled(chckbxNewCheckBox_2_1_1.isSelected());
        		textField_4.setEnabled(chckbxNewCheckBox_2_1_1.isSelected());
        		btnNewButton_2_2.setEnabled(chckbxNewCheckBox_2_1_1.isSelected());
        		
        	}
        });
        chckbxNewCheckBox_2_1_1.setBounds(13, 134, 225, 23);
        panel_2.add(chckbxNewCheckBox_2_1_1);
        
        chckbxNewCheckBox_2 = new JCheckBox("Delete loaded .torrents");
        chckbxNewCheckBox_2.setFocusPainted(false);
        chckbxNewCheckBox_2.setEnabled(false);
        chckbxNewCheckBox_2.setBounds(267, 134, 155, 23);
        panel_2.add(chckbxNewCheckBox_2);
        
        textField_4 = new JTextField();
        textField_4.setEnabled(false);
        textField_4.setColumns(10);
        textField_4.setBounds(34, 164, 422, 20);
        panel_2.add(textField_4);
        
        btnNewButton_2_2 = new JButton("New button");
        btnNewButton_2_2.setFocusPainted(false);
        btnNewButton_2_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Select a folder");
			    int result = fileChooser.showOpenDialog(null);
			    if (result == JFileChooser.APPROVE_OPTION) {
			        File selectedFile = fileChooser.getSelectedFile();
			        
			    }
        	}
        });
        btnNewButton_2_2.setEnabled(false);
        btnNewButton_2_2.setBounds(466, 163, 29, 23);
        panel_2.add(btnNewButton_2_2);
	}

}
