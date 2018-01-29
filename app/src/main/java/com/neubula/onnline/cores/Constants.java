package com.neubula.onnline.cores;

import android.content.res.AssetManager;

/**
 * Created by quadri on 16/11/15.
 */
public class Constants {

    public static final String FONTS_LATO_LIGHT = "fonts/Lato-Light.ttf";
    public static boolean DEBUG_MODE = false;

    public static final String TAG = "com.neubula.onnline";
    public static final String PACKAGE_NAME = "com.neubula.onnline";
    public static final String APP_SHARED_PREFS = "com.neubula.onnline.pref";
    public static final String PREFS_BACKUP_KEY = "com.neubula.onnline.pref.backup";
    public static final String FILE_BACKUP_KEY = "com.neubula.onnline.file.backup";
    public static AssetManager assetManager;

    public static final String IN_PROTOCOL = "https://";

    public static String BASE_URL = "onnline.neubula.com";
//    public static final String BASE_URL = "192.168.43.200:8000";
//    public static final String BASE_URL = "192.168.0.104:8000";

    public static final String PREFIX_URL = "/api/v1";

    public static final String GET_MESSAGE = "GET_MESSAGE";
    public static final String IS_SEEN_HELP = "IS_SEEN_HELP";
}
