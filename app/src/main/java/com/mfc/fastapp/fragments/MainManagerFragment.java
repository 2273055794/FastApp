package com.mfc.fastapp.fragments;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mfc.fastapp.R;
import com.mfc.fastapp.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
/**
 * Created by Administrator on 2016/10/31.
 */
public class MainManagerFragment extends BaseFragment{
//    @BindView(R.id.tv_title)
//    TextView tvTitle;
//    @BindView(R.id.btn_style)
//    Button btnStyle;
//    @BindView(R.id.nag_root)
//    RelativeLayout nagRoot;
//    @BindView(R.id.pagerIndicator)
//    TabPagerIndicator pagerIndicator;
//    @BindView(R.id.viewPager)
//    ViewPager viewPager;
//    @BindView(R.id.colors)
//    LinearLayout colors;
//    @BindView(R.id.btn_style2)
//    Button btn_style2;
//
//    private boolean first;
//    private String[] mTitles;
//    private List<Fragment> mFragments;
//    private BaseViewPagerAdapter mPagerAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main_manager;
    }

//    @Override
//    public void initView() {
//        /*自定义TabPagerIndicator*/
//        btnStyle.setOnClickListener(this);
//
//        mTitles = this.getResources().getStringArray(R.array.fragments_titles);
//        PagerIndicatorFragment pagerIndicatorFragment = new  PagerIndicatorFragment();
//        PagerIndicatorFragment pagerIndicatorFragment1 = new  PagerIndicatorFragment();
//        PagerIndicatorFragment pagerIndicatorFragment2 = new  PagerIndicatorFragment();
//        PagerIndicatorFragment pagerIndicatorFragment3 = new  PagerIndicatorFragment();
//        PagerIndicatorFragment pagerIndicatorFragment4 = new  PagerIndicatorFragment();
//        PagerIndicatorFragment pagerIndicatorFragment5 = new  PagerIndicatorFragment();
//        PagerIndicatorFragment pagerIndicatorFragment6 = new  PagerIndicatorFragment();
//
//        mFragments = new ArrayList<>();
//        mFragments.add(pagerIndicatorFragment);
//        mFragments.add(pagerIndicatorFragment1);
//        mFragments.add(pagerIndicatorFragment2);
//        mFragments.add(pagerIndicatorFragment3);
//        mFragments.add(pagerIndicatorFragment4);
//        mFragments.add(pagerIndicatorFragment5);
//        mFragments.add(pagerIndicatorFragment6);
//
//        mPagerAdapter = new BaseViewPagerAdapter(getChildFragmentManager(), mFragments, mTitles);
//        viewPager.setAdapter(mPagerAdapter);
//        //去掉中间分割线
//        pagerIndicator.setDividerColorResource(R.color.color_white);
//        //底部滑动线的颜色
//        pagerIndicator.setIndicatorColorResource(R.color.color_blue);
//        pagerIndicator.setViewPager(viewPager);
//        /*自定义TabPagerIndicator*/
//    }
//
//    @OnClick({R.id.iv_1, R.id.iv_2, R.id.iv_3, R.id.iv_4, R.id.iv_5, R.id.iv_6, R.id.btn_style, R.id.btn_style2})
//    public void onClick(View view) {
//        switch (view.getId()) {
//            /*自定义TabPagerIndicator*/
//            case R.id.iv_1:
//            case R.id.iv_2:
//            case R.id.iv_3:
//            case R.id.iv_4:
//            case R.id.iv_5:
//            case R.id.iv_6:
//                int color = Color.parseColor(view.getTag().toString());
//                pagerIndicator.setIndicatorColor(color);
//                nagRoot.setBackgroundColor(color);
//                break;
//            case R.id.btn_style:
//                if (!first) {
//                    pagerIndicator.setIndicatorMode(TabPagerIndicator.IndicatorMode.MODE_WEIGHT_EXPAND_NOSAME,
//                            true);
//                } else {
//                    pagerIndicator.setIndicatorMode(TabPagerIndicator.IndicatorMode.MODE_WEIGHT_EXPAND_SAME,
//                            true);
//                }
//                first = !first;
//
//                break;
//            case R.id.btn_style2:
//                pagerIndicator.setPagerItem(1);
//            break;
//            /*自定义TabPagerIndicator*/
//        }
//    }
}
