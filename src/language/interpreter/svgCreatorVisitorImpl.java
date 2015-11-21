package language.interpreter;

import language.grammarElements.AST;
import language.grammarElements.Canvas;
import language.grammarElements.Sheet;
import language.grammarElements.Param;
import language.grammarElements.Params;
import language.grammarElements.Shape;
import language.interpreter.abstracts.svgCreatorBaseVisitor;
import language.interpreter.interfaces.svgCreatorParser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

public class svgCreatorVisitorImpl extends svgCreatorBaseVisitor<AST>{
	
	@Override
	public AST visitDrawing(@NotNull svgCreatorParser.DrawingContext ctx){
		Canvas canvas = (Canvas) visit(ctx.canvas());
		List<svgCreatorParser.ShapeContext> shapesCtx = ctx.shape();
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		for(svgCreatorParser.ShapeContext shapeCtx : shapesCtx){
			shapes.add( (Shape) visit(shapeCtx));
		}
		return new Sheet(canvas, shapes);
	}
	
	@Override
	public AST visitCanvas(@NotNull svgCreatorParser.CanvasContext ctx){	
		return new Canvas((Params) visit(ctx.params()));
	}
	
	public AST visitParams(@NotNull svgCreatorParser.ParamsContext ctx){
		List<svgCreatorParser.ParamContext> paramsCtx = ctx.param();
		ArrayList<Param> params = new ArrayList<Param>();
		for(svgCreatorParser.ParamContext paramCtx : paramsCtx){
			params.add( (Param) visit(paramCtx));
		}
		return new Params(params);
	}
	
	public AST visitParam(@NotNull svgCreatorParser.ParamContext ctx){
		return new Param(ctx.getText());
	}
	
	public AST visitShape(@NotNull svgCreatorParser.ShapeContext ctx){
		String shape = ctx.SHAPE().getText();
		return new Shape(shape,(Params) visit(ctx.params()));
	}

}
