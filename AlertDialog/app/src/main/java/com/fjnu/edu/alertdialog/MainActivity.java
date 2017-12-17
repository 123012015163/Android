package com.fjnu.edu.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        //调用父类的oncreate方法
        super.onCreate(savedInstanceState);
        //调用R.layout里面的alertdialog的布局
        setContentView(R.layout.alertdialog);
        //定义一个按钮,找到这个button

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LinearLayout linerout = (LinearLayout)getLayoutInflater().inflate(R.layout.alertdialog,null);
        builder.setView(linerout);
        builder.show();


    }
}