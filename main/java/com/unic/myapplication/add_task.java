package com.unic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class add_task extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
    }
    public void create_project(View view) {
        Intent intent = new Intent(this, tasks_activity.class);
        startActivity(intent);
    }
}
