package com.phodal.charj.lexer;

import com.intellij.psi.tree.TokenSet;

public interface CharjTokenTypeSets {
    TokenSet KEY_WORDS = TokenSet
            .create(
                    CharjTypes.STRUCT_KEYWORD,
                    CharjTypes.PKG_KEYWORD,
                    CharjTypes.PACKAGE_KEYWORD,
                    CharjTypes.IMPORT_KEYWORD,
                    CharjTypes.AS_KEYWORD,
                    CharjTypes.IF_KEYWORD,
                    CharjTypes.ELSE_KEYWORD,
                    CharjTypes.FUN_KEYWORD,
                    CharjTypes.WHILE_KEYWORD,
                    CharjTypes.FOR_KEYWORD,
                    CharjTypes.BREAK_KEYWORD,
                    CharjTypes.CONTINUE_KEYWORD,
                    CharjTypes.RETURN_KEYWORD,
                    CharjTypes.INT_KEYWORD,
                    CharjTypes.FLOAT_KEYWORD,
                    CharjTypes.STRING_KEYWORD,
                    CharjTypes.IN_KEYWORD,
                    CharjTypes.OUT_KEYWORD,
                    CharjTypes.MEMBER_KEYWORD,
                    CharjTypes.IN_KEYWORD,
                    CharjTypes.INSTANCE_KEYWORD,
                    CharjTypes.MATCH_KEYWORD,
                    CharjTypes.ELIF_KEYWORD,
                    CharjTypes.THEN_KEYWORD,
                    CharjTypes.END_KEYWORD
            );

}
