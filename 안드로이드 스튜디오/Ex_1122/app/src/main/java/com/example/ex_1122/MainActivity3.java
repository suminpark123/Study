package com.example.ex_1122;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    Button btn_start;

    //9개 버튼을 위한 배열생성
    Button [] btnArr=new Button[9];
    //버튼에 들어갈 숫자르르 관리하기 위한 배열 생성
    int[] numArr = new int[9];

    //버튼이 순서대로 눌리는지 확인할 수 있는 정답지 변수
    int answer = 1;
    // 게임시작시 시작 수를 알수 있는 check 변수 지정
    int check=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //반복문을 사용하여 btn1~btn9번까지 id값 지정하기


        //구현할 기능
        //1.랜덤 숫자 생성 -> makeRandom()
        //2.버튼에 랜덤 수 연결->numberInit()
        //3.정답을 맞췄을 경우 버튼 숨기기

        //버튼 id값을 초기화하는 메소드
        //메소드 생성 단축키 -> alt + shift + m
        initView();

        //시작버튼이 눌리기 전에는 보이지않도록 지정하기
        for(int i=0; i<btnArr.length; i++){
            btnArr[i].setVisibility(View.INVISIBLE);
        }
        //btn_start버튼에 이벤트 달기
        //btn_start버튼이 눌리면 9개의 버튼이 보여지도록 연결
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //게임이 시작되면 시작버튼을 사용할수없도록 비활성화
                btn_start.setClickable(false);
                //랜덤수 생성 메소드
                makeRandom(0);

                //버튼과 숫자를 연결하는 메소드
                numberInit();

                //각 버튼을 눌렀을 경우 순서에 맞춰 버튼 감추기
                for(int i=0; i<btnArr.length; i++){

                    //변수 i는 이벤트를 진행하면서 값이 변경 될 수 있으므로
                    //꼭 상수로 변환 되어야 한다.->이벤트를 사용할때 주의해야 할점
                    /// 해결방법) 변수 i를 상수 i로 변경한다.

                    final int p = i;
                    btnArr[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            //실제 눌러야 하는 순서와 버튼의 값이 같은지 판단하기
//                            Integer.parseInt(btnArr[p].getText().toString())
                            if(numArr[p]==answer){
                                //해당하는 버튼 숨기기
                                btnArr[p].setVisibility(view.INVISIBLE);
                                answer++;
                                ++check;
                                //두번째 판이 시작되도록 버튼셋팅하기
                                if(check==9){
                                    makeRandom(check);
                                    numberInit();

                                }
                                else if(check==18){
                                    makeRandom(check);
                                    numberInit();
                                }
                                else if(check==27){
                                    makeRandom(check);
                                    numberInit();
                                }
                                else if(check==36){
                                    makeRandom(check);
                                    numberInit();
                                }
                                else if(check==45){
                                    //게임이 종료되는시점
                                    btn_start.setText("end");
                                    Toast.makeText(getApplicationContext(),"게임종료;;",Toast.LENGTH_LONG).show();
                                    //게임버튼 활성화시키기
                                    btn_start.setClickable(true);
                                }


                            }
                        }
                    });
                }

            }        });
    }

    private void numberInit() {
        //버튼과 랜덤수 연결하기 -> 각 버튼을 누를 수 있는 이벤트 필요
        for(int i=0; i< btnArr.length;i++){
            btnArr[i].setText(Integer.toString(numArr[i]));
//                    numArr[i]+""
            //사라졌던 버튼 다시 띄우기
            btnArr[i].setVisibility(View.VISIBLE);
        }

    }

    private void makeRandom(int check) {
        // 랜덤수 생성!
        Random rd = new Random();

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = rd.nextInt(9)+(1+check);

            //중복되는 수가 있는지 확인
            for (int j = 0; j < i; j++) {
                if(numArr[i]==numArr[j]){
                    i--;
                }
            }
        }
        Log.d("random", Arrays.toString(numArr));
    }

    private void initView() {
        btn_start = findViewById(R.id.btn_start);
        for(int i =0; i< btnArr.length; i++){
            //getResources() :리소스 파일에 접근을 하는 메소드
            //getIdentifier(name,deftype,depackage):찾고자하는 내용을 기준으로 이름값을 가져와주는 메소드
            int btnId=getResources().getIdentifier("btn"+(i+1),"id",getPackageName());
            btnArr[i] = findViewById(btnId);
        }
    }


}