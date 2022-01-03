package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button_1, button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_0,button_open, button_close,button_add,button_sub,button_mul,button_div,button_c,button_e;

    EditText edit;
    float result1,result2;

    boolean add,sub,mul,div;





















    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1 =(Button) findViewById(R.id.button_1);
        button_2 =(Button) findViewById(R.id.button_2);
        button_3 =(Button) findViewById(R.id.button_3);
        button_4 =(Button) findViewById(R.id.button_4);
        button_5 =(Button) findViewById(R.id.button_5);
        button_6 =(Button) findViewById(R.id.button_6);
        button_7 =(Button) findViewById(R.id.button_7);
        button_8 =(Button) findViewById(R.id.button_8);
        button_9 =(Button) findViewById(R.id.button_9);
        button_0 =(Button) findViewById(R.id.button_0);
        button_open =(Button) findViewById(R.id.button_open);
        button_close =(Button) findViewById(R.id.button_close);
        button_add =(Button) findViewById(R.id.button_add);
        button_sub =(Button) findViewById(R.id.button_sub);

        button_div =(Button) findViewById(R.id.button_div);
        button_mul =(Button) findViewById(R.id.button_mul);
        button_c =(Button) findViewById(R.id.button_c);
        button_e =(Button) findViewById(R.id.button_e);

        edit =(EditText) findViewById(R.id.edit);

        button_1.setOnClickListener(v -> edit.setText(edit.getText()+"1"));
        button_2.setOnClickListener(v -> edit.setText(edit.getText()+"2"));
        button_3.setOnClickListener(v -> edit.setText(edit.getText()+"3"));
        button_4.setOnClickListener(v -> edit.setText(edit.getText()+"4"));
        button_5.setOnClickListener(v -> edit.setText(edit.getText()+"5"));
        button_6.setOnClickListener(v -> edit.setText(edit.getText()+"6"));
        button_7.setOnClickListener(v -> edit.setText(edit.getText()+"7"));
        button_8.setOnClickListener(v -> edit.setText(edit.getText()+"8"));
        button_9.setOnClickListener(v -> edit.setText(edit.getText()+"9"));
        button_0.setOnClickListener(v -> edit.setText(edit.getText()+"0"));
        button_open.setOnClickListener(v -> edit.setText(edit.getText()+"("));
        button_close.setOnClickListener(v -> edit.setText(edit.getText()+")"));

        button_add.setOnClickListener(v -> {
            if(edit == null){

                edit.setText("");
            }
            else
            {
                result1= Float.parseFloat(edit.getText()+"");
                add=true;
                edit.setText("");
            }
        });
        button_sub.setOnClickListener(v -> {
            if(edit == null){

                edit.setText("");
            }
            else
            {
                result1= Float.parseFloat(edit.getText()+"");
                sub=true;
                edit.setText("");
            }
        });
        button_mul.setOnClickListener(v -> {
            if(edit == null){

                edit.setText("");
            }
            else
            {
                result1= Float.parseFloat(edit.getText()+"");
                mul=true;
                edit.setText("");
            }
        });
        button_div.setOnClickListener(v -> {
            if(edit == null){

                edit.setText("");
            }
            else
            {
                result1= Float.parseFloat(edit.getText()+"");
                div =true;
                edit.setText("");
            }
        });
        button_c.setOnClickListener(v -> edit.setText(""));
        button_e.setOnClickListener(v -> {
            result2= Float.parseFloat(edit.getText()+"");
            if(add== true){
                edit.setText(result1+result2 + "");
                add=false;

            }
            if(sub== true){
                edit.setText(result1-result2 + "");
                sub=false;

            }
            if(mul== true){
                edit.setText(result1*result2 + "");
                mul=false;

            }
            if(div== true){
                edit.setText(result1/result2 + "");
                div=false;

            }
        });

    }
}