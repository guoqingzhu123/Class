package com.example.aclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.BreakIterator;

public class LoginActivity extends AppCompatActivity  {
    private TextView Title;
    private ImageView kecheng;
    private ImageView gongju;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Title = findViewById(R.id.Title);
        Intent intent = getIntent();
        String name = intent.getStringExtra("ttt");
        if (name != null){
            Title.setText(name+"欢迎来到的空间");
        }

        kecheng = findViewById(R.id.kecheng);
        gongju = findViewById(R.id.gongju);

        kecheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,ExamActivity.class);
                startActivity(intent);
            }
        });
    }

}
