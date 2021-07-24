package cp213;

import java.awt.Dimension;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 * Vending machine model. Contains the algorithms for vending products, handling
 * change and inventory, and working with credit. Should not perform any GUI
 * work of any kind.
 * 
 * @author Jazib Muhammad
 * @version 2021-04-01
 */


public class VendModel {
	
	// Incomplete due to personal reasons that I would rather not share. 
	
	public VendModel() { 
	
		ArrayList<itemID> itemList = new ArrayList<itemID>(); 
		
		itemID A0 = new itemID("A0", 1.25);
		itemID A1 = new itemID("A1", 1.20);
		itemID A2 = new itemID("A2", 1.15);
		itemID A3 = new itemID("A3", 1.50);
		itemID A4 = new itemID("A4", 1.60);
		itemID B0 = new itemID("B0", 1.75);
		itemID B1 = new itemID("B1", 1.25);
		itemID B2 = new itemID("B2", 1.65);
		itemID B3 = new itemID("B3", 1.85);
		itemID B4 = new itemID("B4", 1.25);
		itemID C0 = new itemID("C0", 1.55);
		itemID C1 = new itemID("C1", 1.40);
		itemID C2 = new itemID("C2", 1.25);
		itemID C3 = new itemID("C3", 1.20);
		itemID C4 = new itemID("C4", 1.45);
		itemID D0 = new itemID("D0", 1.20);
		itemID D1 = new itemID("D1", 1.35);
		itemID D2 = new itemID("D2", 1.70);
		itemID D3 = new itemID("D3", 1.25);
		itemID D4 = new itemID("D4", 2.20);
		itemID E0 = new itemID("E0", 2.00);
		itemID E1 = new itemID("E1", 1.05);
		itemID E2 = new itemID("E2", 2.25);
		itemID E3 = new itemID("E3", 1.25);
		itemID E4 = new itemID("E4", 2.25);
		itemID F0 = new itemID("F0", 1.65);
		itemID F1 = new itemID("F1", 1.85);
		itemID F2 = new itemID("F2", 1.15);
		itemID F3 = new itemID("F3", 1.95);
		itemID F4 = new itemID("F4", 2.25);
	    
	}
	    

	class itemID { 
		
		private String ID; 
		private double price;
		
		public itemID() {}
		
		public itemID(String ID, double price) { 
			this.ID = ID; 
			this.price = price; 
		}
		
		public String getID() { 
			return ID;
		}
		
		public void setID(String ID)  { 
			this.ID = ID; 
		}
		
		public double getPrice() { 
			return price; 
		}
		
		public void setPrice(double price) { 
			this.price = price; 
		}
	}
}
	