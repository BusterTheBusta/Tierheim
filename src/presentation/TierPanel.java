package presentation;

import javax.swing.JPanel;

import business.TierDataManager;

public class TierPanel extends JPanel {
	
	private TierDataManager tdm;

	public TierPanel(/*x,y,width,height*/) {
		// setLayout(null);
		// this.setBounds(x,y,width,height);
		
		tdm = new TierDataManager();
		
		DataLabel d_Label = new DataLabel (/*x,y,width,height*/);
		add(d_Label);
	}

}
