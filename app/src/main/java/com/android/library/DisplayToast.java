package com.android.library;

import android.content.Context;
import android.widget.Toast;

public class DisplayToast {
    public static void showToast(Context context, String toastMessage) {
        Toast.makeText(context, "Hey there " + toastMessage, Toast.LENGTH_SHORT).show();
    }
}
