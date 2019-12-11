package ExtendedSupportClasses;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JPanelExtended extends JPanel {
	
	public JPanelExtended(){
		
		// Panel Border
		
		setBounds(100, 100, 365, 309);
		setLayout(null);
		setBorder(new EmptyBorder(5, 5, 5, 5));
	}
	
	// This class will change the Dimension of the Panel
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(365, 240);
	}
}
