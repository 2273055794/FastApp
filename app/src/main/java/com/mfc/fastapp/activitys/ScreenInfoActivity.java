package com.mfc.fastapp.activitys;

import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.TextView;

import com.mfc.fastapp.R;
import com.mfc.fastapp.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ScreenInfoActivity extends BaseActivity {

    @BindView(R.id.tv_info)
    TextView tvInfo;

    @Override
    public int getLayoutId() {
        return R.layout.activity_screen_info;
    }

    @Override
    public void initData() {
        super.initData();
        tvInfo.setText(getScreenParams());
        data();
    }

    public String getScreenParams() {
        DisplayMetrics dm = new DisplayMetrics();
//        dm = getResources().getDisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int heightPixels = dm.heightPixels;
        int widthPixels = dm.widthPixels;
        float xdpi = dm.xdpi;
        float ydpi = dm.ydpi;
        int densityDpi = dm.densityDpi;
        float density = dm.density;
        float scaledDensity = dm.scaledDensity;
        float heightDP = heightPixels / density;
        float widthDP = widthPixels / density;
        String str = "heightPixels: " + heightPixels + "px";
        str += "\nwidthPixels: " + widthPixels + "px";
        str += "\nxdpi: " + xdpi + "dpi";
        str += "\nydpi: " + ydpi + "dpi";
        str += "\ndensityDpi: " + densityDpi + "dpi";
        str += "\ndensity: " + density;
        str += "\nscaledDensity: " + scaledDensity;
        str += "\nheightDP: " + heightDP + "dp";
        str += "\nwidthDP: " + widthDP + "dp";
        str += "\ndimenDP: " + "1dp=" + tvInfo.getTextSize();
        return str;
    }
    private void data() {
        Log.v("Build.BOARD",""+ Build.BOARD);
        Log.v("Build.BOOTLOADER",""+ Build.BOOTLOADER);
        Log.v("Build.BRAND",""+ Build.BRAND);
        Log.v("Build.DEVICE",""+ Build.DEVICE);
        Log.v("Build.DISPLAY",""+ Build.DISPLAY);
        Log.v("Build.FINGERPRINT",""+ Build.FINGERPRINT);
        Log.v("Build.HARDWARE",""+ Build.HARDWARE);
        Log.v("Build.HOST",""+ Build.HOST);
        Log.v("Build.ID",""+ Build.ID);
        Log.v("Build.MANUFACTURER",""+ Build.MANUFACTURER);
        Log.v("Build.MODEL",""+ Build.MODEL);
        Log.v("Build.PRODUCT",""+ Build.PRODUCT);
        Log.v("Build.SERIAL",""+ Build.SERIAL);
        Log.v("Build.TAGS",""+ Build.TAGS);
        Log.v("Build.TYPE",""+ Build.TYPE);
        Log.v("Build.UNKNOWN",""+ Build.UNKNOWN);
        Log.v("Build.USER",""+ Build.USER);
        Log.v("Build.VERSION.SDK_INT",""+ Build.VERSION.SDK_INT);
        Log.v("Build.VERSION.CODENAME",""+ Build.VERSION.CODENAME);
        Log.v("Build.V.INCREMENTAL",""+ Build.VERSION.INCREMENTAL);
        Log.v("Build.VERSION.RELEASE",""+ Build.VERSION.RELEASE);
        Log.v("Build.VERSION_CODES.M",""+ Build.VERSION_CODES.M);
    }
}
