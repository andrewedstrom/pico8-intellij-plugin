// This is a generated file. Not intended for manual editing.
package com.github.andrewedstrom;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.andrewedstrom.Pico8Types.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class Pico8Parser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return chunk(b, l + 1);
  }

  /* ********************************************************** */
  // "(" [explist] ")" | tableconstructor | String
  public static boolean args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGS, "<args>");
    r = args_0(b, l + 1);
    if (!r) r = tableconstructor(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" [explist] ")"
  private static boolean args_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && args_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [explist]
  private static boolean args_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args_0_1")) return false;
    explist(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "+" | "-" | "*" | "/" | "^" | "%" | ".." |
  //      "<" | "<=" | "" | ">=" | "==" | "~=" |
  //      and | or
  public static boolean binop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINOP, "<binop>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "^");
    if (!r) r = consumeToken(b, "%");
    if (!r) r = consumeToken(b, "..");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, "");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, "~=");
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // {stat} [retstat]
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    r = block_0(b, l + 1);
    r = r && block_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {stat}
  private static boolean block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [retstat]
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    retstat(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // block
  static boolean chunk(PsiBuilder b, int l) {
    return block(b, l + 1);
  }

  /* ********************************************************** */
  // nil | false | true | Number | String | "..." | functiondef |
  //      prefixexp | tableconstructor | exp binop exp | unop exp
  public static boolean exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXP, "<exp>");
    r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, "...");
    if (!r) r = functiondef(b, l + 1);
    if (!r) r = prefixexp(b, l + 1);
    if (!r) r = tableconstructor(b, l + 1);
    if (!r) r = exp_9(b, l + 1);
    if (!r) r = exp_10(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // exp binop exp
  private static boolean exp_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exp(b, l + 1);
    r = r && binop(b, l + 1);
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // unop exp
  private static boolean exp_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unop(b, l + 1);
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // exp {"," exp}
  public static boolean explist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPLIST, "<explist>");
    r = exp(b, l + 1);
    r = r && explist_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "," exp
  private static boolean explist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explist_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "[" exp "]" "=" exp | Name "=" exp | exp
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD, "<field>");
    r = field_0(b, l + 1);
    if (!r) r = field_1(b, l + 1);
    if (!r) r = exp(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "[" exp "]" "=" exp
  private static boolean field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && consumeToken(b, "=");
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Name "=" exp
  private static boolean field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && consumeToken(b, "=");
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // field {fieldsep field} [fieldsep]
  public static boolean fieldlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldlist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELDLIST, "<fieldlist>");
    r = field(b, l + 1);
    r = r && fieldlist_1(b, l + 1);
    r = r && fieldlist_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // fieldsep field
  private static boolean fieldlist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldlist_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fieldsep(b, l + 1);
    r = r && field(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [fieldsep]
  private static boolean fieldlist_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldlist_2")) return false;
    fieldsep(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "," | ";"
  public static boolean fieldsep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fieldsep")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELDSEP, "<fieldsep>");
    r = consumeToken(b, ",");
    if (!r) r = consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "(" [parlist] ")" block end
  public static boolean funcbody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcbody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCBODY, "<funcbody>");
    r = consumeToken(b, "(");
    r = r && funcbody_1(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && block(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [parlist]
  private static boolean funcbody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcbody_1")) return false;
    parlist(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Name {"." Name} [":" Name]
  public static boolean funcname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcname")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && funcname_1(b, l + 1);
    r = r && funcname_2(b, l + 1);
    exit_section_(b, m, FUNCNAME, r);
    return r;
  }

  // "." Name
  private static boolean funcname_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcname_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // [":" Name]
  private static boolean funcname_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcname_2")) return false;
    funcname_2_0(b, l + 1);
    return true;
  }

  // ":" Name
  private static boolean funcname_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcname_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // prefixexp args | prefixexp ":" Name args
  public static boolean functioncall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functioncall")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTIONCALL, "<functioncall>");
    r = functioncall_0(b, l + 1);
    if (!r) r = functioncall_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // prefixexp args
  private static boolean functioncall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functioncall_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefixexp(b, l + 1);
    r = r && args(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // prefixexp ":" Name args
  private static boolean functioncall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functioncall_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefixexp(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, NAME);
    r = r && args(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // function funcbody
  public static boolean functiondef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functiondef")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION);
    r = r && funcbody(b, l + 1);
    exit_section_(b, m, FUNCTIONDEF, r);
    return r;
  }

  /* ********************************************************** */
  // "::" Name "::"
  public static boolean label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABEL, "<label>");
    r = consumeToken(b, "::");
    r = r && consumeToken(b, NAME);
    r = r && consumeToken(b, "::");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Name {"," Name}
  public static boolean namelist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namelist")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && namelist_1(b, l + 1);
    exit_section_(b, m, NAMELIST, r);
    return r;
  }

  // "," Name
  private static boolean namelist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namelist_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // namelist ["," "..."] | "..."
  public static boolean parlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parlist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARLIST, "<parlist>");
    r = parlist_0(b, l + 1);
    if (!r) r = consumeToken(b, "...");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // namelist ["," "..."]
  private static boolean parlist_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parlist_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namelist(b, l + 1);
    r = r && parlist_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ["," "..."]
  private static boolean parlist_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parlist_0_1")) return false;
    parlist_0_1_0(b, l + 1);
    return true;
  }

  // "," "..."
  private static boolean parlist_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parlist_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, "...");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var | functioncall | "(" exp ")"
  public static boolean prefixexp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixexp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIXEXP, "<prefixexp>");
    r = var(b, l + 1);
    if (!r) r = functioncall(b, l + 1);
    if (!r) r = prefixexp_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" exp ")"
  private static boolean prefixexp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixexp_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // return [explist] [";"]
  public static boolean retstat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "retstat")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && retstat_1(b, l + 1);
    r = r && retstat_2(b, l + 1);
    exit_section_(b, m, RETSTAT, r);
    return r;
  }

  // [explist]
  private static boolean retstat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "retstat_1")) return false;
    explist(b, l + 1);
    return true;
  }

  // [";"]
  private static boolean retstat_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "retstat_2")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // ";" |
  //      varlist "=" explist |
  //      functioncall |
  //      label |
  //      break |
  //      goto Name |
  //      do block end |
  //      while exp do block end |
  //      repeat block until exp |
  //      if exp then block {elseif exp then block} [else block] end |
  //      for Name "=" exp "," exp ["," exp] do block end |
  //      for namelist in explist do block end |
  //      function funcname funcbody |
  //      local function Name funcbody |
  //      local namelist ["=" explist]
  public static boolean stat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STAT, "<stat>");
    r = consumeToken(b, ";");
    if (!r) r = stat_1(b, l + 1);
    if (!r) r = functioncall(b, l + 1);
    if (!r) r = label(b, l + 1);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = parseTokens(b, 0, GOTO, NAME);
    if (!r) r = stat_6(b, l + 1);
    if (!r) r = stat_7(b, l + 1);
    if (!r) r = stat_8(b, l + 1);
    if (!r) r = stat_9(b, l + 1);
    if (!r) r = stat_10(b, l + 1);
    if (!r) r = stat_11(b, l + 1);
    if (!r) r = stat_12(b, l + 1);
    if (!r) r = stat_13(b, l + 1);
    if (!r) r = stat_14(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // varlist "=" explist
  private static boolean stat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = varlist(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && explist(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // do block end
  private static boolean stat_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // while exp do block end
  private static boolean stat_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, DO);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // repeat block until exp
  private static boolean stat_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REPEAT);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, UNTIL);
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // if exp then block {elseif exp then block} [else block] end
  private static boolean stat_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && block(b, l + 1);
    r = r && stat_9_4(b, l + 1);
    r = r && stat_9_5(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // elseif exp then block
  private static boolean stat_9_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_9_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSEIF);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [else block]
  private static boolean stat_9_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_9_5")) return false;
    stat_9_5_0(b, l + 1);
    return true;
  }

  // else block
  private static boolean stat_9_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_9_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // for Name "=" exp "," exp ["," exp] do block end
  private static boolean stat_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, NAME);
    r = r && consumeToken(b, "=");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && exp(b, l + 1);
    r = r && stat_10_6(b, l + 1);
    r = r && consumeToken(b, DO);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // ["," exp]
  private static boolean stat_10_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_10_6")) return false;
    stat_10_6_0(b, l + 1);
    return true;
  }

  // "," exp
  private static boolean stat_10_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_10_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // for namelist in explist do block end
  private static boolean stat_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && namelist(b, l + 1);
    r = r && consumeToken(b, IN);
    r = r && explist(b, l + 1);
    r = r && consumeToken(b, DO);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // function funcname funcbody
  private static boolean stat_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION);
    r = r && funcname(b, l + 1);
    r = r && funcbody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // local function Name funcbody
  private static boolean stat_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LOCAL, FUNCTION, NAME);
    r = r && funcbody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // local namelist ["=" explist]
  private static boolean stat_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOCAL);
    r = r && namelist(b, l + 1);
    r = r && stat_14_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ["=" explist]
  private static boolean stat_14_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_14_2")) return false;
    stat_14_2_0(b, l + 1);
    return true;
  }

  // "=" explist
  private static boolean stat_14_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_14_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && explist(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{" [fieldlist] "}"
  public static boolean tableconstructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableconstructor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLECONSTRUCTOR, "<tableconstructor>");
    r = consumeToken(b, "{");
    r = r && tableconstructor_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [fieldlist]
  private static boolean tableconstructor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableconstructor_1")) return false;
    fieldlist(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "-" | not | "#"
  public static boolean unop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNOP, "<unop>");
    r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, "#");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Name | prefixexp "[" exp "]" | prefixexp "." Name
  public static boolean var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR, "<var>");
    r = consumeToken(b, NAME);
    if (!r) r = var_1(b, l + 1);
    if (!r) r = var_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // prefixexp "[" exp "]"
  private static boolean var_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefixexp(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // prefixexp "." Name
  private static boolean var_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefixexp(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var {"," var}
  public static boolean varlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varlist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARLIST, "<varlist>");
    r = var(b, l + 1);
    r = r && varlist_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "," var
  private static boolean varlist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varlist_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && var(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
