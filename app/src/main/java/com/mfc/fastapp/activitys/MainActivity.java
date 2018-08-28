package com.mfc.fastapp.activitys;
/**
 * 该应用将输入轻应用，将作为库引用到实际开发中。
 */

import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.mfc.fastapp.R;
import com.mfc.fastapp.base.BaseActivity;
import com.mfc.fastapp.fragments.MainHomeFragment;
import com.mfc.fastapp.fragments.MainManagerFragment;
import com.mfc.fastapp.fragments.MainMyFragment;
import com.mfc.fastapp.util.UIUtils;
import com.mfc.fastapp.widget.IconFontTextView;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(android.R.id.tabcontent)
    FrameLayout tabcontent;
    @BindView(android.R.id.tabhost)
    FragmentTabHost tabhost;

    private Class fragmentArray[] = {MainHomeFragment.class, MainManagerFragment.class, MainMyFragment.class};
    private int iconFontArray[] = {R.string.ic_home, R.string.ic_type, R.string.ic_user};
    private String textViewArray[] = {"首页", "理财", "我的"};
    private LayoutInflater inflater;
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        tabhost.setup(this, getSupportFragmentManager(), R.id.container);
        inflater = LayoutInflater.from(this);
        int count = textViewArray.length;
        for (int i = 0; i < count; i++) {
            TabHost.TabSpec tabSpec = tabhost.newTabSpec(textViewArray[i]).setIndicator(getTabItemView(i));
            tabhost.addTab(tabSpec, fragmentArray[i], null);
            tabhost.setTag(i);
//            tabhost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.selector_while_bg);
        }
    }
    private View getTabItemView(int i) {
        //将xml布局转换为view对象
        View view = inflater.inflate(R.layout.tab_content, null);
        //利用view对象，找到布局中的组件,并设置内容，然后返回视图
//        ImageView mImageView = (ImageView) view
//                .findViewById(R.id.tab_imageview);
        IconFontTextView if_textview = view.findViewById(R.id.if_textview);
        TextView mTextView = (TextView) view.findViewById(R.id.tab_textview);
//        mImageView.setBackgroundResource(imageViewArray[i]);
        if_textview.setText(UIUtils.getString(iconFontArray[i]));
        mTextView.setText(textViewArray[i]);
        return view;
    }
}
