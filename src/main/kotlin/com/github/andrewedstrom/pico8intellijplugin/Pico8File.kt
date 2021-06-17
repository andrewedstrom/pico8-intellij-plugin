package com.github.andrewedstrom.pico8intellijplugin

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.jetbrains.annotations.NotNull

class Pico8File(viewProvider: @NotNull FileViewProvider) : PsiFileBase(viewProvider, Pico8Language) {
    override fun getFileType(): FileType {
        return Pico8FileType
    }

    override fun toString(): String {
        return "PICO-8 File"
    }
}
