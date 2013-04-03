package cropMe;
import java.awt.*;

import java.awt.datatransfer.*;
import java.io.IOException;


public class CropnPaste {

	
	private static final Clipboard clipboardAction=Toolkit.getDefaultToolkit().getSystemClipboard();

	/**
	 * @throws ArrayIndexOutOfBoundsException
	 * @throws IOException 
	 * @throws UnsupportedFlavorException 
	 */
	public String cropIt() {
		
		try {
			String pastedText[] = getFromClipboard().split("\t");
			setToClipboard(pastedText[1]);
			//String pastedText = getFromClipboard();
			//setToClipboard(pastedText);
			return pastedText[1];
		} 	catch(ArrayIndexOutOfBoundsException errorMessage) {
			//errorMessage.printStackTrace();
			String pastedText = null;
			pastedText = getFromClipboard();
			setToClipboard(pastedText);
			return pastedText;
		}
		
		
	}
	
	public String getFromClipboard() throws ArrayIndexOutOfBoundsException {

	try {
		return (String) clipboardAction.getData(DataFlavor.stringFlavor);
	} catch(IOException errorMessage) {
		errorMessage.printStackTrace();
		return "This isn't text";
	} catch (UnsupportedFlavorException errorMessage) {
		return "Cannot copy";
	}
		
	 }

	public void setToClipboard(String pastedText) {
		StringSelection transPastedText = new StringSelection(pastedText);
		clipboardAction.setContents(transPastedText, null);
		
	}
	
}
