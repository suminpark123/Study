package com.example.ex_1207;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_time;
    Button btn_time;
    TextView tv_time2;
    MainHandler handler;

//    MainHandler handler2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_time=findViewById(R.id.tv_time);
        btn_time = findViewById(R.id.btn_time);
        tv_time2 = findViewById(R.id.tv_time2);
        btn_time.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Mythread mythread = new Mythread();
                Mythread2 mythread2 = new Mythread2();



                // Mythread 안에 있는 run 메소드를 실행시켜주세요!
                mythread.start();
                mythread2.start();

            }
        });
        handler = new MainHandler();
//        handler2 = new MainHandler();


    } // 여기까지 onCreate

    // 쓰레드에서 요청을 받아 화면에 있는 요소를 조작할 수 있는 Handler!

    class MainHandler extends Handler{
        @Override
        public void handleMessage(@NonNull Message msg) {

            Bundle bundle = msg.getData();

            if(bundle.getInt("valuee")==0){
                int value = bundle.getInt("value");
                tv_time.setText("value 값 : " + value);
            }else{
                int value2 = bundle.getInt("value");
                tv_time2.setText("두번째 : " + value2);
            }

//            tv_time.setText(String.valueOf(msg.));
        }
    }
    //핸들러 한개 추가도 가능





    // 새로운 작업 공간 == 새로운 Thread
    class Mythread extends Thread {
        // 새로운 작업 공간에서 실행시킬 로직을 정의! --> run 메소드 오버라이딩

        int value = 0;

        @Override

        public void run() {
            // 1초마다 1씩 증가하는 출력문 작성!
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000); // --> 1초를 기다려주세요!!

                    // Thread에서는 직접적으로 화면에 있는 구성 요소를 (View) 조작할 수 없다!!!

                    // 1초마다 핸들러로 Message 객체를 통해서 요청을 보내야함!

                }
                catch (Exception e) {

                }
                Log.d("경과시간", String.valueOf(i));

                value += 1;

                Message message = handler.obtainMessage();
                Bundle bundle = new Bundle();
                bundle.putInt("value", value);
                bundle.putInt("valuee", 0);
                message.setData(bundle);

                handler.sendMessage(message);


            }
        }

    }

//    추가2
    class Mythread2 extends Thread {
    // 새로운 작업 공간에서 실행시킬 로직을 정의! --> run 메소드 오버라이딩

    int value = 0;

    @Override

    public void run() {
        // 1초마다 1씩 증가하는 출력문 작성!
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(3000); // --> 1초를 기다려주세요!!

                // Thread에서는 직접적으로 화면에 있는 구성 요소를 (View) 조작할 수 없다!!!

                // 1초마다 핸들러로 Message 객체를 통해서 요청을 보내야함!

            }
            catch (Exception e) {

            }
            Log.d("경과시간2", String.valueOf(i));
            value += 1;

            Message message = handler.obtainMessage();
            Bundle bundle = new Bundle();
            bundle.putInt("value", value);
            bundle.putInt("valuee", 1);
            message.setData(bundle);

            handler.sendMessage(message);


        }
    }

}
}