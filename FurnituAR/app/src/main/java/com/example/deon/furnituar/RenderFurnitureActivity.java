package com.example.deon.furnituar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class RenderFurnitureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_render_furniture);
        Intent intent = getIntent();
        String selection = intent.getStringExtra(BrowseFurnitureActivity.SELECTED_FURNITURE);
        Log.d("TESTING PUTEXTRA", selection);
    }

}