package com.example.recyclerview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout ;
    private ViewPager viewpager;
    private PagerAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewpager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new PagerAdapter(getSupportFragmentManager());

//        Add Fragment here

        adapter.AddFragment(new CallFragment(),"");
        adapter.AddFragment(new ContactFragment(),"");
        adapter.AddFragment(new FavouriteFragment(),"");

        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);

//        add icons
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star);


//        Remove Shadow in the action bar

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);


    }
}
