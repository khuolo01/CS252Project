package ActionEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import ItemInterface.ItemPanel;

public class ActionOpenItemInterface implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		ItemPanel panel = new ItemPanel();
		JOptionPane.showConfirmDialog(
				null, 
				panel, 
				"Item Functions", 
				JOptionPane.CLOSED_OPTION, 
				JOptionPane.PLAIN_MESSAGE);
	}
	
}
