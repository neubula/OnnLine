package com.neubula.onnline.cores;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by quadri on 23/10/16.
 */
public class NetworkStatusTask  extends AsyncTask<Void, Void, Boolean> {

    private Context context;

    public NetworkStatusTask(Context context) {
        this.context = context;
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        try {
            HttpURLConnection urlConnection = (HttpURLConnection)
                    (new URL("http://clients3.google.com/generate_204")
                            .openConnection());
            urlConnection.setRequestProperty("User-Agent", "Android");
            urlConnection.setRequestProperty("Connection", "close");
            urlConnection.setConnectTimeout(1500);
            urlConnection.connect();
            return (urlConnection.getResponseCode() == 204 &&
                    urlConnection.getContentLength() == 0);
        } catch (IOException e) {
            Log.e(Constants.TAG, "Error checking internet connection", e);
        }
        return false;
    }

    @Override
    protected void onPostExecute(Boolean isConnected) {
        super.onPostExecute(isConnected);
        if (isConnected) {
            NotificationUtil.connected(context, null, null);
        } else {
            NotificationUtil.online(context, null, "Your device is unable to access Internet.");
        }
    }
}
