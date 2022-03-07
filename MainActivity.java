package com.example.chet4ik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.Menu;
import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String LOG_TAG = "myLogs";
    public Integer counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtnAddSKot(View view) {
        counter+=1;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        if (counter >= 10){
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams oval = layout.getLayoutParams();
            oval.height = 400;
            oval.width = 400;
            layout.setLayoutParams(oval);

        }
        if (counter >= 100){
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams oval = layout.getLayoutParams();
            oval.height = 450;
            oval.width = 450;
            layout.setLayoutParams(oval);

        }
        if (counter >= 1000){
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams oval = layout.getLayoutParams();
            oval.height = 500;
            oval.width = 500;
            layout.setLayoutParams(oval);

        }

        }
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("Count");
        Log.d(LOG_TAG, "onRestoreInstanceState");
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Count", counter);
        Log.d(LOG_TAG, "onSaveInstateState");
    }

}
