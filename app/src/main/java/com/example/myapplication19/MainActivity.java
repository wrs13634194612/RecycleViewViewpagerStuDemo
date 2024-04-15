package com.example.myapplication19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class MainActivity extends AppCompatActivity    {
    private LanguageRecycleAdapter languageRecycleAdapter;
    private RecyclerView rvLanguage;
    private List<String> languageList = new ArrayList<>();
    private EditText editText;
    private Button btn_main;

    private TabLayout tabLayout;

    NestedScrollView mNestedScrollView;
    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languageList.add("一年级1班");
        languageList.add("一年级2班");
        languageList.add("一年级3班");
        languageList.add("一年级4班");
        languageList.add("一年级5班");
        languageList.add("一年级6班");

        languageList.add("二年级1班");
        languageList.add("二年级2班");
        languageList.add("二年级3班");
        languageList.add("二年级4班");
        languageList.add("二年级5班");
        languageList.add("二年级6班");

        languageList.add("三年级1班");
        languageList.add("三年级2班");
        languageList.add("三年级3班");
        languageList.add("三年级4班");
        languageList.add("三年级5班");
        languageList.add("三年级6班");


        rvLanguage = findViewById(R.id.rvLanguage);
        editText= findViewById(R.id.etLanguage);
        btn_main= findViewById(R.id.btn_main);
        tabLayout = findViewById(R.id.tab_layout2);
        viewPager = findViewById(R.id.view_pager2);


        FragmentManager fragmentManager = getSupportFragmentManager();
        ViewPagerFragmentAdapter homeAdapter = new ViewPagerFragmentAdapter(fragmentManager, getLifecycle());

        //禁止滑动
        viewPager.setUserInputEnabled(false);
        //设置滑动方向
        viewPager.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
        viewPager.setAdapter(homeAdapter);


    /*    RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(this);
        rvLanguage.setLayoutManager(layoutManager);
*/



        rvLanguage.setLayoutManager(new GridLayoutManager(this, 4));


        languageRecycleAdapter = new LanguageRecycleAdapter(languageList);
        rvLanguage.setAdapter(languageRecycleAdapter);

        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String etString = editText.getText().toString();
                languageList.add(etString);
                languageRecycleAdapter.setData(languageList);
                languageRecycleAdapter.notifyDataSetChanged();
            }
        });



    }

}