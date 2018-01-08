package com.example.juerany.fuckingmath;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.juerany.fuckingmath.MathTool.MathTools;

import org.w3c.dom.Text;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Juerany on 2018/1/6.
 */

public class Second_TwoActivity extends SecondActivity {
    boolean up_down = true;
    MathTools mathTools = new MathTools();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_second_two);

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
        Button bu_A = (Button)findViewById(R.id.bu_A);
        Button bu_C = (Button)findViewById(R.id.bu_C);
        Button bu_clear = (Button)findViewById(R.id.bu_clear);
        Button bu_up = (Button)findViewById(R.id.bu_up);
        Button bu_down = (Button)findViewById(R.id.bu_down);
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
        bu_A.setOnClickListener(new ButtonListener());
        bu_C.setOnClickListener(new ButtonListener());
        bu_up.setOnClickListener(new ButtonListener());
        bu_down.setOnClickListener(new ButtonListener());
        bu_back.setOnClickListener(new ButtonListener());
        bu_get.setOnClickListener(new ButtonListener());
        bu_clear.setOnClickListener(new ButtonListener());
    }

    private class ButtonListener implements View.OnClickListener{
        TextView tv_error = (TextView)findViewById(R.id.Text_error);
        TextView tv_AC = (TextView)findViewById(R.id.TextA);
        TextView tv_upNum = (TextView)findViewById(R.id.upNum);
        TextView tv_downNum = (TextView)findViewById(R.id.downNum);
        TextView tv_result = (TextView)findViewById(R.id.result);
        DecimalFormat df = new DecimalFormat();
        CharSequence c;
        String string;
        CharSequence str = null;
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.bu_0:
                    if(up_down == true){
                        str = tv_upNum.getText();
                        str = str + "0";
                        tv_upNum.setText(str);
                    }else{
                        str = tv_downNum.getText();
                        str = str + "0";
                        tv_downNum.setText(str);
                    }
                    break;
                case R.id.bu_1:
                    if(up_down == true){
                        str = tv_upNum.getText();
                        str = str + "1";
                        tv_upNum.setText(str);
                    }else{
                        str = tv_downNum.getText();
                        str = str + "1";
                        tv_downNum.setText(str);
                    }
                    break;
                case R.id.bu_2:
                    if(up_down == true){
                        str = tv_upNum.getText();
                        str = str + "2";
                        tv_upNum.setText(str);
                    }else{
                        str = tv_downNum.getText();
                        str = str + "2";
                        tv_downNum.setText(str);
                    }
                    break;
                case R.id.bu_3:
                    if(up_down == true){
                        str = tv_upNum.getText();
                        str = str + "3";
                        tv_upNum.setText(str);
                    }else{
                        str = tv_downNum.getText();
                        str = str + "3";
                        tv_downNum.setText(str);
                    }
                    break;
                case R.id.bu_4:
                    if(up_down == true){
                        str = tv_upNum.getText();
                        str = str + "4";
                        tv_upNum.setText(str);
                    }else{
                        str = tv_downNum.getText();
                        str = str + "4";
                        tv_downNum.setText(str);
                    }
                    break;
                case R.id.bu_5:
                    if(up_down == true){
                        str = tv_upNum.getText();
                        str = str + "5";
                        tv_upNum.setText(str);
                    }else{
                        str = tv_downNum.getText();
                        str = str + "5";
                        tv_downNum.setText(str);
                    }
                    break;
                case R.id.bu_6:
                    if(up_down == true){
                        str = tv_upNum.getText();
                        str = str + "6";
                        tv_upNum.setText(str);
                    }else{
                        str = tv_downNum.getText();
                        str = str + "6";
                        tv_downNum.setText(str);
                    }
                    break;
                case R.id.bu_7:
                    if(up_down == true){
                        str = tv_upNum.getText();
                        str = str + "7";
                        tv_upNum.setText(str);
                    }else{
                        str = tv_downNum.getText();
                        str = str + "7";
                        tv_downNum.setText(str);
                    }
                    break;
                case R.id.bu_8:
                    if(up_down == true){
                        str = tv_upNum.getText();
                        str = str + "8";
                        tv_upNum.setText(str);
                    }else{
                        str = tv_downNum.getText();
                        str = str + "8";
                        tv_downNum.setText(str);
                    }
                    break;
                case R.id.bu_9:
                    if(up_down == true){
                        str = tv_upNum.getText();
                        str = str + "9";
                        tv_upNum.setText(str);
                    }else{
                        str = tv_downNum.getText();
                        str = str + "9";
                        tv_downNum.setText(str);
                    }
                    break;
                case R.id.bu_back:
                    if(up_down == true){
                        if(!(tv_upNum.getText().equals(""))){
                            c = tv_upNum.getText();
                            string = c.toString();
                            string = string.substring(0,string.length() - 1);
                            tv_upNum.setText(string);
                        }
                    }else{
                        if(!(tv_downNum.getText().equals(""))){
                            c = tv_downNum.getText();
                            string = c.toString();
                            string = string.substring(0,string.length() - 1);
                            tv_downNum.setText(string);
                        }
                    }
                    break;
                case R.id.bu_up:
                    up_down = true;
                    break;
                case R.id.bu_down:
                    up_down = false;
                    break;
                case R.id.bu_A:
                    tv_AC.setText("A");
                    break;
                case R.id.bu_C:
                    tv_AC.setText("C");
                    break;
                case R.id.bu_clear:
                    tv_AC.setText("A");
                    tv_result.setText("");
                    tv_upNum.setText("");
                    tv_downNum.setText("");
                    tv_error.setText("");
                    up_down = true;
                    break;
                case R.id.bu_get:
                    if(tv_AC.getText().equals("A")){
                        if(!(tv_upNum.getText().equals("")) && !(tv_downNum.getText().equals(""))){
                            int upNum = Integer.valueOf(tv_upNum.getText().toString());
                            int downNum = Integer.valueOf(tv_downNum.getText().toString());
                            int result = mathTools.getA(upNum,downNum,tv_error);
                            if(result != 0){
                                tv_result.setText(Integer.toString(result));
                            }
                        }
                    }
                    if(tv_AC.getText().equals("C")){
                        if(!(tv_upNum.getText().equals("")) && !(tv_downNum.getText().equals(""))){
                            int upNum = Integer.valueOf(tv_upNum.getText().toString());
                            int downNum = Integer.valueOf(tv_downNum.getText().toString());
                            double result = mathTools.getC(upNum,downNum,tv_error);
                            df.setMaximumFractionDigits(4);
                            df.setRoundingMode(RoundingMode.UP);
                            if(result != 0){
                                tv_result.setText(df.format(result));
                            }
                        }
                    }
                    break;
            }
        }
    }

}
