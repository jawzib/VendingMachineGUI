package cp213;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Main class for the Vending Machine.
 *
 * @author Jazib Muhammad 
 * @version 2021-03-19
 */
public class Main {

    public static void main(String[] args) {
		VendModel model = new VendModel();
		VendView vv = new VendView(model);
		final JFrame frame = new JFrame("FRONT VIEW OF VENDING MACHINE");
		frame.setContentPane(vv);
		frame.setMinimumSize(new Dimension(750,850));
		frame.pack();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
    }

}