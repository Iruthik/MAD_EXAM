package com.example.sjcet.sharedpreference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        SharedPreferences  mypref = getSharedPreferences("activity_main2.xml",0);

        String name = mypref.getString("Name",null);
        String email = mypref.getString("Email",null);
        String mobile = mypref.getString("Mobile",null);
        String username = mypref.getString("Username",null);
        String dob = mypref.getString("DOB",null);

//        String year = dob.substring(5);
//        int y = Integer.parseInt(year);
//        int age = 2022-y;

//
//        char[] b = new char[4];
//        char[] a =dob.toCharArray();
//        for(int i=4;i<=7;i++) {
//            b[i] = a[i];
//        }
//        String yr = b.toString();
//
//        int y = Integer.parseInt(yr);
//        int age = 2022-y;

        tv1.setText("Full Name:"+name);
        tv2.setText("Email    :"+email);
        tv3.setText("Mobile   :"+mobile);
        tv4.setText("Username :"+username);
        tv5.setText("Date of Birth:"+dob);
        tv6.setText("age");


    }
}
