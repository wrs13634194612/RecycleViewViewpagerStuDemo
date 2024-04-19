package com.example.iosdialogdemo.adapter;





        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import com.example.iosdialogdemo.R;


public class LanguageViewHolder2 extends RecyclerView.ViewHolder {
    public TextView tv_stu_name, tv_stu_cls;
    public ImageView iv_img;
    public LanguageViewHolder2(@NonNull View itemView) {
        super(itemView);
        tv_stu_name = itemView.findViewById(R.id.tv_stu_name);
        tv_stu_cls = itemView.findViewById(R.id.tv_stu_cls);
        iv_img = itemView.findViewById(R.id.iv_img);
    }
}