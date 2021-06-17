package com.github.andrewedstrom;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.andrewedstrom.Pico8Types.*;

%%

%{
  public _Pico8Lexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _Pico8Lexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+


%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "break"            { return BREAK; }
  "goto"             { return GOTO; }
  "Name"             { return NAME; }
  "do"               { return DO; }
  "end"              { return END; }
  "while"            { return WHILE; }
  "repeat"           { return REPEAT; }
  "until"            { return UNTIL; }
  "if"               { return IF; }
  "then"             { return THEN; }
  "elseif"           { return ELSEIF; }
  "else"             { return ELSE; }
  "for"              { return FOR; }
  "in"               { return IN; }
  "function"         { return FUNCTION; }
  "local"            { return LOCAL; }
  "return"           { return RETURN; }
  "nil"              { return NIL; }
  "false"            { return FALSE; }
  "true"             { return TRUE; }
  "Number"           { return NUMBER; }
  "String"           { return STRING; }
  "and"              { return AND; }
  "or"               { return OR; }
  "not"              { return NOT; }


}

[^] { return BAD_CHARACTER; }
