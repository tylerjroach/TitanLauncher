package com.tylerjroach.titan.application;

import android.app.Application;
import com.facebook.stetho.Stetho;

/**
 * Created by tylerjroach on 9/20/16.
 */

public class TitanApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
  }
}