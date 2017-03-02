package com.example.wisely.msapplication.utils.utilsactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by weiguannan on 2016/3/20.
 */
public class ToActivityUtils {
    /**页面跳转*/
    public static void toActivity(Context context, Class<?> toClsActivity) {
        toActivity(context, toClsActivity, null);
    }

    public static void toActivity(Context context, Class<?> toClsActivity, Bundle bundle) {
        Intent intent = new Intent(context, toClsActivity);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
    }

}
