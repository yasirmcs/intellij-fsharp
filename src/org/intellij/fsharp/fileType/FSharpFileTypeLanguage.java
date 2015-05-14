package org.intellij.fsharp.fileType;

import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import org.intellij.fsharp.lang.FSharpLanguage;
import org.jetbrains.annotations.NotNull;

public abstract class FSharpFileTypeLanguage extends Language {
    protected FSharpFileTypeLanguage(@NotNull final String id) {
        super(FSharpLanguage.INSTANCE, id);
    }

    @NotNull
    public abstract ParserDefinition getParserDefinition();

    @Override
    public boolean isCaseSensitive() {
        return true;
    }
}
