package com.example.ex_1122;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img;
    Button btnchange;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img = findViewById(R.id.img);
        btnchange =findViewById(R.id.btnchange);

        btnchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //img의 상태에 따라 다시 띄우거나 감추는 기능 만들기
                if(img.getVisibility()== view.VISIBLE){
                    btnchange.setText("VISIBLE");
                    img.setVisibility(View.INVISIBLE);
                }
                else {
                   img.setVisibility(view.VISIBLE);
                    btnchange.setText("INVISIBLE");
                }

            }
        });


    }
}