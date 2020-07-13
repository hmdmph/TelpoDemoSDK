package com.telpo.tps550.api.demo.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.telpo.tps550.api.demo.MainActivity;
import com.telpo.tps550.api.demo.R;

/**
 * Created by yangw160602 on 2017/2/18.
 */

public class XuanXiang extends Activity {
    private CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xuanxiang);
        sharedPreferences=getApplicationContext().getSharedPreferences("token", Context.MODE_PRIVATE);
        cb1= (CheckBox) findViewById(R.id.btn1);
        cb2= (CheckBox) findViewById(R.id.btn2);
        cb3= (CheckBox) findViewById(R.id.btn3);
        cb4= (CheckBox) findViewById(R.id.btn4);
        cb5= (CheckBox) findViewById(R.id.btn5);
        cb6= (CheckBox) findViewById(R.id.btn6);
        cb7= (CheckBox) findViewById(R.id.btn7);
        cb8= (CheckBox) findViewById(R.id.btn8);
       // cb9= (CheckBox) findViewById(R.id.btn9);
        cb10= (CheckBox) findViewById(R.id.btn10);
        cb11 =(CheckBox) findViewById(R.id.btn11);
        cb12= (CheckBox) findViewById(R.id.btn12);
        cb13= (CheckBox) findViewById(R.id.btn13);
        if ( sharedPreferences.getBoolean("BNPRINT",true)){
            cb1.setChecked(true);
        }else {
            cb1.setChecked(false);
        }
        if ( sharedPreferences.getBoolean("BNQRCODE",true)){
            cb2.setChecked(true);
        }else {
            cb2.setChecked(false);
        }
        if ( sharedPreferences.getBoolean("MAGNETICCARDBTN",true)){
            cb3.setChecked(true);
        }else {
            cb3.setChecked(false);
        }
        if ( sharedPreferences.getBoolean("RFIDBTN",true)){
            cb4.setChecked(true);
        }else {
            cb4.setChecked(false);
        }
        if ( sharedPreferences.getBoolean("IDENTIFYBTN",true)){
            cb5.setChecked(true);
        }else {
            cb5.setChecked(false);
        }
        if ( sharedPreferences.getBoolean("PCSCBTN",true)){
            cb6.setChecked(true);
        }else {
            cb6.setChecked(false);
        }
        if ( sharedPreferences.getBoolean("NFCBTN",true)){
            cb7.setChecked(true);
        }else {
            cb7.setChecked(false);
        }
        if ( sharedPreferences.getBoolean("PSAMBTN",true)){
            cb8.setChecked(true);
        }else {
            cb8.setChecked(false);
        }
       /* if ( sharedPreferences.getBoolean("HDMIBTN",true)){
            cb9.setChecked(true);
        }else {
            cb9.setChecked(false);
        }*/
        if ( sharedPreferences.getBoolean("MONEYBOX",true)){
            cb10.setChecked(true);
        }else {
            cb10.setChecked(false);
        }
        if (sharedPreferences.getBoolean("IRBTN",true)){
            cb11.setChecked(true);
        }else {
            cb11.setChecked(false);
        }
        if ( sharedPreferences.getBoolean("LEDBTN",true)){
            cb12.setChecked(true);
        }else {
            cb12.setChecked(false);
        }
        if (sharedPreferences.getBoolean("DECODEBTN",true)){
            cb13.setChecked(true);
        }else {
            cb13.setChecked(false);
        }

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("BNPRINT",true).commit();
                }else {
                    sharedPreferences.edit().putBoolean("BNPRINT",false).commit();
                }
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("BNQRCODE",true).commit();
                }else {
                    sharedPreferences.edit().putBoolean("BNQRCODE",false).commit();
                }
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("MAGNETICCARDBTN",true).commit();
                }else {
                    sharedPreferences.edit().putBoolean("MAGNETICCARDBTN",false).commit();
                }
            }
        });
        cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("RFIDBTN",true).commit();
                }else {
                    sharedPreferences.edit().putBoolean("RFIDBTN",false).commit();
                }
            }
        });
        cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("IDENTIFYBTN",true).commit();
                }else {
                    sharedPreferences.edit().putBoolean("IDENTIFYBTN",false).commit();
                }
            }
        });
        cb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("PCSCBTN",true).commit();
                }else {
                    sharedPreferences.edit().putBoolean("PCSCBTN",false).commit();
                }
            }
        });
        cb7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("NFCBTN",true).commit();
                    XuanXiangUtil.NFCBTN=true;
                }else {
                    sharedPreferences.edit().putBoolean("NFCBTN",false).commit();
                    XuanXiangUtil.NFCBTN=false;
                }
            }
        });
        cb8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("PSAMBTN",true).commit();
                    XuanXiangUtil.PSAMBTN=true;
                }else {
                    sharedPreferences.edit().putBoolean("PSAMBTN",false).commit();
                    XuanXiangUtil.PSAMBTN=false;
                }
            }
        });
       /* cb9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("HDMIBTN",true).commit();
                    XuanXiangUtil.HDMIBTN=true;
                }else {
                    sharedPreferences.edit().putBoolean("HDMIBTN",false).commit();
                    XuanXiangUtil.HDMIBTN=false;
                }
            }
        });*/
        cb10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("MONEYBOX",true).commit();
                    XuanXiangUtil.MONEYBOX=true;
                }else {
                    sharedPreferences.edit().putBoolean("MONEYBOX",false).commit();
                    XuanXiangUtil.MONEYBOX=false;
                }
            }
        });
        cb11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("IRBTN",true).commit();
                    XuanXiangUtil.IRBTN=true;
                }else {
                    sharedPreferences.edit().putBoolean("IRBTN",false).commit();
                    XuanXiangUtil.IRBTN=false;
                }
            }
        });
        cb12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("LEDBTN",true).commit();
                    XuanXiangUtil.LEDBTN=true;
                }else {
                    sharedPreferences.edit().putBoolean("LEDBTN",false).commit();
                    XuanXiangUtil.LEDBTN=false;
                }
            }
        });
        cb13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sharedPreferences.edit().putBoolean("DECODEBTN",true).commit();
                    XuanXiangUtil.DECODEBTN=true;
                }else {
                    sharedPreferences.edit().putBoolean("DECODEBTN",false).commit();
                    XuanXiangUtil.DECODEBTN=false;
                }
            }
        });

    }
    //拦截返回键
    @Override
    public void onBackPressed() {
        Intent loginIt = new Intent(XuanXiang.this, MainActivity.class);
        startActivity(loginIt);
        finish();
    }
}
