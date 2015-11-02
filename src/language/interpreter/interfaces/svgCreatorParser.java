// Generated from C:\Progra\ANTLRWorkspace\u005CuScala Java Files\svgCreator.g4 by ANTLR 4.1
package language.interpreter.interfaces;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class svgCreatorParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, SHAPE=4, INT=5, COLOR=6, CANVAS=7, COMMENT=8, 
		WS=9, ID=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "','", "SHAPE", "INT", "COLOR", "'Canvas'", 
		"COMMENT", "WS", "ID"
	};
	public static final int
		RULE_drawing = 0, RULE_canvas = 1, RULE_params = 2, RULE_param = 3, RULE_shape = 4;
	public static final String[] ruleNames = {
		"drawing", "canvas", "params", "param", "shape"
	};

	@Override
	public String getGrammarFileName() { return "svgCreator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public svgCreatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DrawingContext extends ParserRuleContext {
		public ShapeContext shape(int i) {
			return getRuleContext(ShapeContext.class,i);
		}
		public CanvasContext canvas() {
			return getRuleContext(CanvasContext.class,0);
		}
		public List<ShapeContext> shape() {
			return getRuleContexts(ShapeContext.class);
		}
		public DrawingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof svgCreatorListener ) ((svgCreatorListener)listener).enterDrawing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof svgCreatorListener ) ((svgCreatorListener)listener).exitDrawing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svgCreatorVisitor ) return ((svgCreatorVisitor<? extends T>)visitor).visitDrawing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawingContext drawing() throws RecognitionException {
		DrawingContext _localctx = new DrawingContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_drawing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); canvas();
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHAPE) {
				{
				{
				setState(11); shape();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CanvasContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CANVAS() { return getToken(svgCreatorParser.CANVAS, 0); }
		public CanvasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof svgCreatorListener ) ((svgCreatorListener)listener).enterCanvas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof svgCreatorListener ) ((svgCreatorListener)listener).exitCanvas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svgCreatorVisitor ) return ((svgCreatorVisitor<? extends T>)visitor).visitCanvas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CanvasContext canvas() throws RecognitionException {
		CanvasContext _localctx = new CanvasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_canvas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); match(CANVAS);
			setState(18); match(1);
			setState(19); params();
			setState(20); match(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof svgCreatorListener ) ((svgCreatorListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof svgCreatorListener ) ((svgCreatorListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svgCreatorVisitor ) return ((svgCreatorVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); param();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(23); match(3);
				setState(24); param();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(svgCreatorParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof svgCreatorListener ) ((svgCreatorListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof svgCreatorListener ) ((svgCreatorListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svgCreatorVisitor ) return ((svgCreatorVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode SHAPE() { return getToken(svgCreatorParser.SHAPE, 0); }
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof svgCreatorListener ) ((svgCreatorListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof svgCreatorListener ) ((svgCreatorListener)listener).exitShape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof svgCreatorVisitor ) return ((svgCreatorVisitor<? extends T>)visitor).visitShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(SHAPE);
			setState(33); match(1);
			setState(34); params();
			setState(35); match(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\f(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\7\4\34\n\4\f\4\16\4\37\13\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\2\7\2\4\6\b\n\2\2$\2\f\3\2\2\2\4\23\3\2\2\2\6\30\3\2\2"+
		"\2\b \3\2\2\2\n\"\3\2\2\2\f\20\5\4\3\2\r\17\5\n\6\2\16\r\3\2\2\2\17\22"+
		"\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\3\3\2\2\2\22\20\3\2\2\2\23\24"+
		"\7\t\2\2\24\25\7\3\2\2\25\26\5\6\4\2\26\27\7\4\2\2\27\5\3\2\2\2\30\35"+
		"\5\b\5\2\31\32\7\5\2\2\32\34\5\b\5\2\33\31\3\2\2\2\34\37\3\2\2\2\35\33"+
		"\3\2\2\2\35\36\3\2\2\2\36\7\3\2\2\2\37\35\3\2\2\2 !\7\f\2\2!\t\3\2\2\2"+
		"\"#\7\6\2\2#$\7\3\2\2$%\5\6\4\2%&\7\4\2\2&\13\3\2\2\2\4\20\35";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}