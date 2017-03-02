package com.example.wisely.msapplication.utils.utilsshow;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * User  : weiguannan(weign_android@163.com)
 * Date  : 2015-12-23
 * Notes :
 */
public class ShowToastTools {

    private ShowToastTools(){

        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /** Toast 显示的开关 ,关掉之后全局 toast 都会关闭 ，慎重使用*/
    public static boolean isShow = true;

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, CharSequence message)
    {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * 中部短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showMiddleShort(Context context, CharSequence message)
    {
        Toast toast = null;
        if (isShow)
            toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();

    }


    /**
     * 顶部部短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showTopShort(Context context, CharSequence message)
    {
        Toast toast = null;
        if (isShow)
            toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();

    }


    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, int message)
    {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * 中部短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showMiddleShort(Context context, int message)
    {
        Toast toast = null;
        if (isShow)
            toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, CharSequence message)
    {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    /**
     * 中部长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showMiddleLong(Context context, CharSequence message)
    {
        Toast toast = null;
        if (isShow)
            toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, int message)
    {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    /**
     * 中部长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showMiddleLong(Context context, int message)
    {
        Toast toast = null;
        if (isShow)
            toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
    }


    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, CharSequence message, int duration)
    {
        if (isShow)
            Toast.makeText(context, message, duration).show();
    }


    /**
     * 中部自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void showMiddle(Context context, CharSequence message, int duration)
    {
        Toast toast = null;
        if (isShow)
            toast = Toast.makeText(context, message, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, int message, int duration)
    {
        if (isShow)
            Toast.makeText(context, message, duration).show();
    }


    /**
     * 中部自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void showMiddle(Context context, int message, int duration)
    {
        Toast toast = null;
        if (isShow)
            toast = Toast.makeText(context, message, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
    }



}
