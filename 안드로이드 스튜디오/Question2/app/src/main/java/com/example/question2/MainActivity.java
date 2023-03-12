package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_pre, btn_next;
    ImageView img;
    private ImageView[] imageViews;

    int[] arr = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5};

    int index = 0;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_pre = findViewById(R.id.btn_pre);
        btn_next = findViewById(R.id.btn_next);
        img = findViewById(R.id.img);

        btn_pre.setOnClickListener(this);
        btn_next.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        // 4. 어떤 버튼이 눌렸는지 판단!

        if(view.getId()==R.id.btn_pre){
            if(index==0){
                index=4;
            }
            else{
                index--;
            }
            // 이전 버튼 클릭시 : 0 -> 2 -> 1 -> 0
        }else{
            index++;
            if(index==5){
                index=0;
            }
            // 다음 버튼 클릭시 : 0 -> 1 -> 2 -> 0
        }

        // 공통적으로 img를 띄울 수 있도록 연결

        img.setImageResource(arr[index]);
    }
}






