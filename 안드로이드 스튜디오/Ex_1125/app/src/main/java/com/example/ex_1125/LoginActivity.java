package com.example.ex_1125;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText idtext;
    EditText pwtext;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        idtext = findViewById(R.id.idtext);
        pwtext = findViewById(R.id.pwtext);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String idmsg=idtext.getText().toString();
                String pwmsg=pwtext.getText().toString();

                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("id",idmsg);
                    intent.putExtra("pw",pwmsg);
//                   startActivityForResult: 양방향 통신을 할거다
                    startActivityForResult(intent,0);
                }


        });



    }
//  onActivityResult : 결과를 받아와서 실행시키겠습니다.
    @Override
    protected void  onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        //data : setResult로 보냈던 intent 객체


        //사용자가 요청한 requestCode가 일치하는지 확인!
        //requestCode : 보낸페이지의 코드
        //resultCode : 결과에 대한 확인코드(값)
        if(requestCode== 0){
            //결과에 대한 응답 : RESULT_OK,RESULT_CANNCEL
            if(resultCode == RESULT_OK){
//                String msg=getIntent().getStringExtra("data");
                Toast.makeText(getApplicationContext(),data.getStringExtra("닉네임"), Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(),data.getStringExtra("닉네임"), Toast.LENGTH_SHORT).show();
            }
        }
    }

}