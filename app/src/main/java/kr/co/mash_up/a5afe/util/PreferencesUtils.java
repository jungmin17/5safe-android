package kr.co.mash_up.a5afe.util;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;

/**
 * Created by Dong on 2016-05-13.
 */
public class PreferencesUtils {

    private PreferencesUtils() {
    }

    public static void putInt(@NonNull Context context, @NonNull String key, int value) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        prefs.edit().putInt(key, value).apply();
    }

    public static int getInt(@NonNull Context context, @NonNull String key, int defaultValue) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getInt(key, defaultValue);
    }

    public static void putString(@NonNull Context context, @NonNull String key, String value) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        prefs.edit().putString(key, value).apply();
    }

    public static String getString(@NonNull Context context, @NonNull String key, String defaultValue) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(key, defaultValue);
    }

    public static void putBoolean(@NonNull Context context, @NonNull String key, boolean value) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        prefs.edit().putBoolean(key, value).apply();
    }

    public static boolean getBoolean(@NonNull Context context, @NonNull String key, boolean defaultValue) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getBoolean(key, defaultValue);
    }

    public static void putLong(@NonNull Context context, @NonNull String key, long value) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        prefs.edit().putLong(key, value).apply();
    }

    public static long getLong(@NonNull Context context, @NonNull String key, long defaultValue) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getLong(key, defaultValue);
    }

    public static void remove(@NonNull Context context, @NonNull String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        prefs.edit().remove(key).apply();
    }

//    public static void setPreferences(Context context, String key, Boolean value) {
//        SharedPreferences pref = context.getSharedPreferences(Constants.PREF_NAME, Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = pref.edit();
//        editor.putBoolean(key, value);
//        editor.apply();
//    }

//    public static Boolean getPreferencesBoolean(Context context, String key) {
//        SharedPreferences pref = context.getSharedPreferences(Constants.PREF_NAME, Context.MODE_PRIVATE);
//        return pref.getBoolean(key, false);
//    }
}