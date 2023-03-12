package com.example.ex_1117;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       Button btn1 =  findViewById(R.id.btn1);
       Button btn2 =  findViewById(R.id.btn2);
       Button btn3 =  findViewById(R.id.btn3);
       ConstraintLayout layout1 = findViewById(R.id.layout1);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout1.setBackgroundColor(Color.RED);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout1.setBackgroundColor(Color.GREEN);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout1.setBackgroundColor(Color.BLUE);
            }
        });



    }
//    @Override
//    public void onClick(View view) {
//        if(view.getId()==R.id.btn1){
//            layout1.setBackgroundColor(Color.RED);
//        }
//        else if(view.getId==R.id.btn2){
//            layout1.setBackgroundColor(Color.BLUE);
//        }
//        else{
//            layout1.setBackgroundColor(Color.GREEN);
//
//        }
//    }



}
