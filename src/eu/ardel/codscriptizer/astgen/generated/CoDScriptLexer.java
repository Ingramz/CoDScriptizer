package eu.ardel.codscriptizer.astgen.generated;// Generated from C:/Users/Indrek/IdeaProjects/CoDScriptizer/src/eu/ardel/codscriptizer/grammars\CoDScript.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoDScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Break=1, Case=2, Continue=3, Default=4, Else=5, For=6, If=7, Return=8, 
		Switch=9, While=10, Thread=11, Wait=12, Undefined=13, True=14, False=15, 
		Endon=16, Notify=17, Breakpoint=18, Waittillframeend=19, Waittill=20, 
		Self=21, Level=22, Game=23, LeftParen=24, RightParen=25, LeftBracket=26, 
		RightBracket=27, LeftBrace=28, RightBrace=29, Less=30, LessEqual=31, Greater=32, 
		GreaterEqual=33, LeftShift=34, RightShift=35, Plus=36, PlusPlus=37, Minus=38, 
		MinusMinus=39, Star=40, Div=41, Mod=42, And=43, Or=44, AndAnd=45, OrOr=46, 
		Caret=47, Not=48, Tilde=49, Colon=50, Semi=51, Comma=52, Assign=53, StarAssign=54, 
		DivAssign=55, ModAssign=56, PlusAssign=57, MinusAssign=58, LeftShiftAssign=59, 
		RightShiftAssign=60, AndAssign=61, XorAssign=62, OrAssign=63, Equal=64, 
		NotEqual=65, Dot=66, Backslash=67, Include=68, UsingAnimtree=69, Animtree=70, 
		DeveloperCommentOpen=71, DeveloperCommentClose=72, Identifier=73, IntegerConstant=74, 
		FloatConstant=75, StringLiteral=76, Whitespace=77, Newline=78, BlockComment=79, 
		LineComment=80;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'", "'A'", "'B'", "'C'", "'D'", "'E'", 
		"'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", 
		"'P'"
	};
	public static final String[] ruleNames = {
		"Break", "Case", "Continue", "Default", "Else", "For", "If", "Return", 
		"Switch", "While", "Thread", "Wait", "Undefined", "True", "False", "Endon", 
		"Notify", "Breakpoint", "Waittillframeend", "Waittill", "Self", "Level", 
		"Game", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
		"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
		"RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", 
		"Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Colon", 
		"Semi", "Comma", "Assign", "StarAssign", "DivAssign", "ModAssign", "PlusAssign", 
		"MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", 
		"OrAssign", "Equal", "NotEqual", "Dot", "Backslash", "Include", "UsingAnimtree", 
		"Animtree", "DeveloperCommentOpen", "DeveloperCommentClose", "Identifier", 
		"Nondigit", "Digit", "IntegerConstant", "FloatConstant", "DecimalConstant", 
		"NonzeroDigit", "Zero", "DecimalFloatingConstant", "EscapeSequence", "SingleEscapeCharacter", 
		"NonEscapeCharacter", "StringLiteral", "StringCharacter", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
	};


	public CoDScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoDScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2R\u0253\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67"+
		"\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>"+
		"\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\7J\u01f1\nJ\fJ\16J\u01f4\13"+
		"J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\7O\u0200\nO\fO\16O\u0203\13O\3O\5O\u0206"+
		"\nO\3P\3P\3Q\3Q\3R\5R\u020d\nR\3R\3R\6R\u0211\nR\rR\16R\u0212\3S\3S\5"+
		"S\u0217\nS\3T\3T\3U\3U\3V\3V\7V\u021f\nV\fV\16V\u0222\13V\3V\3V\3W\3W"+
		"\3W\5W\u0229\nW\3X\6X\u022c\nX\rX\16X\u022d\3X\3X\3Y\3Y\5Y\u0234\nY\3"+
		"Y\5Y\u0237\nY\3Y\3Y\3Z\3Z\3Z\3Z\7Z\u023f\nZ\fZ\16Z\u0242\13Z\3Z\3Z\3Z"+
		"\3Z\3Z\3[\3[\3[\3[\7[\u024d\n[\f[\16[\u0250\13[\3[\3[\3\u0240\2\\\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095\2\u0097\2\u0099L\u009bM\u009d\2\u009f\2\u00a1\2"+
		"\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00abN\u00ad\2\u00afO\u00b1P\u00b3Q\u00b5"+
		"R\3\2\7\5\2C\\aac|\7\2$$^^ppttvv\6\2\f\f\17\17$$^^\4\2\13\13\"\"\4\2\f"+
		"\f\17\17\u0256\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u00ab\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\3\u00b7\3\2\2\2\5\u00bd\3\2\2\2\7\u00c2"+
		"\3\2\2\2\t\u00cb\3\2\2\2\13\u00d3\3\2\2\2\r\u00d8\3\2\2\2\17\u00dc\3\2"+
		"\2\2\21\u00df\3\2\2\2\23\u00e6\3\2\2\2\25\u00ed\3\2\2\2\27\u00f3\3\2\2"+
		"\2\31\u00fa\3\2\2\2\33\u00ff\3\2\2\2\35\u0109\3\2\2\2\37\u010e\3\2\2\2"+
		"!\u0114\3\2\2\2#\u011a\3\2\2\2%\u0121\3\2\2\2\'\u012c\3\2\2\2)\u013d\3"+
		"\2\2\2+\u0146\3\2\2\2-\u014b\3\2\2\2/\u0151\3\2\2\2\61\u0156\3\2\2\2\63"+
		"\u0158\3\2\2\2\65\u015a\3\2\2\2\67\u015c\3\2\2\29\u015e\3\2\2\2;\u0160"+
		"\3\2\2\2=\u0162\3\2\2\2?\u0164\3\2\2\2A\u0167\3\2\2\2C\u0169\3\2\2\2E"+
		"\u016c\3\2\2\2G\u016f\3\2\2\2I\u0172\3\2\2\2K\u0174\3\2\2\2M\u0177\3\2"+
		"\2\2O\u0179\3\2\2\2Q\u017c\3\2\2\2S\u017e\3\2\2\2U\u0180\3\2\2\2W\u0182"+
		"\3\2\2\2Y\u0184\3\2\2\2[\u0186\3\2\2\2]\u0189\3\2\2\2_\u018c\3\2\2\2a"+
		"\u018e\3\2\2\2c\u0190\3\2\2\2e\u0192\3\2\2\2g\u0194\3\2\2\2i\u0196\3\2"+
		"\2\2k\u0198\3\2\2\2m\u019a\3\2\2\2o\u019d\3\2\2\2q\u01a0\3\2\2\2s\u01a3"+
		"\3\2\2\2u\u01a6\3\2\2\2w\u01a9\3\2\2\2y\u01ad\3\2\2\2{\u01b1\3\2\2\2}"+
		"\u01b4\3\2\2\2\177\u01b7\3\2\2\2\u0081\u01ba\3\2\2\2\u0083\u01bd\3\2\2"+
		"\2\u0085\u01c0\3\2\2\2\u0087\u01c2\3\2\2\2\u0089\u01c4\3\2\2\2\u008b\u01cd"+
		"\3\2\2\2\u008d\u01dd\3\2\2\2\u008f\u01e7\3\2\2\2\u0091\u01ea\3\2\2\2\u0093"+
		"\u01ed\3\2\2\2\u0095\u01f5\3\2\2\2\u0097\u01f7\3\2\2\2\u0099\u01f9\3\2"+
		"\2\2\u009b\u01fb\3\2\2\2\u009d\u0205\3\2\2\2\u009f\u0207\3\2\2\2\u00a1"+
		"\u0209\3\2\2\2\u00a3\u020c\3\2\2\2\u00a5\u0216\3\2\2\2\u00a7\u0218\3\2"+
		"\2\2\u00a9\u021a\3\2\2\2\u00ab\u021c\3\2\2\2\u00ad\u0228\3\2\2\2\u00af"+
		"\u022b\3\2\2\2\u00b1\u0236\3\2\2\2\u00b3\u023a\3\2\2\2\u00b5\u0248\3\2"+
		"\2\2\u00b7\u00b8\7d\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7c\2\2\u00bb\u00bc\7m\2\2\u00bc\4\3\2\2\2\u00bd\u00be\7e\2\2\u00be\u00bf"+
		"\7c\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\6\3\2\2\2\u00c2\u00c3"+
		"\7e\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7g\2\2"+
		"\u00ca\b\3\2\2\2\u00cb\u00cc\7f\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7h"+
		"\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2"+
		"\7v\2\2\u00d2\n\3\2\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6"+
		"\7u\2\2\u00d6\u00d7\7g\2\2\u00d7\f\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da"+
		"\7q\2\2\u00da\u00db\7t\2\2\u00db\16\3\2\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de"+
		"\7h\2\2\u00de\20\3\2\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2"+
		"\7v\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7p\2\2\u00e5"+
		"\22\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7y\2\2\u00e8\u00e9\7k\2\2\u00e9"+
		"\u00ea\7v\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7j\2\2\u00ec\24\3\2\2\2\u00ed"+
		"\u00ee\7y\2\2\u00ee\u00ef\7j\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7n\2\2"+
		"\u00f1\u00f2\7g\2\2\u00f2\26\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7"+
		"j\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9"+
		"\7f\2\2\u00f9\30\3\2\2\2\u00fa\u00fb\7y\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd"+
		"\7k\2\2\u00fd\u00fe\7v\2\2\u00fe\32\3\2\2\2\u00ff\u0100\7w\2\2\u0100\u0101"+
		"\7p\2\2\u0101\u0102\7f\2\2\u0102\u0103\7g\2\2\u0103\u0104\7h\2\2\u0104"+
		"\u0105\7k\2\2\u0105\u0106\7p\2\2\u0106\u0107\7g\2\2\u0107\u0108\7f\2\2"+
		"\u0108\34\3\2\2\2\u0109\u010a\7v\2\2\u010a\u010b\7t\2\2\u010b\u010c\7"+
		"w\2\2\u010c\u010d\7g\2\2\u010d\36\3\2\2\2\u010e\u010f\7h\2\2\u010f\u0110"+
		"\7c\2\2\u0110\u0111\7n\2\2\u0111\u0112\7u\2\2\u0112\u0113\7g\2\2\u0113"+
		" \3\2\2\2\u0114\u0115\7g\2\2\u0115\u0116\7p\2\2\u0116\u0117\7f\2\2\u0117"+
		"\u0118\7q\2\2\u0118\u0119\7p\2\2\u0119\"\3\2\2\2\u011a\u011b\7p\2\2\u011b"+
		"\u011c\7q\2\2\u011c\u011d\7v\2\2\u011d\u011e\7k\2\2\u011e\u011f\7h\2\2"+
		"\u011f\u0120\7{\2\2\u0120$\3\2\2\2\u0121\u0122\7d\2\2\u0122\u0123\7t\2"+
		"\2\u0123\u0124\7g\2\2\u0124\u0125\7c\2\2\u0125\u0126\7m\2\2\u0126\u0127"+
		"\7r\2\2\u0127\u0128\7q\2\2\u0128\u0129\7k\2\2\u0129\u012a\7p\2\2\u012a"+
		"\u012b\7v\2\2\u012b&\3\2\2\2\u012c\u012d\7y\2\2\u012d\u012e\7c\2\2\u012e"+
		"\u012f\7k\2\2\u012f\u0130\7v\2\2\u0130\u0131\7v\2\2\u0131\u0132\7k\2\2"+
		"\u0132\u0133\7n\2\2\u0133\u0134\7n\2\2\u0134\u0135\7h\2\2\u0135\u0136"+
		"\7t\2\2\u0136\u0137\7c\2\2\u0137\u0138\7o\2\2\u0138\u0139\7g\2\2\u0139"+
		"\u013a\7g\2\2\u013a\u013b\7p\2\2\u013b\u013c\7f\2\2\u013c(\3\2\2\2\u013d"+
		"\u013e\7y\2\2\u013e\u013f\7c\2\2\u013f\u0140\7k\2\2\u0140\u0141\7v\2\2"+
		"\u0141\u0142\7v\2\2\u0142\u0143\7k\2\2\u0143\u0144\7n\2\2\u0144\u0145"+
		"\7n\2\2\u0145*\3\2\2\2\u0146\u0147\7u\2\2\u0147\u0148\7g\2\2\u0148\u0149"+
		"\7n\2\2\u0149\u014a\7h\2\2\u014a,\3\2\2\2\u014b\u014c\7n\2\2\u014c\u014d"+
		"\7g\2\2\u014d\u014e\7x\2\2\u014e\u014f\7g\2\2\u014f\u0150\7n\2\2\u0150"+
		".\3\2\2\2\u0151\u0152\7i\2\2\u0152\u0153\7c\2\2\u0153\u0154\7o\2\2\u0154"+
		"\u0155\7g\2\2\u0155\60\3\2\2\2\u0156\u0157\7*\2\2\u0157\62\3\2\2\2\u0158"+
		"\u0159\7+\2\2\u0159\64\3\2\2\2\u015a\u015b\7]\2\2\u015b\66\3\2\2\2\u015c"+
		"\u015d\7_\2\2\u015d8\3\2\2\2\u015e\u015f\7}\2\2\u015f:\3\2\2\2\u0160\u0161"+
		"\7\177\2\2\u0161<\3\2\2\2\u0162\u0163\7>\2\2\u0163>\3\2\2\2\u0164\u0165"+
		"\7>\2\2\u0165\u0166\7?\2\2\u0166@\3\2\2\2\u0167\u0168\7@\2\2\u0168B\3"+
		"\2\2\2\u0169\u016a\7@\2\2\u016a\u016b\7?\2\2\u016bD\3\2\2\2\u016c\u016d"+
		"\7>\2\2\u016d\u016e\7>\2\2\u016eF\3\2\2\2\u016f\u0170\7@\2\2\u0170\u0171"+
		"\7@\2\2\u0171H\3\2\2\2\u0172\u0173\7-\2\2\u0173J\3\2\2\2\u0174\u0175\7"+
		"-\2\2\u0175\u0176\7-\2\2\u0176L\3\2\2\2\u0177\u0178\7/\2\2\u0178N\3\2"+
		"\2\2\u0179\u017a\7/\2\2\u017a\u017b\7/\2\2\u017bP\3\2\2\2\u017c\u017d"+
		"\7,\2\2\u017dR\3\2\2\2\u017e\u017f\7\61\2\2\u017fT\3\2\2\2\u0180\u0181"+
		"\7\'\2\2\u0181V\3\2\2\2\u0182\u0183\7(\2\2\u0183X\3\2\2\2\u0184\u0185"+
		"\7~\2\2\u0185Z\3\2\2\2\u0186\u0187\7(\2\2\u0187\u0188\7(\2\2\u0188\\\3"+
		"\2\2\2\u0189\u018a\7~\2\2\u018a\u018b\7~\2\2\u018b^\3\2\2\2\u018c\u018d"+
		"\7`\2\2\u018d`\3\2\2\2\u018e\u018f\7#\2\2\u018fb\3\2\2\2\u0190\u0191\7"+
		"\u0080\2\2\u0191d\3\2\2\2\u0192\u0193\7<\2\2\u0193f\3\2\2\2\u0194\u0195"+
		"\7=\2\2\u0195h\3\2\2\2\u0196\u0197\7.\2\2\u0197j\3\2\2\2\u0198\u0199\7"+
		"?\2\2\u0199l\3\2\2\2\u019a\u019b\7,\2\2\u019b\u019c\7?\2\2\u019cn\3\2"+
		"\2\2\u019d\u019e\7\61\2\2\u019e\u019f\7?\2\2\u019fp\3\2\2\2\u01a0\u01a1"+
		"\7\'\2\2\u01a1\u01a2\7?\2\2\u01a2r\3\2\2\2\u01a3\u01a4\7-\2\2\u01a4\u01a5"+
		"\7?\2\2\u01a5t\3\2\2\2\u01a6\u01a7\7/\2\2\u01a7\u01a8\7?\2\2\u01a8v\3"+
		"\2\2\2\u01a9\u01aa\7>\2\2\u01aa\u01ab\7>\2\2\u01ab\u01ac\7?\2\2\u01ac"+
		"x\3\2\2\2\u01ad\u01ae\7@\2\2\u01ae\u01af\7@\2\2\u01af\u01b0\7?\2\2\u01b0"+
		"z\3\2\2\2\u01b1\u01b2\7(\2\2\u01b2\u01b3\7?\2\2\u01b3|\3\2\2\2\u01b4\u01b5"+
		"\7`\2\2\u01b5\u01b6\7?\2\2\u01b6~\3\2\2\2\u01b7\u01b8\7~\2\2\u01b8\u01b9"+
		"\7?\2\2\u01b9\u0080\3\2\2\2\u01ba\u01bb\7?\2\2\u01bb\u01bc\7?\2\2\u01bc"+
		"\u0082\3\2\2\2\u01bd\u01be\7#\2\2\u01be\u01bf\7?\2\2\u01bf\u0084\3\2\2"+
		"\2\u01c0\u01c1\7\60\2\2\u01c1\u0086\3\2\2\2\u01c2\u01c3\7^\2\2\u01c3\u0088"+
		"\3\2\2\2\u01c4\u01c5\7%\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7p\2\2\u01c7"+
		"\u01c8\7e\2\2\u01c8\u01c9\7n\2\2\u01c9\u01ca\7w\2\2\u01ca\u01cb\7f\2\2"+
		"\u01cb\u01cc\7g\2\2\u01cc\u008a\3\2\2\2\u01cd\u01ce\7%\2\2\u01ce\u01cf"+
		"\7w\2\2\u01cf\u01d0\7u\2\2\u01d0\u01d1\7k\2\2\u01d1\u01d2\7p\2\2\u01d2"+
		"\u01d3\7i\2\2\u01d3\u01d4\7a\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7p\2\2"+
		"\u01d6\u01d7\7k\2\2\u01d7\u01d8\7o\2\2\u01d8\u01d9\7v\2\2\u01d9\u01da"+
		"\7t\2\2\u01da\u01db\7g\2\2\u01db\u01dc\7g\2\2\u01dc\u008c\3\2\2\2\u01dd"+
		"\u01de\7%\2\2\u01de\u01df\7c\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7k\2\2"+
		"\u01e1\u01e2\7o\2\2\u01e2\u01e3\7v\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5"+
		"\7g\2\2\u01e5\u01e6\7g\2\2\u01e6\u008e\3\2\2\2\u01e7\u01e8\7\61\2\2\u01e8"+
		"\u01e9\7%\2\2\u01e9\u0090\3\2\2\2\u01ea\u01eb\7%\2\2\u01eb\u01ec\7\61"+
		"\2\2\u01ec\u0092\3\2\2\2\u01ed\u01f2\5\u0095K\2\u01ee\u01f1\5\u0095K\2"+
		"\u01ef\u01f1\5\u0097L\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u0094\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\t\2\2\2\u01f6\u0096\3\2\2\2\u01f7"+
		"\u01f8\4\62;\2\u01f8\u0098\3\2\2\2\u01f9\u01fa\5\u009dO\2\u01fa\u009a"+
		"\3\2\2\2\u01fb\u01fc\5\u00a3R\2\u01fc\u009c\3\2\2\2\u01fd\u0201\5\u009f"+
		"P\2\u01fe\u0200\5\u0097L\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0206\3\2\2\2\u0203\u0201\3\2"+
		"\2\2\u0204\u0206\5\u00a1Q\2\u0205\u01fd\3\2\2\2\u0205\u0204\3\2\2\2\u0206"+
		"\u009e\3\2\2\2\u0207\u0208\4\63;\2\u0208\u00a0\3\2\2\2\u0209\u020a\7\62"+
		"\2\2\u020a\u00a2\3\2\2\2\u020b\u020d\5\u009dO\2\u020c\u020b\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\5\u0085C\2\u020f\u0211"+
		"\5\u0097L\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210\3\2\2"+
		"\2\u0212\u0213\3\2\2\2\u0213\u00a4\3\2\2\2\u0214\u0217\5\u00a7T\2\u0215"+
		"\u0217\5\u00a9U\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217\u00a6"+
		"\3\2\2\2\u0218\u0219\t\3\2\2\u0219\u00a8\3\2\2\2\u021a\u021b\n\3\2\2\u021b"+
		"\u00aa\3\2\2\2\u021c\u0220\7$\2\2\u021d\u021f\5\u00adW\2\u021e\u021d\3"+
		"\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7$\2\2\u0224\u00ac\3\2"+
		"\2\2\u0225\u0229\n\4\2\2\u0226\u0227\7^\2\2\u0227\u0229\5\u00a5S\2\u0228"+
		"\u0225\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u00ae\3\2\2\2\u022a\u022c\t\5"+
		"\2\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\bX\2\2\u0230\u00b0\3\2"+
		"\2\2\u0231\u0233\7\17\2\2\u0232\u0234\7\f\2\2\u0233\u0232\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0237\7\f\2\2\u0236\u0231\3\2"+
		"\2\2\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\bY\2\2\u0239"+
		"\u00b2\3\2\2\2\u023a\u023b\7\61\2\2\u023b\u023c\7,\2\2\u023c\u0240\3\2"+
		"\2\2\u023d\u023f\13\2\2\2\u023e\u023d\3\2\2\2\u023f\u0242\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2"+
		"\2\2\u0243\u0244\7,\2\2\u0244\u0245\7\61\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0247\bZ\2\2\u0247\u00b4\3\2\2\2\u0248\u0249\7\61\2\2\u0249\u024a\7\61"+
		"\2\2\u024a\u024e\3\2\2\2\u024b\u024d\n\6\2\2\u024c\u024b\3\2\2\2\u024d"+
		"\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2"+
		"\2\2\u0250\u024e\3\2\2\2\u0251\u0252\b[\2\2\u0252\u00b6\3\2\2\2\21\2\u01f0"+
		"\u01f2\u0201\u0205\u020c\u0212\u0216\u0220\u0228\u022d\u0233\u0236\u0240"+
		"\u024e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}