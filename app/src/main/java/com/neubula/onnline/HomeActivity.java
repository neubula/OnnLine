package com.neubula.onnline;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.neubula.onnline.cores.NetworkStatus;
import com.neubula.onnline.receiver.NetworkChangeReceiver;
import com.neubula.onnline.receiver.PowerButtonChangeReceiver;

public class HomeActivity extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        context = this;

        NetworkStatus.isNetWorkAvailable(context);

        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_SCREEN_ON);
        // filter.addAction(Intent.ACTION_SCREEN_OFF);
        // filter.addAction(Intent.ACTION_USER_PRESENT);
        PowerButtonChangeReceiver powerButtonChangeReceiver = new PowerButtonChangeReceiver();
        registerReceiver(powerButtonChangeReceiver, filter);
    }
}
