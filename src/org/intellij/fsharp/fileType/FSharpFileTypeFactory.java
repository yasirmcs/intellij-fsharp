package org.intellij.fsharp.fileType;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.intellij.fsharp.fileType.fsi.FsiFileType;
import org.intellij.fsharp.fileType.fsx.FsxFileType;
import org.intellij.fsharp.fileType.fs.FsFileType;
import org.jetbrains.annotations.NotNull;

public class FSharpFileTypeFactory extends FileTypeFactory{
    @Override
    public void createFileTypes(@NotNull final FileTypeConsumer consumer) {
        consumer.consume(FsFileType.INSTANCE, FsFileType.INSTANCE.getDefaultExtension());
        consumer.consume(FsiFileType.INSTANCE, FsiFileType.INSTANCE.getDefaultExtension());
        consumer.consume(FsxFileType.INSTANCE, FsxFileType.INSTANCE.getDefaultExtension());

    }
}
