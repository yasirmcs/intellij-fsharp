package org.intellij.fsharp.fileType.fsi;

import com.intellij.lang.ParserDefinition;
import org.intellij.fsharp.fileType.FSharpFileTypeLanguage;
import org.jetbrains.annotations.NotNull;

public class FsiFileTypeLanguage extends FSharpFileTypeLanguage {
    @NotNull public static final FsiFileTypeLanguage INSTANCE = new FsiFileTypeLanguage();

    private FsiFileTypeLanguage() {
        super("FSHARP_FSI");
    }

    @NotNull
    @Override
    public ParserDefinition getParserDefinition() {
        return null;
    }
}
