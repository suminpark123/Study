package com.example.ex_1206;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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

public class MainActivity extends AppCompatActivity {

    Button btn_login;
    EditText edit_id,edit_pw;
    RequestQueue requestQueue;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(requestQueue==null){
            requestQueue = Volley.newRequestQueue(MainActivity.this);
        }
        btn=findViewById(R.id.btn);
        edit_id=findViewById(R.id.edit_id);
        edit_pw=findViewById(R.id.edit_pw);
        btn_login=findViewById(R.id.btn_login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputId = edit_id.getText().toString();
                String inputPw = edit_pw.getText().toString();

                //가지고 온 값을 서버로 전송-->서버로 요청보내다
                //요청을 보내기 위해서 request 객체,requestQueue
                String url = "http://172.30.1.31:3001/Login";//서버주소
                StringRequest request = new StringRequest(
                        Request.Method.POST,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject json = new JSONObject(response);
                                    String value = json.getString("result");
                                    if(value.equals("123")){
                                        Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();
                                    }
//                                    else{
//                                        Toast.makeText(getApplicationContext(),"로그인실패", Toast.LENGTH_SHORT).show();
//                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                                Log.d("통신",response);

                            }

                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Log.d("통신","실패");
                            }
                        }

                ){
                    @Nullable
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        //getParams --> post방식으로 데이터를 보낼때 사용되는 메소드!
                        //데잍터를 key - value 형태로 만들어서 보내겠습니다.
                        Map<String,String> params= new HashMap<String,String>();
                        //params -> key -value 형태로 만들어줌
                        params.put("id",inputId);
                        params.put("pw",inputPw);

                        //key - value 로 만들어진 params 객체를 전송
                        return params;
                    }
                };//request 여기까지
                requestQueue.add(request);


            }
        });

    }
}