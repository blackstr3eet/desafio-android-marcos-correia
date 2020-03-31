package com.ibm.marvel.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import java.io.IOException;
import java.io.InputStream;

public class ImageDownloadTask extends AsyncTask<String, Void, Bitmap> {

    final ImageView imageView;

    public ImageDownloadTask(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    protected Bitmap doInBackground(String... path) {
        StringBuilder URL = new StringBuilder();
        URL.append(path[0]);
        URL.append(".");
        URL.append(path[1]);

        Bitmap bitmap = null;

        try {
            InputStream in = new java.net.URL(URL.toString()).openStream();
            bitmap = BitmapFactory.decodeStream(in);
        }
        catch (IOException e) {
            Log.e("download error", e.getMessage());
            e.printStackTrace();
        }

        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }
}