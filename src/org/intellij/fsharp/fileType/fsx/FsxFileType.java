package org.intellij.fsharp.fileType.fsx;

import org.intellij.fsharp.FSharpIconUtil;
import org.intellij.fsharp.fileType.FSharpFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class FsxFileType extends FSharpFileType {
    @NotNull public static final FsxFileType INSTANCE = new FsxFileType();

    private FsxFileType() { super(FsxFileTypeLanguage.INSTANCE); }

    @NotNull
    @Override
    public FSharpFileType getAnotherFileType() {
        return null;
    }

    @NotNull
    @Override
    public String getName() { return "FSHARP_FSX_FILE"; }

    @NotNull
    @Override
    public String getDescription() {
        return "FSharp module script files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "fsx";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return FSharpIconUtil.getFsharpFileIcon();
    }
}
