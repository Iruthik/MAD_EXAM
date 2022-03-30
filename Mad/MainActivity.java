package com.example.sjcet.sharedpreference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);
        ed4=findViewById(R.id.ed4);
        ed5=findViewById(R.id.ed5);
        ed6=findViewById(R.id.ed6);

    }


    public void Register(View view) {
        String name = ed1.getText().toString();
        String email = ed2.getText().toString();
        String mobile =ed3.getText().toString();
        String username = ed4.getText().toString();
        String password = ed5.getText().toString();
        String dob = ed6.getText().toString();
        if(name.length() ==0 || email.length() ==0 || mobile.length() ==0 || username.length() == 0 || password.length() == 0 || dob.length() == 0){
            Toast.makeText(this, "Please Fill the form Properly", Toast.LENGTH_SHORT).show();
        }

        else{
            SharedPreferences mypref = getSharedPreferences("activity_main2.xml", 0);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putString("Name", ed1.getText().toString());
            editor.putString("Email", ed2.getText().toString());
            editor.putString("Mobile", ed3.getText().toString());
            editor.putString("Username", ed4.getText().toString());
            editor.putString("Password", ed5.getText().toString());
            editor.putString("DOB", ed6.getText().toString());
            editor.commit();
            editor.apply();

            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }



    }

}
