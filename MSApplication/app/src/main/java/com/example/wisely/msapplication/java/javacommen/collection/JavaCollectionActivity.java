package com.example.wisely.msapplication.java.javacommen.collection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.wisely.msapplication.R;
import com.example.wisely.msapplication.utils.utilsshow.LogUtils;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_showContent;
    private Button btn_arraylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_collection);

        initView();
        setOnclickListener();
    }

    private void initView() {
        btn_arraylist = (Button) findViewById(R.id.btn_arraylist);
        tv_showContent = (TextView) findViewById(R.id.tv_javacollection_showcontent);
    }

    private void setOnclickListener() {
        btn_arraylist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_arraylist:
                testArrayList();
            break;
            default:
                break;
        }
    }

    private void testArrayList() {
        LogUtils.w("enter - testArrayList");
        List<String> arr = new ArrayList();
        for (int i=0;i<10;i++){
            arr.add(i+"  号");
        }

        List<String> arrChild = new ArrayList();
        for(int j = 0;j<5;j++){
            arr.add(j+"  号");
        }

        LogUtils.i("arr.size : "+arr.size());
        arr.retainAll(arrChild);

        for (String strArr:arr
             ) {
            LogUtils.i("arr parent when retainAll : "+ strArr);
        }
    }

}
