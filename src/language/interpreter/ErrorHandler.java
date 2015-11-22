package language.interpreter;

import java.awt.Color;

import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 * Class which handles the errors and add them to the JTextPane of the GUI
 */
public class ErrorHandler {
	
	JTextPane area;
	
	public ErrorHandler(JTextPane area){
		this.area=area;
	}
	
	public void addError(String message, Exception e){
		appendToPane(area, "\n"+message+": "+e.getMessage());
	}
	
	private void appendToPane(JTextPane tp, String msg)
    {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.red);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }

}
