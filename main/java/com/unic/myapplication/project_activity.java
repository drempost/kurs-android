package com.unic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class project_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_activity);
    }
    public void open_tasks(View view) {
        Intent intent = new Intent(this, tasks_activity.class);
        startActivity(intent);
    }
    public void add_project(View view){
        Intent intent = new Intent(this, add_project.class);
        startActivity(intent);
    }
}
