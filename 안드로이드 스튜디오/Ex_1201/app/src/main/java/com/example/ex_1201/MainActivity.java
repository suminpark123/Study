package com.example.ex_1201;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtext;
    TextView tv_result;
    RequestQueue requestQueue;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       tv_result = findViewById(R.id.tv_result);
       edtext =findViewById(R.id.edtext);
       btn = findViewById(R.id.btn);


       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String edmsg=edtext.getText().toString();
//               Log.d("체크",edmsg);

               String movieUrl = "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101";
               //firebase의 리얼타임데이터베이스: db처럼 쓸수있다.

               requestQueue= Volley.newRequestQueue(MainActivity.this);
               StringRequest request = new StringRequest(
                       //정보1 어떤방식으로 통신할껀지
                       Request.Method.GET,
                       //정보2 어디랑 통신 할껀지,
                       movieUrl,
                       //정보3 통신 성공 리스너
                       new Response.Listener<String>() {
                           @Override
                           public void onResponse(String response) {

                               //response 는 String 타입 이기 때문에 json데이터가 String 형식으로 받아진다.
                               //json형식으로 다시 바꿔서 키값을 사용할 수 있다.
                               //responsse->요청성공시 응답데이터를 자동으로 받아옴
                               tv_result.setText(response);


                               //받아온 데이터를 json 타입으로 형 변환
                               try {
                                   ArrayList<String> dataArray;
                                   JSONObject json = new JSONObject(response);
                                   JSONObject json2 =json.getJSONObject("boxOfficeResult");
                                   JSONArray json3 =json2.getJSONArray("dailyBoxOfficeList");

                                   for(int i =0; i<json3.length(); i++){
                                       JSONObject json4 =json3.getJSONObject(i);
                                       String value = json4.getString("movieNm");
//                                       dataArray.add(value);
                                       Log.d("결과",value);
                                   }
//                                   JSONObject json4 =json3.getJSONObject(0);
//                                   String value = json4.getString("movieNm");





                               } catch (JSONException e) {
                                   e.printStackTrace();
                               }

                           }
                       },
                       //정보4 통신 실패 리스너
                       new Response.ErrorListener() {
                           @Override
                           public void onErrorResponse(VolleyError error) {
                               tv_result.setText(error.toString());

                           }
                       }
               );
               requestQueue.add(request);

           }
       });
        //requestQueue 요청을 보낼 수 있는 기능 담아주기
//       requestQueue= Volley.newRequestQueue(MainActivity.this);

       //Volley 통신 실습
       // 1. 요청에 대한 정보를 담아줄 객체 만들기!
//        StringRequest request = new StringRequest(
//                //정보1 어떤방식으로 통신할껀지
//                Request.Method.GET,
//                //정보2 어디랑 통신 할껀지
//                "http://www.google.com",
//                //정보3 통신 성공 리스너
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        //responsse->요청성공시 응답데이터를 자동으로 받아옴
//                    tv_result.setText(response);
//                    }
//                },
//                //정보4 통신 실패 리스너
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        tv_result.setText(error.toString());
//
//                    }
//                }
//        );
        //요청본을 requestQueue에 담아서 실행 시키기!!
//        requestQueue.add(request);
    }
}