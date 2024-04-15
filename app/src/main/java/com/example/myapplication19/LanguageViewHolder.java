package com.example.myapplication19;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

public class LanguageViewHolder extends RecyclerView.ViewHolder {
    TextView item_cls_name,item_stu_status;

    public LanguageViewHolder(@NonNull View itemView) {
        super(itemView);
        item_cls_name = itemView.findViewById(R.id.item_cls_name);
        item_stu_status = itemView.findViewById(R.id.item_stu_status);
    }
}
