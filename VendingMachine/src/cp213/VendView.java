package cp213;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.util.ArrayList;



/**
 * Handles the GUI portion of the vending machine. May use other GUI classes for
 * individual elements of the vending machine. Should use the VendModel for all
 * control logic.
 *
 * @author Jazib Muhammad
 * @version 2021-03-26
 */
@SuppressWarnings("serial")
public class VendView extends JPanel implements ActionListener{
	
	// Declaring variables to make them easily accesible
    private VendModel model = null;

    public int rows = 6; 
    public int cols = 5;
    
    JLabel ImageLabel;
    ImageIcon img1;
    JLabel PushSlot; 
    ImageIcon img2;
    JPanel picsPanel;
    JTextField textField;
    JPanel optionsPanel;
	JButton numButton;
	JButton moneyButton;
	JPanel moneyPanel;
	String displayContent = "";
	String[] numPadContent = {"A","B","C","D","E","F","1","2","3","4","5","6","7","8","9","*","0","#"};
	String[] items = {"A0","A1","A2","A3","A4","B0","B1","B2","B3","B4","C0","C1","C2","C3","C4","D0",
			"D1","D2","D3","D4","E0","E1","E2","E3","E4","F0","F1","F2","F3","F4"};
	String[] moneyContent = {"5¢","10¢","25¢","50¢","$1","$2","$5","$10"};
	
	ArrayList<JButton> buttonList; 
	ArrayList<JLabel> itemList; 
	ArrayList<JButton> moneyList;
	
    public VendView(VendModel model) {
		this.model = model;
		
		ImageIcon img1 = new ImageIcon("C:\\Users\\jazib\\cp213workspace\\muha9770_a05\\src\\cp213\\chocolate-bar-small.png"); 
		JLabel ImageLabel = new JLabel(); 
		ImageLabel.setHorizontalAlignment(JLabel.LEFT);
		ImageLabel.setIcon(img1);
		
		ImageIcon img2 = new ImageIcon("C:\\Users\\jazib\\cp213workspace\\muha9770_a05\\src\\cp213\\push-slot.jpg");
		JLabel PushSlot = new JLabel();
		PushSlot.setHorizontalAlignment(JLabel.LEFT);
		PushSlot.setIcon(img2);
		
		itemList = new ArrayList<JLabel>(30);
		JPanel itemPanel = new JPanel();
		itemPanel.setLayout(new GridLayout(6,5,0,0));
		itemPanel.setPreferredSize(new Dimension(400,750));
		
		for (int i = 0; i < items.length; i++) { 
			ImageLabel = new JLabel(items[i],img1,JLabel.CENTER);
			ImageLabel.setVerticalTextPosition(JLabel.BOTTOM);
			ImageLabel.setHorizontalTextPosition(JLabel.CENTER);
			itemList.add(ImageLabel);
		}
				
		for (int n = 0; n < itemList.size(); n++) { 
			itemPanel.add(itemList.get(n));
		}
		
		itemPanel.setBounds(25,75,800,800);
		
		
		// initialize the buttonList
		buttonList = new ArrayList<JButton>(18);
		JPanel numberPanel = new JPanel();
		// set the numberPanel to have a 6row by 3col grid layout
		numberPanel.setLayout(new GridLayout(8,3,0,0));
		// set the size of the numberPanel
		numberPanel.setPreferredSize(new Dimension(130,200));
		// create the buttons and add them to the buttonList, properly displaying the numbers 
		for (int i = 0; i < numPadContent.length; i++) {
			numButton = new JButton(numPadContent[i]);
			buttonList.add(numButton);
		}
		// add the buttonList to the number panel
		for (int n = 0; n < buttonList.size(); n++) {
			buttonList.get(n).addActionListener(this);
			numberPanel.add(buttonList.get(n));
		}
		
		
        setSize(400, 400);  
        setPreferredSize(getSize());
        
		// initialize the buttonList
		moneyList = new ArrayList<JButton>(8);
		JPanel moneyPanel = new JPanel();
		moneyPanel.setLayout(new GridLayout(4,2,0,0));
		for (int i = 0; i < moneyContent.length; i++) {
			moneyButton = new JButton(moneyContent[i]);
			moneyList.add(moneyButton);
		}
		
		for (int n = 0; n < moneyList.size(); n++) {
			moneyList.get(n).addActionListener(this);
			moneyPanel.add(moneyList.get(n));
		}
		
        
        JButton enterButton = new JButton("Enter");
        JButton vendButton = new JButton("Vend");
		JButton cancelButton = new JButton("Cancel");
		JTextField textField = new JTextField("Select ID");
		JTextField textField2 = new JTextField("Total Cost");
		
		
		cancelButton.setBounds(50,50,100,60);
		cancelButton.addActionListener(this);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        
        
		
		// the panel for the customer to decide whether they would like to continue with their 
		// order or not 
		JPanel optionsPanel = new JPanel(); 
		optionsPanel.setLayout(new GridLayout(0,1,0,0));
		optionsPanel.add(enterButton);
		optionsPanel.add(vendButton);
		optionsPanel.add(textField);
		optionsPanel.add(textField2);
		optionsPanel.add(cancelButton);
		
		numButton.addActionListener(new ActionListener() 
		{ 
			
			// update the display depending on clicked button(s)
			public void actionPerformed(ActionEvent e) {
				String textThere = textField.getText();
				String additionalText = "";
				// add clicked number button text to display
				for (int i = 0; i < buttonList.size(); i++) {
					if (e.getSource().equals(buttonList.get(i))) {
						additionalText = buttonList.get(i).getText();
						textThere = additionalText;
					}
				}
				textField.setText(textThere.concat(additionalText));
			}
		});
		
		
		// displaying the images, panels, buttons and textfields onto the GUI 
		this.add(itemPanel, BorderLayout.WEST); 
		this.add(numberPanel, BorderLayout.EAST);
		this.add(optionsPanel);
		this.add(moneyPanel);
		this.add(PushSlot);

    }
        
}

