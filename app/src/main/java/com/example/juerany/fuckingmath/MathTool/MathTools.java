package com.example.juerany.fuckingmath.MathTool;

import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Juerany on 2018/1/5.
 */

public class MathTools {
    ArrayList<Integer> number = new ArrayList<>();
    double average;
    double a;

    //求平均数
    public double average(ArrayList<Integer> number){
        double resultAverage,b,c = 0.0;
        int a = 0;
        this.number = number;

        //求用户数字和
        for(int i = 0;i < number.size();i++){
            a = a + number.get(i);
        }

        //求用户数字平均数
        b = (double)a;
        c = (double)number.size();
        resultAverage = b/c;

        return resultAverage;
    }

    //求方差
    public double variance(ArrayList<Integer> number, double average) {
        this.number = number;
        this.average = average;
        double a,b = 0.0,result = 0.0;
        for(int i = 0;i < number.size();i++){
            a = number.get(i) - average;
            b = b + a*a;
        }
        result = b / number.size();
        return result;
    }

    //方差分子计算
    public int useNumber(ArrayList<Integer> number, double average){
        this.number = number;
        this.average = average;

        double a,b = 0.0;
        for(int i = 0;i < number.size();i++){
            a = number.get(i) - average;
            b = b + a*a;
        }

        //判断是否含有小数点
        int i = (int)b;
        if(i - b == 0){
            return i;
        }

        return 0;
    }

    //分数显示
    public String fraction(int num1, int num2){
        String string;
        while(true){
            if(num1 > num2){
                if(num1 % num2 == 0){
                    num1 = num1 / num2;
                    num2 = 1;
                }
            }
            if(num1 < num2){
                if(num2 % num1 == 0){
                    num2 = num2 / num1;
                    num1 = 1;
                }
            }

            while(num1 % 2 == 0 && num2 % 2 == 0){
                num1 = num1 / 2;
                num2 = num2 / 2;
            }
            while(num1 % 3 == 0 && num2 % 3 == 0){
                num1 = num1 / 3;
                num2 = num2 / 3;
            }
            while(num1 % 5 == 0 && num2 % 5 == 0){
                num1 = num1 / 5;
                num2 = num2 / 5;
            }
            while(num1 % 7 == 0 && num2 % 7 == 0){
                num1 = num1 / 7;
                num2 = num2 / 7;
            }

            if(num1 == num2){
                //System.out.println("分数为1");
                string = "分数为 1";
                break;
            }
            if(num2 == 1){
                //System.out.println("分数为" + num1);
                string = "分数为 " + num1;
                break;
            }else
            {
                //System.out.println(num1 + " " + num2);
                string = "分数为 " + num1 + " / " + num2;
                break;
            }
        }
        return string;
    }

    //排列数计算
    public int getA(int num1, int num2, TextView tv_error){
        int result = 1;
        if(num1 > num2){
            tv_error.setText("上不能大于下");
            return 0;
        }
        if(num1 == 0 || num2 == 0){
            tv_error.setText("参数错误，上下不能有零");
            return 0;
        }
        for(int i = 0;i < num1;i++){
            result = result * num2;
            num2 = num2 - 1;
        }
        return result;
    }

    //组合数计算
    public double getC(int num1,int num2,TextView tv_error){
        int upResult,downResult;
        int result2 = 1;
        if(num2 == 0){
            return 1.0;
        }
        if(num1 > num2){
            tv_error.setText("上不能大于下");
            return 0.0;
        }
        upResult = getA(num1,num2,tv_error);
        int num3 = num1,num4 = num1;
        for(int i = 0;i < num3;i++){
            result2 = result2 * num4;
            num4 = num4 - 1;
        }
        downResult = result2;
        String str = fraction(upResult,downResult);
        tv_error.setText(str);
        double a = upResult / downResult;
        return a;
    }
}
