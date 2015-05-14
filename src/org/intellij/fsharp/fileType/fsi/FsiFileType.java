package org.intellij.fsharp.fileType.fsi;

import org.intellij.fsharp.FSharpIconUtil;
import org.intellij.fsharp.fileType.FSharpFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class FsiFileType extends FSharpFileType {
    @NotNull public static final FsiFileType INSTANCE = new FsiFileType();

    private FsiFileType() { super(FsiFileTypeLanguage.INSTANCE); }

    @NotNull
    @Override
    public FSharpFileType getAnotherFileType() {
        return null;
    }

    @NotNull
    @Override
    public String getName() { return "FSHARP_FSI_FILE"; }

    @NotNull
    @Override
    public String getDescription() {
        return "FSharp module interface files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "fsi";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return FSharpIconUtil.getFsharpFileIcon();
    }
}
