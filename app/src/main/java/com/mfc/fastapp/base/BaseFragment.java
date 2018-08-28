package com.mfc.fastapp.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment extends Fragment {
    private View rootView;
    private Unbinder butterKnife;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(this.getLayoutId(), container, false);
            butterKnife = ButterKnife.bind(this, rootView);
            initView();
            initData();
        }else {
            butterKnife = ButterKnife.bind(this, rootView);
            reflesh();
        }
        ViewGroup parent = (ViewGroup) rootView.getParent();
        if (parent != null) {
            parent.removeView(rootView);
        }
        return rootView;
    }
    protected View getContentView() {
        return rootView;
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (butterKnife!=null){
            butterKnife.unbind();
        }
    }

    public abstract int getLayoutId();

    public void initView(){
    }
    public void initData() {
    }
    //页面重复加载时调用该方法，用于页面数据刷新。
    public void reflesh(){
    }

}
