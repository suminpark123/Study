package com.example.ex_1208;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tv_score;
    Button btn_start;
    ImageView[] imgArray = new ImageView[9];
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;
    TextView tv_time;
    MainHandler handler;



    int num1 = 0;
    final String TAG_ON = "on"; //태그용
    final String TAG_OFF = "off";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_time = findViewById(R.id.tv_time);
        tv_score = findViewById(R.id.tv_score);
        btn_start = findViewById(R.id.btn_start);
//        img1 = findViewById(R.id.img1);
//        img2 = findViewById(R.id.img2);
//        img3 = findViewById(R.id.img3);
//        img4 = findViewById(R.id.img4);
//        img5 = findViewById(R.id.img5);
//        img6 = findViewById(R.id.img6);
//        img7 = findViewById(R.id.img7);
//        img8 = findViewById(R.id.img8);
//        img9 = findViewById(R.id.img9);
//
//        id값들이 imgld에 담기게 된다
        for (int i = 0; i < imgArray.length; i++) {
            int imgId = getResources().getIdentifier("img" + (i + 1), "id", getPackageName());
            imgArray[i] = findViewById(imgId);
            imgArray[i].setImageResource(R.drawable.image1);
            imgArray[i].setTag(TAG_OFF);

            int finalI = i;
            imgArray[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //view 객체는 화면에 보여지는 모든 요소에 대한 제일 최상위 객체이다
                    //view 를 통해서 사용해 줄때는 다운캐스팅해서 사용해 줘야 한다.
                    ImageView img = (ImageView) view;
//                    img.setImageResource(R.drawable.image1);
                    //내려가있는 이미지로 바꾸어주세요

                    if(img.getTag().toString().equals(TAG_ON)){
//                        Toast.makeText(getApplicationContext(), "good", Toast.LENGTH_SHORT).show();
                        imgArray[finalI].setImageResource(R.drawable.image1);
                        num1=num1+1;
                        tv_score.setText("SCORE :"+Integer.toString(num1));
                        view.setTag(TAG_OFF);
                    }
                    else{
//                        Toast.makeText(getApplicationContext(), "bad", Toast.LENGTH_SHORT).show();

                        if(num1>0){
                            num1=num1-1;
                            tv_score.setText("SCORE :"+Integer.toString(num1));

                        }
                        else{
                            num1=0;
                            tv_score.setText("SCORE :"+Integer.toString(num1));
                        }
                        img.setImageResource(R.drawable.image2);
                        view.setTag(TAG_ON);
                    }

                }
            });
        }

        //버튼을 클릭했을때 이미지가 랜덤하게 올라온 이미지로 바뀌게 해주세요
        btn_start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Mythread mythread = new Mythread();
                mythread.start();

                for(int i=0; i< imgArray.length; i++){
                    DoThread thread = new DoThread(i);
                    thread.start();//중요
                }


            }
        });



        handler = new MainHandler();


    }

    class MainHandler extends Handler {
        @Override
        public void handleMessage(@NonNull Message msg) {

            Bundle bundle = msg.getData();
            int value = bundle.getInt("value");
            tv_time.setText("남은시간 : " + value+"초");


        }
    }

    Handler doHandler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            //이미지뷰를 바꾸어줄게요

                imgArray[msg.arg1].setImageResource(R.drawable.image2);
                imgArray[msg.arg1].setTag(TAG_ON); //올라오면 ON태그 달아줌



        }
    };

    Handler offHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            imgArray[msg.arg1].setImageResource(R.drawable.image1);
            imgArray[msg.arg1].setTag(TAG_OFF); //내려오면 OFF태그 달아줌

        }
    };

    //각각의 이미지가 랜덤한 시간을 셀 수 있도록 도와주는 쓰레드
    class DoThread extends Thread {
        // 새로운 작업 공간에서 실행시킬 로직을 정의! --> run 메소드 오버라이딩

        int pos;


        public  DoThread(int pos){
            this.pos =pos;

        }

        @Override

        public void run() {


            Random ran = new Random();
            //1~9사이의 랜덤값

            //랜덤한 시간을 기다려주세요
            while (num1<30){
                try {
                    int ranTime =ran.nextInt(3)+1;
//                    Thread.sleep(ranTime*1000);
//                    int offtime = new Random().nextInt(5000) + 500 ;
                    Thread.sleep(ranTime*1000);
                    //이미지를 올라온 이미지로 바꾸어주세요 쓰레드에선 뷰조작불가능/ 핸들러로 요청
                    //요청데이터 1. 몇번째 이미지인지 2. 어떤 이미지로 바꿀지(올라온)
                    Message msg =new Message();
                    msg.arg1 = pos;
                    msg.arg2 = R.drawable.image2;
                    doHandler.sendMessage(msg);

                    int ontime = new Random().nextInt(1000)+500;
                    Thread.sleep(ontime); //두더지가 올라가있는 시간
                    Message msg2 = new Message();
                    msg2.arg1= pos;
                    offHandler.sendMessage(msg2);


                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }





        }

    }

    class Mythread extends Thread {
        // 새로운 작업 공간에서 실행시킬 로직을 정의! --> run 메소드 오버라이딩

        int value = 30;

        @Override

        public void run() {
            // 1초마다 1씩 증가하는 출력문 작성!
            for (int i = 30; i > 0; i--) {
                try {
                    Thread.sleep(1000); // --> 1초를 기다려주세요!!

                    // Thread에서는 직접적으로 화면에 있는 구성 요소를 (View) 조작할 수 없다!!!

                    // 1초마다 핸들러로 Message 객체를 통해서 요청을 보내야함!

                }
                catch (Exception e) {

                }
                Log.d("경과시간", String.valueOf(i));

                value -= 1;

                Message message = handler.obtainMessage();
                Bundle bundle = new Bundle();
                bundle.putInt("value", value);
                bundle.putInt("valuee", 0);
                message.setData(bundle);

                handler.sendMessage(message);


            }

        }

    }
}


