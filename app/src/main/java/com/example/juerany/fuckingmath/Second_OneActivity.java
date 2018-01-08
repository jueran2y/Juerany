package com.example.juerany.fuckingmath;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.juerany.fuckingmath.MathTool.MathTools;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Juerany on 2018/1/4.
 */

public class Second_OneActivity extends SecondActivity {
    //存储数字数组(Integer)
    protected ArrayList<Integer> numberArr = new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_second_one);
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
        Button bu_clear = (Button)findViewById(R.id.bu_clear);
        Button bu_plus = (Button)findViewById(R.id.bu_plus);
        Button bu_get = (Button)findViewById(R.id.bu_get);
        Button bu_back = (Button)findViewById(R.id.bu_back);
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
        bu_clear.setOnClickListener(new ButtonListener());
        bu_plus.setOnClickListener(new ButtonListener());
        bu_get.setOnClickListener(new ButtonListener());
        bu_back.setOnClickListener(new ButtonListener());
    }
    private class ButtonListener implements View.OnClickListener {
        CharSequence c;
        String string;
        String fraction;
        boolean flag = false;
        MathTools mathTools = new MathTools();
        TextView tv = (TextView)findViewById(R.id.textView);
        //方差保留四位小数
        DecimalFormat df = new DecimalFormat();
        //平均数结果
        double resultAverage = 0.0;
        //方差结果
        double resultVariance = 0.0;
        CharSequence str = null;
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
                case R.id.bu_clear:
                    fraction = "";
                    tv.setText("");
                    numberArr.clear();
                    c = "";
                    string = "";
                    resultAverage = 0.0;
                    resultVariance = 0.0;
                    break;
                case R.id.bu_plus:
                    c = tv.getText();
                    string = c.toString();
                    if(!(string.contains("["))){
                        if(!(tv.getText().equals(""))){
                            numberArr.add(Integer.valueOf(c.toString()));
                            tv.setText("");
                        }
                    }
                    if(string.contains("[")){
                        fraction = "";
                        tv.setText("");
                        numberArr.clear();
                        c = "";
                        string = "";
                        resultAverage = 0.0;
                        resultVariance = 0.0;
                    }
                    break;
                case R.id.bu_back:
                    if(!(tv.getText().equals(""))){
                        c = tv.getText();
                        string = c.toString();
                        string = string.substring(0,string.length() - 1);
                        tv.setText(string);
                    }
                    break;
                case R.id.bu_get:
                    ////方差保留四位小数
                    df.setMaximumFractionDigits(4);
                    df.setRoundingMode(RoundingMode.UP);
                    c = tv.getText();
                    string = c.toString();
                    if(!(string.contains("["))){
                        //如果数组里有数，且TextView为空
                        if(numberArr.size() != 0 && tv.getText().equals("")){
                            resultAverage = mathTools.average(numberArr);
                            resultVariance = mathTools.variance(numberArr,resultAverage);
                            //解决分数问题,如果可以显示成分数形式，则显示出来
                            int upNum = mathTools.useNumber(numberArr,resultAverage);
                            int downNum = numberArr.size();
                            if(upNum != 0){
                                fraction = mathTools.fraction(upNum,downNum);
                            }
                            tv.setText(numberArr.toString() + "\n平均数为：" + df.format(resultAverage) + "\n方差为 " + df.format(resultVariance) + "\n转换" + fraction);
                            //此时控制不能点按+
                            fraction = "";
                        }
                        //TextView里还有数没加，且数组里有数
                        else if(numberArr.size() != 0 && !(tv.getText().equals(""))){
                            CharSequence c = tv.getText();
                            numberArr.add(Integer.valueOf(c.toString()));
                            resultAverage = mathTools.average(numberArr);
                            resultVariance = mathTools.variance(numberArr,resultAverage);
                            //解决分数问题,如果可以显示成分数形式，则显示出来
                            int upNum = mathTools.useNumber(numberArr,resultAverage);
                            int downNum = numberArr.size();
                            if(upNum != 0){
                                fraction = mathTools.fraction(upNum,downNum);
                            }
                            tv.setText(numberArr.toString() + "\n平均数为：" + df.format(resultAverage) + "\n方差为 " + df.format(resultVariance) + "\n转换" + fraction);
                            //此时控制不能点按+
                            fraction = "";
                        }
                    }
                    if(string.contains("[")){
                        fraction = "";
                        tv.setText("");
                        numberArr.clear();
                        c = "";
                        string = "";
                        resultAverage = 0.0;
                        resultVariance = 0.0;
                    }
                    break;
            }
        }
    }
}
