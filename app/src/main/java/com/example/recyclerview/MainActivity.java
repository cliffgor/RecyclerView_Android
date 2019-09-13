package com.example.recyclerview;

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

        adapter.AddFragment(new CallFragment(),"Call");
        adapter.AddFragment(new ContactFragment(),"Contact");
        adapter.AddFragment(new FavouriteFragment(),"Favourite");

        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);

    }
}
