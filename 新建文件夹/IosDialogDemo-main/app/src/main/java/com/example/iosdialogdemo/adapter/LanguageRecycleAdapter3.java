package com.example.iosdialogdemo.adapter;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.iosdialogdemo.R;
import com.example.iosdialogdemo.bean.StuBean;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class LanguageRecycleAdapter3 extends RecyclerView.Adapter<LanguageViewHolder3> {


    private List<StuBean.ClassListBean> classList;
    private Context context;

    public LanguageRecycleAdapter3(Context context, List<StuBean.ClassListBean> classList) {
        this.classList = classList;
        this.context = context;
    }


    public void setData(List<StuBean.ClassListBean> languageList2) {
        this.classList = classList;
    }

    @NonNull
    @Override
    public LanguageViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LanguageViewHolder3 holder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item3, parent, false);
        holder = new LanguageViewHolder3(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull LanguageViewHolder3 holder, final int position) {
        holder.item_cls_name.setText(String.valueOf(position));
        holder.item_cls_name.setText(classList.get(position).getGrade_name());

    }

    @Override
    public int getItemCount() {
        return classList.size();
    }


}
