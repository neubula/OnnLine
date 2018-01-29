package com.neubula.onnline.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.neubula.onnline.cores.NetworkStatus;

/**
 * Created by quadri on 23/10/16.
 */
public class PowerButtonChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NetworkStatus.isNetWorkAvailable(context);
    }
}
