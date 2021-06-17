package com.github.andrewedstrom.pico8intellijplugin

import com.github.andrewedstrom.Pico8Parser
import com.github.andrewedstrom.Pico8Types
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

val FILE: IFileElementType = IFileElementType(Pico8Language)
val COMMENTS: TokenSet = TokenSet.create(Pico8Types.COMMENT)

class Pico8ParserDefinitio: ParserDefinition {
    override fun createLexer(project: Project?): Lexer {
        return Pico8LexerAdapter()
    }

    override fun createParser(project: Project?): PsiParser {
        return Pico8Parser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getCommentTokens(): TokenSet {
        TODO("Not yet implemented")
    }

    override fun getStringLiteralElements(): TokenSet {
        TODO("Not yet implemented")
    }

    override fun createElement(node: ASTNode?): PsiElement {
        TODO("Not yet implemented")
    }

    override fun createFile(viewProvider: FileViewProvider?): PsiFile {
        TODO("Not yet implemented")
    }
}