package com.example.ankit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView,tV;
    Button A, S, M, D,ROOT,SQR,EXP,MOD;
    String st="";
    String temp,sub;
    float num = 0, num1 = 0;
    float res = 0;
    double num2 = 0;
    double res2 = 0;
    int t;
    double answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void one(View view) {
        tV = (TextView) findViewById(R.id.label1);
        textView = (TextView) findViewById(R.id.label);
        if(textView.getText().toString().equals("0")) {
            textView.setText("");
            tV.setText("");
            textView.setText(textView.getText() + "1");
            tV.setText(tV.getText() + "1");
        }
        else{
            textView.setText(textView.getText() + "1");
            tV.setText(tV.getText() + "1");
        }
    }

    public void two(View view) {
        tV = (TextView) findViewById(R.id.label1);
        textView = (TextView) findViewById(R.id.label);
        if(textView.getText().toString().equals("0")) {
            textView.setText("");
            tV.setText("");
            textView.setText(textView.getText() + "2");
            tV.setText(tV.getText() + "12");
        }
        else{
            textView.setText(textView.getText() + "2");
            tV.setText(tV.getText() + "2");
        }

    }

    public void three(View view) {
        tV = (TextView) findViewById(R.id.label1);
        textView = (TextView) findViewById(R.id.label);
        if(textView.getText().toString().equals("0")) {
            textView.setText("");
            tV.setText("");
            textView.setText(textView.getText() + "3");
            tV.setText(tV.getText() + "3");
        }
        else{
            textView.setText(textView.getText() + "3");
            tV.setText(tV.getText() + "3");
        }
    }

    public void four(View view) {
        tV = (TextView) findViewById(R.id.label1);
        textView = (TextView) findViewById(R.id.label);
        if(textView.getText().toString().equals("0")) {
            textView.setText("");
            tV.setText("");
            textView.setText(textView.getText() + "4");
            tV.setText(tV.getText() + "4");
        }
        else{
            textView.setText(textView.getText() + "4");
            tV.setText(tV.getText() + "4");
        }
    }

    public void five(View view) {
        tV = (TextView) findViewById(R.id.label1);
        textView = (TextView) findViewById(R.id.label);
        if(textView.getText().toString().equals("0")) {
            textView.setText("");
            tV.setText("");
            textView.setText(textView.getText() + "5");
            tV.setText(tV.getText() + "5");
        }
        else{
            textView.setText(textView.getText() + "5");
            tV.setText(tV.getText() + "5");
        }
    }

    public void six(View view) {
        tV = (TextView) findViewById(R.id.label1);
        textView = (TextView) findViewById(R.id.label);
        if(textView.getText().toString().equals("0")) {
            textView.setText("");
            tV.setText("");
            textView.setText(textView.getText() + "6");
            tV.setText(tV.getText() + "6");
        }
        else{
            textView.setText(textView.getText() + "6");
            tV.setText(tV.getText() + "6");
        }
    }

    public void seven(View view) {
        tV = (TextView) findViewById(R.id.label1);
        textView = (TextView) findViewById(R.id.label);
        if(textView.getText().toString().equals("0")) {
            textView.setText("");
            tV.setText("");
            textView.setText(textView.getText() + "7");
            tV.setText(tV.getText() + "7");
        }
        else{
            textView.setText(textView.getText() + "7");
            tV.setText(tV.getText() + "7");
        }
    }

    public void eight(View view) {
        tV = (TextView) findViewById(R.id.label1);
        textView = (TextView) findViewById(R.id.label);
        if(textView.getText().toString().equals("0")) {
            textView.setText("");
            tV.setText("");
            textView.setText(textView.getText() + "8");
            tV.setText(tV.getText() + "8");
        }
        else{
            textView.setText(textView.getText() + "8");
            tV.setText(tV.getText() + "8");
        }
    }

    public void nine(View view) {
        tV = (TextView) findViewById(R.id.label1);
        textView = (TextView) findViewById(R.id.label);
        if(textView.getText().toString().equals("0")) {
            textView.setText("");
            tV.setText("");
            textView.setText(textView.getText() + "9");
            tV.setText(tV.getText() + "9");
        }
        else{
            textView.setText(textView.getText() + "9");
            tV.setText(tV.getText() + "9");
        }
    }

    public void zero(View view) {
        textView = (TextView) findViewById(R.id.label);
        tV = (TextView) findViewById(R.id.label1);
        if (textView.getText().toString().equals("0")) {
            tV.setText("0");
        } else {
            tV = (TextView) findViewById(R.id.label1);
            textView = (TextView) findViewById(R.id.label);
            textView.setText(textView.getText() + "0");
            tV.setText(tV.getText() + "0");
        }
    }

    public void dot(View view){
        tV = (TextView) findViewById(R.id.label1);
        textView = (TextView) findViewById(R.id.label);
        textView.setText(textView.getText() + ".");
        tV.setText(tV.getText() + ".");
    }

    public void clear(View view) {
        tV = (TextView) findViewById(R.id.label1);
        textView = (TextView) findViewById(R.id.label);
        textView.setText("0");
        tV.setText("");
        num = 0;
        num1 = 0;
        res = 0;
        st = "";
    }

    public void plus(View view) {
        textView = (TextView) findViewById(R.id.label);
        tV = (TextView) findViewById(R.id.label1);
        if(textView.getText().toString().equals("+ ")){
            textView.setText("0");
        }
        else{
        A = (Button) findViewById(R.id.add);
        st = A.getText().toString();
        num = Float.parseFloat(textView.getText().toString());
        textView.setText("+ ");
        tV.setText(tV.getText() + "+");
       }
//       if(st.equals("+")){
//            res = num + Float.parseFloat(textView.getText().toString());
//       }
 }

    public void minus(View view) {
        textView = (TextView) findViewById(R.id.label);
        tV = (TextView) findViewById(R.id.label1);
        if(textView.getText().toString().equals("- ")){
            textView.setText("0");
        }
        else{
            S = (Button) findViewById(R.id.subtract);
            st = S.getText().toString();
            num = Float.parseFloat(textView.getText().toString());
            textView.setText("- ");
            tV.setText(tV.getText() + "-");
        }
    }

    public void multiply(View view) {
        textView = (TextView) findViewById(R.id.label);
        tV = (TextView) findViewById(R.id.label1);
        if(textView.getText().toString().equals("* ")){
            textView.setText("0");
        }
        else{
            M = (Button) findViewById(R.id.product);
            st = M.getText().toString();
            num = Float.parseFloat(textView.getText().toString());
            textView.setText("* ");
            tV.setText(tV.getText() + "*");
        }
    }

    public void divide(View view) {
        textView = (TextView) findViewById(R.id.label);
        tV = (TextView) findViewById(R.id.label1);
        if(textView.getText().toString().equals("/ ")){
            textView.setText("0");
        }
        else{
            D = (Button) findViewById(R.id.division);
            st = D.getText().toString();
            num = Float.parseFloat(textView.getText().toString());
            textView.setText("/ ");
            tV.setText(tV.getText() + "/");
        }
    }

    public void sqrt(View view){
        textView = (TextView) findViewById(R.id.label);
        tV = (TextView) findViewById(R.id.label1);
        if(textView.getText().toString().equals("√ ")){
            textView.setText("0");
        }
        else{
            ROOT = (Button) findViewById(R.id.root);
            st = ROOT.getText().toString();
            num = Float.parseFloat(textView.getText().toString());
            textView.setText("√ ");
            tV.setText(tV.getText() + "√");
        }
    }

    public void power(View view){
        textView = (TextView) findViewById(R.id.label);
        tV = (TextView) findViewById(R.id.label1);
        if(textView.getText().toString().equals("EXP ")){
            textView.setText("0");
        }
        else{
            EXP = (Button) findViewById(R.id.exp);
            st = EXP.getText().toString();
            num = Float.parseFloat(textView.getText().toString());
            textView.setText("EXP ");
            tV.setText(tV.getText() + "EXP");
        }
    }

    public void square(View view){
        textView = (TextView) findViewById(R.id.label);
        tV = (TextView) findViewById(R.id.label1);
        if(textView.getText().toString().equals("SQR ")){
            textView.setText("0");
        }
        else{
            SQR = (Button) findViewById(R.id.sqr);
            st = SQR.getText().toString();
            num = Float.parseFloat(textView.getText().toString());
            textView.setText("SQR ");
            tV.setText(tV.getText() + "SQR");
        }
    }

    public void percent(View view){
        textView = (TextView) findViewById(R.id.label);
        tV = (TextView) findViewById(R.id.label1);
        if(textView.getText().toString().equals("% ")){
            textView.setText("0");
        }
        else{
            MOD = (Button) findViewById(R.id.mod);
            st = MOD.getText().toString();
            num = Float.parseFloat(textView.getText().toString());
            textView.setText("% ");
            tV.setText(tV.getText() + "%");
        }
    }


    public void equal(View view) {
        textView = (TextView) findViewById(R.id.label);
        tV = (TextView) findViewById(R.id.label1);
        switch(st) {
            case "+":
                temp = textView.getText().toString();
                sub = temp.substring(2);
                num1 = Float.parseFloat(sub);
                res = num + num1;
                answer = res;
                textView.setText("" + res);
                tV.setText("" + res);
                break;
            case "-":
                temp = textView.getText().toString();
                sub = temp.substring(2);
                num1 = Float.parseFloat(sub);
                res = num - num1;
                answer = res;
                textView.setText("" + res);
                tV.setText("" + res);
                break;
            case "*":
                temp = textView.getText().toString();
                sub = temp.substring(2);
                num1 = Float.parseFloat(sub);
                res = num * num1;
                answer = res;
                textView.setText("" + res);
                tV.setText("" + res);
                break;
            case "/":
                temp = textView.getText().toString();
                sub = temp.substring(2);
                num1 = Float.parseFloat(sub);
                if(num1 == 0){
                    textView.setText("Can't divide by zero");
                }
                else {
                    res = num / num1;
                    answer = res;
                    textView.setText("" + res);
                    tV.setText("" + res);
                }
                break;
            case "√":
                temp = textView.getText().toString();
                sub = temp.substring(2);
                num2 = Double.parseDouble(sub);
                res2 = Math.sqrt(num2);
                answer = res2;
                textView.setText(""+res2);
                tV.setText("" + res2);
                break;
            case "EXP":
                temp = textView.getText().toString();
                sub = temp.substring(4);
                num2 = Double.parseDouble(sub);
                res2 = Math.pow(10,num2);
                answer = res2;
                textView.setText(""+res2);
                tV.setText("" + res2);
                break;
            case "SQR":
                temp = textView.getText().toString();
                sub = temp.substring(4);
                num2 = Double.parseDouble(sub);
                res2 = Math.pow(num2,2);
                answer = res2;
                textView.setText(""+res2);
                tV.setText("" + res2);
                break;
            case "%":
                temp = textView.getText().toString();
                sub = temp.substring(2);
                num2 = Double.parseDouble(sub);
                res2 = num2/100;
                answer = res2;
                textView.setText(""+res2);
                tV.setText("" + res2);
                break;
            case "":
                t = Integer.parseInt(textView.getText().toString());
                textView.setText(""+ t);
                tV.setText("" + t);
                break;
        }
    }

    public void answer(View view){
        textView = (TextView) findViewById(R.id.label);
        textView.setText(textView.getText().toString() +answer);
    }

    public void backspace(View view)
    {
        textView = (TextView) findViewById(R.id.label);
        String str = textView.getText().toString();
        String str1 = tV.getText().toString();
        if(str.length() > 1){
            str = str.substring(0, str.length() - 1);
            str1 = str1.substring(0, str1.length() - 1);
            textView.setText(str);
            tV.setText(str1);
        }
        else if (str.length() <=1 ) {
            textView.setText("0");
            tV.setText("0");
        }
    }
}
