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

public class Pico8ExpImpl extends ASTWrapperPsiElement implements Pico8Exp {

  public Pico8ExpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Pico8Visitor visitor) {
    visitor.visitExp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Pico8Visitor) accept((Pico8Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Pico8Binop getBinop() {
    return findChildByClass(Pico8Binop.class);
  }

  @Override
  @NotNull
  public List<Pico8Exp> getExpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Pico8Exp.class);
  }

  @Override
  @Nullable
  public Pico8Functiondef getFunctiondef() {
    return findChildByClass(Pico8Functiondef.class);
  }

  @Override
  @Nullable
  public Pico8Prefixexp getPrefixexp() {
    return findChildByClass(Pico8Prefixexp.class);
  }

  @Override
  @Nullable
  public Pico8Tableconstructor getTableconstructor() {
    return findChildByClass(Pico8Tableconstructor.class);
  }

  @Override
  @Nullable
  public Pico8Unop getUnop() {
    return findChildByClass(Pico8Unop.class);
  }

}
