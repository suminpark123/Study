package com.example.ex_1122;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView score1,score2;
    ImageView dice1,dice2;
    Button btn;

    //주사위 이미지를 관리할 배열 생성
   int[] arr= {R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,
            R.drawable.dice6};
    int num1 = 0;
    int num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score1=findViewById(R.id.score1);
        score2=findViewById(R.id.score2);
        dice1=findViewById(R.id.dice1);
        dice2=findViewById(R.id.dice2);
        btn=findViewById(R.id.btn);


    //2. btn에 이벤트 달기

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //2-1 주사위의 이미지 변경하기

                // 랜덤으로 주사위 눈을 생성하기





                Random rd=new Random();
                int rd1=rd.nextInt(6);
                int rd2=rd.nextInt(6);

                //생성된 랜덤값을 실제 주사위 이미지에 연결하기
                dice1.setImageResource(arr[rd1]);
                dice2.setImageResource(arr[rd2]);

                //2-2 주사위의 눈을 비교하여 점수 배당하기


                if(rd1>rd2){
                    num1=num1+1;
                    score1.setText(Integer.toString(num1));
                }

                else{
                    num2=num2+1;
                    score2.setText(Integer.toString(num2));
                }

                //둘중에 한명이 5점을 달성할 경우 게임 종료
                //toast 메시지 사용
                if(num1==5 || num2==5){
                    num1=0;
                    num2=0;//                    Toast.makeText(어플의정보/메시지문구/메시지를 띄우는방법);
                    Toast.makeText(getApplicationContext(),"게임종료;;",Toast.LENGTH_LONG).show();
                    score1.setText(Integer.toString(num1));
                    score2.setText(Integer.toString(num2));
                }
            }

        });


   }
}