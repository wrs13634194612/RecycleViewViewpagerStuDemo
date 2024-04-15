package com.example.myapplication19;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

public class ChatFragment extends Fragment     {
    private List<String> languageList = new ArrayList<>();

    RecyclerView rvLanguage2;
    private LanguageRecycleAdapter2 languageRecycleAdapter2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);


        languageList.add("张飞");
        languageList.add("赵云");
        languageList.add("刘备");

        languageList.add("曹操");
        languageList.add("孙权");
        languageList.add("林黛玉");

        languageList.add("薛宝钗");
        languageList.add("史湘云");
        languageList.add("武松");

        languageList.add("鲁智深");
        languageList.add("李逵");
        languageList.add("李世民");

        languageList.add("朱棣");
        languageList.add("朱元璋");
        languageList.add("朱允炆");

        languageList.add("康熙");
        languageList.add("雍正");
        languageList.add("道光");



        rvLanguage2 = view.findViewById(R.id.rvLanguage2);


        rvLanguage2.setLayoutManager(new GridLayoutManager(getContext(), 3));

        languageRecycleAdapter2 = new LanguageRecycleAdapter2(languageList);
        rvLanguage2.setAdapter(languageRecycleAdapter2);

        return view;
    }


}
