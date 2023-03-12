package com.example.ex_1125;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView checktext;
    String nick = "안나라수마나라";
    Button Mainbtn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        checktext=findViewById(R.id.checktext);
        Mainbtn=findViewById(R.id.Mainbtn);

        String msg1=getIntent().getStringExtra("id");
        String msg2=getIntent().getStringExtra("pw");

        Log.d("check아이디",msg1);
        Log.d("check비번",msg2);

        if(msg1.equals("smhrd")&& msg2.equals("123")){
            checktext.setText("로그인 성공");
        }
        else {

            checktext.setText("로그인 실패");
        }



        Mainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String msg=getIntent().getStringExtra(nick);
//                Intent intent = new Intent(getApplicationContext(nick),MainActivity2.class);
                //로그인 성공 ->nick 전달 후 Toast 로 출력
                //로그인 실패 ->페이지바뀌고 "로그인 실패" Toast 출력

                //텍스트뷰안에 문자열과 비교하기 위함.
                if(checktext.getText().toString().equals("로그인 성공")){
                    //nick ->Intent 객체 저장
                    Intent intent = getIntent();
                    intent.putExtra("닉네임",nick);
                    setResult(RESULT_OK,intent);
                    //setResult : 양방향 intent 통신에서
                    //요청 내용이 제대로 실행 되었는지 판단 해줄 수 있는 기능
                    //요청하는 쪽에서 가지고 있는 onActivityResult를 실행 시키겠습니다.

                }
                else {
                    Intent intent = getIntent();
                    intent.putExtra("닉네임","비밀번호 다시입력 바람");
                    setResult(100,intent);

                }

                //다시 원래 페이지로 돌아가고싶어...
//                Intent intent = new Intent();
//                intent.putExtra("닉네임",nick);
//
//                setResult(RESULT_OK,intent);

                finish();


            }
        });
    }
}