// Generated from D:/My Programs/maslan/src/main/resources\Maslan.g4 by ANTLR 4.7.2
package com.bsuir.maslan.lang.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MaslanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID_TYPE=1, INT_TYPE=2, VECTOR_TYPE=3, MATRIX_TYPE=4, RETURN=5, MAIN=6, 
		PRINT=7, LEN=8, NCOL=9, NROW=10, SET=11, GET=12, INSERT=13, REMOVE=14, 
		IF=15, ELSE=16, DO=17, WHILE=18, FOR=19, ID=20, INT=21, ASSIGMENT=22, 
		DOT=23, COMMA=24, SEMICOLON=25, LEFT_BRACKET=26, RIGHT_BRACKET=27, LEFT_FIGURE_BRACKET=28, 
		RIGHT_FIGURE_BRACKET=29, ADD=30, SUBTRACT=31, MULTIPLY=32, EQUAL=33, NON_EQUAL=34, 
		LESS=35, GREATER=36, WS=37, SINGLE_COMMENT=38, MULTI_COMMENT=39;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_returnStatement = 2, RULE_funcAssigment = 3, 
		RULE_funcParams = 4, RULE_funcParam = 5, RULE_funcCall = 6, RULE_funcArgs = 7, 
		RULE_funcArg = 8, RULE_printFunc = 9, RULE_getFunc = 10, RULE_setFunc = 11, 
		RULE_lenFunc = 12, RULE_ncolFunc = 13, RULE_nrowFunc = 14, RULE_insertFunc = 15, 
		RULE_removeFunc = 16, RULE_addingOper = 17, RULE_subtractingOper = 18, 
		RULE_multiplyingOper = 19, RULE_type = 20, RULE_varDeclaration = 21, RULE_assignment = 22, 
		RULE_intAssignment = 23, RULE_setLine = 24, RULE_vectorAssignment = 25, 
		RULE_setLines = 26, RULE_matrixAssignment = 27, RULE_expression = 28, 
		RULE_compOper = 29, RULE_compOperator = 30, RULE_compOperand = 31, RULE_ifStatement = 32, 
		RULE_elseStatement = 33, RULE_condOperator = 34, RULE_doStatement = 35, 
		RULE_whileStatement = 36, RULE_whileOperator = 37, RULE_doWhileOperator = 38, 
		RULE_forOperator = 39, RULE_iterAction = 40, RULE_content = 41, RULE_funcCallStatement = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "returnStatement", "funcAssigment", "funcParams", 
			"funcParam", "funcCall", "funcArgs", "funcArg", "printFunc", "getFunc", 
			"setFunc", "lenFunc", "ncolFunc", "nrowFunc", "insertFunc", "removeFunc", 
			"addingOper", "subtractingOper", "multiplyingOper", "type", "varDeclaration", 
			"assignment", "intAssignment", "setLine", "vectorAssignment", "setLines", 
			"matrixAssignment", "expression", "compOper", "compOperator", "compOperand", 
			"ifStatement", "elseStatement", "condOperator", "doStatement", "whileStatement", 
			"whileOperator", "doWhileOperator", "forOperator", "iterAction", "content", 
			"funcCallStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'int'", "'vector'", "'matrix'", "'return'", "'main'", 
			"'print'", "'len'", "'ncol'", "'nrow'", "'set'", "'get'", "'insert'", 
			"'remove'", "'if'", "'else'", "'do'", "'while'", "'for'", null, null, 
			"'='", "'.'", "','", "';'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", 
			"'*'", "'=='", "'!='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID_TYPE", "INT_TYPE", "VECTOR_TYPE", "MATRIX_TYPE", "RETURN", 
			"MAIN", "PRINT", "LEN", "NCOL", "NROW", "SET", "GET", "INSERT", "REMOVE", 
			"IF", "ELSE", "DO", "WHILE", "FOR", "ID", "INT", "ASSIGMENT", "DOT", 
			"COMMA", "SEMICOLON", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_FIGURE_BRACKET", 
			"RIGHT_FIGURE_BRACKET", "ADD", "SUBTRACT", "MULTIPLY", "EQUAL", "NON_EQUAL", 
			"LESS", "GREATER", "WS", "SINGLE_COMMENT", "MULTI_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Maslan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MaslanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(MaslanParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<FuncAssigmentContext> funcAssigment() {
			return getRuleContexts(FuncAssigmentContext.class);
		}
		public FuncAssigmentContext funcAssigment(int i) {
			return getRuleContext(FuncAssigmentContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VECTOR_TYPE || _la==MATRIX_TYPE) {
				{
				{
				setState(86);
				funcAssigment();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(MAIN);
			setState(93);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_FIGURE_BRACKET() { return getToken(MaslanParser.LEFT_FIGURE_BRACKET, 0); }
		public TerminalNode RIGHT_FIGURE_BRACKET() { return getToken(MaslanParser.RIGHT_FIGURE_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(LEFT_FIGURE_BRACKET);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << VECTOR_TYPE) | (1L << MATRIX_TYPE) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(96);
				content();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(102);
				returnStatement();
				}
			}

			setState(105);
			match(RIGHT_FIGURE_BRACKET);
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
		public TerminalNode RETURN() { return getToken(MaslanParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MaslanParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(RETURN);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(108);
				match(ID);
				}
			}

			setState(111);
			match(SEMICOLON);
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

	public static class FuncAssigmentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncParamsContext funcParams() {
			return getRuleContext(FuncParamsContext.class,0);
		}
		public FuncAssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcAssigment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitFuncAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncAssigmentContext funcAssigment() throws RecognitionException {
		FuncAssigmentContext _localctx = new FuncAssigmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcAssigment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			type();
			setState(114);
			match(ID);
			setState(115);
			match(LEFT_BRACKET);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VECTOR_TYPE || _la==MATRIX_TYPE) {
				{
				setState(116);
				funcParams();
				}
			}

			setState(119);
			match(RIGHT_BRACKET);
			setState(120);
			block();
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

	public static class FuncParamsContext extends ParserRuleContext {
		public List<FuncParamContext> funcParam() {
			return getRuleContexts(FuncParamContext.class);
		}
		public FuncParamContext funcParam(int i) {
			return getRuleContext(FuncParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MaslanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MaslanParser.COMMA, i);
		}
		public FuncParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitFuncParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamsContext funcParams() throws RecognitionException {
		FuncParamsContext _localctx = new FuncParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			funcParam();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				funcParam();
				}
				}
				setState(129);
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

	public static class FuncParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public FuncParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitFuncParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamContext funcParam() throws RecognitionException {
		FuncParamContext _localctx = new FuncParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			type();
			setState(131);
			match(ID);
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ID);
			setState(134);
			match(LEFT_BRACKET);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(135);
				funcArgs();
				}
			}

			setState(138);
			match(RIGHT_BRACKET);
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

	public static class FuncArgsContext extends ParserRuleContext {
		public List<FuncArgContext> funcArg() {
			return getRuleContexts(FuncArgContext.class);
		}
		public FuncArgContext funcArg(int i) {
			return getRuleContext(FuncArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MaslanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MaslanParser.COMMA, i);
		}
		public FuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitFuncArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgsContext funcArgs() throws RecognitionException {
		FuncArgsContext _localctx = new FuncArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			funcArg();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(141);
				match(COMMA);
				setState(142);
				funcArg();
				}
				}
				setState(147);
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

	public static class FuncArgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public FuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitFuncArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgContext funcArg() throws RecognitionException {
		FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ID);
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

	public static class PrintFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode DOT() { return getToken(MaslanParser.DOT, 0); }
		public TerminalNode PRINT() { return getToken(MaslanParser.PRINT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public PrintFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitPrintFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintFuncContext printFunc() throws RecognitionException {
		PrintFuncContext _localctx = new PrintFuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ID);
			setState(151);
			match(DOT);
			setState(152);
			match(PRINT);
			setState(153);
			match(LEFT_BRACKET);
			setState(154);
			match(RIGHT_BRACKET);
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

	public static class GetFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode DOT() { return getToken(MaslanParser.DOT, 0); }
		public TerminalNode GET() { return getToken(MaslanParser.GET, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public List<FuncArgContext> funcArg() {
			return getRuleContexts(FuncArgContext.class);
		}
		public FuncArgContext funcArg(int i) {
			return getRuleContext(FuncArgContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(MaslanParser.COMMA, 0); }
		public GetFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitGetFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetFuncContext getFunc() throws RecognitionException {
		GetFuncContext _localctx = new GetFuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_getFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(DOT);
			setState(158);
			match(GET);
			setState(159);
			match(LEFT_BRACKET);
			setState(160);
			funcArg();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(161);
				match(COMMA);
				setState(162);
				funcArg();
				}
			}

			setState(165);
			match(RIGHT_BRACKET);
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

	public static class SetFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode DOT() { return getToken(MaslanParser.DOT, 0); }
		public TerminalNode SET() { return getToken(MaslanParser.SET, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public List<FuncArgContext> funcArg() {
			return getRuleContexts(FuncArgContext.class);
		}
		public FuncArgContext funcArg(int i) {
			return getRuleContext(FuncArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MaslanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MaslanParser.COMMA, i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public SetFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitSetFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetFuncContext setFunc() throws RecognitionException {
		SetFuncContext _localctx = new SetFuncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(DOT);
			setState(169);
			match(SET);
			setState(170);
			match(LEFT_BRACKET);
			setState(171);
			funcArg();
			setState(172);
			match(COMMA);
			setState(173);
			funcArg();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(174);
				match(COMMA);
				setState(175);
				funcArg();
				}
			}

			setState(178);
			match(RIGHT_BRACKET);
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

	public static class LenFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode DOT() { return getToken(MaslanParser.DOT, 0); }
		public TerminalNode LEN() { return getToken(MaslanParser.LEN, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public LenFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lenFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitLenFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenFuncContext lenFunc() throws RecognitionException {
		LenFuncContext _localctx = new LenFuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lenFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(DOT);
			setState(182);
			match(LEN);
			setState(183);
			match(LEFT_BRACKET);
			setState(184);
			match(RIGHT_BRACKET);
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

	public static class NcolFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode DOT() { return getToken(MaslanParser.DOT, 0); }
		public TerminalNode NCOL() { return getToken(MaslanParser.NCOL, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public NcolFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ncolFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitNcolFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NcolFuncContext ncolFunc() throws RecognitionException {
		NcolFuncContext _localctx = new NcolFuncContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ncolFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ID);
			setState(187);
			match(DOT);
			setState(188);
			match(NCOL);
			setState(189);
			match(LEFT_BRACKET);
			setState(190);
			match(RIGHT_BRACKET);
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

	public static class NrowFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode DOT() { return getToken(MaslanParser.DOT, 0); }
		public TerminalNode NROW() { return getToken(MaslanParser.NROW, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public NrowFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nrowFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitNrowFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NrowFuncContext nrowFunc() throws RecognitionException {
		NrowFuncContext _localctx = new NrowFuncContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nrowFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
			setState(193);
			match(DOT);
			setState(194);
			match(NROW);
			setState(195);
			match(LEFT_BRACKET);
			setState(196);
			match(RIGHT_BRACKET);
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

	public static class InsertFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode DOT() { return getToken(MaslanParser.DOT, 0); }
		public TerminalNode INSERT() { return getToken(MaslanParser.INSERT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public FuncArgContext funcArg() {
			return getRuleContext(FuncArgContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public InsertFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitInsertFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertFuncContext insertFunc() throws RecognitionException {
		InsertFuncContext _localctx = new InsertFuncContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_insertFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			setState(199);
			match(DOT);
			setState(200);
			match(INSERT);
			setState(201);
			match(LEFT_BRACKET);
			setState(202);
			funcArg();
			setState(203);
			match(RIGHT_BRACKET);
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

	public static class RemoveFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode DOT() { return getToken(MaslanParser.DOT, 0); }
		public TerminalNode REMOVE() { return getToken(MaslanParser.REMOVE, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public RemoveFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitRemoveFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveFuncContext removeFunc() throws RecognitionException {
		RemoveFuncContext _localctx = new RemoveFuncContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_removeFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
			setState(206);
			match(DOT);
			setState(207);
			match(REMOVE);
			setState(208);
			match(LEFT_BRACKET);
			setState(209);
			match(RIGHT_BRACKET);
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

	public static class AddingOperContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MaslanParser.ADD, 0); }
		public List<TerminalNode> ID() { return getTokens(MaslanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MaslanParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(MaslanParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MaslanParser.INT, i);
		}
		public AddingOperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addingOper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitAddingOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddingOperContext addingOper() throws RecognitionException {
		AddingOperContext _localctx = new AddingOperContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addingOper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(212);
			match(ADD);
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SubtractingOperContext extends ParserRuleContext {
		public TerminalNode SUBTRACT() { return getToken(MaslanParser.SUBTRACT, 0); }
		public List<TerminalNode> ID() { return getTokens(MaslanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MaslanParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(MaslanParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MaslanParser.INT, i);
		}
		public SubtractingOperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtractingOper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitSubtractingOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtractingOperContext subtractingOper() throws RecognitionException {
		SubtractingOperContext _localctx = new SubtractingOperContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_subtractingOper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(216);
			match(SUBTRACT);
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MultiplyingOperContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(MaslanParser.MULTIPLY, 0); }
		public List<TerminalNode> ID() { return getTokens(MaslanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MaslanParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(MaslanParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MaslanParser.INT, i);
		}
		public MultiplyingOperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingOper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitMultiplyingOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingOperContext multiplyingOper() throws RecognitionException {
		MultiplyingOperContext _localctx = new MultiplyingOperContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplyingOper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(220);
			match(MULTIPLY);
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VECTOR_TYPE() { return getToken(MaslanParser.VECTOR_TYPE, 0); }
		public TerminalNode MATRIX_TYPE() { return getToken(MaslanParser.MATRIX_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==VECTOR_TYPE || _la==MATRIX_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(MaslanParser.SEMICOLON, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			type();
			setState(226);
			match(ID);
			setState(227);
			match(SEMICOLON);
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
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode ASSIGMENT() { return getToken(MaslanParser.ASSIGMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MaslanParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VECTOR_TYPE || _la==MATRIX_TYPE) {
				{
				setState(229);
				type();
				}
			}

			setState(232);
			match(ID);
			setState(233);
			match(ASSIGMENT);
			setState(234);
			expression();
			setState(235);
			match(SEMICOLON);
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

	public static class IntAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode ASSIGMENT() { return getToken(MaslanParser.ASSIGMENT, 0); }
		public TerminalNode INT() { return getToken(MaslanParser.INT, 0); }
		public TerminalNode SEMICOLON() { return getToken(MaslanParser.SEMICOLON, 0); }
		public TerminalNode INT_TYPE() { return getToken(MaslanParser.INT_TYPE, 0); }
		public IntAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitIntAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntAssignmentContext intAssignment() throws RecognitionException {
		IntAssignmentContext _localctx = new IntAssignmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_intAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE) {
				{
				setState(237);
				match(INT_TYPE);
				}
			}

			setState(240);
			match(ID);
			setState(241);
			match(ASSIGMENT);
			setState(242);
			match(INT);
			setState(243);
			match(SEMICOLON);
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

	public static class SetLineContext extends ParserRuleContext {
		public TerminalNode LEFT_FIGURE_BRACKET() { return getToken(MaslanParser.LEFT_FIGURE_BRACKET, 0); }
		public List<TerminalNode> INT() { return getTokens(MaslanParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MaslanParser.INT, i);
		}
		public TerminalNode RIGHT_FIGURE_BRACKET() { return getToken(MaslanParser.RIGHT_FIGURE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MaslanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MaslanParser.COMMA, i);
		}
		public SetLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setLine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitSetLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetLineContext setLine() throws RecognitionException {
		SetLineContext _localctx = new SetLineContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_setLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(LEFT_FIGURE_BRACKET);
			setState(246);
			match(INT);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247);
				match(COMMA);
				setState(248);
				match(INT);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(RIGHT_FIGURE_BRACKET);
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

	public static class VectorAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode ASSIGMENT() { return getToken(MaslanParser.ASSIGMENT, 0); }
		public SetLineContext setLine() {
			return getRuleContext(SetLineContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MaslanParser.SEMICOLON, 0); }
		public TerminalNode VECTOR_TYPE() { return getToken(MaslanParser.VECTOR_TYPE, 0); }
		public VectorAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitVectorAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorAssignmentContext vectorAssignment() throws RecognitionException {
		VectorAssignmentContext _localctx = new VectorAssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_vectorAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VECTOR_TYPE) {
				{
				setState(256);
				match(VECTOR_TYPE);
				}
			}

			setState(259);
			match(ID);
			setState(260);
			match(ASSIGMENT);
			setState(261);
			setLine();
			setState(262);
			match(SEMICOLON);
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

	public static class SetLinesContext extends ParserRuleContext {
		public TerminalNode LEFT_FIGURE_BRACKET() { return getToken(MaslanParser.LEFT_FIGURE_BRACKET, 0); }
		public List<SetLineContext> setLine() {
			return getRuleContexts(SetLineContext.class);
		}
		public SetLineContext setLine(int i) {
			return getRuleContext(SetLineContext.class,i);
		}
		public TerminalNode RIGHT_FIGURE_BRACKET() { return getToken(MaslanParser.RIGHT_FIGURE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MaslanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MaslanParser.COMMA, i);
		}
		public SetLinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setLines; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitSetLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetLinesContext setLines() throws RecognitionException {
		SetLinesContext _localctx = new SetLinesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_setLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LEFT_FIGURE_BRACKET);
			setState(265);
			setLine();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				setLine();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(RIGHT_FIGURE_BRACKET);
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

	public static class MatrixAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode ASSIGMENT() { return getToken(MaslanParser.ASSIGMENT, 0); }
		public SetLinesContext setLines() {
			return getRuleContext(SetLinesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MaslanParser.SEMICOLON, 0); }
		public TerminalNode MATRIX_TYPE() { return getToken(MaslanParser.MATRIX_TYPE, 0); }
		public MatrixAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitMatrixAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixAssignmentContext matrixAssignment() throws RecognitionException {
		MatrixAssignmentContext _localctx = new MatrixAssignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_matrixAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MATRIX_TYPE) {
				{
				setState(275);
				match(MATRIX_TYPE);
				}
			}

			setState(278);
			match(ID);
			setState(279);
			match(ASSIGMENT);
			setState(280);
			setLines();
			setState(281);
			match(SEMICOLON);
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
		public AddingOperContext addingOper() {
			return getRuleContext(AddingOperContext.class,0);
		}
		public SubtractingOperContext subtractingOper() {
			return getRuleContext(SubtractingOperContext.class,0);
		}
		public MultiplyingOperContext multiplyingOper() {
			return getRuleContext(MultiplyingOperContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				addingOper();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				subtractingOper();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				multiplyingOper();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				funcCall();
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

	public static class CompOperContext extends ParserRuleContext {
		public List<CompOperandContext> compOperand() {
			return getRuleContexts(CompOperandContext.class);
		}
		public CompOperandContext compOperand(int i) {
			return getRuleContext(CompOperandContext.class,i);
		}
		public CompOperatorContext compOperator() {
			return getRuleContext(CompOperatorContext.class,0);
		}
		public CompOperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitCompOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOperContext compOper() throws RecognitionException {
		CompOperContext _localctx = new CompOperContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_compOper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			compOperand();
			setState(290);
			compOperator();
			setState(291);
			compOperand();
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

	public static class CompOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(MaslanParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(MaslanParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(MaslanParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(MaslanParser.GREATER, 0); }
		public CompOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitCompOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOperatorContext compOperator() throws RecognitionException {
		CompOperatorContext _localctx = new CompOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_compOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << GREATER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CompOperandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode INT() { return getToken(MaslanParser.INT, 0); }
		public GetFuncContext getFunc() {
			return getRuleContext(GetFuncContext.class,0);
		}
		public LenFuncContext lenFunc() {
			return getRuleContext(LenFuncContext.class,0);
		}
		public NcolFuncContext ncolFunc() {
			return getRuleContext(NcolFuncContext.class,0);
		}
		public NrowFuncContext nrowFunc() {
			return getRuleContext(NrowFuncContext.class,0);
		}
		public RemoveFuncContext removeFunc() {
			return getRuleContext(RemoveFuncContext.class,0);
		}
		public CompOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOperand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitCompOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOperandContext compOperand() throws RecognitionException {
		CompOperandContext _localctx = new CompOperandContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compOperand);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				getFunc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				lenFunc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				ncolFunc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				nrowFunc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				removeFunc();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MaslanParser.IF, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public CompOperContext compOper() {
			return getRuleContext(CompOperContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IF);
			setState(305);
			match(LEFT_BRACKET);
			setState(306);
			compOper();
			setState(307);
			match(RIGHT_BRACKET);
			setState(308);
			block();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MaslanParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ELSE);
			setState(311);
			block();
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

	public static class CondOperatorContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public CondOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitCondOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondOperatorContext condOperator() throws RecognitionException {
		CondOperatorContext _localctx = new CondOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_condOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			ifStatement();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(314);
				elseStatement();
				}
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

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(MaslanParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(DO);
			setState(318);
			block();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MaslanParser.WHILE, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public CompOperContext compOper() {
			return getRuleContext(CompOperContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(WHILE);
			setState(321);
			match(LEFT_BRACKET);
			setState(322);
			compOper();
			setState(323);
			match(RIGHT_BRACKET);
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

	public static class WhileOperatorContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitWhileOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileOperatorContext whileOperator() throws RecognitionException {
		WhileOperatorContext _localctx = new WhileOperatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_whileOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			whileStatement();
			setState(326);
			block();
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

	public static class DoWhileOperatorContext extends ParserRuleContext {
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MaslanParser.SEMICOLON, 0); }
		public DoWhileOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitDoWhileOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileOperatorContext doWhileOperator() throws RecognitionException {
		DoWhileOperatorContext _localctx = new DoWhileOperatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_doWhileOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			doStatement();
			setState(329);
			whileStatement();
			setState(330);
			match(SEMICOLON);
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

	public static class ForOperatorContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MaslanParser.FOR, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MaslanParser.LEFT_BRACKET, 0); }
		public IntAssignmentContext intAssignment() {
			return getRuleContext(IntAssignmentContext.class,0);
		}
		public CompOperContext compOper() {
			return getRuleContext(CompOperContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MaslanParser.SEMICOLON, 0); }
		public IterActionContext iterAction() {
			return getRuleContext(IterActionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MaslanParser.RIGHT_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitForOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForOperatorContext forOperator() throws RecognitionException {
		ForOperatorContext _localctx = new ForOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(FOR);
			setState(333);
			match(LEFT_BRACKET);
			setState(334);
			intAssignment();
			setState(335);
			compOper();
			setState(336);
			match(SEMICOLON);
			setState(337);
			iterAction();
			setState(338);
			match(RIGHT_BRACKET);
			setState(339);
			block();
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

	public static class IterActionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MaslanParser.ID, 0); }
		public TerminalNode ASSIGMENT() { return getToken(MaslanParser.ASSIGMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IterActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterAction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitIterAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterActionContext iterAction() throws RecognitionException {
		IterActionContext _localctx = new IterActionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_iterAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(ID);
			setState(342);
			match(ASSIGMENT);
			setState(343);
			expression();
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

	public static class ContentContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public IntAssignmentContext intAssignment() {
			return getRuleContext(IntAssignmentContext.class,0);
		}
		public VectorAssignmentContext vectorAssignment() {
			return getRuleContext(VectorAssignmentContext.class,0);
		}
		public MatrixAssignmentContext matrixAssignment() {
			return getRuleContext(MatrixAssignmentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CondOperatorContext condOperator() {
			return getRuleContext(CondOperatorContext.class,0);
		}
		public WhileOperatorContext whileOperator() {
			return getRuleContext(WhileOperatorContext.class,0);
		}
		public DoWhileOperatorContext doWhileOperator() {
			return getRuleContext(DoWhileOperatorContext.class,0);
		}
		public ForOperatorContext forOperator() {
			return getRuleContext(ForOperatorContext.class,0);
		}
		public FuncCallStatementContext funcCallStatement() {
			return getRuleContext(FuncCallStatementContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_content);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				intAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				vectorAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				matrixAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
				condOperator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(351);
				whileOperator();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(352);
				doWhileOperator();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(353);
				forOperator();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(354);
				funcCallStatement();
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

	public static class FuncCallStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MaslanParser.SEMICOLON, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public PrintFuncContext printFunc() {
			return getRuleContext(PrintFuncContext.class,0);
		}
		public SetFuncContext setFunc() {
			return getRuleContext(SetFuncContext.class,0);
		}
		public InsertFuncContext insertFunc() {
			return getRuleContext(InsertFuncContext.class,0);
		}
		public RemoveFuncContext removeFunc() {
			return getRuleContext(RemoveFuncContext.class,0);
		}
		public FuncCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaslanVisitor ) return ((MaslanVisitor<? extends T>)visitor).visitFuncCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallStatementContext funcCallStatement() throws RecognitionException {
		FuncCallStatementContext _localctx = new FuncCallStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_funcCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(357);
				funcCall();
				}
				break;
			case 2:
				{
				setState(358);
				printFunc();
				}
				break;
			case 3:
				{
				setState(359);
				setFunc();
				}
				break;
			case 4:
				{
				setState(360);
				insertFunc();
				}
				break;
			case 5:
				{
				setState(361);
				removeFunc();
				}
				break;
			}
			setState(364);
			match(SEMICOLON);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0171\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\3\3\3\3\7\3d\n\3\f\3\16\3"+
		"g\13\3\3\3\5\3j\n\3\3\3\3\3\3\4\3\4\5\4p\n\4\3\4\3\4\3\5\3\5\3\5\3\5\5"+
		"\5x\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6\u0083\13\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\5\b\u008b\n\b\3\b\3\b\3\t\3\t\3\t\7\t\u0092\n\t\f"+
		"\t\16\t\u0095\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00b3\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\5\30"+
		"\u00e9\n\30\3\30\3\30\3\30\3\30\3\30\3\31\5\31\u00f1\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00fc\n\32\f\32\16\32\u00ff\13"+
		"\32\3\32\3\32\3\33\5\33\u0104\n\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\7\34\u010f\n\34\f\34\16\34\u0112\13\34\3\34\3\34\3\35\5\35"+
		"\u0117\n\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0122\n"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u0131\n!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\5$\u013e\n$\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\5+\u0166\n+\3,\3,\3,\3,\3,\5,\u016d\n,\3,\3,\3"+
		",\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTV\2\5\3\2\26\27\3\2\5\6\3\2#&\2\u016c\2[\3\2\2\2\4a\3\2\2"+
		"\2\6m\3\2\2\2\bs\3\2\2\2\n|\3\2\2\2\f\u0084\3\2\2\2\16\u0087\3\2\2\2\20"+
		"\u008e\3\2\2\2\22\u0096\3\2\2\2\24\u0098\3\2\2\2\26\u009e\3\2\2\2\30\u00a9"+
		"\3\2\2\2\32\u00b6\3\2\2\2\34\u00bc\3\2\2\2\36\u00c2\3\2\2\2 \u00c8\3\2"+
		"\2\2\"\u00cf\3\2\2\2$\u00d5\3\2\2\2&\u00d9\3\2\2\2(\u00dd\3\2\2\2*\u00e1"+
		"\3\2\2\2,\u00e3\3\2\2\2.\u00e8\3\2\2\2\60\u00f0\3\2\2\2\62\u00f7\3\2\2"+
		"\2\64\u0103\3\2\2\2\66\u010a\3\2\2\28\u0116\3\2\2\2:\u0121\3\2\2\2<\u0123"+
		"\3\2\2\2>\u0127\3\2\2\2@\u0130\3\2\2\2B\u0132\3\2\2\2D\u0138\3\2\2\2F"+
		"\u013b\3\2\2\2H\u013f\3\2\2\2J\u0142\3\2\2\2L\u0147\3\2\2\2N\u014a\3\2"+
		"\2\2P\u014e\3\2\2\2R\u0157\3\2\2\2T\u0165\3\2\2\2V\u016c\3\2\2\2XZ\5\b"+
		"\5\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7"+
		"\b\2\2_`\5\4\3\2`\3\3\2\2\2ae\7\36\2\2bd\5T+\2cb\3\2\2\2dg\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hj\5\6\4\2ih\3\2\2\2ij\3\2\2\2jk\3"+
		"\2\2\2kl\7\37\2\2l\5\3\2\2\2mo\7\7\2\2np\7\26\2\2on\3\2\2\2op\3\2\2\2"+
		"pq\3\2\2\2qr\7\33\2\2r\7\3\2\2\2st\5*\26\2tu\7\26\2\2uw\7\34\2\2vx\5\n"+
		"\6\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\35\2\2z{\5\4\3\2{\t\3\2\2\2|\u0081"+
		"\5\f\7\2}~\7\32\2\2~\u0080\5\f\7\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\13\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0084\u0085\5*\26\2\u0085\u0086\7\26\2\2\u0086\r\3\2\2\2\u0087\u0088"+
		"\7\26\2\2\u0088\u008a\7\34\2\2\u0089\u008b\5\20\t\2\u008a\u0089\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\35\2\2\u008d"+
		"\17\3\2\2\2\u008e\u0093\5\22\n\2\u008f\u0090\7\32\2\2\u0090\u0092\5\22"+
		"\n\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\21\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\26\2"+
		"\2\u0097\23\3\2\2\2\u0098\u0099\7\26\2\2\u0099\u009a\7\31\2\2\u009a\u009b"+
		"\7\t\2\2\u009b\u009c\7\34\2\2\u009c\u009d\7\35\2\2\u009d\25\3\2\2\2\u009e"+
		"\u009f\7\26\2\2\u009f\u00a0\7\31\2\2\u00a0\u00a1\7\16\2\2\u00a1\u00a2"+
		"\7\34\2\2\u00a2\u00a5\5\22\n\2\u00a3\u00a4\7\32\2\2\u00a4\u00a6\5\22\n"+
		"\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\7\35\2\2\u00a8\27\3\2\2\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\7\31\2\2\u00ab"+
		"\u00ac\7\r\2\2\u00ac\u00ad\7\34\2\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\7"+
		"\32\2\2\u00af\u00b2\5\22\n\2\u00b0\u00b1\7\32\2\2\u00b1\u00b3\5\22\n\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\7\35\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8\7\31\2\2\u00b8"+
		"\u00b9\7\n\2\2\u00b9\u00ba\7\34\2\2\u00ba\u00bb\7\35\2\2\u00bb\33\3\2"+
		"\2\2\u00bc\u00bd\7\26\2\2\u00bd\u00be\7\31\2\2\u00be\u00bf\7\13\2\2\u00bf"+
		"\u00c0\7\34\2\2\u00c0\u00c1\7\35\2\2\u00c1\35\3\2\2\2\u00c2\u00c3\7\26"+
		"\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\7\34\2\2\u00c6"+
		"\u00c7\7\35\2\2\u00c7\37\3\2\2\2\u00c8\u00c9\7\26\2\2\u00c9\u00ca\7\31"+
		"\2\2\u00ca\u00cb\7\17\2\2\u00cb\u00cc\7\34\2\2\u00cc\u00cd\5\22\n\2\u00cd"+
		"\u00ce\7\35\2\2\u00ce!\3\2\2\2\u00cf\u00d0\7\26\2\2\u00d0\u00d1\7\31\2"+
		"\2\u00d1\u00d2\7\20\2\2\u00d2\u00d3\7\34\2\2\u00d3\u00d4\7\35\2\2\u00d4"+
		"#\3\2\2\2\u00d5\u00d6\t\2\2\2\u00d6\u00d7\7 \2\2\u00d7\u00d8\t\2\2\2\u00d8"+
		"%\3\2\2\2\u00d9\u00da\t\2\2\2\u00da\u00db\7!\2\2\u00db\u00dc\t\2\2\2\u00dc"+
		"\'\3\2\2\2\u00dd\u00de\t\2\2\2\u00de\u00df\7\"\2\2\u00df\u00e0\t\2\2\2"+
		"\u00e0)\3\2\2\2\u00e1\u00e2\t\3\2\2\u00e2+\3\2\2\2\u00e3\u00e4\5*\26\2"+
		"\u00e4\u00e5\7\26\2\2\u00e5\u00e6\7\33\2\2\u00e6-\3\2\2\2\u00e7\u00e9"+
		"\5*\26\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\7\26\2\2\u00eb\u00ec\7\30\2\2\u00ec\u00ed\5:\36\2\u00ed\u00ee\7"+
		"\33\2\2\u00ee/\3\2\2\2\u00ef\u00f1\7\4\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\26\2\2\u00f3\u00f4\7\30\2\2"+
		"\u00f4\u00f5\7\27\2\2\u00f5\u00f6\7\33\2\2\u00f6\61\3\2\2\2\u00f7\u00f8"+
		"\7\36\2\2\u00f8\u00fd\7\27\2\2\u00f9\u00fa\7\32\2\2\u00fa\u00fc\7\27\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\37\2\2"+
		"\u0101\63\3\2\2\2\u0102\u0104\7\5\2\2\u0103\u0102\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\26\2\2\u0106\u0107\7\30\2\2"+
		"\u0107\u0108\5\62\32\2\u0108\u0109\7\33\2\2\u0109\65\3\2\2\2\u010a\u010b"+
		"\7\36\2\2\u010b\u0110\5\62\32\2\u010c\u010d\7\32\2\2\u010d\u010f\5\62"+
		"\32\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\37"+
		"\2\2\u0114\67\3\2\2\2\u0115\u0117\7\6\2\2\u0116\u0115\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\26\2\2\u0119\u011a\7\30\2\2"+
		"\u011a\u011b\5\66\34\2\u011b\u011c\7\33\2\2\u011c9\3\2\2\2\u011d\u0122"+
		"\5$\23\2\u011e\u0122\5&\24\2\u011f\u0122\5(\25\2\u0120\u0122\5\16\b\2"+
		"\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120"+
		"\3\2\2\2\u0122;\3\2\2\2\u0123\u0124\5@!\2\u0124\u0125\5> \2\u0125\u0126"+
		"\5@!\2\u0126=\3\2\2\2\u0127\u0128\t\4\2\2\u0128?\3\2\2\2\u0129\u0131\7"+
		"\26\2\2\u012a\u0131\7\27\2\2\u012b\u0131\5\26\f\2\u012c\u0131\5\32\16"+
		"\2\u012d\u0131\5\34\17\2\u012e\u0131\5\36\20\2\u012f\u0131\5\"\22\2\u0130"+
		"\u0129\3\2\2\2\u0130\u012a\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2"+
		"\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"A\3\2\2\2\u0132\u0133\7\21\2\2\u0133\u0134\7\34\2\2\u0134\u0135\5<\37"+
		"\2\u0135\u0136\7\35\2\2\u0136\u0137\5\4\3\2\u0137C\3\2\2\2\u0138\u0139"+
		"\7\22\2\2\u0139\u013a\5\4\3\2\u013aE\3\2\2\2\u013b\u013d\5B\"\2\u013c"+
		"\u013e\5D#\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013eG\3\2\2\2\u013f"+
		"\u0140\7\23\2\2\u0140\u0141\5\4\3\2\u0141I\3\2\2\2\u0142\u0143\7\24\2"+
		"\2\u0143\u0144\7\34\2\2\u0144\u0145\5<\37\2\u0145\u0146\7\35\2\2\u0146"+
		"K\3\2\2\2\u0147\u0148\5J&\2\u0148\u0149\5\4\3\2\u0149M\3\2\2\2\u014a\u014b"+
		"\5H%\2\u014b\u014c\5J&\2\u014c\u014d\7\33\2\2\u014dO\3\2\2\2\u014e\u014f"+
		"\7\25\2\2\u014f\u0150\7\34\2\2\u0150\u0151\5\60\31\2\u0151\u0152\5<\37"+
		"\2\u0152\u0153\7\33\2\2\u0153\u0154\5R*\2\u0154\u0155\7\35\2\2\u0155\u0156"+
		"\5\4\3\2\u0156Q\3\2\2\2\u0157\u0158\7\26\2\2\u0158\u0159\7\30\2\2\u0159"+
		"\u015a\5:\36\2\u015aS\3\2\2\2\u015b\u0166\5,\27\2\u015c\u0166\5\60\31"+
		"\2\u015d\u0166\5\64\33\2\u015e\u0166\58\35\2\u015f\u0166\5.\30\2\u0160"+
		"\u0166\5F$\2\u0161\u0166\5L\'\2\u0162\u0166\5N(\2\u0163\u0166\5P)\2\u0164"+
		"\u0166\5V,\2\u0165\u015b\3\2\2\2\u0165\u015c\3\2\2\2\u0165\u015d\3\2\2"+
		"\2\u0165\u015e\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0160\3\2\2\2\u0165\u0161"+
		"\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166"+
		"U\3\2\2\2\u0167\u016d\5\16\b\2\u0168\u016d\5\24\13\2\u0169\u016d\5\30"+
		"\r\2\u016a\u016d\5 \21\2\u016b\u016d\5\"\22\2\u016c\u0167\3\2\2\2\u016c"+
		"\u0168\3\2\2\2\u016c\u0169\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7\33\2\2\u016fW\3\2\2\2\27[eiow\u0081"+
		"\u008a\u0093\u00a5\u00b2\u00e8\u00f0\u00fd\u0103\u0110\u0116\u0121\u0130"+
		"\u013d\u0165\u016c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}