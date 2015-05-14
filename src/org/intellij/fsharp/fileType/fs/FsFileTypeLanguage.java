package org.intellij.fsharp.fileType.fs;

import com.intellij.lang.ParserDefinition;
import org.intellij.fsharp.fileType.FSharpFileTypeLanguage;
import org.jetbrains.annotations.NotNull;

public class FsFileTypeLanguage extends FSharpFileTypeLanguage {
    @NotNull public static final FsFileTypeLanguage INSTANCE = new FsFileTypeLanguage();

    private FsFileTypeLanguage() {
        super("FSHARP_FS");
    }

    @NotNull
    @Override
    public ParserDefinition getParserDefinition() {
        return null;
    }
}
