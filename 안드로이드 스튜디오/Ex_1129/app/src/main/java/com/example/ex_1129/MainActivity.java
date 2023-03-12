package com.example.ex_1129;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> dataArray; // 데이터셋
    ArrayAdapter<String> adapter; //어댑터 사용!
    EditText listtext;
    Button listbtn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //activity_main.xml 파일을 Java에서 사용가능 하도록 변환해주겠습니다.
        setContentView(R.layout.activity_main);

        lv= findViewById(R.id.lv);
        listtext=findViewById(R.id.listtext);
        listbtn1=findViewById(R.id.listbtn1);

        //데이터 저장
        dataArray = new ArrayList<String>();
        dataArray.add("짜장면");
        dataArray.add("짬뽕");
        dataArray.add("탕슉");
        dataArray.add("잡탕밥");
        dataArray.add("간풍기");
        dataArray.add("유산술");
        dataArray.add("닌자완스");
        dataArray.add("앙장피");
        dataArray.add("샥스핀");
        dataArray.add("짜장면");
        dataArray.add("매실");
        dataArray.add("포도쥬스");
        dataArray.add("오렌지쥬스");
        dataArray.add("파워에이드");
        dataArray.add("비타500");
        dataArray.add("울면");
        dataArray.add("포도잼");
        dataArray.add("액체만 마시지 말고 밥 좀 먹고 살아요..");

        //어뎁터 : 데이터를 ListView의 항목(=아이템)으로 보여질 수 있도록 변환 해주는 역할
        //현재페이지의 정보,어떤 형식(항목)으로 띄워질지,어떤데이터를 띄울건지
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,dataArray);


        //어뎁터로 만들어진 항목들을 listview에 적용
        lv.setAdapter(adapter);

        //ListView 각각의 항목에 클릭이벤트 적용
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //adapterView : 현재 사용하고 있는 adapterView 의 속성 ==>ListView 속성
                //view : 클릭한 항목에 대한 객체
                // i : 몇번째 항목의 인덱스
                // l : 클릭한 항목의 ID값
                // int i를 스트링으로 변환
                Log.d("클릭한항목인덱스",String.valueOf(i));
                Toast.makeText(MainActivity.this,dataArray.get(i),Toast.LENGTH_SHORT).show();

           }
        });

        listbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String listtext2=listtext.getText().toString();
                Log.d("리스트추가테스트",listtext2);
                dataArray.add(listtext2);
//                lv.setAdapter(adapter);


                //어댑터 갱신 -->어댑터 내용을 갱신해줌으로써 연결되어있는 ListView(AdapterView)
                //에 자동으로 반영 시키는 기능
                //데이터 셋이 클수록 유리 해짐!

                adapter.notifyDataSetChanged();

            }
        });


    }
}