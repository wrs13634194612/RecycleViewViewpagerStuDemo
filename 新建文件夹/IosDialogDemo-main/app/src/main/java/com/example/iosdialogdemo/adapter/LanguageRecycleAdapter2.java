package com.example.iosdialogdemo.adapter;


import com.bumptech.glide.Glide;
import com.example.iosdialogdemo.R;
import com.example.iosdialogdemo.bean.StuBean;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LanguageRecycleAdapter2 extends RecyclerView.Adapter<LanguageViewHolder2> {
    private List<StuBean.SchReadyIngListBean> stuList;
    private Context context;

    public LanguageRecycleAdapter2(Context context, List<StuBean.SchReadyIngListBean> stuList) {
        this.stuList = stuList;
        this.context = context;
    }

    public void setData(List<StuBean.SchReadyIngListBean> stuList) {
        this.stuList = stuList;
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
        holder.tv_stu_name.setText(stuList.get(position).getStu_name());
        holder.tv_stu_cls.setText(stuList.get(position).getGrade_name());
        Glide.with(context).load(stuList.get(position).getStu_url()).into(holder.iv_img);
    }

    @Override
    public int getItemCount() {
        return stuList.size();
    }

}
