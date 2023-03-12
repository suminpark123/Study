package com.example.ex_1125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    TextView tv_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_view= findViewById(R.id.tv_view);

        //화면이 전환 되었을때 main에서 보내준 "data"값 꺼내오기
        //data -> intent를 통한 전달
        //getIntent() : 이전화면에서 생성하고 전달하는 Intent를 가져오는 메소드
        String msg=getIntent().getStringExtra("data");

        //받아온 데이터 tv_view에 연결
        tv_view.setText(msg);

        //양방향 사용시 결과에 대한 메소드를 수행할 수 있도록
        //메소드 호출하기 -> onActivityResult() -> setResult()
        setResult(RESULT_OK);


        //양방향에 대한 처리가 끝나면 자동으로 요청한 Activity화면으로 이동
        //성공에 대한 결과값을 담아서 이동
//        finish();

    }
}