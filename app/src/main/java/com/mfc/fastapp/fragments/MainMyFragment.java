package com.mfc.fastapp.fragments;

import android.content.Intent;
import android.view.View;

import com.mfc.fastapp.R;
import com.mfc.fastapp.activitys.RecyclerviewActivity;
import com.mfc.fastapp.activitys.ScreenInfoActivity;
import com.mfc.fastapp.base.BaseFragment;

import butterknife.OnClick;

/**
 * Created by Administrator on 2016/10/31.
 */
public class MainMyFragment extends BaseFragment {

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main_home;
    }

    @Override
    public void initView() {

    }

    @OnClick({R.id.tv_recyverview, R.id.tv_scan, R.id.tv_scroll_recyclerview, R.id.tv_scrollview,
            R.id.tv_viewpage, R.id.tv_qiehuan, R.id.tv_progress_wheel, R.id.tv_tablyout, R.id.tv_lockpattern, R.id.tv_info})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_recyverview:
                startActivity(new Intent(getActivity(), RecyclerviewActivity.class));
                break;
            case R.id.tv_scan:
//                startActivity(new Intent(getActivity(), HomeActiviy.class));
                break;
            case R.id.tv_scroll_recyclerview:
//                startActivity(new Intent(getActivity(), HomeActivity.class));
                break;
            case R.id.tv_scrollview:
//                startActivity(new Intent(getActivity(), ScrollViewActicity.class));
                break;
            case R.id.tv_viewpage:
//                startActivity(new Intent(getActivity(), CustomViewpageActivity.class));
                break;
            case R.id.tv_qiehuan:
//                startActivity(new Intent(getActivity(), TestMainActivity.class));
                break;
            case R.id.tv_progress_wheel:// 页面加载动画
//                startActivity(new Intent(getActivity(), ProgressWheels.class));
                break;
            case R.id.tv_tablyout:
//                startActivity(new Intent(getActivity(), TabLayoutActivity.class));
                break;
            case R.id.tv_lockpattern:
//                startActivity(new Intent(getActivity(), LockpatternActivity.class));
                break;
            case  R.id.tv_info:
                startActivity(new Intent(getActivity(), ScreenInfoActivity.class));
                break;
        }
    }
}
