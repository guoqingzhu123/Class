package com.example.aclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);
        login = findViewById(R.id.bt_login);
        exit = findViewById(R.id.bt_exit);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = ((EditText) findViewById(R.id.et_username)).getText().toString();
                String password = ((EditText) findViewById(R.id.et_password)).getText().toString();
                if(username.equals("zgq")&& password.equals("123456")){
                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                    intent.putExtra("ttt",username);
                    startActivity(intent);

                }else{
                    Toast.makeText(MainActivity.this,"账号或密码错误，请重新输入",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    }
