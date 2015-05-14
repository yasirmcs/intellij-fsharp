package org.intellij.fsharp.fileType.fs;

import org.intellij.fsharp.FSharpIconUtil;
import org.intellij.fsharp.fileType.FSharpFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class FsFileType extends FSharpFileType {
    @NotNull public static final FsFileType INSTANCE = new FsFileType();

    private FsFileType() { super(FsFileTypeLanguage.INSTANCE); }

    @NotNull
    @Override
    public FSharpFileType getAnotherFileType() {
        return null;
    }

    @NotNull
    @Override
    public String getName() { return "FSHARP_FS_FILE"; }

    @NotNull
    @Override
    public String getDescription() {
        return "FSharp module implementation files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "fs";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return FSharpIconUtil.getFsharpFileIcon();
    }
}
