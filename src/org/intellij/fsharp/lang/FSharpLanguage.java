package org.intellij.fsharp.lang;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class FSharpLanguage extends Language {
    @NotNull
    public static final FSharpLanguage INSTANCE = new FSharpLanguage();

    private FSharpLanguage(){
        super("fsharp");
    }
}
