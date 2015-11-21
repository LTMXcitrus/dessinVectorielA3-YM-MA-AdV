package language.main;

import geometry.Drawing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import language.grammarElements.AST;
import language.grammarElements.Sheet;
import language.interpreter.svgCreatorVisitorImpl;
import language.interpreter.abstracts.svgCreatorLexer;
import language.interpreter.interfaces.svgCreatorParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import visitors.Visitor;
import visitors.VisitorDescription;
import visitors.VisitorSVG;

public class Main {
	
	public static void main(String[] args) throws IOException {
		String inputFile = null;
		if (args.length > 0)
			inputFile = "" + args[0];
		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
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
		
		
		Visitor<String> v = new VisitorSVG();
		//Visitor<String> v = new VisitorDescription();
		
		System.out.println(v.visit(drawing));
		
		
	}
}
