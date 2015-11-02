// Generated from C:\Progra\ANTLRWorkspace\u005CuScala Java Files\svgCreator.g4 by ANTLR 4.1
package language.interpreter.abstracts;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class svgCreatorLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, SHAPE=4, INT=5, COLOR=6, CANVAS=7, COMMENT=8, 
		WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "','", "SHAPE", "INT", "COLOR", "'Canvas'", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "SHAPE", "INT", "COLOR", "CANVAS", "COMMENT", 
		"WS"
	};


	public svgCreatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "svgCreator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 8: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\13K\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\7\5\35\n\5\f\5\16\5 \13\5\3\6\7\6#\n\6\f\6\16\6&"+
		"\13\6\3\7\7\7)\n\7\f\7\16\7,\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\7\t9\n\t\f\t\16\t<\13\t\3\t\5\t?\n\t\3\t\3\t\3\t\3\t\3\n\6\n"+
		"F\n\n\r\n\16\nG\3\n\3\n\3:\13\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17"+
		"\t\1\21\n\2\23\13\3\3\2\6\3\2C\\\3\2\62;\3\2c|\5\2\13\f\17\17\"\"P\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7\31"+
		"\3\2\2\2\t\36\3\2\2\2\13$\3\2\2\2\r*\3\2\2\2\17-\3\2\2\2\21\64\3\2\2\2"+
		"\23E\3\2\2\2\25\26\7*\2\2\26\4\3\2\2\2\27\30\7+\2\2\30\6\3\2\2\2\31\32"+
		"\7.\2\2\32\b\3\2\2\2\33\35\t\2\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2"+
		"\2\2\36\37\3\2\2\2\37\n\3\2\2\2 \36\3\2\2\2!#\t\3\2\2\"!\3\2\2\2#&\3\2"+
		"\2\2$\"\3\2\2\2$%\3\2\2\2%\f\3\2\2\2&$\3\2\2\2\')\t\4\2\2(\'\3\2\2\2)"+
		",\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\16\3\2\2\2,*\3\2\2\2-.\7E\2\2./\7c\2\2"+
		"/\60\7p\2\2\60\61\7x\2\2\61\62\7c\2\2\62\63\7u\2\2\63\20\3\2\2\2\64\65"+
		"\7\61\2\2\65\66\7\61\2\2\66:\3\2\2\2\679\13\2\2\28\67\3\2\2\29<\3\2\2"+
		"\2:;\3\2\2\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2=?\7\17\2\2>=\3\2\2\2>?\3\2"+
		"\2\2?@\3\2\2\2@A\7\f\2\2AB\3\2\2\2BC\b\t\2\2C\22\3\2\2\2DF\t\5\2\2ED\3"+
		"\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\b\n\3\2J\24\3\2\2\2\t"+
		"\2\36$*:>G";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}