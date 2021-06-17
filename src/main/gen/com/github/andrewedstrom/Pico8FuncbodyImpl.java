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

public class Pico8FuncbodyImpl extends ASTWrapperPsiElement implements Pico8Funcbody {

  public Pico8FuncbodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Pico8Visitor visitor) {
    visitor.visitFuncbody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Pico8Visitor) accept((Pico8Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public Pico8Block getBlock() {
    return findNotNullChildByClass(Pico8Block.class);
  }

  @Override
  @Nullable
  public Pico8Parlist getParlist() {
    return findChildByClass(Pico8Parlist.class);
  }

}
