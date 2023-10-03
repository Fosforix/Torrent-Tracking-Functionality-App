import java.awt.EventQueue;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.JFrame;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Dimension;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Preferences extends JFrame {

	private JPanel contentPane;
	private JTextField txtNone;
	private JTextField textField;
	private JPanel panel0;
	private CardLayout cardLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Preferences frame = new Preferences();
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
	public Preferences() {
		
		setTitle("Preferences");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-14, 468, 696, 2);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("Apply");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(554, 481, 96, 29);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
        panel.setBounds(145, 11, 505, 446);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(98, 98, 98)));
        panel_1.setBackground(new Color(0, 113, 225));
        panel_1.setBounds(0, 0, 505, 33);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("General");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(10, 0, 121, 27);
        panel_1.add(lblNewLabel);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "When Downloading", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel_2.setBounds(0, 333, 505, 79);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
        JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Append .!ut to incomplete files");
        chckbxNewCheckBox_7.setBounds(13, 18, 205, 23);
        panel_2.add(chckbxNewCheckBox_7);
        
        JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Prevent standby if there are active torrents ");
        chckbxNewCheckBox_8.setSelected(true);
        chckbxNewCheckBox_8.setBounds(13, 44, 274, 23);
        panel_2.add(chckbxNewCheckBox_8);
        
        JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Pre-allocate all files");
        chckbxNewCheckBox_9.setBounds(286, 18, 161, 23);
        panel_2.add(chckbxNewCheckBox_9);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Updates", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_3.setBounds(0, 184, 505, 150);
        panel.add(panel_3);
        panel_3.setLayout(null);
        
        JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Automaticalyy install updates");
        chckbxNewCheckBox_3.setSelected(true);
        chckbxNewCheckBox_3.setBounds(13, 19, 196, 23);
        panel_3.add(chckbxNewCheckBox_3);
        
        JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Update to beta versions");
        chckbxNewCheckBox_4.setBounds(268, 19, 164, 23);
        panel_3.add(chckbxNewCheckBox_4);
        
        JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Notify me before installing updates");
        chckbxNewCheckBox_5.setBounds(37, 45, 231, 23);
        panel_3.add(chckbxNewCheckBox_5);
        
        JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Use Boss-Key password");
        chckbxNewCheckBox_6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField.setEnabled(chckbxNewCheckBox_6.isSelected());
        		textField.setText("●●●●●●●●●●●");
        	}
        });
        chckbxNewCheckBox_6.setBounds(13, 86, 203, 23);
        panel_3.add(chckbxNewCheckBox_6);
        
        JLabel lblNewLabel_3 = new JLabel("Boss-Key:");
        lblNewLabel_3.setBounds(16, 116, 68, 14);
        panel_3.add(lblNewLabel_3);
        
        txtNone = new JTextField();
        txtNone.setText("None");
        txtNone.setBounds(92, 112, 164, 22);
        panel_3.add(txtNone);
        txtNone.setColumns(10);
        
        textField = new JTextField();
        textField.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (textField.getText().equals("●●●●●●●●●●●") && chckbxNewCheckBox_6.isSelected()) {
        			textField.setText("");
                }
        	}
        });
        textField.setName("");
        textField.setText("●●●●●●●●●●●");
        textField.setEnabled(false);
        textField.setBounds(331, 86, 152, 22);
        panel_3.add(textField);
        textField.setColumns(10);
        
        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Windows Integration", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel_4.setBounds(0, 77, 505, 107);
        panel.add(panel_4);
        panel_4.setLayout(null);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Start µTorrent when Windows Starts");
        chckbxNewCheckBox.setBounds(13, 22, 250, 23);
        panel_4.add(chckbxNewCheckBox);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Start Minimized");
        chckbxNewCheckBox_1.setSelected(true);
        chckbxNewCheckBox_1.setBounds(37, 48, 137, 23);
        panel_4.add(chckbxNewCheckBox_1);
        
        JLabel lblNewLabel_2 = new JLabel("Define Minimize in UI Settings");
        lblNewLabel_2.setBounds(13, 78, 175, 14);
        panel_4.add(lblNewLabel_2);
        
        JButton btnNewButton_1 = new JButton("Associate with torrent files");
        btnNewButton_1.setEnabled(false);
        btnNewButton_1.setBounds(268, 22, 215, 23);
        panel_4.add(btnNewButton_1);
        
        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Check association on startup");
        chckbxNewCheckBox_2.setSelected(true);
        chckbxNewCheckBox_2.setBounds(264, 48, 219, 23);
        panel_4.add(chckbxNewCheckBox_2);
        
        JLabel lblNewLabel_1 = new JLabel("Language:");
        lblNewLabel_1.setBounds(10, 48, 98, 14);
        panel.add(lblNewLabel_1);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"(System Default)", "English"}));
        comboBox.setSelectedIndex(1);
        comboBox.setBounds(118, 44, 365, 22);
        panel.add(comboBox);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFocusPainted(false);
		btnCancel.setBounds(448, 481, 96, 29);
		contentPane.add(btnCancel);
		
		JButton btnNewButton_1_1 = new JButton("OK");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setBounds(342, 481, 96, 29);
		contentPane.add(btnNewButton_1_1);
		
		
		JTree tree = new JTree();
		tree.setBorder(new LineBorder(new Color(192, 192, 192)));
        tree.setRootVisible(false);
        tree.setShowsRootHandles(true);
        tree.setModel(new DefaultTreeModel(
        	new DefaultMutableTreeNode("JTree") {
        		{
        			DefaultMutableTreeNode node_1;
        			add(new DefaultMutableTreeNode("General"));
        			add(new DefaultMutableTreeNode("Privacy"));
        			add(new DefaultMutableTreeNode("UI Settings"));
        			add(new DefaultMutableTreeNode("Directories"));
        			add(new DefaultMutableTreeNode("Connection"));
        			add(new DefaultMutableTreeNode("Bandwidth"));
        			add(new DefaultMutableTreeNode("BitTorrent"));
        			add(new DefaultMutableTreeNode("Transfer Cap"));
        			add(new DefaultMutableTreeNode("Queueing"));
        			add(new DefaultMutableTreeNode("Scheduler"));
        			add(new DefaultMutableTreeNode("Remote"));
        			add(new DefaultMutableTreeNode("Playback"));
        			add(new DefaultMutableTreeNode("Paired Devices"));
        			add(new DefaultMutableTreeNode("Label"));
        			node_1 = new DefaultMutableTreeNode("Advanced");
        				node_1.add(new DefaultMutableTreeNode("UI Extras"));
        				node_1.add(new DefaultMutableTreeNode("Disk Cache"));
        				node_1.add(new DefaultMutableTreeNode("Web UI"));
        				node_1.add(new DefaultMutableTreeNode("Run Program"));
        			add(node_1);
        		}
        	}
        ));
        
        
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer() {
            public java.awt.Component getTreeCellRendererComponent(
                    JTree tree,
                    Object value,
                    boolean sel,
                    boolean expanded,
                    boolean leaf,
                    int row,
                    boolean hasFocus) {
                
                super.getTreeCellRendererComponent(
                        tree, value, sel, expanded, leaf, row, hasFocus);
                
                setIcon(null);
                
                return this;
            }
        };
        
       
        PPrivacy Privacy=new PPrivacy();
        PUI UI=new PUI();
        PAdvanced Advanced=new PAdvanced();
        PBandwidth Bandwidth=new PBandwidth();
        PBitTorrent BitTorrent=new PBitTorrent();
        PConnection Connection=new PConnection();
        PDirectories Directories=new PDirectories();
        PDisk Disk=new PDisk();
        PLabel Label=new PLabel();
        PPaired Paired=new PPaired();
        PPlayback Playback=new PPlayback();
        PQueue Queue=new PQueue();
        PRemote Remote=new PRemote();
        PRunProgram RunProgram=new PRunProgram();
        PScheduler Scheduler=new PScheduler();
        PTransfer Transfer=new PTransfer();
        PUIExtras UIExtras=new PUIExtras();
        PWebUI WebUI=new PWebUI();
        
        tree.setCellRenderer(renderer);

        tree.setBounds(10, 11, 119, 446);
        getContentPane().add(tree);
        
        JPanel aux=panel;
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode selectedNode = 
                    (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
                if (selectedNode == null) {
    				
                    return;
                }
                
                
                String nodeName = selectedNode.toString();
                if (nodeName.equals("General")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(panel);
                	revalidate();
                	repaint();
                	panel.setVisible(true);
                } else if (nodeName.equals("Privacy")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                    
                    getContentPane().add(Privacy); 
                    revalidate(); 
                    repaint(); 
                    Privacy.setVisible(true); 
                    
                } else if (nodeName.equals("UI Settings")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(UI); 
                	revalidate(); 
                    repaint(); 
                    UI.setVisible(true);
                } else if (nodeName.equals("Directories")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(Directories); 
                	revalidate(); 
                    repaint(); 
                    Directories.setVisible(true);
                }else if (nodeName.equals("Connection")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(Connection); 
                	revalidate(); 
                    repaint(); 
                    Connection.setVisible(true);
                    
                } else if (nodeName.equals("Bandwidth")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(Bandwidth); 
                	revalidate(); 
                    repaint(); 
                    Bandwidth.setVisible(true);
                    
                } else if (nodeName.equals("BitTorrent")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(BitTorrent); 
                	revalidate(); 
                    repaint(); 
                    BitTorrent.setVisible(true);
                    
                } else if (nodeName.equals("Transfer Cap")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(Transfer); 
                	revalidate(); 
                    repaint(); 
                    Transfer.setVisible(true);
                    
                } else if (nodeName.equals("Queueing")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(Queue); 
                	revalidate(); 
                    repaint(); 
                    Queue.setVisible(true);
                    
                } else if (nodeName.equals("Scheduler")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(Scheduler); 
                	revalidate(); 
                    repaint(); 
                    Scheduler.setVisible(true);
                    
                } else if (nodeName.equals("Remote")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(Remote); 
                	revalidate(); 
                    repaint(); 
                    Remote.setVisible(true);
                    
                } else if (nodeName.equals("Playback")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(Playback); 
                	revalidate(); 
                    repaint(); 
                    Playback.setVisible(true);
                    
                } else if (nodeName.equals("Paired Devices")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(Paired); 
                	revalidate(); 
                    repaint(); 
                    Paired.setVisible(true);
                    
                } else if (nodeName.equals("Label")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);

                	getContentPane().add(Label); 
                	revalidate(); 
                    repaint(); 
                    Label.setVisible(true);
                } else if (nodeName.equals("Advanced")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(Advanced); 
                	revalidate(); 
                    repaint(); 
                    Advanced.setVisible(true);
                    
                } else if (nodeName.equals("UI Extras")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(UIExtras); 
                	revalidate(); 
                    repaint(); 
                    UIExtras.setVisible(true);
                    
                } else if (nodeName.equals("Disk Cache")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(Disk); 
                	revalidate(); 
                    repaint(); 
                    Disk.setVisible(true);
                    
                } else if (nodeName.equals("Web UI")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                    
                	getContentPane().add(WebUI); 
                	revalidate(); 
                    repaint(); 
                    WebUI.setVisible(true);
                } else if (nodeName.equals("Run Program")) {
                	Advanced.setVisible(false);
                	Bandwidth.setVisible(false);
                	BitTorrent.setVisible(false);
                	Connection.setVisible(false);
                	Directories.setVisible(false);
                	Disk.setVisible(false);
                	Label.setVisible(false);
                	panel.setVisible(false);
                	Paired.setVisible(false);
                	Playback.setVisible(false);
                	Privacy.setVisible(false);
                	Queue.setVisible(false);
                	Remote.setVisible(false);
                	RunProgram.setVisible(false);
                	Scheduler.setVisible(false);
                	Transfer.setVisible(false);
                	UI.setVisible(false);
                	UIExtras.setVisible(false);
                	WebUI.setVisible(false);
                	
                	getContentPane().add(RunProgram); 
                	revalidate(); 
                    repaint(); 
                    RunProgram.setVisible(true);
                    
                } 
                
                
            }
        });

	}
}
