package org.intellij.fsharp.lang;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class FSharpElementType extends IElementType {

    public FSharpElementType(@NotNull @NonNls final String elementType) {
        super(elementType, FSharpLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "FSharp:" + super.toString();
    }
}
