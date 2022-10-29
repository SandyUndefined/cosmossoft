package com.sandy.cosmossoft.adapters;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import com.sandy.cosmossoft.util.ViewUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PdfDocumentAdapter extends PrintDocumentAdapter {
    Context context;
    String path;

    public PdfDocumentAdapter(Context context2, String path2) {
        this.context = context2;
        this.path = path2;
    }

    public void onLayout(PrintAttributes oldAttributes, PrintAttributes newAttributes, CancellationSignal cancellationSignal, LayoutResultCallback callback, Bundle extras) {
        if (cancellationSignal.isCanceled()) {
            callback.onLayoutCancelled();
            return;
        }
        PrintDocumentInfo.Builder builder = new PrintDocumentInfo.Builder("receipt_invoice");
        builder.setContentType(0).setPageCount(-1).build();
        callback.onLayoutFinished(builder.build(), !newAttributes.equals(oldAttributes));
    }

    public void onWrite(PageRange[] pages, ParcelFileDescriptor destination, CancellationSignal cancellationSignal, WriteResultCallback callback) {
        InputStream in = null;
        OutputStream out = null;
        try {
            InputStream in2 = new FileInputStream(new File(this.path));
            OutputStream out2 = new FileOutputStream(destination.getFileDescriptor());
            byte[] buff = new byte[16384];
            while (true) {
                int read = in2.read(buff);
                int size = read;
                if (read >= 0 && !cancellationSignal.isCanceled()) {
                    out2.write(buff, 0, size);
                }
            }
            if (cancellationSignal.isCanceled()) {
                callback.onWriteCancelled();
            } else {
                callback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            }
            try {
                in2.close();
                out2.close();
            } catch (IOException e) {
                ViewUtils.showToast(this.context, e.getMessage());
                e.printStackTrace();
            }
        } catch (Exception e2) {
            callback.onWriteFailed(e2.getMessage());
            ViewUtils.showToast(this.context, e2.getMessage());
            e2.printStackTrace();
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        } catch (Throwable th) {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e3) {
                    ViewUtils.showToast(this.context, e3.getMessage());
                    e3.printStackTrace();
                    throw th;
                }
            }
            if (out != null) {
                out.close();
            }
            throw th;
        }
    }
}
