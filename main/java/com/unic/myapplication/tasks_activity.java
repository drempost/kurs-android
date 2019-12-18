package com.unic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tasks_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_activity);
    }
    public void edit_task(View view) {
        Intent intent = new Intent(this, configuring_task.class);
        startActivity(intent);
    }
}
