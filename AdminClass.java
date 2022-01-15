package Project;

//FOR GUI

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class AdminClass {

	private JFrame frmPriborAdmin;
	private JTextField txtPriborAdminControls;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JButton btnNewButton_2;
	private JButton btnInserthaiti;
	private JButton btnInsertaubergine;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JButton btnInsertwattle;
	private JButton btnInsertmb;
	private JButton btnInsertoliveGreen;
	private JButton btnInsertbronco;
	private JButton btnInsertflint;
	private JButton btnInsertzeus;
	private JPanel panel_2;
	private JLabel lblNewLabel_2;
	private JButton btnInsertbruno;
	private JButton btnInsertcamel;
	private JButton btnInsertcherrywood;
	private JButton btnInsertwattle_1;
	private JPanel panel_3;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField txtKap;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnInsertred;
	private JButton btnInsertblack;
	private JButton btnInsertgray;
	private JButton btnInsertbrown;
	private JPanel panel_4;
	private JLabel lblNewLabel_4;
	private JTextField txtStickers;
	private JButton btnInsertwattle_2;
	private JTextField txtRandomStickers;
	private JTextField txtCustomStickers;
	private JButton btnInsertwattle_4;
	private JTextArea txtrTakeYourStyle;
	private JButton btnInsertwattle_3;
	private JButton btnInsertwattle_5;
	private JButton btnInsertwattle_6;
	private JTextArea txtrAddAFunky;
	private JButton btnNewButton_3;
    AdminCode obj = new AdminCode(10);
    CartTree obj1 = new CartTree();
    AdminCode stock = new AdminCode(10);
    private JButton btnNewButton_1;
    private JButton btnNewButton_4;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminClass window = new AdminClass();
					window.frmPriborAdmin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPriborAdmin =new JFrame();
		frmPriborAdmin.setAlwaysOnTop(true);
		frmPriborAdmin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abc\\Downloads\\WhatsApp Image 2021-12-28 at 12.42.52 PM.jpeg"));
		frmPriborAdmin.setTitle("PRIBOR ADMIN");
		frmPriborAdmin.setBounds(100, 100, 1516, 882);
		frmPriborAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPriborAdmin.getContentPane().setLayout(null);
		
		txtPriborAdminControls = new JTextField();
		txtPriborAdminControls.setBounds(0, 0, 1550, 47);
		txtPriborAdminControls.setFont(new Font("Verdana", Font.BOLD, 33));
		txtPriborAdminControls.setHorizontalAlignment(SwingConstants.CENTER);
		txtPriborAdminControls.setText("PRIBOR ONLINE SHOPPING SITE");
		txtPriborAdminControls.setBackground(Color.LIGHT_GRAY);
		txtPriborAdminControls.setForeground(new Color(128, 0, 0));
		frmPriborAdmin.getContentPane().add(txtPriborAdminControls);
		txtPriborAdminControls.setColumns(10);
		
		panel = new JPanel();
		panel.setBounds(10, 62, 349, 352);
		frmPriborAdmin.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 30, 313, 157);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abc\\Pictures\\Cuero.jpeg"));
		panel.add(lblNewLabel);
		
		
		JButton btnNewButton = new JButton("Insert \"bean\"");
		btnNewButton.setBounds(75, 272, 124, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminCode obj = new AdminCode(10);
			    CartTree obj1 = new CartTree();
			    AdminCode stock = new AdminCode(10);
				obj.insertProduct("Bean", "Cuero", "Wallets","blue",101, 800, 8, " ");
				 obj1.stock = obj;
				obj1.insertItem(101);
	            
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setToolTipText(" ");
		panel.add(btnNewButton);
		
		btnNewButton_2 = new JButton("Insert \"myrtle\"");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("myrtle", "Cuero", "Wallets","green",102, 800, 8, " ");
				 obj1.stock = obj;
				obj1.insertItem(102);
			}
		}); 
		btnNewButton_2.setBounds(10, 300, 124, 25);
		btnNewButton_2.setToolTipText(" ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(btnNewButton_2);
		
		btnInserthaiti = new JButton("Insert \"Haiti\"");
		btnInserthaiti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				obj.insertProduct("Haiti", "Cuero", "Wallets","blue",103, 800, 8, " ");
				 obj1.stock = obj;
				obj1.insertItem(102);
			}
		});
		btnInserthaiti.setBounds(75, 327, 124, 25);
		btnInserthaiti.setToolTipText(" ");
		btnInserthaiti.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(btnInserthaiti);
		
		btnInsertaubergine = new JButton("Insert \"Aubergine\"");
		btnInsertaubergine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Aubergine", "Cuero", "Wallets","red",104, 800, 8, " ");
				 obj1.stock = obj;
				obj1.insertItem(104);
			}
			
		}); 
		btnInsertaubergine.setBounds(145, 300, 124, 25);
		btnInsertaubergine.setToolTipText(" ");
		btnInsertaubergine.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(btnInsertaubergine);
		
		textField = new JTextField();
		textField.setText("CUERO");
		textField.setFont(new Font("Verdana", Font.BOLD, 12));
		textField.setColumns(10);
		textField.setBounds(10, 10, 82, 16);
		panel.add(textField);
		
		JTextArea txtrIntroducingOurPremium = new JTextArea();
		txtrIntroducingOurPremium.setFont(new Font("Monospaced", Font.ITALIC, 11));
		txtrIntroducingOurPremium.setText("Introducing our premium raw leather \r\nwallets c\uD835\uDE02\uD835\uDDF2\uD835\uDDFF\uD835\uDDFC.\r\nCrafted with perfection, it's a design that'll\r\nmake you stand out.\r\nPrice: Rs 800");
		txtrIntroducingOurPremium.setBounds(0, 197, 339, 77);
		panel.add(txtrIntroducingOurPremium);
		
		panel_1 = new JPanel();
		panel_1.setBounds(369, 57, 413, 420);
		frmPriborAdmin.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(60, 36, 311, 180);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\abc\\Pictures\\KAZO.jpeg"));
		panel_1.add(lblNewLabel_1);
		
		btnInsertwattle = new JButton("Insert \"Wattle\"");
		btnInsertwattle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("wattle", "Kazo", "Wallets","yellow",105, 750, 8, " ");
				obj1.insertItem(105);
			}
		});
		btnInsertwattle.setBounds(223, 315, 124, 25);
		btnInsertwattle.setToolTipText(" ");
		btnInsertwattle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.add(btnInsertwattle);
		
		btnInsertmb = new JButton("Insert \"MB\"");
		btnInsertmb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("MB", "Kazo", "Wallets","blue",106, 750, 8, " ");
				obj1.insertItem(106);
			}
		}); 
		btnInsertmb.setBounds(89, 315, 124, 25);
		btnInsertmb.setToolTipText(" ");
		btnInsertmb.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.add(btnInsertmb);
		
		btnInsertoliveGreen = new JButton("Insert \"Olive Green\"");
		btnInsertoliveGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				obj.insertProduct("Olive Green", "Kazo", "Wallets","green",107, 750, 8, " ");
				obj1.insertItem(107);
			}
		});
		btnInsertoliveGreen.setBounds(223, 350, 124, 25);
		btnInsertoliveGreen.setToolTipText(" ");
		btnInsertoliveGreen.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.add(btnInsertoliveGreen);
		
		btnInsertbronco = new JButton("Insert \"bronco\"");
		btnInsertbronco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("bronco", "Kazo", "Wallets","grey",108, 750, 8, " ");
				obj1.insertItem(108);
			}
		});
		btnInsertbronco.setBounds(89, 350, 124, 25);
		btnInsertbronco.setToolTipText(" ");
		btnInsertbronco.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.add(btnInsertbronco);
		
		btnInsertflint = new JButton("Insert \"flint\"");
		btnInsertflint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("flint", "Kazo", "Wallets","dark gray",109, 750, 8, " ");
				obj1.insertItem(109);
			}
		});
		btnInsertflint.setBounds(89, 385, 124, 25);
		btnInsertflint.setToolTipText(" ");
		btnInsertflint.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.add(btnInsertflint);
		
		btnInsertzeus = new JButton("Insert \"Zeus\"");
		btnInsertzeus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Zeus", "Kazo", "Wallets","blue",110, 750, 8, " ");
				obj1.insertItem(110);
			}
		});
		btnInsertzeus.setBounds(223, 385, 124, 25);
		btnInsertzeus.setToolTipText(" ");
		btnInsertzeus.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.add(btnInsertzeus);
		
		textField_1 = new JTextField();
		textField_1.setText("KAZO");
		textField_1.setFont(new Font("Verdana", Font.BOLD, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(62, 10, 82, 16);
		panel_1.add(textField_1);
		
		JTextArea txtrOurPersonalFavorite = new JTextArea();
		txtrOurPersonalFavorite.setText("Our personal favorite, \uD835\uDDDE\uD835\uDDEE\uD835\uDE07\uD835\uDDFC soft goat leather \r\nwallets. An art of fashion in your pocket,\r\ncomplimenting your personal style effortlessly.\r\nPrice : Rs 750");
		txtrOurPersonalFavorite.setFont(new Font("Monospaced", Font.ITALIC, 11));
		txtrOurPersonalFavorite.setBounds(47, 228, 339, 77);
		panel_1.add(txtrOurPersonalFavorite);
		
		panel_2 = new JPanel();
		panel_2.setBounds(800, 57, 370, 420);
		frmPriborAdmin.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\abc\\Pictures\\GUZEL.jpeg"));
		lblNewLabel_2.setBounds(10, 33, 319, 200);
		panel_2.add(lblNewLabel_2);
		
		btnInsertbruno = new JButton("Insert \"Bruno\"");
		btnInsertbruno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Bruno", "Guzel", "Wallets","black",111, 850, 8, " ");
				obj1.insertItem(111);
			}
		}); 
		btnInsertbruno.setToolTipText(" ");
		btnInsertbruno.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertbruno.setBounds(10, 340, 124, 25);
		panel_2.add(btnInsertbruno);
		
		btnInsertcamel = new JButton("Insert \"Camel\"");
		btnInsertcamel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Camel", "Guzel", "Wallets","brown",114, 850, 8, " ");
				obj1.insertItem(114);
			}
		});
		btnInsertcamel.setToolTipText(" ");
		btnInsertcamel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertcamel.setBounds(159, 385, 124, 25);
		panel_2.add(btnInsertcamel);
		
		btnInsertcherrywood = new JButton("Insert \"Cherrywood\"");
		btnInsertcherrywood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Cherrywood", "Guzel", "Wallets","dark brown",113, 850, 8, " ");
				obj1.insertItem(113);
			}
		});
		btnInsertcherrywood.setToolTipText(" ");
		btnInsertcherrywood.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertcherrywood.setBounds(10, 385, 124, 25);
		panel_2.add(btnInsertcherrywood);
		
		btnInsertwattle_1 = new JButton("Insert \"Cardinal\"");
		btnInsertwattle_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Cardinal", "Guzel", "Wallets","red",112, 850, 8, " ");
				obj1.insertItem(112);
			}
		});
		btnInsertwattle_1.setToolTipText(" ");
		btnInsertwattle_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertwattle_1.setBounds(159, 340, 124, 25);
		panel_2.add(btnInsertwattle_1);
		
		textField_2 = new JTextField();
		textField_2.setText("GUZEL");
		textField_2.setFont(new Font("Verdana", Font.BOLD, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(10, 10, 82, 16);
		panel_2.add(textField_2);
		
		JTextArea txtrAnAccessoryThatll = new JTextArea();
		txtrAnAccessoryThatll.setText("An accessory that'll definitely be an integral \r\npart of your attire. Introducing our exclusive \r\nrange of ladies wallets\r\n\uD835\uDDDA\uD835\uDE02\uD835\uDE07\uD835\uDDF2\uD835\uDDF9 specially on customers' demands.\r\nPrice : Rs 850");
		txtrAnAccessoryThatll.setFont(new Font("Monospaced", Font.ITALIC, 11));
		txtrAnAccessoryThatll.setBounds(20, 243, 327, 77);
		panel_2.add(txtrAnAccessoryThatll);
		
		panel_3 = new JPanel();
		panel_3.setBounds(10, 435, 441, 410);
		frmPriborAdmin.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 37, 269, 247);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\abc\\Pictures\\KAP.jpeg"));
		panel_3.add(lblNewLabel_3);
		
		txtKap = new JTextField();
		txtKap.setText("KAP");
		txtKap.setFont(new Font("Verdana", Font.BOLD, 12));
		txtKap.setColumns(10);
		txtKap.setBounds(10, 10, 82, 16);
		panel_3.add(txtKap);
		
		btnInsertred = new JButton("Insert \"Red\"");
		btnInsertred.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Red", "Kap", "Caps","red",116, 900, 8, " ");
				obj1.insertItem(116);
			}
		});
		btnInsertred.setToolTipText(" ");
		btnInsertred.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertred.setBounds(289, 131, 124, 25);
		panel_3.add(btnInsertred);
		
		btnInsertblack = new JButton("Insert \"Black\"");
		btnInsertblack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Black", "Kap", "Caps","black",115, 900, 8, " ");
				obj1.insertItem(115);
			}
		});
		btnInsertblack.setToolTipText(" ");
		btnInsertblack.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertblack.setBounds(289, 96, 124, 25);
		panel_3.add(btnInsertblack);
		
		btnInsertgray = new JButton("Insert \"Gray\"");
		btnInsertgray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Gray", "Kap", "Caps","gray",117, 900, 8, " ");
				obj1.insertItem(117);
			}
		});
		btnInsertgray.setToolTipText(" ");
		btnInsertgray.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertgray.setBounds(289, 166, 124, 25);
		panel_3.add(btnInsertgray);
		
		btnInsertbrown = new JButton("Insert \"Brown\"");
		btnInsertbrown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Brown", "Kap", "Caps","brown",118, 900, 8, " ");
				obj1.insertItem(118);
			}
		});
		btnInsertbrown.setToolTipText(" ");
		btnInsertbrown.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertbrown.setBounds(289, 201, 124, 25);
		panel_3.add(btnInsertbrown);
		
		txtrTakeYourStyle = new JTextArea();
		txtrTakeYourStyle.setText("Take your style a notch up on sunny beach \r\ndays or breezy winter outings with our highly \r\nanticipated leather caps and set new \r\ntrends with each OOTD. \r\nPrice: Rs 900");
		txtrTakeYourStyle.setFont(new Font("Monospaced", Font.ITALIC, 11));
		txtrTakeYourStyle.setBounds(32, 295, 339, 91);
		panel_3.add(txtrTakeYourStyle);
		
		panel_4 = new JPanel();
		panel_4.setBounds(461, 487, 573, 358);
		frmPriborAdmin.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(10, 36, 278, 255);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\abc\\Pictures\\stickers.jpeg"));
		panel_4.add(lblNewLabel_4);
		
		txtStickers = new JTextField();
		txtStickers.setBounds(10, 10, 82, 16);
		txtStickers.setText("STICKERS");
		txtStickers.setFont(new Font("Verdana", Font.BOLD, 12));
		txtStickers.setColumns(10);
		panel_4.add(txtStickers);
		
		btnInsertwattle_2 = new JButton("Insert");
		btnInsertwattle_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Random", "Random Stickers", "Stickers","multi",119, 200, 8, " ");
				obj1.insertItem(119);
			}
		});
		btnInsertwattle_2.setBounds(352, 72, 124, 25);
		btnInsertwattle_2.setToolTipText(" ");
		btnInsertwattle_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_4.add(btnInsertwattle_2);
		
		txtRandomStickers = new JTextField();
		txtRandomStickers.setText("Random Stickers");
		txtRandomStickers.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtRandomStickers.setColumns(10);
		txtRandomStickers.setBounds(352, 46, 113, 16);
		panel_4.add(txtRandomStickers);
		
		txtCustomStickers = new JTextField();
		txtCustomStickers.setText("Custom  Stickers");
		txtCustomStickers.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtCustomStickers.setColumns(10);
		txtCustomStickers.setBounds(352, 107, 113, 16);
		panel_4.add(txtCustomStickers);
		
		btnInsertwattle_4 = new JButton(" Insert \"Movies\"");
		btnInsertwattle_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Movies", "Custom Stickers", "Stickers","multi",120, 250, 8, " ");
				obj1.insertItem(120);
			}
		});
		btnInsertwattle_4.setToolTipText(" ");
		btnInsertwattle_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertwattle_4.setBounds(352, 133, 124, 25);
		panel_4.add(btnInsertwattle_4);
		
		btnInsertwattle_3 = new JButton(" Insert \"Anime\"");
		btnInsertwattle_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Anime", "Custom Stickers", "Stickers","multi",121, 250, 8, " ");
				obj1.insertItem(121);
			}
		});
		btnInsertwattle_3.setToolTipText(" ");
		btnInsertwattle_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertwattle_3.setBounds(352, 168, 124, 25);
		panel_4.add(btnInsertwattle_3);
		
		btnInsertwattle_5 = new JButton(" Insert \"Memes\"");
		btnInsertwattle_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Memes", "Custom Stickers", "Stickers","multi",122, 250, 8, " ");
				obj1.insertItem(122);
			}
		});
		btnInsertwattle_5.setToolTipText(" ");
		btnInsertwattle_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertwattle_5.setBounds(352, 203, 124, 25);
		panel_4.add(btnInsertwattle_5);
		
		btnInsertwattle_6 = new JButton(" Insert \"Cartoons\"");
		btnInsertwattle_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.insertProduct("Cartoons", "Custom Stickers", "Stickers","multi",123, 250, 8, " ");
				obj1.insertItem(123);
			}
		});
		btnInsertwattle_6.setToolTipText(" ");
		btnInsertwattle_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInsertwattle_6.setBounds(352, 238, 124, 25);
		panel_4.add(btnInsertwattle_6);
		
		txtrAddAFunky = new JTextArea();
		txtrAddAFunky.setText("Add a funky and fiesty edge to your electronic accessories with \r\nour wide range of stickers.Customization available.\r\nPrice: Rs 250 for custom packs and Rs 200 for random packs.");
		txtrAddAFunky.setFont(new Font("Monospaced", Font.ITALIC, 11));
		txtrAddAFunky.setBounds(10, 288, 466, 60);
		panel_4.add(txtrAddAFunky);
		
		btnNewButton_3 = new JButton("View my Cart");
		btnNewButton_3.setBounds(1187, 223, 130, 29);
		frmPriborAdmin.getContentPane().add(btnNewButton_3);
		
		btnNewButton_1 = new JButton("View my Bill");
		btnNewButton_1.setBounds(1187, 403, 114, 28);
		frmPriborAdmin.getContentPane().add(btnNewButton_1);
		
		btnNewButton_4 = new JButton("checkout");
		btnNewButton_4.setBounds(1187, 500, 114, 29);
		frmPriborAdmin.getContentPane().add(btnNewButton_4);
		
	}
}
