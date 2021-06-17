// This is a generated file. Not intended for manual editing.
package com.github.andrewedstrom.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.andrewedstrom.Pico8Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.andrewedstrom.psi.*;

public class Pico8PrefixexpImpl extends ASTWrapperPsiElement implements Pico8Prefixexp {

  public Pico8PrefixexpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Pico8Visitor visitor) {
    visitor.visitPrefixexp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Pico8Visitor) accept((Pico8Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Pico8Exp getExp() {
    return findChildByClass(Pico8Exp.class);
  }

  @Override
  @Nullable
  public Pico8Functioncall getFunctioncall() {
    return findChildByClass(Pico8Functioncall.class);
  }

  @Override
  @Nullable
  public Pico8Var getVar() {
    return findChildByClass(Pico8Var.class);
  }

}
