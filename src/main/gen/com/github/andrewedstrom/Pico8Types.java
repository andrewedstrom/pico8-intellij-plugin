// This is a generated file. Not intended for manual editing.
package com.github.andrewedstrom;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.andrewedstrom.impl.*;

public interface Pico8Types {

  IElementType ARGS = new Pico8ElementType("ARGS");
  IElementType BINOP = new Pico8ElementType("BINOP");
  IElementType BLOCK = new Pico8ElementType("BLOCK");
  IElementType EXP = new Pico8ElementType("EXP");
  IElementType EXPLIST = new Pico8ElementType("EXPLIST");
  IElementType FIELD = new Pico8ElementType("FIELD");
  IElementType FIELDLIST = new Pico8ElementType("FIELDLIST");
  IElementType FIELDSEP = new Pico8ElementType("FIELDSEP");
  IElementType FUNCBODY = new Pico8ElementType("FUNCBODY");
  IElementType FUNCNAME = new Pico8ElementType("FUNCNAME");
  IElementType FUNCTIONCALL = new Pico8ElementType("FUNCTIONCALL");
  IElementType FUNCTIONDEF = new Pico8ElementType("FUNCTIONDEF");
  IElementType LABEL = new Pico8ElementType("LABEL");
  IElementType NAMELIST = new Pico8ElementType("NAMELIST");
  IElementType PARLIST = new Pico8ElementType("PARLIST");
  IElementType PREFIXEXP = new Pico8ElementType("PREFIXEXP");
  IElementType RETSTAT = new Pico8ElementType("RETSTAT");
  IElementType STAT = new Pico8ElementType("STAT");
  IElementType TABLECONSTRUCTOR = new Pico8ElementType("TABLECONSTRUCTOR");
  IElementType UNOP = new Pico8ElementType("UNOP");
  IElementType VAR = new Pico8ElementType("VAR");
  IElementType VARLIST = new Pico8ElementType("VARLIST");

  IElementType AND = new Pico8TokenType("and");
  IElementType BREAK = new Pico8TokenType("break");
  IElementType DO = new Pico8TokenType("do");
  IElementType ELSE = new Pico8TokenType("else");
  IElementType ELSEIF = new Pico8TokenType("elseif");
  IElementType END = new Pico8TokenType("end");
  IElementType FALSE = new Pico8TokenType("false");
  IElementType FOR = new Pico8TokenType("for");
  IElementType FUNCTION = new Pico8TokenType("function");
  IElementType GOTO = new Pico8TokenType("goto");
  IElementType IF = new Pico8TokenType("if");
  IElementType IN = new Pico8TokenType("in");
  IElementType LOCAL = new Pico8TokenType("local");
  IElementType NAME = new Pico8TokenType("Name");
  IElementType NIL = new Pico8TokenType("nil");
  IElementType NOT = new Pico8TokenType("not");
  IElementType NUMBER = new Pico8TokenType("Number");
  IElementType OR = new Pico8TokenType("or");
  IElementType REPEAT = new Pico8TokenType("repeat");
  IElementType RETURN = new Pico8TokenType("return");
  IElementType STRING = new Pico8TokenType("String");
  IElementType THEN = new Pico8TokenType("then");
  IElementType TRUE = new Pico8TokenType("true");
  IElementType UNTIL = new Pico8TokenType("until");
  IElementType WHILE = new Pico8TokenType("while");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGS) {
        return new Pico8ArgsImpl(node);
      }
      else if (type == BINOP) {
        return new Pico8BinopImpl(node);
      }
      else if (type == BLOCK) {
        return new Pico8BlockImpl(node);
      }
      else if (type == EXP) {
        return new Pico8ExpImpl(node);
      }
      else if (type == EXPLIST) {
        return new Pico8ExplistImpl(node);
      }
      else if (type == FIELD) {
        return new Pico8FieldImpl(node);
      }
      else if (type == FIELDLIST) {
        return new Pico8FieldlistImpl(node);
      }
      else if (type == FIELDSEP) {
        return new Pico8FieldsepImpl(node);
      }
      else if (type == FUNCBODY) {
        return new Pico8FuncbodyImpl(node);
      }
      else if (type == FUNCNAME) {
        return new Pico8FuncnameImpl(node);
      }
      else if (type == FUNCTIONCALL) {
        return new Pico8FunctioncallImpl(node);
      }
      else if (type == FUNCTIONDEF) {
        return new Pico8FunctiondefImpl(node);
      }
      else if (type == LABEL) {
        return new Pico8LabelImpl(node);
      }
      else if (type == NAMELIST) {
        return new Pico8NamelistImpl(node);
      }
      else if (type == PARLIST) {
        return new Pico8ParlistImpl(node);
      }
      else if (type == PREFIXEXP) {
        return new Pico8PrefixexpImpl(node);
      }
      else if (type == RETSTAT) {
        return new Pico8RetstatImpl(node);
      }
      else if (type == STAT) {
        return new Pico8StatImpl(node);
      }
      else if (type == TABLECONSTRUCTOR) {
        return new Pico8TableconstructorImpl(node);
      }
      else if (type == UNOP) {
        return new Pico8UnopImpl(node);
      }
      else if (type == VAR) {
        return new Pico8VarImpl(node);
      }
      else if (type == VARLIST) {
        return new Pico8VarlistImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
