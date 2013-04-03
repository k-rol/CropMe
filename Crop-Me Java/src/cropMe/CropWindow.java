package cropMe;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;

public class CropWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cropMeWindow();
	}
	
	public static void cropMeWindow() {
		Dimension mainWindowSize = new Dimension(195,65);
		
		//Create new GUI objects
		JFrame mainWindow = new JFrame("Crop-me for OCA");
		JPanel mainPanel = new JPanel();
		JButton cropButton = new JButton("Crop");
		final JTextField pasteTextbox = new JTextField();
		final CropnPaste cropAction = new CropnPaste();
		
		
		//main window setup
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel.setPreferredSize(mainWindowSize);
		mainWindow.setPreferredSize(mainWindowSize);
		//mainWindow.setMinimumSize(230,60);
		
		//main panel setup
		mainWindow.add(mainPanel);

		//text box setup
		mainPanel.add(pasteTextbox);
		pasteTextbox.setPreferredSize(new Dimension(100,20));
		pasteTextbox.getLocation();
		
		
		//crop button setup
		mainPanel.add(cropButton);
		///cropButton.setLocation(100, 100);
		cropButton.setPreferredSize(new Dimension(65,20));
		cropButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pasteTextbox.setText(cropAction.cropIt());
				}			
		});
		
		//Set them to appear
		mainWindow.pack();
		mainWindow.setVisible(true);
				
	}
		

}