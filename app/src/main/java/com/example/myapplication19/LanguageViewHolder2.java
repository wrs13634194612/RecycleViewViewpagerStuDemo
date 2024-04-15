package com.example.myapplication19;



import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LanguageViewHolder2 extends RecyclerView.ViewHolder {
    TextView tv_stu_name, tv_stu_cls;

    public LanguageViewHolder2(@NonNull View itemView) {
        super(itemView);
        tv_stu_name = itemView.findViewById(R.id.tv_stu_name);
        tv_stu_cls = itemView.findViewById(R.id.tv_stu_cls);
    }
}