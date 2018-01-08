package com.example.juerany.fuckingmath;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by Juerany on 2018/1/2.
 */

public class SecondActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_second);
        Button bu1 = (Button)findViewById(R.id.bu1);
        Button bu2 = (Button)findViewById(R.id.bu2);
        Button bu3 = (Button)findViewById(R.id.bu3);
        bu1.setOnClickListener(new ButtonListener());
        bu2.setOnClickListener(new ButtonListener());
        bu3.setOnClickListener(new ButtonListener());
    }

    private class ButtonListener implements View.OnClickListener {

        public void onClick(View v) {
            Intent intent;
            switch (v.getId()){
                case R.id.bu1:
                    intent = new Intent(SecondActivity.this,Second_OneActivity.class);
                    startActivity(intent);
                    break;
                case R.id.bu2:
                    intent = new Intent(SecondActivity.this,Second_TwoActivity.class);
                    startActivity(intent);
                    break;
                case R.id.bu3:
                    intent = new Intent(SecondActivity.this,Second_ThreeActivity.class);
                    startActivity(intent);
                    break;
            }
        }

    }
}
