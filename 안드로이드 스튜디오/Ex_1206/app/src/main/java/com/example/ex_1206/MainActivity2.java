package com.example.ex_1206;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    EditText ed_id;
    EditText ed_pw;
    EditText ed_nick;
    Button btn2;
    RequestQueue requestQueue;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(requestQueue==null){
            requestQueue = Volley.newRequestQueue(MainActivity2.this);
        }
        ed_id=findViewById(R.id.ed_id);
        ed_pw=findViewById(R.id.ed_pw);
        ed_nick=findViewById(R.id.ed_nick);
        btn2=findViewById(R.id.btn2);


        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String inputId2 = ed_id.getText().toString();
                String inputPw2 = ed_pw.getText().toString();
                String inputNick2 = ed_nick.getText().toString();

                String url = "http://172.30.1.31:3001/Join";

                StringRequest request = new StringRequest(
                        Request.Method.POST,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject json = new JSONObject(response);
                                    String value = json.getString("result");
//                                    if(value.equals("1")){
//                                        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
//                                        startActivity(intent);
//                                        Log.d("회원가입통신","성공?");
//                                    }
//                                    else{
//
//                                    }
                                    Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                                        startActivity(intent);
                                        Log.d("회원가입통신","성공?");
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }


                            }

                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Log.d("회원가입통신","실패");
                            }
                        }

                )
                {
                    @Nullable
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        //getParams --> post방식으로 데이터를 보낼때 사용되는 메소드!
                        //데잍터를 key - value 형태로 만들어서 보내겠습니다.
                        Map<String,String> params= new HashMap<String,String>();
                        //params -> key -value 형태로 만들어줌
                        params.put("id",inputId2);
                        params.put("pw",inputPw2);
                        params.put("nick",inputNick2);

                        //key - value 로 만들어진 params 객체를 전송
                        return params;
                    }
                };//request 여기까지
                requestQueue.add(request);

            }
        });






    }
}