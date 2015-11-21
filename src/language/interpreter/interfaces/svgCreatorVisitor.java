// Generated from C:\Progra\ANTLRWorkspace\u005CuScala Java Files\svgCreator.g4 by ANTLR 4.1
package language.interpreter.interfaces;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link svgCreatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface svgCreatorVisitor<T> extends ParseTreeVisitor<T> {	
	
	/**
	 * Visit a parse tree produced by {@link svgCreatorParser#canvas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanvas(@NotNull svgCreatorParser.CanvasContext ctx);

	/**
	 * Visit a parse tree produced by {@link svgCreatorParser#shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape(@NotNull svgCreatorParser.ShapeContext ctx);

	/**
	 * Visit a parse tree produced by {@link svgCreatorParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull svgCreatorParser.ParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link svgCreatorParser#drawing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawing(@NotNull svgCreatorParser.DrawingContext ctx);

	/**
	 * Visit a parse tree produced by {@link svgCreatorParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull svgCreatorParser.ParamsContext ctx);
}