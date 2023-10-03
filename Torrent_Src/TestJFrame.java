import javax.swing.JFrame;
import java.awt.Color;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Font;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.InputEvent;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTree;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

public class TestJFrame extends JFrame {
	private final Action action = new SwingAction();
	private JTextField textField;
	private JTextField textField_1;
	private JCheckBox chckbxNewCheckBox_1;
	private JRadioButton rdbtnNewRadioButton_1;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestJFrame frame = new TestJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public class MyColors {
	    public static final Color LIGHT_BLUE = new Color(0, 120, 215);
	}
	
	public TestJFrame() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("\\\\HOME\\home\\ac568\\Desktop\\Piug\\Proiect\\uTorrent_Logo.png"));
		setForeground(new Color(0, 0, 0));
		setTitle("µTorrent v3.6 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 620);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBackground(new Color(255, 255, 255));
		menuBar_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		setJMenuBar(menuBar_1);
		
		JMenu File = new JMenu("File");
		menuBar_1.add(File);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add Torrent...");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Select a .torrent to open");
			    int result = fileChooser.showOpenDialog(null);
			    if (result == JFileChooser.APPROVE_OPTION) {
			        File selectedFile = fileChooser.getSelectedFile();
			        
			    }
			}
		});
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		File.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Add Torrent (choose save dir)...");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setDialogTitle("Select a .torrent to open");
				    int result = fileChooser.showOpenDialog(null);
				    if (result == JFileChooser.APPROVE_OPTION) {
				        File selectedFile = fileChooser.getSelectedFile();}
			}
		});
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		File.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Add Torrent from URL...");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTorrentFromURL addurl = new AddTorrentFromURL();
				addurl.setVisible(true);
				addurl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
			}
		});
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_DOWN_MASK));
		File.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Add RSS Feed...");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                AddRSSFeed AddRSS=new AddRSSFeed();
                AddRSS.setVisible(true);
                AddRSS.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
		});
		File.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Add Device...");
		File.add(mntmNewMenuItem_4);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(240, 240, 240));
		File.add(separator);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Create New Torrent...");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateNewTorrent CreateNewTorrent=new CreateNewTorrent();
				CreateNewTorrent.setVisible(true);
				CreateNewTorrent.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		mntmNewMenuItem_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		File.add(mntmNewMenuItem_5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(240, 240, 240));
		File.add(separator_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Exit");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit µTorrent?", "Close Interface", JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
					System.exit(0);
			    }
				
			    
			}
		});
		File.add(mntmNewMenuItem_6);
		
		JMenu Options = new JMenu("Options");
		menuBar_1.add(Options);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Get µTorrent Pro");
		Options.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Preferences");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Preferences pref=new Preferences();
				pref.setVisible(true);
				pref.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		Options.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("RSS Downloader");
		Options.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Setup Guide");
		Options.add(mntmNewMenuItem_10);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Show Toolbar");
		chckbxmntmNewCheckItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0));
		Options.add(chckbxmntmNewCheckItem);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("Show Detailed Info");
		chckbxmntmNewCheckItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		Options.add(chckbxmntmNewCheckItem_1);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_2 = new JCheckBoxMenuItem("Show Status Bar");
		chckbxmntmNewCheckItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0));
		Options.add(chckbxmntmNewCheckItem_2);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_3 = new JCheckBoxMenuItem("Show Sidebar");
		chckbxmntmNewCheckItem_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0));
		Options.add(chckbxmntmNewCheckItem_3);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_4 = new JCheckBoxMenuItem("Show Trending Videos");
		chckbxmntmNewCheckItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0));
		Options.add(chckbxmntmNewCheckItem_4);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_7 = new JCheckBoxMenuItem("Show Devices");
		Options.add(chckbxmntmNewCheckItem_7);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_8 = new JCheckBoxMenuItem("Narrow Toolbar");
		chckbxmntmNewCheckItem_8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0));
		Options.add(chckbxmntmNewCheckItem_8);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_5 = new JCheckBoxMenuItem("Compact Category List");
		chckbxmntmNewCheckItem_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
		Options.add(chckbxmntmNewCheckItem_5);
		
		JSeparator separator_3 = new JSeparator();
		Options.add(separator_3);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_6 = new JCheckBoxMenuItem("Icons on Tabs");
		Options.add(chckbxmntmNewCheckItem_6);
		
		JSeparator separator_4 = new JSeparator();
		Options.add(separator_4);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		Options.add(mnNewMenu_2);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_9 = new JCheckBoxMenuItem("Disabled");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_9);
		
		JSeparator separator_9 = new JSeparator();
		mnNewMenu_2.add(separator_9);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_18 = new JCheckBoxMenuItem("Quit when Downloads Complete");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_18);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_17 = new JCheckBoxMenuItem("Quit when Everything Completes");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_17);
		
		JSeparator separator_8 = new JSeparator();
		mnNewMenu_2.add(separator_8);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_16 = new JCheckBoxMenuItem("Hibernate when Downloads Complete");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_16);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_19 = new JCheckBoxMenuItem("Hibernate when Everything Completes");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_19);
		
		JSeparator separator_7 = new JSeparator();
		mnNewMenu_2.add(separator_7);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_15 = new JCheckBoxMenuItem("Standby when Downloads Complete");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_15);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_14 = new JCheckBoxMenuItem("Standby when Everything Completes");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_14);
		
		JSeparator separator_6 = new JSeparator();
		mnNewMenu_2.add(separator_6);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_10 = new JCheckBoxMenuItem("Reboot when Downloads Complete");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_10);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_11 = new JCheckBoxMenuItem("Reboot when Everything Completes");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_11);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_2.add(separator_5);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_13 = new JCheckBoxMenuItem("Shutdown when Downloads Complete");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_13);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_12 = new JCheckBoxMenuItem("Shutdown when Everything Completes");
		mnNewMenu_2.add(chckbxmntmNewCheckItem_12);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar_1.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Learn how to use µTorrent");
		mnNewMenu_1.add(mntmNewMenuItem_11);
		
		JSeparator separator_10 = new JSeparator();
		mnNewMenu_1.add(separator_10);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Learn more about µTorrent Pro");
		mnNewMenu_1.add(mntmNewMenuItem_12);
		
		JSeparator separator_11 = new JSeparator();
		mnNewMenu_1.add(separator_11);
		
		JMenuItem mntmNewMenuItem_24 = new JMenuItem("µTorrent Help");
		mntmNewMenuItem_24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mnNewMenu_1.add(mntmNewMenuItem_24);
		
		JMenuItem mntmNewMenuItem_25 = new JMenuItem("µTorrent FAQ");
		mnNewMenu_1.add(mntmNewMenuItem_25);
		
		JSeparator separator_12 = new JSeparator();
		mnNewMenu_1.add(separator_12);
		
		JMenuItem mntmNewMenuItem_26 = new JMenuItem("µTorrent Webpage");
		mnNewMenu_1.add(mntmNewMenuItem_26);
		
		JMenuItem mntmNewMenuItem_27 = new JMenuItem("µTorrent Forums");
		mnNewMenu_1.add(mntmNewMenuItem_27);
		
		JMenuItem mntmNewMenuItem_28 = new JMenuItem("Trending Videos Webpage");
		mnNewMenu_1.add(mntmNewMenuItem_28);
		
		JSeparator separator_13 = new JSeparator();
		mnNewMenu_1.add(separator_13);
		
		JMenuItem mntmNewMenuItem_29 = new JMenuItem("Check for Updates");
		mnNewMenu_1.add(mntmNewMenuItem_29);
		
		JMenuItem mntmNewMenuItem_32 = new JMenuItem("Download Translation");
		mnNewMenu_1.add(mntmNewMenuItem_32);
		
		JMenuItem mntmNewMenuItem_31 = new JMenuItem("Activate Pro/Ad-Free");
		mnNewMenu_1.add(mntmNewMenuItem_31);
		
		JSeparator separator_14 = new JSeparator();
		mnNewMenu_1.add(separator_14);
		
		
		JMenuItem mntmNewMenuItem_34 = new JMenuItem("Show Statistics");
		mnNewMenu_1.add(mntmNewMenuItem_34);
		
		JSeparator separator_15 = new JSeparator();
		mnNewMenu_1.add(separator_15);
		
		JMenuItem mntmNewMenuItem_30 = new JMenuItem("Update Privacy Consent");
		mnNewMenu_1.add(mntmNewMenuItem_30);
		
		JSeparator separator_16 = new JSeparator();
		mnNewMenu_1.add(separator_16);
		
		JMenuItem mntmNewMenuItem_33 = new JMenuItem("About µTorrent");
		mnNewMenu_1.add(mntmNewMenuItem_33);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setBackground(new Color(255, 255, 255));
		
		JPanel panel_12 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
						.addComponent(panel_10, GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)))
				.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_10, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
						.addComponent(panel_11, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
		);
		
		JLabel lblNewLabel_2 = new JLabel("DHT: ");
		
		JLabel lblNewLabel_3 = new JLabel("D:");
		
		JLabel lblNewLabel_4 = new JLabel("U: ");
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGap(157)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(142)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(128)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(134, Short.MAX_VALUE))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_3))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_12.setLayout(gl_panel_12);
		
		JTree tree = new JTree();
		/*tree.setRootVisible(false);
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("JTree") {
				{
					DefaultMutableTreeNode node_1;
					add(new DefaultMutableTreeNode("Speed - Download Torrents Faster !"));
					add(new DefaultMutableTreeNode("Trending Videos"));
					node_1 = new DefaultMutableTreeNode("Upgrade to Pro");
						node_1.add(new DefaultMutableTreeNode("Streaming"));
						node_1.add(new DefaultMutableTreeNode("HD Media Player"));
						node_1.add(new DefaultMutableTreeNode("Anti-Virus Protection"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Torrents");
						node_1.add(new DefaultMutableTreeNode("Downloading"));
						node_1.add(new DefaultMutableTreeNode("Seeding"));
						node_1.add(new DefaultMutableTreeNode("Completed"));
						node_1.add(new DefaultMutableTreeNode("Active"));
						node_1.add(new DefaultMutableTreeNode("Inactive"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Labels");
						node_1.add(new DefaultMutableTreeNode("No Label"));
					add(node_1);
					add(new DefaultMutableTreeNode("Feeds"));
					add(new DefaultMutableTreeNode("Devices"));
				}
			}
		));*/
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addComponent(tree, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addComponent(tree, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
		);
		panel_11.setLayout(gl_panel_11);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(new Color(255, 255, 255));
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(25)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
		);
		
		table_1 = new JTable();
		table_1.setShowGrid(false);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"#", "Name", "Size", "Status", "Down Speed", "Up Speed", "ETA", "Seeds/Peers"
			}
		));
		scrollPane_1.setViewportView(table_1);
		panel_10.setLayout(gl_panel_10);
		JPanel panel_9 = new JPanel();
		GroupLayout groupLayoutt = new GroupLayout(getContentPane());
		groupLayoutt.setHorizontalGroup(
			groupLayoutt.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayoutt.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayoutt.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayoutt.createSequentialGroup()
							.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayoutt.createParallelGroup(Alignment.LEADING)
							.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))))
		);
		groupLayoutt.setVerticalGroup(
			groupLayoutt.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayoutt.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addGap(283)
					.addGroup(groupLayoutt.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Files", null, panel_4, null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
		);
		
		table = new JTable();
		table.setShowGrid(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Path", "Size", "Done", "%", "# Pieces", "Pieces", "Priority", "Rate", "Resolution", "Duration", "Streamable", "Has Header", "Codecs"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(213);
		scrollPane.setViewportView(table);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Info", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Downloaded:");
		lblNewLabel_5.setBounds(10, 11, 99, 14);
		panel_5.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Availability:");
		lblNewLabel_6.setBounds(10, 36, 99, 14);
		panel_5.add(lblNewLabel_6);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(119, 11, 362, 14);
		panel_5.add(progressBar);
		
		JLabel lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(491, 11, 46, 14);
		panel_5.add(lblNewLabel_7);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(119, 36, 362, 14);
		panel_5.add(progressBar_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("%");
		lblNewLabel_7_1.setBounds(491, 36, 46, 14);
		panel_5.add(lblNewLabel_7_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 61, 551, 117);
		panel_5.add(scrollPane_3);
		
		JPanel panel_13 = new JPanel();
		scrollPane_3.setViewportView(panel_13);
		
		JLabel lblNewLabel_8 = new JLabel("Transfer:");
		
		JLabel lblNewLabel_9 = new JLabel("Time Elapsed:");
		
		JLabel lblNewLabel_9_1 = new JLabel("Downloaded:");
		
		JLabel lblNewLabel_9_2 = new JLabel("Download Speed:");
		
		JLabel lblNewLabel_9_3 = new JLabel("Download Limit:");
		
		JLabel lblNewLabel_9_4 = new JLabel("Remaining:");
		
		JLabel lblNewLabel_9_5 = new JLabel("Uploaded:");
		
		JLabel lblNewLabel_9_5_1 = new JLabel("Upload Speed:");
		
		JLabel lblNewLabel_9_5_2 = new JLabel("Upload Limit:");
		
		JLabel lblNewLabel_9_4_1 = new JLabel("Wasted:");
		
		JLabel lblNewLabel_9_4_2 = new JLabel("Seeds:");
		
		JLabel lblNewLabel_9_4_3 = new JLabel("Peers:");
		
		JLabel lblNewLabel_9_4_4 = new JLabel("Share Ratio:");
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_13.createSequentialGroup()
							.addGroup(gl_panel_13.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblNewLabel_9_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_9_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_9_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_9, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_13.createSequentialGroup()
									.addComponent(lblNewLabel_9_5_2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_9_4_4, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_13.createSequentialGroup()
									.addComponent(lblNewLabel_9_5_1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_9_4_3, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_13.createSequentialGroup()
									.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_9_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_9_4, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_9_4_2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_9_4_1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(161, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_8)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9)
						.addComponent(lblNewLabel_9_4)
						.addComponent(lblNewLabel_9_4_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9_1)
						.addComponent(lblNewLabel_9_5)
						.addComponent(lblNewLabel_9_4_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9_2)
						.addComponent(lblNewLabel_9_5_1)
						.addComponent(lblNewLabel_9_4_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9_3)
						.addComponent(lblNewLabel_9_5_2)
						.addComponent(lblNewLabel_9_4_4))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_13.setLayout(gl_panel_13);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Peers", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Trackers", null, panel_7, null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollPane_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
		);
		
		table_2 = new JTable();
		table_2.setShowGrid(false);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"#", "Up-Speed", "Down-Speed", "Cache", "Size", "Peers"
			}
		));
		scrollPane_2.setViewportView(table_2);
		panel_7.setLayout(gl_panel_7);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Graphs", null, panel_8, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_1 = new JLabel("Advertisment");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		JLabel lblReportAd_1 = new JLabel("<html><u>Report Ad</u></html>");
		lblReportAd_1.setForeground(new Color(0, 128, 255));
		lblReportAd_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		JButton btnNewButton_1 = new JButton("x");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(170)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
							.addComponent(lblReportAd_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(105))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
							.addGap(106))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(13, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblReportAd_1)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Advertisment");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel.setBounds(0, 0, 65, 14);
		panel.add(lblNewLabel);
		
		JLabel lblReportAd = new JLabel("<html><u>Report Ad</u></html>");
		lblReportAd.setForeground(new Color(0, 128, 255));
		lblReportAd.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblReportAd.setBounds(104, 0, 49, 14);
		panel.add(lblReportAd);
		
		JButton btnNewButton = new JButton("x");
		btnNewButton.setBounds(192, 0, 16, 14);
		panel.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 14, 208, 227);
		panel.add(panel_2);
		getContentPane().setLayout(groupLayout);;
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
		
	}
}
