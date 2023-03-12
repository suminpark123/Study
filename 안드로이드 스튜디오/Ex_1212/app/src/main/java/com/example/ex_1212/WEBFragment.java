package com.example.ex_1212;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class WEBFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_w_e_b,null);

        WebView myWeb = view.findViewById(R.id.myWeb);

        //인터넷 권한 ,url
        myWeb.loadUrl("http://172.30.1.28:5500/Ex01.html");

        //1. 센서 활용방법
        //2. 레이아웃 구성 방법
        //3. 어떤기기에서 만들지
        //4. 코틀린 공부


        return view;
    }
}