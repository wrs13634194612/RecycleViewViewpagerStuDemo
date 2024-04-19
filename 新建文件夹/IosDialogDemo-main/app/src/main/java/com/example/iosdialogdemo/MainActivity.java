package com.example.iosdialogdemo;


import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iosdialogdemo.bean.StuBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import com.example.iosdialogdemo.adapter.LanguageRecycleAdapter3;
import com.example.iosdialogdemo.adapter.LanguageRecycleAdapter2;

public class MainActivity extends Activity {
    private List<StuBean.SchReadyIngListBean> stuList;

    private List<StuBean.ClassListBean> classList;


    private TextView tv_stu_ed, tv_all_stu, tv_stu_ing, tv_stu_not;
    private RecyclerView rvLanguage2,rvLanguage3;
    private String jsonString;
    private LanguageRecycleAdapter2 languageRecycleAdapter2;
    private LanguageRecycleAdapter3 languageRecycleAdapter3;


    private Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message message) {
            if (message.what == 100) {
                jsonString = (String) message.obj;
                Log.e("INFO", "##### Sub: " + ": " + jsonString);
                Gson gson = new Gson();
                //解析字符串
                StuBean mStuBean = gson.fromJson(jsonString, StuBean.class);
                if (stuList != null) {
                    stuList.clear();
                }
                if (classList != null) {
                    classList.clear();
                }
                stuList.addAll(mStuBean.getSch_ready_ing_list());
                classList.addAll(mStuBean.getClass_list());
                Log.e("INFO", "##### Sub: " + ": " + stuList);
                tv_all_stu.setText(String.valueOf(mStuBean.getSch_num()));
                tv_stu_ing.setText(String.valueOf(mStuBean.getSch_ready_ing()));
                tv_stu_ed.setText(String.valueOf(mStuBean.getSch_ready_ed()));
                tv_stu_not.setText(String.valueOf(mStuBean.getSch_ready_not()));
                languageRecycleAdapter2.setData(stuList);
                languageRecycleAdapter2.notifyDataSetChanged();
                languageRecycleAdapter3.setData(classList);
                languageRecycleAdapter3.notifyDataSetChanged();

            }
            return false;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_stu_ed = findViewById(R.id.tv_stu_ed);
        tv_all_stu = findViewById(R.id.tv_all_stu);
        tv_stu_ing = findViewById(R.id.tv_stu_ing);
        tv_stu_not = findViewById(R.id.tv_stu_not);
        rvLanguage2 = findViewById(R.id.rvLanguage2);
        rvLanguage3= findViewById(R.id.rvLanguage3);
        stuList = new ArrayList<>();
        classList = new ArrayList<>();

        rvLanguage2.setLayoutManager(new GridLayoutManager(MainActivity.this, 3));
        languageRecycleAdapter2 = new LanguageRecycleAdapter2(MainActivity.this,stuList);
        rvLanguage2.setAdapter(languageRecycleAdapter2);


        rvLanguage3.setLayoutManager(new GridLayoutManager(MainActivity.this, 3));
        languageRecycleAdapter3 = new LanguageRecycleAdapter3(MainActivity.this,classList);
        rvLanguage3.setAdapter(languageRecycleAdapter3);


        loadJsonFromAssests();
    }

    public void loadJsonFromAssests() {
        String json = null;
        try {
            InputStream inputStream = getAssets().open("stu.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Log.e("TAG", "loadJsonFromAssests:" + json.toString());
        Message msg = new Message();
        msg.what = 100;
        msg.obj = json.toString();
        mHandler.sendMessage(msg);
    }

}