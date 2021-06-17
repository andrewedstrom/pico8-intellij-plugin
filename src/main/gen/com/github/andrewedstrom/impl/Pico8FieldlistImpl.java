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

public class Pico8FieldlistImpl extends ASTWrapperPsiElement implements Pico8Fieldlist {

  public Pico8FieldlistImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Pico8Visitor visitor) {
    visitor.visitFieldlist(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Pico8Visitor) accept((Pico8Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Pico8Field> getFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Pico8Field.class);
  }

  @Override
  @NotNull
  public List<Pico8Fieldsep> getFieldsepList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Pico8Fieldsep.class);
  }

}
