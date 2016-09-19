package com.tylerjroach.titan;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class StartupReceiver extends BroadcastReceiver {

    static final String SYSTEM_READY = "com.tylerjroach.titan.SYSTEM_READY";

    @Override
    public void onReceive(Context context, Intent intent) {
        context.sendStickyBroadcast(new Intent(SYSTEM_READY));
    }
}
