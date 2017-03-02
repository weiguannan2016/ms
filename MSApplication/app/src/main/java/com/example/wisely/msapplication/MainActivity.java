package com.example.wisely.msapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.wisely.msapplication.java.javacommen.collection.JavaCollectionActivity;
import com.example.wisely.msapplication.utils.utilsactivity.ToActivityUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_tojavatest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
    }

    private void initView() {
        tv_tojavatest = (TextView) findViewById(R.id.tv_tojavatest);
        tv_tojavatest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_tojavatest:
//                Toast.makeText(this,"hello   java",Toast.LENGTH_LONG).show();
                ToActivityUtils.toActivity(this, JavaCollectionActivity.class);
                break;
            default:
                break;
        }
    }
}
