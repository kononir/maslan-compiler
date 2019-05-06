grammar Maslan;

// -------------------------------
fragment ID_SYMBOL: [a-zA-Z_$] ;
fragment DIGIT: [0-9] ;

// -------------------------------
VOID_TYPE: 'void' ;
INT_TYPE: 'int' ;
VECTOR_TYPE: 'vector' ;
MATRIX_TYPE: 'matrix' ;

RETURN: 'return' ;

MAIN: 'main' ;
PRINT: 'print' ;
LEN: 'len' ;
NCOL: 'ncol' ;
NROW: 'nrow' ;
SET: 'set' ;
GET: 'get' ;
INSERT: 'insert' ;
REMOVE: 'remove' ;

IF: 'if' ;
ELSE: 'else' ;

DO: 'do' ;
WHILE: 'while' ;
FOR: 'for' ;

ID: ID_SYMBOL (ID_SYMBOL|DIGIT)* ;

INT: DIGIT+ ;

ASSIGMENT: '=' ;

DOT: '.' ;
COMMA: ',' ;
SEMICOLON: ';' ;

LEFT_BRACKET: '(' ;
RIGHT_BRACKET: ')' ;
LEFT_FIGURE_BRACKET: '{' ;
RIGHT_FIGURE_BRACKET: '}' ;

ADD: '+' ;
SUBTRACT: '-' ;
MULTIPLY: '*' ;

EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
GREATER: '>';

WS: [ \t\r\n]+ -> skip ;

SINGLE_COMMENT: '//' .*? '\r'? '\n' -> skip ;
MULTI_COMMENT: '/*' .*? '*/' -> skip ;

// -------------------------------
program: funcAssigment* MAIN block ;

block: LEFT_FIGURE_BRACKET content* returnStatement? RIGHT_FIGURE_BRACKET ;
returnStatement: RETURN ID? SEMICOLON ;

funcAssigment: type ID LEFT_BRACKET funcParams? RIGHT_BRACKET block ;
funcParams: funcParam (COMMA funcParam)* ;
funcParam: type ID ;

funcCall: ID LEFT_BRACKET funcArgs? RIGHT_BRACKET ;
funcArgs: funcArg (COMMA funcArg)* ;
funcArg: ID ;

printFunc: ID DOT PRINT LEFT_BRACKET RIGHT_BRACKET ;
getFunc: ID DOT GET LEFT_BRACKET funcArg (COMMA funcArg)? RIGHT_BRACKET ;
setFunc: ID DOT SET LEFT_BRACKET funcArg COMMA funcArg (COMMA funcArg)? RIGHT_BRACKET ;
lenFunc: ID DOT LEN LEFT_BRACKET RIGHT_BRACKET ;
ncolFunc: ID DOT NCOL LEFT_BRACKET RIGHT_BRACKET ;
nrowFunc: ID DOT NROW LEFT_BRACKET RIGHT_BRACKET ;
insertFunc: ID DOT INSERT LEFT_BRACKET funcArg RIGHT_BRACKET ;
removeFunc: ID DOT REMOVE LEFT_BRACKET RIGHT_BRACKET ;

addingOper: (ID | INT) ADD (ID | INT) ;
subtractingOper: (ID | INT) SUBTRACT (ID | INT) ;
multiplyingOper: (ID | INT) MULTIPLY (ID | INT) ;

type: VECTOR_TYPE
    | MATRIX_TYPE ;

varDeclaration: type ID SEMICOLON ;
assignment: type? ID ASSIGMENT expression SEMICOLON ;

intAssignment: INT_TYPE? ID ASSIGMENT INT SEMICOLON ;
setLine: LEFT_FIGURE_BRACKET INT (COMMA INT)* RIGHT_FIGURE_BRACKET ;
vectorAssignment: VECTOR_TYPE? ID ASSIGMENT setLine SEMICOLON ;
setLines: LEFT_FIGURE_BRACKET setLine (COMMA setLine)* RIGHT_FIGURE_BRACKET ;
matrixAssignment: MATRIX_TYPE? ID ASSIGMENT setLines SEMICOLON ;

expression: addingOper
    | subtractingOper
    | multiplyingOper
    | funcCall ;

compOper: compOperand compOperator compOperand ;

compOperator: EQUAL
    | NON_EQUAL
    | LESS
    | GREATER ;
compOperand: ID
    | INT
    | getFunc
    | lenFunc
    | ncolFunc
    | nrowFunc
    | removeFunc ;

ifStatement: IF LEFT_BRACKET compOper RIGHT_BRACKET block ;
elseStatement: ELSE block ;
condOperator: ifStatement elseStatement? ;

doStatement: DO block ;
whileStatement: WHILE LEFT_BRACKET compOper RIGHT_BRACKET ;

whileOperator: whileStatement block ;
doWhileOperator: doStatement whileStatement SEMICOLON ;
forOperator: FOR LEFT_BRACKET intAssignment compOper SEMICOLON iterAction RIGHT_BRACKET block ;

iterAction: ID ASSIGMENT expression ;

content: varDeclaration
    | intAssignment
    | vectorAssignment
    | matrixAssignment
    | assignment
    | condOperator
    | whileOperator
    | doWhileOperator
    | forOperator
    | funcCallStatement ;

funcCallStatement: (
    funcCall
    | printFunc
    | setFunc
    | insertFunc
    | removeFunc
) SEMICOLON ;
