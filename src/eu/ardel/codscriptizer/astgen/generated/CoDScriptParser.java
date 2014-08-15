package eu.ardel.codscriptizer.astgen.generated;// Generated from C:/Users/Indrek/IdeaProjects/CoDScriptizer/src/eu/ardel/codscriptizer/grammars\CoDScript.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoDScriptParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'break'", "'case'", "'continue'", "'default'", "'else'", 
		"'for'", "'if'", "'return'", "'switch'", "'while'", "'thread'", "'wait'", 
		"'undefined'", "'true'", "'false'", "'endon'", "'notify'", "'breakpoint'", 
		"'waittillframeend'", "'waittill'", "'self'", "'level'", "'game'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", 
		"'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", 
		"'&&'", "'||'", "'^'", "'!'", "'~'", "':'", "';'", "','", "'='", "'*='", 
		"'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", 
		"'=='", "'!='", "'.'", "'\\'", "'#include'", "'#using_animtree'", "'#animtree'", 
		"'/#'", "'#/'", "Identifier", "IntegerConstant", "FloatConstant", "StringLiteral", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
	};
	public static final int
		RULE_program = 0, RULE_includeStatement = 1, RULE_usingAnimtreeStatement = 2, 
		RULE_functionDefinition = 3, RULE_outerDeveloperComment = 4, RULE_codeBlock = 5, 
		RULE_innerDeveloperComment = 6, RULE_statement = 7, RULE_terminatedStatement = 8, 
		RULE_optionallyTerminatedStatement = 9, RULE_functionCallStatement = 10, 
		RULE_waitStatement = 11, RULE_returnStatement = 12, RULE_breakStatement = 13, 
		RULE_breakpointStatement = 14, RULE_continueStatement = 15, RULE_waittillframeendStatement = 16, 
		RULE_notifyStatement = 17, RULE_endonStatement = 18, RULE_waittillStatement = 19, 
		RULE_whileLoop = 20, RULE_ifStatement = 21, RULE_forLoop = 22, RULE_vector = 23, 
		RULE_functionPointer = 24, RULE_functionCall = 25, RULE_functionCallTail = 26, 
		RULE_switchStatement = 27, RULE_caseBlock = 28, RULE_switchCase = 29, 
		RULE_incrementDecrement = 30, RULE_assignment = 31, RULE_lvalue = 32, 
		RULE_containerValue = 33, RULE_filePath = 34, RULE_expression = 35, RULE_logicalOrExpression = 36, 
		RULE_logicalAndExpression = 37, RULE_inclusiveOrExpression = 38, RULE_exclusiveOrExpression = 39, 
		RULE_andExpression = 40, RULE_equalityExpression = 41, RULE_relationalExpression = 42, 
		RULE_shiftExpression = 43, RULE_additiveExpression = 44, RULE_multiplicativeExpression = 45, 
		RULE_unaryExpression = 46, RULE_primaryExpression = 47;
	public static final String[] ruleNames = {
		"program", "includeStatement", "usingAnimtreeStatement", "functionDefinition", 
		"outerDeveloperComment", "codeBlock", "innerDeveloperComment", "statement", 
		"terminatedStatement", "optionallyTerminatedStatement", "functionCallStatement", 
		"waitStatement", "returnStatement", "breakStatement", "breakpointStatement", 
		"continueStatement", "waittillframeendStatement", "notifyStatement", "endonStatement", 
		"waittillStatement", "whileLoop", "ifStatement", "forLoop", "vector", 
		"functionPointer", "functionCall", "functionCallTail", "switchStatement", 
		"caseBlock", "switchCase", "incrementDecrement", "assignment", "lvalue", 
		"containerValue", "filePath", "expression", "logicalOrExpression", "logicalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "primaryExpression"
	};

	@Override
	public String getGrammarFileName() { return "CoDScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoDScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<IncludeStatementContext> includeStatement() {
			return getRuleContexts(IncludeStatementContext.class);
		}
		public OuterDeveloperCommentContext outerDeveloperComment(int i) {
			return getRuleContext(OuterDeveloperCommentContext.class,i);
		}
		public UsingAnimtreeStatementContext usingAnimtreeStatement(int i) {
			return getRuleContext(UsingAnimtreeStatementContext.class,i);
		}
		public IncludeStatementContext includeStatement(int i) {
			return getRuleContext(IncludeStatementContext.class,i);
		}
		public List<OuterDeveloperCommentContext> outerDeveloperComment() {
			return getRuleContexts(OuterDeveloperCommentContext.class);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public List<UsingAnimtreeStatementContext> usingAnimtreeStatement() {
			return getRuleContexts(UsingAnimtreeStatementContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Include) {
				{
				{
				setState(96); includeStatement();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (UsingAnimtree - 69)) | (1L << (DeveloperCommentOpen - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(105);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(102); functionDefinition();
					}
					break;
				case DeveloperCommentOpen:
					{
					setState(103); outerDeveloperComment();
					}
					break;
				case UsingAnimtree:
					{
					setState(104); usingAnimtreeStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109);
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

	public static class IncludeStatementContext extends ParserRuleContext {
		public TerminalNode Include() { return getToken(CoDScriptParser.Include, 0); }
		public TerminalNode Semi() { return getToken(CoDScriptParser.Semi, 0); }
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public IncludeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterIncludeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitIncludeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitIncludeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeStatementContext includeStatement() throws RecognitionException {
		IncludeStatementContext _localctx = new IncludeStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(Include);
			setState(111); filePath();
			setState(112); match(Semi);
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

	public static class UsingAnimtreeStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CoDScriptParser.Semi, 0); }
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode UsingAnimtree() { return getToken(CoDScriptParser.UsingAnimtree, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public TerminalNode StringLiteral() { return getToken(CoDScriptParser.StringLiteral, 0); }
		public UsingAnimtreeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingAnimtreeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterUsingAnimtreeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitUsingAnimtreeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitUsingAnimtreeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingAnimtreeStatementContext usingAnimtreeStatement() throws RecognitionException {
		UsingAnimtreeStatementContext _localctx = new UsingAnimtreeStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_usingAnimtreeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(UsingAnimtree);
			setState(115); match(LeftParen);
			setState(116); match(StringLiteral);
			setState(117); match(RightParen);
			setState(118); match(Semi);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(CoDScriptParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CoDScriptParser.Identifier); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode Comma(int i) {
			return getToken(CoDScriptParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CoDScriptParser.Comma); }
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); ((FunctionDefinitionContext)_localctx).name = match(Identifier);
			setState(121); match(LeftParen);
			setState(130);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(122); match(Identifier);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(123); match(Comma);
					setState(124); match(Identifier);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(132); match(RightParen);
			setState(133); codeBlock();
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

	public static class OuterDeveloperCommentContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public TerminalNode DeveloperCommentClose() { return getToken(CoDScriptParser.DeveloperCommentClose, 0); }
		public TerminalNode DeveloperCommentOpen() { return getToken(CoDScriptParser.DeveloperCommentOpen, 0); }
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public OuterDeveloperCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerDeveloperComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterOuterDeveloperComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitOuterDeveloperComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitOuterDeveloperComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OuterDeveloperCommentContext outerDeveloperComment() throws RecognitionException {
		OuterDeveloperCommentContext _localctx = new OuterDeveloperCommentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_outerDeveloperComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(DeveloperCommentOpen);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(136); functionDefinition();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142); match(DeveloperCommentClose);
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

	public static class CodeBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode RightBrace() { return getToken(CoDScriptParser.RightBrace, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LeftBrace() { return getToken(CoDScriptParser.LeftBrace, 0); }
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(LeftBrace);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Break) | (1L << Continue) | (1L << For) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << While) | (1L << Thread) | (1L << Wait) | (1L << Breakpoint) | (1L << Waittillframeend) | (1L << Self) | (1L << Level) | (1L << Game) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Colon) | (1L << Semi))) != 0) || _la==DeveloperCommentOpen || _la==Identifier) {
				{
				{
				setState(145); statement();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151); match(RightBrace);
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

	public static class InnerDeveloperCommentContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode DeveloperCommentClose() { return getToken(CoDScriptParser.DeveloperCommentClose, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode DeveloperCommentOpen() { return getToken(CoDScriptParser.DeveloperCommentOpen, 0); }
		public InnerDeveloperCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerDeveloperComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterInnerDeveloperComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitInnerDeveloperComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitInnerDeveloperComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerDeveloperCommentContext innerDeveloperComment() throws RecognitionException {
		InnerDeveloperCommentContext _localctx = new InnerDeveloperCommentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_innerDeveloperComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(DeveloperCommentOpen);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Break) | (1L << Continue) | (1L << For) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << While) | (1L << Thread) | (1L << Wait) | (1L << Breakpoint) | (1L << Waittillframeend) | (1L << Self) | (1L << Level) | (1L << Game) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Colon) | (1L << Semi))) != 0) || _la==DeveloperCommentOpen || _la==Identifier) {
				{
				{
				setState(154); statement();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160); match(DeveloperCommentClose);
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

	public static class StatementContext extends ParserRuleContext {
		public OptionallyTerminatedStatementContext optionallyTerminatedStatement() {
			return getRuleContext(OptionallyTerminatedStatementContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(CoDScriptParser.Semi); }
		public TerminatedStatementContext terminatedStatement() {
			return getRuleContext(TerminatedStatementContext.class,0);
		}
		public TerminalNode Semi(int i) {
			return getToken(CoDScriptParser.Semi, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			int _alt;
			setState(174);
			switch (_input.LA(1)) {
			case For:
			case If:
			case Switch:
			case While:
			case LeftBrace:
			case DeveloperCommentOpen:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); optionallyTerminatedStatement();
				setState(164);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(163); match(Semi);
					}
					break;
				}
				}
				break;
			case Break:
			case Continue:
			case Return:
			case Thread:
			case Wait:
			case Breakpoint:
			case Waittillframeend:
			case Self:
			case Level:
			case Game:
			case LeftParen:
			case LeftBracket:
			case Colon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); terminatedStatement();
				setState(167); match(Semi);
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(169); match(Semi);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(172); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TerminatedStatementContext extends ParserRuleContext {
		public WaittillStatementContext waittillStatement() {
			return getRuleContext(WaittillStatementContext.class,0);
		}
		public EndonStatementContext endonStatement() {
			return getRuleContext(EndonStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public WaittillframeendStatementContext waittillframeendStatement() {
			return getRuleContext(WaittillframeendStatementContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WaitStatementContext waitStatement() {
			return getRuleContext(WaitStatementContext.class,0);
		}
		public IncrementDecrementContext incrementDecrement() {
			return getRuleContext(IncrementDecrementContext.class,0);
		}
		public BreakpointStatementContext breakpointStatement() {
			return getRuleContext(BreakpointStatementContext.class,0);
		}
		public NotifyStatementContext notifyStatement() {
			return getRuleContext(NotifyStatementContext.class,0);
		}
		public TerminatedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminatedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterTerminatedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitTerminatedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitTerminatedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminatedStatementContext terminatedStatement() throws RecognitionException {
		TerminatedStatementContext _localctx = new TerminatedStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_terminatedStatement);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); incrementDecrement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178); functionCallStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179); waitStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180); returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181); breakStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182); breakpointStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183); continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(184); waittillframeendStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(185); endonStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(186); waittillStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(187); notifyStatement();
				}
				break;
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

	public static class OptionallyTerminatedStatementContext extends ParserRuleContext {
		public InnerDeveloperCommentContext innerDeveloperComment() {
			return getRuleContext(InnerDeveloperCommentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public OptionallyTerminatedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionallyTerminatedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterOptionallyTerminatedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitOptionallyTerminatedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitOptionallyTerminatedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionallyTerminatedStatementContext optionallyTerminatedStatement() throws RecognitionException {
		OptionallyTerminatedStatementContext _localctx = new OptionallyTerminatedStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_optionallyTerminatedStatement);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(190); codeBlock();
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(191); switchStatement();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 3);
				{
				setState(192); whileLoop();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(193); forLoop();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(194); ifStatement();
				}
				break;
			case DeveloperCommentOpen:
				enterOuterAlt(_localctx, 6);
				{
				setState(195); innerDeveloperComment();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); functionCall();
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

	public static class WaitStatementContext extends ParserRuleContext {
		public TerminalNode Wait() { return getToken(CoDScriptParser.Wait, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WaitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterWaitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitWaitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitWaitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitStatementContext waitStatement() throws RecognitionException {
		WaitStatementContext _localctx = new WaitStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_waitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(Wait);
			setState(201); expression();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnWithoutValueContext extends ReturnStatementContext {
		public TerminalNode Return() { return getToken(CoDScriptParser.Return, 0); }
		public ReturnWithoutValueContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterReturnWithoutValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitReturnWithoutValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitReturnWithoutValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnWithValueContext extends ReturnStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Return() { return getToken(CoDScriptParser.Return, 0); }
		public ReturnWithValueContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterReturnWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitReturnWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitReturnWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStatement);
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ReturnWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203); match(Return);
				setState(204); expression();
				}
				break;
			case 2:
				_localctx = new ReturnWithoutValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205); match(Return);
				}
				break;
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(CoDScriptParser.Break, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(Break);
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

	public static class BreakpointStatementContext extends ParserRuleContext {
		public TerminalNode Breakpoint() { return getToken(CoDScriptParser.Breakpoint, 0); }
		public BreakpointStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakpointStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterBreakpointStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitBreakpointStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitBreakpointStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakpointStatementContext breakpointStatement() throws RecognitionException {
		BreakpointStatementContext _localctx = new BreakpointStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakpointStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(Breakpoint);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(CoDScriptParser.Continue, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(Continue);
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

	public static class WaittillframeendStatementContext extends ParserRuleContext {
		public TerminalNode Waittillframeend() { return getToken(CoDScriptParser.Waittillframeend, 0); }
		public WaittillframeendStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waittillframeendStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterWaittillframeendStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitWaittillframeendStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitWaittillframeendStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaittillframeendStatementContext waittillframeendStatement() throws RecognitionException {
		WaittillframeendStatementContext _localctx = new WaittillframeendStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_waittillframeendStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(Waittillframeend);
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

	public static class NotifyStatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode Notify() { return getToken(CoDScriptParser.Notify, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public ContainerValueContext containerValue() {
			return getRuleContext(ContainerValueContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode Comma(int i) {
			return getToken(CoDScriptParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CoDScriptParser.Comma); }
		public NotifyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notifyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterNotifyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitNotifyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitNotifyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotifyStatementContext notifyStatement() throws RecognitionException {
		NotifyStatementContext _localctx = new NotifyStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_notifyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); containerValue(0);
			setState(217); match(Notify);
			setState(218); match(LeftParen);
			setState(219); expression();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(220); match(Comma);
				setState(221); expression();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); match(RightParen);
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

	public static class EndonStatementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public ContainerValueContext containerValue() {
			return getRuleContext(ContainerValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Endon() { return getToken(CoDScriptParser.Endon, 0); }
		public EndonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterEndonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitEndonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitEndonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndonStatementContext endonStatement() throws RecognitionException {
		EndonStatementContext _localctx = new EndonStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_endonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); containerValue(0);
			setState(230); match(Endon);
			setState(231); match(LeftParen);
			setState(232); expression();
			setState(233); match(RightParen);
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

	public static class WaittillStatementContext extends ParserRuleContext {
		public TerminalNode Waittill() { return getToken(CoDScriptParser.Waittill, 0); }
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public ContainerValueContext containerValue() {
			return getRuleContext(ContainerValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma(int i) {
			return getToken(CoDScriptParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CoDScriptParser.Comma); }
		public WaittillStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waittillStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterWaittillStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitWaittillStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitWaittillStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaittillStatementContext waittillStatement() throws RecognitionException {
		WaittillStatementContext _localctx = new WaittillStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_waittillStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); containerValue(0);
			setState(236); match(Waittill);
			setState(237); match(LeftParen);
			setState(238); expression();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(239); match(Comma);
				setState(240); lvalue(0);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246); match(RightParen);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(CoDScriptParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(While);
			setState(249); match(LeftParen);
			setState(250); expression();
			setState(251); match(RightParen);
			setState(252); statement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementWithOutElseContext extends IfStatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public TerminalNode If() { return getToken(CoDScriptParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementWithOutElseContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterIfStatementWithOutElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitIfStatementWithOutElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitIfStatementWithOutElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementWithElseContext extends IfStatementContext {
		public StatementContext ifpart;
		public StatementContext elsepart;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode Else() { return getToken(CoDScriptParser.Else, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public TerminalNode If() { return getToken(CoDScriptParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementWithElseContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterIfStatementWithElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitIfStatementWithElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitIfStatementWithElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStatement);
		try {
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new IfStatementWithOutElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254); match(If);
				setState(255); match(LeftParen);
				setState(256); expression();
				setState(257); match(RightParen);
				setState(258); statement();
				}
				break;
			case 2:
				_localctx = new IfStatementWithElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260); match(If);
				setState(261); match(LeftParen);
				setState(262); expression();
				setState(263); match(RightParen);
				setState(264); ((IfStatementWithElseContext)_localctx).ifpart = statement();
				setState(265); match(Else);
				setState(266); ((IfStatementWithElseContext)_localctx).elsepart = statement();
				}
				break;
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminatedStatementContext precond;
		public TerminatedStatementContext postcond;
		public TerminatedStatementContext terminatedStatement(int i) {
			return getRuleContext(TerminatedStatementContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode For() { return getToken(CoDScriptParser.For, 0); }
		public List<TerminalNode> Semi() { return getTokens(CoDScriptParser.Semi); }
		public List<TerminatedStatementContext> terminatedStatement() {
			return getRuleContexts(TerminatedStatementContext.class);
		}
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi(int i) {
			return getToken(CoDScriptParser.Semi, i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(For);
			setState(271); match(LeftParen);
			setState(273);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Break) | (1L << Continue) | (1L << Return) | (1L << Thread) | (1L << Wait) | (1L << Breakpoint) | (1L << Waittillframeend) | (1L << Self) | (1L << Level) | (1L << Game) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Colon))) != 0) || _la==Identifier) {
				{
				setState(272); ((ForLoopContext)_localctx).precond = terminatedStatement();
				}
			}

			setState(275); match(Semi);
			setState(277);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Thread) | (1L << Undefined) | (1L << True) | (1L << False) | (1L << Self) | (1L << Level) | (1L << Game) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Minus) | (1L << Mod) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << Colon))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Animtree - 70)) | (1L << (Identifier - 70)) | (1L << (IntegerConstant - 70)) | (1L << (FloatConstant - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
				{
				setState(276); expression();
				}
			}

			setState(279); match(Semi);
			setState(281);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Break) | (1L << Continue) | (1L << Return) | (1L << Thread) | (1L << Wait) | (1L << Breakpoint) | (1L << Waittillframeend) | (1L << Self) | (1L << Level) | (1L << Game) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Colon))) != 0) || _la==Identifier) {
				{
				setState(280); ((ForLoopContext)_localctx).postcond = terminatedStatement();
				}
			}

			setState(283); match(RightParen);
			setState(284); statement();
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

	public static class VectorContext extends ParserRuleContext {
		public ExpressionContext x;
		public ExpressionContext y;
		public ExpressionContext z;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode Comma(int i) {
			return getToken(CoDScriptParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CoDScriptParser.Comma); }
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); match(LeftParen);
			setState(287); ((VectorContext)_localctx).x = expression();
			setState(288); match(Comma);
			setState(289); ((VectorContext)_localctx).y = expression();
			setState(290); match(Comma);
			setState(291); ((VectorContext)_localctx).z = expression();
			setState(292); match(RightParen);
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

	public static class FunctionPointerContext extends ParserRuleContext {
		public List<TerminalNode> Colon() { return getTokens(CoDScriptParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(CoDScriptParser.Colon, i);
		}
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CoDScriptParser.Identifier, 0); }
		public FunctionPointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterFunctionPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitFunctionPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitFunctionPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPointerContext functionPointer() throws RecognitionException {
		FunctionPointerContext _localctx = new FunctionPointerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionPointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(294); filePath();
				}
			}

			setState(297); match(Colon);
			setState(298); match(Colon);
			setState(299); match(Identifier);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public ContainerValueContext containerValue() {
			return getRuleContext(ContainerValueContext.class,0);
		}
		public FunctionCallTailContext functionCallTail() {
			return getRuleContext(FunctionCallTailContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCall);
		try {
			setState(305);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); containerValue(0);
				setState(302); functionCallTail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304); functionCallTail();
				}
				break;
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

	public static class FunctionCallTailContext extends ParserRuleContext {
		public FunctionCallTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallTail; }
	 
		public FunctionCallTailContext() { }
		public void copyFrom(FunctionCallTailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DynamicFunctionCallContext extends FunctionCallTailContext {
		public ExpressionContext expr;
		public List<TerminalNode> RightBracket() { return getTokens(CoDScriptParser.RightBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CoDScriptParser.LeftBracket, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public TerminalNode RightBracket(int i) {
			return getToken(CoDScriptParser.RightBracket, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(CoDScriptParser.LeftBracket); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode Comma(int i) {
			return getToken(CoDScriptParser.Comma, i);
		}
		public TerminalNode Thread() { return getToken(CoDScriptParser.Thread, 0); }
		public List<TerminalNode> Comma() { return getTokens(CoDScriptParser.Comma); }
		public DynamicFunctionCallContext(FunctionCallTailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterDynamicFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitDynamicFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitDynamicFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StaticFunctionCallContext extends FunctionCallTailContext {
		public Token ptr;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionPointerContext functionPointer() {
			return getRuleContext(FunctionPointerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public TerminalNode Identifier() { return getToken(CoDScriptParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode Comma(int i) {
			return getToken(CoDScriptParser.Comma, i);
		}
		public TerminalNode Thread() { return getToken(CoDScriptParser.Thread, 0); }
		public List<TerminalNode> Comma() { return getTokens(CoDScriptParser.Comma); }
		public StaticFunctionCallContext(FunctionCallTailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterStaticFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitStaticFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitStaticFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallTailContext functionCallTail() throws RecognitionException {
		FunctionCallTailContext _localctx = new FunctionCallTailContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCallTail);
		int _la;
		try {
			setState(347);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new StaticFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				_la = _input.LA(1);
				if (_la==Thread) {
					{
					setState(307); match(Thread);
					}
				}

				setState(312);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(310); functionPointer();
					}
					break;
				case 2:
					{
					setState(311); ((StaticFunctionCallContext)_localctx).ptr = match(Identifier);
					}
					break;
				}
				setState(314); match(LeftParen);
				setState(323);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Thread) | (1L << Undefined) | (1L << True) | (1L << False) | (1L << Self) | (1L << Level) | (1L << Game) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Minus) | (1L << Mod) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << Colon))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Animtree - 70)) | (1L << (Identifier - 70)) | (1L << (IntegerConstant - 70)) | (1L << (FloatConstant - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(315); expression();
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(316); match(Comma);
						setState(317); expression();
						}
						}
						setState(322);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(325); match(RightParen);
				}
				break;
			case 2:
				_localctx = new DynamicFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				_la = _input.LA(1);
				if (_la==Thread) {
					{
					setState(326); match(Thread);
					}
				}

				setState(329); match(LeftBracket);
				setState(330); match(LeftBracket);
				setState(331); ((DynamicFunctionCallContext)_localctx).expr = expression();
				setState(332); match(RightBracket);
				setState(333); match(RightBracket);
				setState(334); match(LeftParen);
				setState(343);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Thread) | (1L << Undefined) | (1L << True) | (1L << False) | (1L << Self) | (1L << Level) | (1L << Game) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Minus) | (1L << Mod) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << Colon))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Animtree - 70)) | (1L << (Identifier - 70)) | (1L << (IntegerConstant - 70)) | (1L << (FloatConstant - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(335); expression();
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(336); match(Comma);
						setState(337); expression();
						}
						}
						setState(342);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(345); match(RightParen);
				}
				break;
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public TerminalNode RightBrace() { return getToken(CoDScriptParser.RightBrace, 0); }
		public TerminalNode Switch() { return getToken(CoDScriptParser.Switch, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CaseBlockContext caseBlock(int i) {
			return getRuleContext(CaseBlockContext.class,i);
		}
		public List<CaseBlockContext> caseBlock() {
			return getRuleContexts(CaseBlockContext.class);
		}
		public TerminalNode LeftBrace() { return getToken(CoDScriptParser.LeftBrace, 0); }
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(Switch);
			setState(350); match(LeftParen);
			setState(351); expression();
			setState(352); match(RightParen);
			setState(353); match(LeftBrace);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case || _la==Default) {
				{
				{
				setState(354); caseBlock();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360); match(RightBrace);
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

	public static class CaseBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_caseBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(362); switchCase();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Break) | (1L << Continue) | (1L << For) | (1L << If) | (1L << Return) | (1L << Switch) | (1L << While) | (1L << Thread) | (1L << Wait) | (1L << Breakpoint) | (1L << Waittillframeend) | (1L << Self) | (1L << Level) | (1L << Game) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Colon) | (1L << Semi))) != 0) || _la==DeveloperCommentOpen || _la==Identifier) {
				{
				{
				setState(367); statement();
				}
				}
				setState(372);
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
	 
		public SwitchCaseContext() { }
		public void copyFrom(SwitchCaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefaultCaseContext extends SwitchCaseContext {
		public TerminalNode Colon() { return getToken(CoDScriptParser.Colon, 0); }
		public TerminalNode Default() { return getToken(CoDScriptParser.Default, 0); }
		public DefaultCaseContext(SwitchCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterDefaultCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitDefaultCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitDefaultCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantCaseIntegerContext extends SwitchCaseContext {
		public TerminalNode Colon() { return getToken(CoDScriptParser.Colon, 0); }
		public TerminalNode Case() { return getToken(CoDScriptParser.Case, 0); }
		public TerminalNode IntegerConstant() { return getToken(CoDScriptParser.IntegerConstant, 0); }
		public ConstantCaseIntegerContext(SwitchCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterConstantCaseInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitConstantCaseInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitConstantCaseInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantCaseStringContext extends SwitchCaseContext {
		public TerminalNode Colon() { return getToken(CoDScriptParser.Colon, 0); }
		public TerminalNode Case() { return getToken(CoDScriptParser.Case, 0); }
		public TerminalNode StringLiteral() { return getToken(CoDScriptParser.StringLiteral, 0); }
		public ConstantCaseStringContext(SwitchCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterConstantCaseString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitConstantCaseString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitConstantCaseString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_switchCase);
		try {
			setState(381);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new ConstantCaseStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(373); match(Case);
				setState(374); match(StringLiteral);
				setState(375); match(Colon);
				}
				break;
			case 2:
				_localctx = new ConstantCaseIntegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(376); match(Case);
				setState(377); match(IntegerConstant);
				setState(378); match(Colon);
				}
				break;
			case 3:
				_localctx = new DefaultCaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(379); match(Default);
				setState(380); match(Colon);
				}
				break;
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

	public static class IncrementDecrementContext extends ParserRuleContext {
		public IncrementDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementDecrement; }
	 
		public IncrementDecrementContext() { }
		public void copyFrom(IncrementDecrementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecrementContext extends IncrementDecrementContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(CoDScriptParser.MinusMinus, 0); }
		public DecrementContext(IncrementDecrementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementContext extends IncrementDecrementContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CoDScriptParser.PlusPlus, 0); }
		public IncrementContext(IncrementDecrementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementDecrementContext incrementDecrement() throws RecognitionException {
		IncrementDecrementContext _localctx = new IncrementDecrementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_incrementDecrement);
		try {
			setState(389);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new IncrementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(383); lvalue(0);
				setState(384); match(PlusPlus);
				}
				break;
			case 2:
				_localctx = new DecrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(386); lvalue(0);
				setState(387); match(MinusMinus);
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ModAssignmentContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ModAssign() { return getToken(CoDScriptParser.ModAssign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ModAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterModAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitModAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitModAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegularAssignmentContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CoDScriptParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RegularAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterRegularAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitRegularAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitRegularAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndAssignmentContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode AndAssign() { return getToken(CoDScriptParser.AndAssign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AndAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterAndAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitAndAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorAssignmentContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode XorAssign() { return getToken(CoDScriptParser.XorAssign, 0); }
		public XorAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterXorAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitXorAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitXorAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusAssignmentContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PlusAssign() { return getToken(CoDScriptParser.PlusAssign, 0); }
		public PlusAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPlusAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPlusAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPlusAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivAssignmentContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode DivAssign() { return getToken(CoDScriptParser.DivAssign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DivAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterDivAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitDivAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitDivAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftShiftAssignmentContext extends AssignmentContext {
		public TerminalNode LeftShiftAssign() { return getToken(CoDScriptParser.LeftShiftAssign, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LeftShiftAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterLeftShiftAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitLeftShiftAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitLeftShiftAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightShiftAssignmentContext extends AssignmentContext {
		public TerminalNode RightShiftAssign() { return getToken(CoDScriptParser.RightShiftAssign, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RightShiftAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterRightShiftAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitRightShiftAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitRightShiftAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusAssignmentContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode MinusAssign() { return getToken(CoDScriptParser.MinusAssign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterMinusAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitMinusAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitMinusAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrAssignmentContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OrAssign() { return getToken(CoDScriptParser.OrAssign, 0); }
		public OrAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterOrAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitOrAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitOrAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarAssignmentContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode StarAssign() { return getToken(CoDScriptParser.StarAssign, 0); }
		public StarAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterStarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitStarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitStarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assignment);
		try {
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new RegularAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(391); lvalue(0);
				setState(392); match(Assign);
				setState(393); expression();
				}
				break;
			case 2:
				_localctx = new StarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(395); lvalue(0);
				setState(396); match(StarAssign);
				setState(397); expression();
				}
				break;
			case 3:
				_localctx = new DivAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(399); lvalue(0);
				setState(400); match(DivAssign);
				setState(401); expression();
				}
				break;
			case 4:
				_localctx = new ModAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(403); lvalue(0);
				setState(404); match(ModAssign);
				setState(405); expression();
				}
				break;
			case 5:
				_localctx = new PlusAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(407); lvalue(0);
				setState(408); match(PlusAssign);
				setState(409); expression();
				}
				break;
			case 6:
				_localctx = new MinusAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(411); lvalue(0);
				setState(412); match(MinusAssign);
				setState(413); expression();
				}
				break;
			case 7:
				_localctx = new LeftShiftAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(415); lvalue(0);
				setState(416); match(LeftShiftAssign);
				setState(417); expression();
				}
				break;
			case 8:
				_localctx = new RightShiftAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(419); lvalue(0);
				setState(420); match(RightShiftAssign);
				setState(421); expression();
				}
				break;
			case 9:
				_localctx = new AndAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(423); lvalue(0);
				setState(424); match(AndAssign);
				setState(425); expression();
				}
				break;
			case 10:
				_localctx = new XorAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(427); lvalue(0);
				setState(428); match(XorAssign);
				setState(429); expression();
				}
				break;
			case 11:
				_localctx = new OrAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(431); lvalue(0);
				setState(432); match(OrAssign);
				setState(433); expression();
				}
				break;
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

	public static class LvalueContext extends ParserRuleContext {
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	 
		public LvalueContext() { }
		public void copyFrom(LvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LvalueFunctionCallArrayAccessContext extends LvalueContext {
		public TerminalNode RightBracket() { return getToken(CoDScriptParser.RightBracket, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CoDScriptParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LvalueFunctionCallArrayAccessContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterLvalueFunctionCallArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitLvalueFunctionCallArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitLvalueFunctionCallArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LvalueDotIdentifierContext extends LvalueContext {
		public TerminalNode Dot() { return getToken(CoDScriptParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CoDScriptParser.Identifier, 0); }
		public ContainerValueContext containerValue() {
			return getRuleContext(ContainerValueContext.class,0);
		}
		public LvalueDotIdentifierContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterLvalueDotIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitLvalueDotIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitLvalueDotIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LvalueGameArrayContext extends LvalueContext {
		public TerminalNode RightBracket() { return getToken(CoDScriptParser.RightBracket, 0); }
		public TerminalNode LeftBracket() { return getToken(CoDScriptParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Game() { return getToken(CoDScriptParser.Game, 0); }
		public LvalueGameArrayContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterLvalueGameArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitLvalueGameArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitLvalueGameArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LvalueIdentifierContext extends LvalueContext {
		public TerminalNode Identifier() { return getToken(CoDScriptParser.Identifier, 0); }
		public LvalueIdentifierContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterLvalueIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitLvalueIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitLvalueIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LvalueArrayAccessContext extends LvalueContext {
		public TerminalNode RightBracket() { return getToken(CoDScriptParser.RightBracket, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CoDScriptParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LvalueArrayAccessContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterLvalueArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitLvalueArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitLvalueArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new LvalueIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(438); match(Identifier);
				}
				break;
			case 2:
				{
				_localctx = new LvalueDotIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(439); containerValue(0);
				setState(440); match(Dot);
				setState(441); match(Identifier);
				}
				break;
			case 3:
				{
				_localctx = new LvalueFunctionCallArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(443); functionCall();
				setState(444); match(LeftBracket);
				setState(445); expression();
				setState(446); match(RightBracket);
				}
				break;
			case 4:
				{
				_localctx = new LvalueGameArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(448); match(Game);
				setState(449); match(LeftBracket);
				setState(450); expression();
				setState(451); match(RightBracket);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LvalueArrayAccessContext(new LvalueContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
					setState(455);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(456); match(LeftBracket);
					setState(457); expression();
					setState(458); match(RightBracket);
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ContainerValueContext extends ParserRuleContext {
		public ContainerValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerValue; }
	 
		public ContainerValueContext() { }
		public void copyFrom(ContainerValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContainerValueArrayAccessContext extends ContainerValueContext {
		public TerminalNode RightBracket() { return getToken(CoDScriptParser.RightBracket, 0); }
		public TerminalNode LeftBracket() { return getToken(CoDScriptParser.LeftBracket, 0); }
		public ContainerValueContext containerValue() {
			return getRuleContext(ContainerValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContainerValueArrayAccessContext(ContainerValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterContainerValueArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitContainerValueArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitContainerValueArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainerValueFunctionCallTailOnlyContext extends ContainerValueContext {
		public FunctionCallTailContext functionCallTail() {
			return getRuleContext(FunctionCallTailContext.class,0);
		}
		public ContainerValueFunctionCallTailOnlyContext(ContainerValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterContainerValueFunctionCallTailOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitContainerValueFunctionCallTailOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitContainerValueFunctionCallTailOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainerValueParensContext extends ContainerValueContext {
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public ContainerValueContext containerValue() {
			return getRuleContext(ContainerValueContext.class,0);
		}
		public ContainerValueParensContext(ContainerValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterContainerValueParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitContainerValueParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitContainerValueParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainerValueIdentifierContext extends ContainerValueContext {
		public TerminalNode Identifier() { return getToken(CoDScriptParser.Identifier, 0); }
		public ContainerValueIdentifierContext(ContainerValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterContainerValueIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitContainerValueIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitContainerValueIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainerValueLevelContext extends ContainerValueContext {
		public TerminalNode Level() { return getToken(CoDScriptParser.Level, 0); }
		public ContainerValueLevelContext(ContainerValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterContainerValueLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitContainerValueLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitContainerValueLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainerValueDotIdentifierContext extends ContainerValueContext {
		public TerminalNode Dot() { return getToken(CoDScriptParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CoDScriptParser.Identifier, 0); }
		public ContainerValueContext containerValue() {
			return getRuleContext(ContainerValueContext.class,0);
		}
		public ContainerValueDotIdentifierContext(ContainerValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterContainerValueDotIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitContainerValueDotIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitContainerValueDotIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainerValueSelfContext extends ContainerValueContext {
		public TerminalNode Self() { return getToken(CoDScriptParser.Self, 0); }
		public ContainerValueSelfContext(ContainerValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterContainerValueSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitContainerValueSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitContainerValueSelf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainerValueGameContext extends ContainerValueContext {
		public TerminalNode Game() { return getToken(CoDScriptParser.Game, 0); }
		public ContainerValueGameContext(ContainerValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterContainerValueGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitContainerValueGame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitContainerValueGame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainerValueFunctionCallContext extends ContainerValueContext {
		public ContainerValueContext containerValue() {
			return getRuleContext(ContainerValueContext.class,0);
		}
		public FunctionCallTailContext functionCallTail() {
			return getRuleContext(FunctionCallTailContext.class,0);
		}
		public ContainerValueFunctionCallContext(ContainerValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterContainerValueFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitContainerValueFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitContainerValueFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerValueContext containerValue() throws RecognitionException {
		return containerValue(0);
	}

	private ContainerValueContext containerValue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ContainerValueContext _localctx = new ContainerValueContext(_ctx, _parentState);
		ContainerValueContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_containerValue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				_localctx = new ContainerValueFunctionCallTailOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(466); functionCallTail();
				}
				break;
			case 2:
				{
				_localctx = new ContainerValueParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(467); match(LeftParen);
				setState(468); containerValue(0);
				setState(469); match(RightParen);
				}
				break;
			case 3:
				{
				_localctx = new ContainerValueGameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(471); match(Game);
				}
				break;
			case 4:
				{
				_localctx = new ContainerValueLevelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(472); match(Level);
				}
				break;
			case 5:
				{
				_localctx = new ContainerValueSelfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(473); match(Self);
				}
				break;
			case 6:
				{
				_localctx = new ContainerValueIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(474); match(Identifier);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(487);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ContainerValueFunctionCallContext(new ContainerValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_containerValue);
						setState(477);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(478); functionCallTail();
						}
						break;
					case 2:
						{
						_localctx = new ContainerValueArrayAccessContext(new ContainerValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_containerValue);
						setState(479);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(480); match(LeftBracket);
						setState(481); expression();
						setState(482); match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new ContainerValueDotIdentifierContext(new ContainerValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_containerValue);
						setState(484);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(485); match(Dot);
						setState(486); match(Identifier);
						}
						break;
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FilePathContext extends ParserRuleContext {
		public List<TerminalNode> Backslash() { return getTokens(CoDScriptParser.Backslash); }
		public TerminalNode Identifier(int i) {
			return getToken(CoDScriptParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CoDScriptParser.Identifier); }
		public TerminalNode Backslash(int i) {
			return getToken(CoDScriptParser.Backslash, i);
		}
		public FilePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterFilePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitFilePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitFilePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilePathContext filePath() throws RecognitionException {
		FilePathContext _localctx = new FilePathContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_filePath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); match(Identifier);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Backslash) {
				{
				{
				setState(493); match(Backslash);
				setState(494); match(Identifier);
				}
				}
				setState(499);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500); logicalOrExpression(0);
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueLogicalOrExpressionContext extends LogicalOrExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(CoDScriptParser.OrOr, 0); }
		public TrueLogicalOrExpressionContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterTrueLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitTrueLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitTrueLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrToLogicalAndExpressionContext extends LogicalOrExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrToLogicalAndExpressionContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterLogicalOrToLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitLogicalOrToLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitLogicalOrToLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalOrToLogicalAndExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(503); logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TrueLogicalOrExpressionContext(new LogicalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(505);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(506); match(OrOr);
					setState(507); logicalAndExpression(0);
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	 
		public LogicalAndExpressionContext() { }
		public void copyFrom(LogicalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueLogicalAndExpressionContext extends LogicalAndExpressionContext {
		public TerminalNode AndAnd() { return getToken(CoDScriptParser.AndAnd, 0); }
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TrueLogicalAndExpressionContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterTrueLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitTrueLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitTrueLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndToInclusiveOrExpressionContext extends LogicalAndExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndToInclusiveOrExpressionContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterLogicalAndToInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitLogicalAndToInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitLogicalAndToInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalAndToInclusiveOrExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(514); inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TrueLogicalAndExpressionContext(new LogicalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(516);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(517); match(AndAnd);
					setState(518); inclusiveOrExpression(0);
					}
					} 
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	 
		public InclusiveOrExpressionContext() { }
		public void copyFrom(InclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueInclusiveOrExpressionContext extends InclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(CoDScriptParser.Or, 0); }
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TrueInclusiveOrExpressionContext(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterTrueInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitTrueInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitTrueInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InclusiveOrToExclusiveOrExpressionContext extends InclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrToExclusiveOrExpressionContext(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterInclusiveOrToExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitInclusiveOrToExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitInclusiveOrToExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new InclusiveOrToExclusiveOrExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(525); exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TrueInclusiveOrExpressionContext(new InclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(527);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(528); match(Or);
					setState(529); exclusiveOrExpression(0);
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	 
		public ExclusiveOrExpressionContext() { }
		public void copyFrom(ExclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueExclusiveOrExpressionContext extends ExclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(CoDScriptParser.Caret, 0); }
		public TrueExclusiveOrExpressionContext(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterTrueExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitTrueExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitTrueExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExclusiveOrToAndExpressionContext extends ExclusiveOrExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrToAndExpressionContext(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterExclusiveOrToAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitExclusiveOrToAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitExclusiveOrToAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExclusiveOrToAndExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(536); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TrueExclusiveOrExpressionContext(new ExclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(538);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(539); match(Caret);
					setState(540); andExpression(0);
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	 
		public AndExpressionContext() { }
		public void copyFrom(AndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndToEqualityExpressionContext extends AndExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndToEqualityExpressionContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterAndToEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitAndToEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitAndToEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueAndExpressionContext extends AndExpressionContext {
		public TerminalNode And() { return getToken(CoDScriptParser.And, 0); }
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TrueAndExpressionContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterTrueAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitTrueAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitTrueAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndToEqualityExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(547); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TrueAndExpressionContext(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(549);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(550); match(And);
					setState(551); equalityExpression(0);
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotEqualExpressionContext extends EqualityExpressionContext {
		public TerminalNode NotEqual() { return getToken(CoDScriptParser.NotEqual, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public NotEqualExpressionContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterNotEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitNotEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitNotEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExpressionContext extends EqualityExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(CoDScriptParser.Equal, 0); }
		public EqualExpressionContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityToRelationalExpressionContext extends EqualityExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityToRelationalExpressionContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterEqualityToRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitEqualityToRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitEqualityToRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqualityToRelationalExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(558); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(566);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new EqualExpressionContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(560);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(561); match(Equal);
						setState(562); relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new NotEqualExpressionContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(563);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(564); match(NotEqual);
						setState(565); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreaterExpressionContext extends RelationalExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CoDScriptParser.Greater, 0); }
		public GreaterExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterGreaterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitGreaterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitGreaterExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualExpressionContext extends RelationalExpressionContext {
		public TerminalNode LessEqual() { return getToken(CoDScriptParser.LessEqual, 0); }
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public LessEqualExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterLessEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitLessEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitLessEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalToShiftExpressionContext extends RelationalExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalToShiftExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterRelationalToShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitRelationalToShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitRelationalToShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqualExpressionContext extends RelationalExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode GreaterEqual() { return getToken(CoDScriptParser.GreaterEqual, 0); }
		public GreaterEqualExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterGreaterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitGreaterEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitGreaterEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessExpressionContext extends RelationalExpressionContext {
		public TerminalNode Less() { return getToken(CoDScriptParser.Less, 0); }
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public LessExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterLessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitLessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitLessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationalToShiftExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(572); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(586);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new LessExpressionContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(574);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(575); match(Less);
						setState(576); shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new GreaterExpressionContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(577);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(578); match(Greater);
						setState(579); shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new LessEqualExpressionContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(580);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(581); match(LessEqual);
						setState(582); shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new GreaterEqualExpressionContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(583);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(584); match(GreaterEqual);
						setState(585); shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	 
		public ShiftExpressionContext() { }
		public void copyFrom(ShiftExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RightShiftExpressionContext extends ShiftExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode RightShift() { return getToken(CoDScriptParser.RightShift, 0); }
		public RightShiftExpressionContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterRightShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitRightShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitRightShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftShiftExpressionContext extends ShiftExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode LeftShift() { return getToken(CoDScriptParser.LeftShift, 0); }
		public LeftShiftExpressionContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterLeftShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitLeftShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitLeftShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftToAdditiveExpressionContext extends ShiftExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftToAdditiveExpressionContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterShiftToAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitShiftToAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitShiftToAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ShiftToAdditiveExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(592); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(600);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new LeftShiftExpressionContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(594);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(595); match(LeftShift);
						setState(596); additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RightShiftExpressionContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(597);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(598); match(RightShift);
						setState(599); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubtractionExpressionContext extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Minus() { return getToken(CoDScriptParser.Minus, 0); }
		public SubtractionExpressionContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterSubtractionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitSubtractionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitSubtractionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionExpressionContext extends AdditiveExpressionContext {
		public TerminalNode Plus() { return getToken(CoDScriptParser.Plus, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditionExpressionContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitAdditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveToMultiplicativeExpressionContext extends AdditiveExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveToMultiplicativeExpressionContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterAdditiveToMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitAdditiveToMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitAdditiveToMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveToMultiplicativeExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(606); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(614);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionExpressionContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(608);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(609); match(Plus);
						setState(610); multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionExpressionContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(611);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(612); match(Minus);
						setState(613); multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationExpressionContext extends MultiplicativeExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(CoDScriptParser.Star, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicationExpressionContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterMultiplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitMultiplicationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeToUnaryExpressionContext extends MultiplicativeExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeToUnaryExpressionContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterMultiplicativeToUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitMultiplicativeToUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitMultiplicativeToUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloExpressionContext extends MultiplicativeExpressionContext {
		public TerminalNode Mod() { return getToken(CoDScriptParser.Mod, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public ModuloExpressionContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterModuloExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitModuloExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitModuloExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionExpressionContext extends MultiplicativeExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Div() { return getToken(CoDScriptParser.Div, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public DivisionExpressionContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterDivisionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitDivisionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitDivisionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultiplicativeToUnaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(620); unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(631);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpressionContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(622);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(623); match(Star);
						setState(624); unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new DivisionExpressionContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(625);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(626); match(Div);
						setState(627); unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(628);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(629); match(Mod);
						setState(630); unaryExpression();
						}
						break;
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryLogicalNotExpressionContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Not() { return getToken(CoDScriptParser.Not, 0); }
		public UnaryLogicalNotExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterUnaryLogicalNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitUnaryLogicalNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitUnaryLogicalNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryToPrimaryExpressionContext extends UnaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryToPrimaryExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterUnaryToPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitUnaryToPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitUnaryToPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryNotExpressionContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(CoDScriptParser.Tilde, 0); }
		public UnaryNotExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterUnaryNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitUnaryNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitUnaryNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unaryExpression);
		try {
			setState(641);
			switch (_input.LA(1)) {
			case Thread:
			case Undefined:
			case True:
			case False:
			case Self:
			case Level:
			case Game:
			case LeftParen:
			case LeftBracket:
			case Minus:
			case Mod:
			case And:
			case Colon:
			case Animtree:
			case Identifier:
			case IntegerConstant:
			case FloatConstant:
			case StringLiteral:
				_localctx = new UnaryToPrimaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(636); primaryExpression();
				}
				break;
			case Not:
				_localctx = new UnaryLogicalNotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(637); match(Not);
				setState(638); unaryExpression();
				}
				break;
			case Tilde:
				_localctx = new UnaryNotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(639); match(Tilde);
				setState(640); unaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryExpressionTrueConstantContext extends PrimaryExpressionContext {
		public TerminalNode True() { return getToken(CoDScriptParser.True, 0); }
		public PrimaryExpressionTrueConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionTrueConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionTrueConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionTrueConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionLocalizedStringConstantContext extends PrimaryExpressionContext {
		public TerminalNode And() { return getToken(CoDScriptParser.And, 0); }
		public TerminalNode StringLiteral() { return getToken(CoDScriptParser.StringLiteral, 0); }
		public PrimaryExpressionLocalizedStringConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionLocalizedStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionLocalizedStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionLocalizedStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionStringLiteralConstantContext extends PrimaryExpressionContext {
		public TerminalNode StringLiteral() { return getToken(CoDScriptParser.StringLiteral, 0); }
		public PrimaryExpressionStringLiteralConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionStringLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionStringLiteralConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionStringLiteralConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionGroupingContext extends PrimaryExpressionContext {
		public TerminalNode LeftParen() { return getToken(CoDScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CoDScriptParser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionGroupingContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionGrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionGrouping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionGrouping(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionContainerValueContext extends PrimaryExpressionContext {
		public ContainerValueContext containerValue() {
			return getRuleContext(ContainerValueContext.class,0);
		}
		public PrimaryExpressionContainerValueContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionContainerValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionContainerValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionContainerValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionAnimtreeConstantContext extends PrimaryExpressionContext {
		public TerminalNode Animtree() { return getToken(CoDScriptParser.Animtree, 0); }
		public PrimaryExpressionAnimtreeConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionAnimtreeConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionAnimtreeConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionAnimtreeConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionUndefinedConstantContext extends PrimaryExpressionContext {
		public TerminalNode Undefined() { return getToken(CoDScriptParser.Undefined, 0); }
		public PrimaryExpressionUndefinedConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionUndefinedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionUndefinedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionUndefinedConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionEmptyArrayConstantContext extends PrimaryExpressionContext {
		public TerminalNode RightBracket() { return getToken(CoDScriptParser.RightBracket, 0); }
		public TerminalNode LeftBracket() { return getToken(CoDScriptParser.LeftBracket, 0); }
		public PrimaryExpressionEmptyArrayConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionEmptyArrayConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionEmptyArrayConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionEmptyArrayConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionFalseConstantContext extends PrimaryExpressionContext {
		public TerminalNode False() { return getToken(CoDScriptParser.False, 0); }
		public PrimaryExpressionFalseConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionFalseConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionFalseConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionFalseConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionVectorContext extends PrimaryExpressionContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public PrimaryExpressionVectorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionVector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionAnimationConstantContext extends PrimaryExpressionContext {
		public TerminalNode Mod() { return getToken(CoDScriptParser.Mod, 0); }
		public TerminalNode Identifier() { return getToken(CoDScriptParser.Identifier, 0); }
		public PrimaryExpressionAnimationConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionAnimationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionAnimationConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionAnimationConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionFloatConstantContext extends PrimaryExpressionContext {
		public TerminalNode FloatConstant() { return getToken(CoDScriptParser.FloatConstant, 0); }
		public TerminalNode Minus() { return getToken(CoDScriptParser.Minus, 0); }
		public PrimaryExpressionFloatConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionFloatConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionFloatConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionFloatConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionIntegerConstantContext extends PrimaryExpressionContext {
		public TerminalNode IntegerConstant() { return getToken(CoDScriptParser.IntegerConstant, 0); }
		public TerminalNode Minus() { return getToken(CoDScriptParser.Minus, 0); }
		public PrimaryExpressionIntegerConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpressionFunctionPointerConstantContext extends PrimaryExpressionContext {
		public FunctionPointerContext functionPointer() {
			return getRuleContext(FunctionPointerContext.class,0);
		}
		public PrimaryExpressionFunctionPointerConstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).enterPrimaryExpressionFunctionPointerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoDScriptListener ) ((CoDScriptListener)listener).exitPrimaryExpressionFunctionPointerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoDScriptVisitor ) return ((CoDScriptVisitor<? extends T>)visitor).visitPrimaryExpressionFunctionPointerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_primaryExpression);
		int _la;
		try {
			setState(669);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new PrimaryExpressionContainerValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(643); containerValue(0);
				}
				break;
			case 2:
				_localctx = new PrimaryExpressionVectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(644); vector();
				}
				break;
			case 3:
				_localctx = new PrimaryExpressionFloatConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(646);
				_la = _input.LA(1);
				if (_la==Minus) {
					{
					setState(645); match(Minus);
					}
				}

				setState(648); match(FloatConstant);
				}
				break;
			case 4:
				_localctx = new PrimaryExpressionIntegerConstantContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(650);
				_la = _input.LA(1);
				if (_la==Minus) {
					{
					setState(649); match(Minus);
					}
				}

				setState(652); match(IntegerConstant);
				}
				break;
			case 5:
				_localctx = new PrimaryExpressionStringLiteralConstantContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(653); match(StringLiteral);
				}
				break;
			case 6:
				_localctx = new PrimaryExpressionLocalizedStringConstantContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(654); match(And);
				setState(655); match(StringLiteral);
				}
				break;
			case 7:
				_localctx = new PrimaryExpressionAnimationConstantContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(656); match(Mod);
				setState(657); match(Identifier);
				}
				break;
			case 8:
				_localctx = new PrimaryExpressionAnimtreeConstantContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(658); match(Animtree);
				}
				break;
			case 9:
				_localctx = new PrimaryExpressionFunctionPointerConstantContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(659); functionPointer();
				}
				break;
			case 10:
				_localctx = new PrimaryExpressionGroupingContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(660); match(LeftParen);
				setState(661); expression();
				setState(662); match(RightParen);
				}
				break;
			case 11:
				_localctx = new PrimaryExpressionUndefinedConstantContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(664); match(Undefined);
				}
				break;
			case 12:
				_localctx = new PrimaryExpressionEmptyArrayConstantContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(665); match(LeftBracket);
				setState(666); match(RightBracket);
				}
				break;
			case 13:
				_localctx = new PrimaryExpressionTrueConstantContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(667); match(True);
				}
				break;
			case 14:
				_localctx = new PrimaryExpressionFalseConstantContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(668); match(False);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32: return lvalue_sempred((LvalueContext)_localctx, predIndex);
		case 33: return containerValue_sempred((ContainerValueContext)_localctx, predIndex);
		case 36: return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 37: return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 38: return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 39: return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 40: return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 41: return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 42: return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 43: return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 44: return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 45: return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return precpred(_ctx, 2);
		case 10: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean containerValue_sempred(ContainerValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 9);
		case 2: return precpred(_ctx, 7);
		case 3: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return precpred(_ctx, 4);
		case 12: return precpred(_ctx, 3);
		case 13: return precpred(_ctx, 2);
		case 14: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 1);
		case 15: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return precpred(_ctx, 2);
		case 18: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19: return precpred(_ctx, 3);
		case 21: return precpred(_ctx, 1);
		case 20: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3R\u02a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\2\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\u0080\n\5\f\5\16\5\u0083\13\5\5\5\u0085"+
		"\n\5\3\5\3\5\3\5\3\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3\6\3\6\3\7"+
		"\3\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\3\7\3\b\3\b\7\b\u009e\n\b\f"+
		"\b\16\b\u00a1\13\b\3\b\3\b\3\t\3\t\5\t\u00a7\n\t\3\t\3\t\3\t\3\t\6\t\u00ad"+
		"\n\t\r\t\16\t\u00ae\5\t\u00b1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00bf\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c7\n"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00d1\n\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e1\n\23"+
		"\f\23\16\23\u00e4\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u00f4\n\25\f\25\16\25\u00f7\13\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010f\n\27\3\30\3\30\3\30\5\30"+
		"\u0114\n\30\3\30\3\30\5\30\u0118\n\30\3\30\3\30\5\30\u011c\n\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\5\32\u012a\n\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0134\n\33\3\34\5\34\u0137"+
		"\n\34\3\34\3\34\5\34\u013b\n\34\3\34\3\34\3\34\3\34\7\34\u0141\n\34\f"+
		"\34\16\34\u0144\13\34\5\34\u0146\n\34\3\34\3\34\5\34\u014a\n\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0155\n\34\f\34\16\34\u0158"+
		"\13\34\5\34\u015a\n\34\3\34\3\34\5\34\u015e\n\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\7\35\u0166\n\35\f\35\16\35\u0169\13\35\3\35\3\35\3\36\6\36\u016e"+
		"\n\36\r\36\16\36\u016f\3\36\7\36\u0173\n\36\f\36\16\36\u0176\13\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0180\n\37\3 \3 \3 \3 \3 \3 "+
		"\5 \u0188\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\5!\u01b6\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u01c8\n\"\3\"\3\"\3\"\3\"\3\"\7\"\u01cf\n\"\f\"\16\""+
		"\u01d2\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01de\n#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\7#\u01ea\n#\f#\16#\u01ed\13#\3$\3$\3$\7$\u01f2\n$\f$\16"+
		"$\u01f5\13$\3%\3%\3&\3&\3&\3&\3&\3&\7&\u01ff\n&\f&\16&\u0202\13&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\7\'\u020a\n\'\f\'\16\'\u020d\13\'\3(\3(\3(\3(\3(\3"+
		"(\7(\u0215\n(\f(\16(\u0218\13(\3)\3)\3)\3)\3)\3)\7)\u0220\n)\f)\16)\u0223"+
		"\13)\3*\3*\3*\3*\3*\3*\7*\u022b\n*\f*\16*\u022e\13*\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\7+\u0239\n+\f+\16+\u023c\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\7,\u024d\n,\f,\16,\u0250\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\7-\u025b\n-\f-\16-\u025e\13-\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0269\n.\f"+
		".\16.\u026c\13.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u027a\n/\f/\16"+
		"/\u027d\13/\3\60\3\60\3\60\3\60\3\60\5\60\u0284\n\60\3\61\3\61\3\61\5"+
		"\61\u0289\n\61\3\61\3\61\5\61\u028d\n\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02a0\n\61"+
		"\3\61\2\16BDJLNPRTVXZ\\\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\2\u02df\2e\3\2\2\2\4p\3\2\2"+
		"\2\6t\3\2\2\2\bz\3\2\2\2\n\u0089\3\2\2\2\f\u0092\3\2\2\2\16\u009b\3\2"+
		"\2\2\20\u00b0\3\2\2\2\22\u00be\3\2\2\2\24\u00c6\3\2\2\2\26\u00c8\3\2\2"+
		"\2\30\u00ca\3\2\2\2\32\u00d0\3\2\2\2\34\u00d2\3\2\2\2\36\u00d4\3\2\2\2"+
		" \u00d6\3\2\2\2\"\u00d8\3\2\2\2$\u00da\3\2\2\2&\u00e7\3\2\2\2(\u00ed\3"+
		"\2\2\2*\u00fa\3\2\2\2,\u010e\3\2\2\2.\u0110\3\2\2\2\60\u0120\3\2\2\2\62"+
		"\u0129\3\2\2\2\64\u0133\3\2\2\2\66\u015d\3\2\2\28\u015f\3\2\2\2:\u016d"+
		"\3\2\2\2<\u017f\3\2\2\2>\u0187\3\2\2\2@\u01b5\3\2\2\2B\u01c7\3\2\2\2D"+
		"\u01dd\3\2\2\2F\u01ee\3\2\2\2H\u01f6\3\2\2\2J\u01f8\3\2\2\2L\u0203\3\2"+
		"\2\2N\u020e\3\2\2\2P\u0219\3\2\2\2R\u0224\3\2\2\2T\u022f\3\2\2\2V\u023d"+
		"\3\2\2\2X\u0251\3\2\2\2Z\u025f\3\2\2\2\\\u026d\3\2\2\2^\u0283\3\2\2\2"+
		"`\u029f\3\2\2\2bd\5\4\3\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fm\3"+
		"\2\2\2ge\3\2\2\2hl\5\b\5\2il\5\n\6\2jl\5\6\4\2kh\3\2\2\2ki\3\2\2\2kj\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\3\3\2\2\2om\3\2\2\2pq\7F\2\2qr\5"+
		"F$\2rs\7\65\2\2s\5\3\2\2\2tu\7G\2\2uv\7\32\2\2vw\7N\2\2wx\7\33\2\2xy\7"+
		"\65\2\2y\7\3\2\2\2z{\7K\2\2{\u0084\7\32\2\2|\u0081\7K\2\2}~\7\66\2\2~"+
		"\u0080\7K\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084|\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\33\2\2\u0087\u0088"+
		"\5\f\7\2\u0088\t\3\2\2\2\u0089\u008d\7I\2\2\u008a\u008c\5\b\5\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7J\2\2\u0091"+
		"\13\3\2\2\2\u0092\u0096\7\36\2\2\u0093\u0095\5\20\t\2\u0094\u0093\3\2"+
		"\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\37\2\2\u009a\r\3\2\2"+
		"\2\u009b\u009f\7I\2\2\u009c\u009e\5\20\t\2\u009d\u009c\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7J\2\2\u00a3\17\3\2\2\2\u00a4\u00a6\5\24\13"+
		"\2\u00a5\u00a7\7\65\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00b1\3\2\2\2\u00a8\u00a9\5\22\n\2\u00a9\u00aa\7\65\2\2\u00aa\u00b1\3"+
		"\2\2\2\u00ab\u00ad\7\65\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a4\3\2"+
		"\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00bf"+
		"\5@!\2\u00b3\u00bf\5> \2\u00b4\u00bf\5\26\f\2\u00b5\u00bf\5\30\r\2\u00b6"+
		"\u00bf\5\32\16\2\u00b7\u00bf\5\34\17\2\u00b8\u00bf\5\36\20\2\u00b9\u00bf"+
		"\5 \21\2\u00ba\u00bf\5\"\22\2\u00bb\u00bf\5&\24\2\u00bc\u00bf\5(\25\2"+
		"\u00bd\u00bf\5$\23\2\u00be\u00b2\3\2\2\2\u00be\u00b3\3\2\2\2\u00be\u00b4"+
		"\3\2\2\2\u00be\u00b5\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00b7\3\2\2\2\u00be"+
		"\u00b8\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\23\3\2\2\2\u00c0\u00c7"+
		"\5\f\7\2\u00c1\u00c7\58\35\2\u00c2\u00c7\5*\26\2\u00c3\u00c7\5.\30\2\u00c4"+
		"\u00c7\5,\27\2\u00c5\u00c7\5\16\b\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3"+
		"\2\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\25\3\2\2\2\u00c8\u00c9\5\64\33\2\u00c9\27\3\2\2\2"+
		"\u00ca\u00cb\7\16\2\2\u00cb\u00cc\5H%\2\u00cc\31\3\2\2\2\u00cd\u00ce\7"+
		"\n\2\2\u00ce\u00d1\5H%\2\u00cf\u00d1\7\n\2\2\u00d0\u00cd\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\33\3\2\2\2\u00d2\u00d3\7\3\2\2\u00d3\35\3\2\2\2\u00d4"+
		"\u00d5\7\24\2\2\u00d5\37\3\2\2\2\u00d6\u00d7\7\5\2\2\u00d7!\3\2\2\2\u00d8"+
		"\u00d9\7\25\2\2\u00d9#\3\2\2\2\u00da\u00db\5D#\2\u00db\u00dc\7\23\2\2"+
		"\u00dc\u00dd\7\32\2\2\u00dd\u00e2\5H%\2\u00de\u00df\7\66\2\2\u00df\u00e1"+
		"\5H%\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\33"+
		"\2\2\u00e6%\3\2\2\2\u00e7\u00e8\5D#\2\u00e8\u00e9\7\22\2\2\u00e9\u00ea"+
		"\7\32\2\2\u00ea\u00eb\5H%\2\u00eb\u00ec\7\33\2\2\u00ec\'\3\2\2\2\u00ed"+
		"\u00ee\5D#\2\u00ee\u00ef\7\26\2\2\u00ef\u00f0\7\32\2\2\u00f0\u00f5\5H"+
		"%\2\u00f1\u00f2\7\66\2\2\u00f2\u00f4\5B\"\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\33\2\2\u00f9)\3\2\2\2\u00fa\u00fb"+
		"\7\f\2\2\u00fb\u00fc\7\32\2\2\u00fc\u00fd\5H%\2\u00fd\u00fe\7\33\2\2\u00fe"+
		"\u00ff\5\20\t\2\u00ff+\3\2\2\2\u0100\u0101\7\t\2\2\u0101\u0102\7\32\2"+
		"\2\u0102\u0103\5H%\2\u0103\u0104\7\33\2\2\u0104\u0105\5\20\t\2\u0105\u010f"+
		"\3\2\2\2\u0106\u0107\7\t\2\2\u0107\u0108\7\32\2\2\u0108\u0109\5H%\2\u0109"+
		"\u010a\7\33\2\2\u010a\u010b\5\20\t\2\u010b\u010c\7\7\2\2\u010c\u010d\5"+
		"\20\t\2\u010d\u010f\3\2\2\2\u010e\u0100\3\2\2\2\u010e\u0106\3\2\2\2\u010f"+
		"-\3\2\2\2\u0110\u0111\7\b\2\2\u0111\u0113\7\32\2\2\u0112\u0114\5\22\n"+
		"\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117"+
		"\7\65\2\2\u0116\u0118\5H%\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011b\7\65\2\2\u011a\u011c\5\22\n\2\u011b\u011a\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\33\2\2\u011e"+
		"\u011f\5\20\t\2\u011f/\3\2\2\2\u0120\u0121\7\32\2\2\u0121\u0122\5H%\2"+
		"\u0122\u0123\7\66\2\2\u0123\u0124\5H%\2\u0124\u0125\7\66\2\2\u0125\u0126"+
		"\5H%\2\u0126\u0127\7\33\2\2\u0127\61\3\2\2\2\u0128\u012a\5F$\2\u0129\u0128"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\64\2\2"+
		"\u012c\u012d\7\64\2\2\u012d\u012e\7K\2\2\u012e\63\3\2\2\2\u012f\u0130"+
		"\5D#\2\u0130\u0131\5\66\34\2\u0131\u0134\3\2\2\2\u0132\u0134\5\66\34\2"+
		"\u0133\u012f\3\2\2\2\u0133\u0132\3\2\2\2\u0134\65\3\2\2\2\u0135\u0137"+
		"\7\r\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u013b\5\62\32\2\u0139\u013b\7K\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3"+
		"\2\2\2\u013b\u013c\3\2\2\2\u013c\u0145\7\32\2\2\u013d\u0142\5H%\2\u013e"+
		"\u013f\7\66\2\2\u013f\u0141\5H%\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u013d\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u015e\7\33\2\2\u0148\u014a\7\r\2\2\u0149\u0148\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7\34\2\2\u014c\u014d\7"+
		"\34\2\2\u014d\u014e\5H%\2\u014e\u014f\7\35\2\2\u014f\u0150\7\35\2\2\u0150"+
		"\u0159\7\32\2\2\u0151\u0156\5H%\2\u0152\u0153\7\66\2\2\u0153\u0155\5H"+
		"%\2\u0154\u0152\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u0151\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\33\2\2\u015c"+
		"\u015e\3\2\2\2\u015d\u0136\3\2\2\2\u015d\u0149\3\2\2\2\u015e\67\3\2\2"+
		"\2\u015f\u0160\7\13\2\2\u0160\u0161\7\32\2\2\u0161\u0162\5H%\2\u0162\u0163"+
		"\7\33\2\2\u0163\u0167\7\36\2\2\u0164\u0166\5:\36\2\u0165\u0164\3\2\2\2"+
		"\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7\37\2\2\u016b9\3\2\2\2\u016c"+
		"\u016e\5<\37\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0174\3\2\2\2\u0171\u0173\5\20\t\2\u0172"+
		"\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175;\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7\4\2\2\u0178\u0179"+
		"\7N\2\2\u0179\u0180\7\64\2\2\u017a\u017b\7\4\2\2\u017b\u017c\7L\2\2\u017c"+
		"\u0180\7\64\2\2\u017d\u017e\7\6\2\2\u017e\u0180\7\64\2\2\u017f\u0177\3"+
		"\2\2\2\u017f\u017a\3\2\2\2\u017f\u017d\3\2\2\2\u0180=\3\2\2\2\u0181\u0182"+
		"\5B\"\2\u0182\u0183\7\'\2\2\u0183\u0188\3\2\2\2\u0184\u0185\5B\"\2\u0185"+
		"\u0186\7)\2\2\u0186\u0188\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0184\3\2"+
		"\2\2\u0188?\3\2\2\2\u0189\u018a\5B\"\2\u018a\u018b\7\67\2\2\u018b\u018c"+
		"\5H%\2\u018c\u01b6\3\2\2\2\u018d\u018e\5B\"\2\u018e\u018f\78\2\2\u018f"+
		"\u0190\5H%\2\u0190\u01b6\3\2\2\2\u0191\u0192\5B\"\2\u0192\u0193\79\2\2"+
		"\u0193\u0194\5H%\2\u0194\u01b6\3\2\2\2\u0195\u0196\5B\"\2\u0196\u0197"+
		"\7:\2\2\u0197\u0198\5H%\2\u0198\u01b6\3\2\2\2\u0199\u019a\5B\"\2\u019a"+
		"\u019b\7;\2\2\u019b\u019c\5H%\2\u019c\u01b6\3\2\2\2\u019d\u019e\5B\"\2"+
		"\u019e\u019f\7<\2\2\u019f\u01a0\5H%\2\u01a0\u01b6\3\2\2\2\u01a1\u01a2"+
		"\5B\"\2\u01a2\u01a3\7=\2\2\u01a3\u01a4\5H%\2\u01a4\u01b6\3\2\2\2\u01a5"+
		"\u01a6\5B\"\2\u01a6\u01a7\7>\2\2\u01a7\u01a8\5H%\2\u01a8\u01b6\3\2\2\2"+
		"\u01a9\u01aa\5B\"\2\u01aa\u01ab\7?\2\2\u01ab\u01ac\5H%\2\u01ac\u01b6\3"+
		"\2\2\2\u01ad\u01ae\5B\"\2\u01ae\u01af\7@\2\2\u01af\u01b0\5H%\2\u01b0\u01b6"+
		"\3\2\2\2\u01b1\u01b2\5B\"\2\u01b2\u01b3\7A\2\2\u01b3\u01b4\5H%\2\u01b4"+
		"\u01b6\3\2\2\2\u01b5\u0189\3\2\2\2\u01b5\u018d\3\2\2\2\u01b5\u0191\3\2"+
		"\2\2\u01b5\u0195\3\2\2\2\u01b5\u0199\3\2\2\2\u01b5\u019d\3\2\2\2\u01b5"+
		"\u01a1\3\2\2\2\u01b5\u01a5\3\2\2\2\u01b5\u01a9\3\2\2\2\u01b5\u01ad\3\2"+
		"\2\2\u01b5\u01b1\3\2\2\2\u01b6A\3\2\2\2\u01b7\u01b8\b\"\1\2\u01b8\u01c8"+
		"\7K\2\2\u01b9\u01ba\5D#\2\u01ba\u01bb\7D\2\2\u01bb\u01bc\7K\2\2\u01bc"+
		"\u01c8\3\2\2\2\u01bd\u01be\5\64\33\2\u01be\u01bf\7\34\2\2\u01bf\u01c0"+
		"\5H%\2\u01c0\u01c1\7\35\2\2\u01c1\u01c8\3\2\2\2\u01c2\u01c3\7\31\2\2\u01c3"+
		"\u01c4\7\34\2\2\u01c4\u01c5\5H%\2\u01c5\u01c6\7\35\2\2\u01c6\u01c8\3\2"+
		"\2\2\u01c7\u01b7\3\2\2\2\u01c7\u01b9\3\2\2\2\u01c7\u01bd\3\2\2\2\u01c7"+
		"\u01c2\3\2\2\2\u01c8\u01d0\3\2\2\2\u01c9\u01ca\f\5\2\2\u01ca\u01cb\7\34"+
		"\2\2\u01cb\u01cc\5H%\2\u01cc\u01cd\7\35\2\2\u01cd\u01cf\3\2\2\2\u01ce"+
		"\u01c9\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1C\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\b#\1\2\u01d4\u01de"+
		"\5\66\34\2\u01d5\u01d6\7\32\2\2\u01d6\u01d7\5D#\2\u01d7\u01d8\7\33\2\2"+
		"\u01d8\u01de\3\2\2\2\u01d9\u01de\7\31\2\2\u01da\u01de\7\30\2\2\u01db\u01de"+
		"\7\27\2\2\u01dc\u01de\7K\2\2\u01dd\u01d3\3\2\2\2\u01dd\u01d5\3\2\2\2\u01dd"+
		"\u01d9\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2"+
		"\2\2\u01de\u01eb\3\2\2\2\u01df\u01e0\f\13\2\2\u01e0\u01ea\5\66\34\2\u01e1"+
		"\u01e2\f\t\2\2\u01e2\u01e3\7\34\2\2\u01e3\u01e4\5H%\2\u01e4\u01e5\7\35"+
		"\2\2\u01e5\u01ea\3\2\2\2\u01e6\u01e7\f\7\2\2\u01e7\u01e8\7D\2\2\u01e8"+
		"\u01ea\7K\2\2\u01e9\u01df\3\2\2\2\u01e9\u01e1\3\2\2\2\u01e9\u01e6\3\2"+
		"\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"E\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f3\7K\2\2\u01ef\u01f0\7E\2\2\u01f0"+
		"\u01f2\7K\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f3\u01f4\3\2\2\2\u01f4G\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7"+
		"\5J&\2\u01f7I\3\2\2\2\u01f8\u01f9\b&\1\2\u01f9\u01fa\5L\'\2\u01fa\u0200"+
		"\3\2\2\2\u01fb\u01fc\f\3\2\2\u01fc\u01fd\7\60\2\2\u01fd\u01ff\5L\'\2\u01fe"+
		"\u01fb\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201K\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\b\'\1\2\u0204\u0205"+
		"\5N(\2\u0205\u020b\3\2\2\2\u0206\u0207\f\3\2\2\u0207\u0208\7/\2\2\u0208"+
		"\u020a\5N(\2\u0209\u0206\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2"+
		"\2\u020b\u020c\3\2\2\2\u020cM\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f"+
		"\b(\1\2\u020f\u0210\5P)\2\u0210\u0216\3\2\2\2\u0211\u0212\f\3\2\2\u0212"+
		"\u0213\7.\2\2\u0213\u0215\5P)\2\u0214\u0211\3\2\2\2\u0215\u0218\3\2\2"+
		"\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217O\3\2\2\2\u0218\u0216"+
		"\3\2\2\2\u0219\u021a\b)\1\2\u021a\u021b\5R*\2\u021b\u0221\3\2\2\2\u021c"+
		"\u021d\f\3\2\2\u021d\u021e\7\61\2\2\u021e\u0220\5R*\2\u021f\u021c\3\2"+
		"\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"Q\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0225\b*\1\2\u0225\u0226\5T+\2\u0226"+
		"\u022c\3\2\2\2\u0227\u0228\f\3\2\2\u0228\u0229\7-\2\2\u0229\u022b\5T+"+
		"\2\u022a\u0227\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d"+
		"\3\2\2\2\u022dS\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0230\b+\1\2\u0230\u0231"+
		"\5V,\2\u0231\u023a\3\2\2\2\u0232\u0233\f\4\2\2\u0233\u0234\7B\2\2\u0234"+
		"\u0239\5V,\2\u0235\u0236\f\3\2\2\u0236\u0237\7C\2\2\u0237\u0239\5V,\2"+
		"\u0238\u0232\3\2\2\2\u0238\u0235\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023bU\3\2\2\2\u023c\u023a\3\2\2\2\u023d"+
		"\u023e\b,\1\2\u023e\u023f\5X-\2\u023f\u024e\3\2\2\2\u0240\u0241\f\6\2"+
		"\2\u0241\u0242\7 \2\2\u0242\u024d\5X-\2\u0243\u0244\f\5\2\2\u0244\u0245"+
		"\7\"\2\2\u0245\u024d\5X-\2\u0246\u0247\f\4\2\2\u0247\u0248\7!\2\2\u0248"+
		"\u024d\5X-\2\u0249\u024a\f\3\2\2\u024a\u024b\7#\2\2\u024b\u024d\5X-\2"+
		"\u024c\u0240\3\2\2\2\u024c\u0243\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u0249"+
		"\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"W\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252\b-\1\2\u0252\u0253\5Z.\2\u0253"+
		"\u025c\3\2\2\2\u0254\u0255\f\4\2\2\u0255\u0256\7$\2\2\u0256\u025b\5Z."+
		"\2\u0257\u0258\f\3\2\2\u0258\u0259\7%\2\2\u0259\u025b\5Z.\2\u025a\u0254"+
		"\3\2\2\2\u025a\u0257\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025dY\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0260\b.\1\2\u0260"+
		"\u0261\5\\/\2\u0261\u026a\3\2\2\2\u0262\u0263\f\4\2\2\u0263\u0264\7&\2"+
		"\2\u0264\u0269\5\\/\2\u0265\u0266\f\3\2\2\u0266\u0267\7(\2\2\u0267\u0269"+
		"\5\\/\2\u0268\u0262\3\2\2\2\u0268\u0265\3\2\2\2\u0269\u026c\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b[\3\2\2\2\u026c\u026a\3\2\2\2"+
		"\u026d\u026e\b/\1\2\u026e\u026f\5^\60\2\u026f\u027b\3\2\2\2\u0270\u0271"+
		"\f\5\2\2\u0271\u0272\7*\2\2\u0272\u027a\5^\60\2\u0273\u0274\f\4\2\2\u0274"+
		"\u0275\7+\2\2\u0275\u027a\5^\60\2\u0276\u0277\f\3\2\2\u0277\u0278\7,\2"+
		"\2\u0278\u027a\5^\60\2\u0279\u0270\3\2\2\2\u0279\u0273\3\2\2\2\u0279\u0276"+
		"\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"]\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0284\5`\61\2\u027f\u0280\7\62\2\2"+
		"\u0280\u0284\5^\60\2\u0281\u0282\7\63\2\2\u0282\u0284\5^\60\2\u0283\u027e"+
		"\3\2\2\2\u0283\u027f\3\2\2\2\u0283\u0281\3\2\2\2\u0284_\3\2\2\2\u0285"+
		"\u02a0\5D#\2\u0286\u02a0\5\60\31\2\u0287\u0289\7(\2\2\u0288\u0287\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u02a0\7M\2\2\u028b"+
		"\u028d\7(\2\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u02a0\7L\2\2\u028f\u02a0\7N\2\2\u0290\u0291\7-\2\2\u0291\u02a0"+
		"\7N\2\2\u0292\u0293\7,\2\2\u0293\u02a0\7K\2\2\u0294\u02a0\7H\2\2\u0295"+
		"\u02a0\5\62\32\2\u0296\u0297\7\32\2\2\u0297\u0298\5H%\2\u0298\u0299\7"+
		"\33\2\2\u0299\u02a0\3\2\2\2\u029a\u02a0\7\17\2\2\u029b\u029c\7\34\2\2"+
		"\u029c\u02a0\7\35\2\2\u029d\u02a0\7\20\2\2\u029e\u02a0\7\21\2\2\u029f"+
		"\u0285\3\2\2\2\u029f\u0286\3\2\2\2\u029f\u0288\3\2\2\2\u029f\u028c\3\2"+
		"\2\2\u029f\u028f\3\2\2\2\u029f\u0290\3\2\2\2\u029f\u0292\3\2\2\2\u029f"+
		"\u0294\3\2\2\2\u029f\u0295\3\2\2\2\u029f\u0296\3\2\2\2\u029f\u029a\3\2"+
		"\2\2\u029f\u029b\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u029e\3\2\2\2\u02a0"+
		"a\3\2\2\2?ekm\u0081\u0084\u008d\u0096\u009f\u00a6\u00ae\u00b0\u00be\u00c6"+
		"\u00d0\u00e2\u00f5\u010e\u0113\u0117\u011b\u0129\u0133\u0136\u013a\u0142"+
		"\u0145\u0149\u0156\u0159\u015d\u0167\u016f\u0174\u017f\u0187\u01b5\u01c7"+
		"\u01d0\u01dd\u01e9\u01eb\u01f3\u0200\u020b\u0216\u0221\u022c\u0238\u023a"+
		"\u024c\u024e\u025a\u025c\u0268\u026a\u0279\u027b\u0283\u0288\u028c\u029f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}