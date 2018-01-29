package com.neubula.onnline.cores;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

import com.neubula.onnline.R;

/**
 * Created by quadri on 22/10/16.
 */
public class NotificationUtil {

    public static void offline(Context context, String title, String text) {
        title = title == null ? "Network Unavailable" : title;
        text = text == null ? "Your device is not connected." : text;
        NotificationCompat.Builder mBuilder = new NotificationCompat
                .Builder(context).setSmallIcon(R.drawable.ic_stat_times_circle).setContentTitle(title)
                .setStyle(new NotificationCompat.BigTextStyle().bigText(text)).setContentText(text);

        mBuilder.setAutoCancel(false);
        mBuilder.setOngoing(true);

        ((NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE)).notify(0, mBuilder.build());
    }

    public static void online(Context context, String title, String text) {
        title = title == null ? "Network Available" : title;
        text = text == null ? "You device is connected." : text;
        NotificationCompat.Builder mBuilder = new NotificationCompat
                .Builder(context).setSmallIcon(R.drawable.ic_stat_circle).setContentTitle(title)
                .setStyle(new NotificationCompat.BigTextStyle().bigText(text)).setContentText(text);

        mBuilder.setAutoCancel(false);
        mBuilder.setOngoing(true);

        ((NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE)).notify(0, mBuilder.build());
    }

    public static void connected(Context context, String title, String text) {
        title = title == null ? "Internet Accessible" : title;
        text = text == null ? "You device can access the internet." : text;
        NotificationCompat.Builder mBuilder = new NotificationCompat
                .Builder(context).setSmallIcon(R.drawable.ic_stat_check_circle).setContentTitle(title)
                .setStyle(new NotificationCompat.BigTextStyle().bigText(text)).setContentText(text);

        mBuilder.setAutoCancel(false);
        mBuilder.setOngoing(true);

        ((NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE)).notify(0, mBuilder.build());
    }
}
