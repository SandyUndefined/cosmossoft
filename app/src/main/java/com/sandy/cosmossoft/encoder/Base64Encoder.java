package com.sandy.cosmossoft.encoder;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

public class Base64Encoder {
    public static String encodeImage(Bitmap bm) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        return Base64.encodeToString(baos.toByteArray(), 0);
    }
}
