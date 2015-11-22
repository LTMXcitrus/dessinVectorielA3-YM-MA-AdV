package main;

import java.awt.Color;

import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class SyntaxColor {
	
	private static final String CERCLE = "CERCLE";

	JTextPane pane;
	
	public SyntaxColor(JTextPane pane){
		this.pane=pane;
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
	
	public void colorCercle(){
		StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.red);
        
        String text = pane.getText();
        
        int index = text.indexOf(CERCLE, 0);
        
        pane.select(index-1, index+CERCLE.length()-1);
        index = index+CERCLE.length();
        pane.setCharacterAttributes(aset, false);
        pane.replaceSelection(CERCLE);
        
	}

}
