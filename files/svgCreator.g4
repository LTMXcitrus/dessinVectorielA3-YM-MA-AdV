grammar svgCreator;

drawing : canvas shape*
        ;

canvas  : CANVAS '(' params ')'
        ;

params  : param (',' param)*
        ;

param   : INT | COLOR
        ;

shape   : SHAPE '(' params ')'
        ;
          
SHAPE   : [A-Z][A-Z]*
        ;
    
INT     : [0-9][0-9]*
        ;

COLOR   : [a-z][a-z]*
        ;
    
CANVAS  : 'Canvas'
        ;
    
COMMENT : '//' .*? '\r'? '\n' -> skip
        ;

WS      : [ \t\n\r]+-> skip
        ;




