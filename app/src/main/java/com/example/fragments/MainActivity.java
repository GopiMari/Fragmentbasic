package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.fragments.Adapter.ViewPagerAdapter;
import com.example.fragments.Fragments.PostFragment;
import com.example.fragments.Fragments.ProfileFragment;
import com.example.fragments.Fragments.UploadFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
    ViewPager fragmentVP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }

        fragmentVP = findViewById(R.id.fragmentVP);

        adapter.addFragment(new PostFragment(),"YOUR POST");
        adapter.addFragment(new UploadFragment(),"UPLOAD");
        adapter.addFragment(new ProfileFragment(),"PROFILE");

        fragmentVP.setAdapter(adapter);

        SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.viewpagertab);
        viewPagerTab.setViewPager(fragmentVP);




    }
}
