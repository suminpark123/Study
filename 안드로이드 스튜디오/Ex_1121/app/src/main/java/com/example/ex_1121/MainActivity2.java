package com.example.ex_1121;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
//public class MainActivity2 extends AppCompatActivity {

    //1. view 선언
    EditText edt_num1;
    EditText edt_num2;
    Button btn_plus;
    Button btn_sub;
    Button btn_mul;
    Button btn_4;
    TextView tv_result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //2. view id값 저장
        edt_num1= findViewById(R.id.edt_num1);
        edt_num2= findViewById(R.id.edt_num2);
        btn_plus= findViewById(R.id.btn_plus);
        btn_sub= findViewById(R.id.btn_sub);
        btn_mul= findViewById(R.id.btn_mul);
        btn_4=findViewById(R.id.btn_4);
        tv_result=findViewById(R.id.tv_result);
        //3. btn버튼을 클릭했을 때 각 버튼의 기능에 맞춰 연산 진행하기
       btn_plus.setOnClickListener(this);
       btn_sub.setOnClickListener(this);
       btn_mul.setOnClickListener(this);
       btn_4.setOnClickListener(this);


        //-이벤트 연결은 클래스 활용한 이벤트-> interface 사용

        //4. onclick() 메소드 내에서 사용자가 클릭한 버튼이 어떤 버튼인지 확인하기
        //-확인된 버튼에 따라 첫번째 정수,두번째 정수 값을 가져와
        //연산 진행하기
        //-연산에 따른 결과값 tv_result에 띄우기
    }


    @Override
    public void onClick(View view) {
        int n1 = Integer.parseInt(edt_num1.getText().toString());
        int n2 = Integer.parseInt(edt_num2.getText().toString());

        if(view.getId()==R.id.btn_plus){
            Log.d("check","더하기체크콘솔");
            tv_result.setText(Integer.toString(n1+n2));

        }
        else if(view.getId()==R.id.btn_sub){
            if(n1>n2){
                tv_result.setText(Integer.toString(n1-n2));
            }else{
                tv_result.setText(Integer.toString(n2-n1));
            }
        }
        else if(view.getId()==R.id.btn_mul){
            tv_result.setText(Integer.toString(n1*n2));
        }
        else if(view.getId()==R.id.btn_4){
            tv_result.setText(Integer.toString(n1/n2));
        }
    }
}