// This is a generated file. Not intended for manual editing.
package com.github.andrewedstrom;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.andrewedstrom.Pico8Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.andrewedstrom.psi.*;

public class Pico8StatImpl extends ASTWrapperPsiElement implements Pico8Stat {

  public Pico8StatImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Pico8Visitor visitor) {
    visitor.visitStat(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Pico8Visitor) accept((Pico8Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Pico8Block getBlock() {
    return findChildByClass(Pico8Block.class);
  }

  @Override
  @Nullable
  public Pico8Exp getExp() {
    return findChildByClass(Pico8Exp.class);
  }

  @Override
  @Nullable
  public Pico8Explist getExplist() {
    return findChildByClass(Pico8Explist.class);
  }

  @Override
  @Nullable
  public Pico8Funcbody getFuncbody() {
    return findChildByClass(Pico8Funcbody.class);
  }

  @Override
  @Nullable
  public Pico8Funcname getFuncname() {
    return findChildByClass(Pico8Funcname.class);
  }

  @Override
  @Nullable
  public Pico8Functioncall getFunctioncall() {
    return findChildByClass(Pico8Functioncall.class);
  }

  @Override
  @Nullable
  public Pico8Label getLabel() {
    return findChildByClass(Pico8Label.class);
  }

  @Override
  @Nullable
  public Pico8Namelist getNamelist() {
    return findChildByClass(Pico8Namelist.class);
  }

  @Override
  @Nullable
  public Pico8Varlist getVarlist() {
    return findChildByClass(Pico8Varlist.class);
  }

}
