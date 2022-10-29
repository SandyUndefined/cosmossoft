package com.sandy.cosmossoft.util;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou;
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYouListener;
import com.sandy.cosmossoft.C0330R;

public class BindingUtils {
    public static void loadUrlImage(ImageView imageView, String url) {
        try {
            String url2 = url.trim();
            if (url2.isEmpty()) {
                return;
            }
            if (url2.contains(".svg")) {
                loadSvgUrl(imageView, url2);
            } else {
                ((RequestBuilder) ((RequestBuilder) Glide.with((View) imageView).load(url2).error((int) C0330R.C0332drawable.warning)).placeholder((int) C0330R.C0332drawable.loading)).into(imageView);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void loadProfileUrlImage(ImageView imageView, String url) {
        if (!url.isEmpty()) {
            ((RequestBuilder) ((RequestBuilder) Glide.with((View) imageView).load(url).error((int) C0330R.C0332drawable.ic_baseline_account_circle_24)).placeholder((int) C0330R.C0332drawable.ic_baseline_account_circle_24)).into(imageView);
        }
    }

    public static void loadResourceImage(ImageView imageView, Integer image) {
        imageView.setImageResource(image.intValue());
    }

    public static void loadBitmapResourceImage(ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }

    public static void setIntegerToText(TextView textView, Long data) {
        textView.setText(String.valueOf(data));
    }

    public static void loadSvgUrl(final ImageView imageView, String url) {
        GlideToVectorYou.init().setPlaceHolder(C0330R.C0332drawable.loading, C0330R.C0332drawable.loading).with(imageView.getContext()).withListener(new GlideToVectorYouListener() {
            public void onLoadFailed() {
                imageView.setImageResource(C0330R.C0332drawable.loading);
            }

            public void onResourceReady() {
            }
        }).load(Uri.parse(url), imageView);
    }
}
