package com.example.ex_1212;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class STARFragment extends Fragment {

    Button btn_star;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //프래그먼트에 요소에 기능을 달아 줄때는
        //프래그먼트화면을 java로 변환 시켜주는 작업이 필요하다.
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_s_t_a_r,null);





        btn_star = view.findViewById(R.id.btn_star);
        btn_star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("버튼","123");
                Toast.makeText(view.getContext(), "star", Toast.LENGTH_SHORT).show();
            }
        });

        return view;


    }
}