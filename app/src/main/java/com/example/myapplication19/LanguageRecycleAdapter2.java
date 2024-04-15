package com.example.myapplication19;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LanguageRecycleAdapter2 extends RecyclerView.Adapter<LanguageViewHolder2> {

    private List<String> languageList = new ArrayList<>();


    public LanguageRecycleAdapter2(List<String> languageList) {
        this.languageList = languageList;

        Log.e("TAG", "LanguageRecycleAdapter " + languageList.size());
    }

    public void setData(List<String> languageList2) {
        this.languageList = languageList2;
    }

    @NonNull
    @Override
    public LanguageViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LanguageViewHolder2 holder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, parent, false);
        holder = new LanguageViewHolder2(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull LanguageViewHolder2 holder, final int position) {
        holder.tv_stu_cls.setText(String.valueOf(position));
        holder.tv_stu_name.setText(languageList.get(position));

    }

    @Override
    public int getItemCount() {
        return languageList.size();
    }


}
