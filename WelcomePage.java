package LoginSystem;

import java.awt.*;
import javax.swing.*;
public class WelcomePage {
    JFrame frame = new JFrame("Welcome Page");
	JLabel welcomeLabel = new JLabel();
	
	public WelcomePage(String userID){		
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		welcomeLabel.setText("Hello "+userID);
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
