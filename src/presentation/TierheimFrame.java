package presentation;

import javax.swing.JFrame;

public final class TierheimFrame extends JFrame {

	public TierheimFrame(/*x,y,width,height*/) {
		setLayout(null);
		setTitle("Tierheim");
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//this.setBounds(x, y, width, height);
		
		TierPanel t_Panel = new TierPanel(/*x,y,width,height*/);
	
		this.add(t_Panel);
	}

}
