package org.intellij.fsharp.fileType.fsx;

import com.intellij.lang.ParserDefinition;
import org.intellij.fsharp.fileType.FSharpFileTypeLanguage;
import org.jetbrains.annotations.NotNull;

public class FsxFileTypeLanguage extends FSharpFileTypeLanguage {
    @NotNull public static final FsxFileTypeLanguage INSTANCE = new FsxFileTypeLanguage();

    private FsxFileTypeLanguage() {
        super("FSHARP_FSX");
    }

    @NotNull
    @Override
    public ParserDefinition getParserDefinition() {
        return null;
    }
}
