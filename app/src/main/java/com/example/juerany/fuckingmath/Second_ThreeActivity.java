package com.example.juerany.fuckingmath;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.juerany.fuckingmath.MathTool.MathTools;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Juerany on 2018/1/6.
 */

public class Second_ThreeActivity extends SecondActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_second_three);

        Button bu_0 = (Button)findViewById(R.id.bu_0);
        Button bu_1 = (Button)findViewById(R.id.bu_1);
        Button bu_2 = (Button)findViewById(R.id.bu_2);
        Button bu_3 = (Button)findViewById(R.id.bu_3);
        Button bu_4 = (Button)findViewById(R.id.bu_4);
        Button bu_5 = (Button)findViewById(R.id.bu_5);
        Button bu_6 = (Button)findViewById(R.id.bu_6);
        Button bu_7 = (Button)findViewById(R.id.bu_7);
        Button bu_8 = (Button)findViewById(R.id.bu_8);
        Button bu_9 = (Button)findViewById(R.id.bu_9);
        Button bu_gang = (Button)findViewById(R.id.bu_gang);
        Button bu_clear = (Button)findViewById(R.id.bu_clear);
        Button bu_back = (Button)findViewById(R.id.bu_back);
        Button bu_get = (Button)findViewById(R.id.bu_get);
        bu_0.setOnClickListener(new ButtonListener());
        bu_1.setOnClickListener(new ButtonListener());
        bu_2.setOnClickListener(new ButtonListener());
        bu_3.setOnClickListener(new ButtonListener());
        bu_4.setOnClickListener(new ButtonListener());
        bu_5.setOnClickListener(new ButtonListener());
        bu_6.setOnClickListener(new ButtonListener());
        bu_7.setOnClickListener(new ButtonListener());
        bu_8.setOnClickListener(new ButtonListener());
        bu_9.setOnClickListener(new ButtonListener());
        bu_back.setOnClickListener(new ButtonListener());
        bu_gang.setOnClickListener(new ButtonListener());
        bu_clear.setOnClickListener(new ButtonListener());
        bu_get.setOnClickListener(new ButtonListener());
    }

    private class ButtonListener implements View.OnClickListener{
        String string;
        String result = null;
        TextView tv = (TextView)findViewById(R.id.Num);
        TextView tv2 = (TextView)findViewById(R.id.tv_result);
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<String> numberString = new ArrayList<>();
        MathTools mathTools = new MathTools();
        CharSequence str;
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.bu_0:
                    str = tv.getText();
                    str = str + "0";
                    tv.setText(str);
                    break;
                case R.id.bu_1:
                    str = tv.getText();
                    str = str + "1";
                    tv.setText(str);
                    break;
                case R.id.bu_2:
                    str = tv.getText();
                    str = str + "2";
                    tv.setText(str);
                    break;
                case R.id.bu_3:
                    str = tv.getText();
                    str = str + "3";
                    tv.setText(str);
                    break;
                case R.id.bu_4:
                    str = tv.getText();
                    str = str + "4";
                    tv.setText(str);
                    break;
                case R.id.bu_5:
                    str = tv.getText();
                    str = str + "5";
                    tv.setText(str);
                    break;
                case R.id.bu_6:
                    str = tv.getText();
                    str = str + "6";
                    tv.setText(str);
                    break;
                case R.id.bu_7:
                    str = tv.getText();
                    str = str + "7";
                    tv.setText(str);
                    break;
                case R.id.bu_8:
                    str = tv.getText();
                    str = str + "8";
                    tv.setText(str);
                    break;
                case R.id.bu_9:
                    str = tv.getText();
                    str = str + "9";
                    tv.setText(str);
                    break;
                case R.id.bu_gang:
                    str = tv.getText();
                    str = str + "/";
                    tv.setText(str);
                    break;
                case R.id.bu_clear:
                    tv.setText("");
                    tv2.setText("分数结果是: ");
                    result = "";
                    number.clear();
                    break;
                case R.id.bu_back:
                    if(!(tv.getText().equals(""))){
                        string = tv.getText().toString();
                        string = string.substring(0,string.length() - 1);
                        tv.setText(string);
                    }
                    break;
                case R.id.bu_get:
                    if(!(tv.getText().equals(""))){
                        String str = tv.getText().toString();
                        String[] numberStr = str.split("/");
                        Arrays.asList(numberStr);
                        numberString = new ArrayList<>(Arrays.asList(numberStr));

                        //从String数组转化成Integer数组
                        for(int i = 0;i < numberString.size();i++){
                            String string = numberString.get(i);
                            number.add(Integer.valueOf(string));
                        }
                        result = mathTools.fraction(number.get(0),number.get(1));
                        System.out.print(result);
                        tv2.setText(result);
                    }
            }
        }
    }
    }
