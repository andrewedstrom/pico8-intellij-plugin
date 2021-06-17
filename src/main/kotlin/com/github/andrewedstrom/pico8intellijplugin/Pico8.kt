package com.github.andrewedstrom.pico8intellijplugin

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object Pico8Language : Language("PICO-8") {
}

object Pico8Icons {
    val FILE = IconLoader.getIcon("/icons/jar-gray.png")
}

object Pico8FileType : LanguageFileType(Pico8Language) {
    override fun getName(): String {
        return "PICO-8"
    }

    override fun getDescription(): String {
        return "PICO-8 dialect LUA"
    }

    override fun getDefaultExtension(): String {
        return "p8"
    }

    override fun getIcon(): Icon? {
        return Pico8Icons.FILE
    }
}