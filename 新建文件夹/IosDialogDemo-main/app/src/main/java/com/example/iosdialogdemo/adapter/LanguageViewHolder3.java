package com.example.iosdialogdemo.adapter;



        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;
        import com.example.iosdialogdemo.R;


public class LanguageViewHolder3 extends RecyclerView.ViewHolder {
    public TextView item_cls_name,item_stu_status;

    public LanguageViewHolder3(@NonNull View itemView) {
        super(itemView);
        item_cls_name = itemView.findViewById(R.id.item_cls_name);
        item_stu_status = itemView.findViewById(R.id.item_stu_status);
    }
}
