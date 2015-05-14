package org.intellij.fsharp.fileType;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

public abstract class FSharpFileType extends LanguageFileType implements FileType {
    @NotNull private final FSharpFileTypeLanguage myLanguage;

    protected FSharpFileType(@NotNull final FSharpFileTypeLanguage language) {
        super(language);
        myLanguage = language;
    }

    @NotNull
    public FSharpFileTypeLanguage getFSharpFileTypeLanguage() { return myLanguage; }

    @NotNull
    public abstract FSharpFileType getAnotherFileType();
}
