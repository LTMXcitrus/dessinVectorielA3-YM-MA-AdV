// Generated from C:\Progra\ANTLRWorkspace\u005CuScala Java Files\svgCreator.g4 by ANTLR 4.1
package language.interpreter.interfaces;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link svgCreatorParser}.
 */
public interface svgCreatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link svgCreatorParser#canvas}.
	 * @param ctx the parse tree
	 */
	void enterCanvas(@NotNull svgCreatorParser.CanvasContext ctx);
	/**
	 * Exit a parse tree produced by {@link svgCreatorParser#canvas}.
	 * @param ctx the parse tree
	 */
	void exitCanvas(@NotNull svgCreatorParser.CanvasContext ctx);

	/**
	 * Enter a parse tree produced by {@link svgCreatorParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(@NotNull svgCreatorParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link svgCreatorParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(@NotNull svgCreatorParser.ShapeContext ctx);

	/**
	 * Enter a parse tree produced by {@link svgCreatorParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(@NotNull svgCreatorParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link svgCreatorParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(@NotNull svgCreatorParser.ParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link svgCreatorParser#drawing}.
	 * @param ctx the parse tree
	 */
	void enterDrawing(@NotNull svgCreatorParser.DrawingContext ctx);
	/**
	 * Exit a parse tree produced by {@link svgCreatorParser#drawing}.
	 * @param ctx the parse tree
	 */
	void exitDrawing(@NotNull svgCreatorParser.DrawingContext ctx);

	/**
	 * Enter a parse tree produced by {@link svgCreatorParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull svgCreatorParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link svgCreatorParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull svgCreatorParser.ParamsContext ctx);
}