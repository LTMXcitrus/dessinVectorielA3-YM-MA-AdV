package main;

import geometry.Drawing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import language.grammarElements.AST;
import language.grammarElements.Sheet;
import language.interpreter.svgCreatorVisitorImpl;
import language.interpreter.abstracts.svgCreatorLexer;
import language.interpreter.interfaces.svgCreatorParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import visitors.Visitor;
import visitors.implementations.VisitorDescription;
import visitors.implementations.VisitorSVG;

public class Window extends JFrame{
	
	private Visitor visitor = new VisitorSVG();
	
	private JTextArea area;

	public Window() {
		super("Générer une image");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.getContentPane().setLayout(new BorderLayout());

		this.creerHaut();
		this.creerCentre();
		this.creerBas();
		this.pack();
	}
	
	public String[] getModules(){
		return new String[]{"SVG", "Description"};
	}

	public void creerHaut(){
		
	}

	public void creerCentre(){
		
		area = new JTextArea();
		area.setPreferredSize(new Dimension(500,500));
		this.getContentPane().add(area, BorderLayout.CENTER);
	}
	
	public void creerBas(){
		JPanel panneauBas = new JPanel(new GridLayout(1, 3));
		panneauBas.setPreferredSize(new Dimension(800, 200));
		JComboBox<String> modulesList = new JComboBox<String>(getModules());
		modulesList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(((JComboBox<String>)e.getSource()).getSelectedIndex() == 0){
					visitor = new VisitorSVG();
				}
				else{
					visitor = new VisitorDescription();
				}
				
			}
		});
		
		panneauBas.add(new JScrollPane(modulesList));
		panneauBas.setPreferredSize(new Dimension(100,30));
		JButton button = new JButton("Valider");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				generate(visitor);
			}
		});
		panneauBas.add(button);
		this.getContentPane().add(panneauBas,BorderLayout.SOUTH);
	}
	
	public void generate(Visitor v){
		
		String code = area.getText();
		
		ANTLRInputStream input = new ANTLRInputStream(code);
		svgCreatorLexer lexer = new svgCreatorLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		svgCreatorParser parser = new svgCreatorParser(tokens);
		parser.removeErrorListeners();
		ParseTree tree = parser.drawing();
		System.out.println(tree.toStringTree(parser));
		
		svgCreatorVisitorImpl visitor = new svgCreatorVisitorImpl();
		AST ast = visitor.visit(tree);
		
		Sheet sheet = (Sheet) ast;
		
		Drawing drawing = sheet.draw();
		
		System.out.println(v.visit(drawing));
	}
}
