package com.neubula.onnline.cores;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;


public class NetworkStatus {

	public static  void isNetWorkAvailable(Context context) {

		if (ContextCompat.checkSelfPermission(context,
				"android.permission.ACCESS_NETWORK_STATE") == PackageManager.PERMISSION_GRANTED) {
			ConnectivityManager connectivityManager =
					(ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

			NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
			boolean isConnected = activeNetwork != null &&
					activeNetwork.isConnectedOrConnecting();

			if (isConnected) {
				NotificationUtil.online(context, null, null);
				boolean isWiFi = activeNetwork.getType() == ConnectivityManager.TYPE_WIFI;
				if (isWiFi) {
					NotificationUtil.online(context, null, "Your device is connected over Wi-Fi");
				}
				new NetworkStatusTask(context).execute();
			} else {
				NotificationUtil.offline(context, null, null);
			}
		} else {
			final int REQUEST_CODE_ASK_PERMISSIONS = 123;
			ActivityCompat.requestPermissions((Activity) context,
					new String[]{"android.permission.ACCESS_NETWORK_STATE"}, REQUEST_CODE_ASK_PERMISSIONS);
		}
		
		/*ConnectivityManager connMgr = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
		try {
			if (connMgr == null) {
				return false;
			} else return connMgr.getActiveNetworkInfo() != null
                    && connMgr.getActiveNetworkInfo().isAvailable()
                    && connMgr.getActiveNetworkInfo().isConnected();
        } catch (Exception e) {
			return false;
		}*/
	}

}
