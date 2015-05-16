package org.intellij.fsharp;

import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class FSharpIconUtil {
    @NotNull
    private static final Icon _fsharpFileIcon = IconLoader.getIcon("/img/fsharp_fs_file.png");

    @NotNull
    public static Icon getFsharpFileIcon() { return _fsharpFileIcon; }
}
