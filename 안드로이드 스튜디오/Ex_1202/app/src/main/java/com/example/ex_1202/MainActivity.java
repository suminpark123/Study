package com.example.ex_1202;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

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

    Button btn;
    ListView my_lv;
    RequestQueue requestQueue;
    MyAdapter adapter;
    ArrayList<Member> dataArray;
    EditText edmsg;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        my_lv = findViewById(R.id.my_lv);
        dataArray = new ArrayList<Member>();
        edmsg = findViewById(R.id.edmsg);


    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String idmsg=edmsg.getText().toString();

            String movieUrl = "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt="+idmsg;
            //firebase의 리얼타임데이터베이스: db처럼 쓸수있다.
            String url2= "http://172.30.1.28:3010";

            requestQueue= Volley.newRequestQueue(MainActivity.this);
            StringRequest request = new StringRequest(
                    //정보1 어떤방식으로 통신할껀지
                    Request.Method.GET,
                    //정보2 어디랑 통신 할껀지,
                    url2,
                    //정보3 통신 성공 리스너
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            Log.d("통신","성공");
                            //response 는 String 타입 이기 때문에 json데이터가 String 형식으로 받아진다.
                            //json형식으로 다시 바꿔서 키값을 사용할 수 있다.
                            //responsse->요청성공시 응답데이터를 자동으로 받아옴



                            //받아온 데이터를 json 타입으로 형 변환
//                            try {
//
//                                JSONObject json = new JSONObject(response);
//                                JSONObject json2 =json.getJSONObject("boxOfficeResult");
//                                JSONArray json3 =json2.getJSONArray("dailyBoxOfficeList");
//
//                                dataArray.clear();
//                                for(int i =0; i<json3.length(); i++){
//                                    JSONObject json4 =json3.getJSONObject(i);
//                                    String value = json4.getString("movieNm");
//                                    String value2 = json4.getString("movieCd");
//                                    String value3 = json4.getString("audiCnt");
//                                    String value4 = json4.getString("rank");
//
//
////                                       dataArray.add(value);
//                                    Log.d("결과",value);
//
//                                    dataArray.add(new Member(value,value2,value3,"\n"+value4+"\n\n관객수"));
//
//                                }
//                                adapter = new MyAdapter(MainActivity.this,R.layout.my_item,dataArray);
//                                my_lv.setAdapter(adapter);
////                                   JSONObject json4 =json3.getJSONObject(0);
////                                   String value = json4.getString("movieNm");
//
//
//
//
//
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }

                        }
                    },
                    //정보4 통신 실패 리스너
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                        Log.d("통신","실패");

                        }
                    }
            );
            requestQueue.add(request);

        }
    });

    }
}