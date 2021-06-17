// This is a generated file. Not intended for manual editing.
package com.github.andrewedstrom.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Pico8Exp extends PsiElement {

  @Nullable
  Pico8Binop getBinop();

  @NotNull
  List<Pico8Exp> getExpList();

  @Nullable
  Pico8Functiondef getFunctiondef();

  @Nullable
  Pico8Prefixexp getPrefixexp();

  @Nullable
  Pico8Tableconstructor getTableconstructor();

  @Nullable
  Pico8Unop getUnop();

}
