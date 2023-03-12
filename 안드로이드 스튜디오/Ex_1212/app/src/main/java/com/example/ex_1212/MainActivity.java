package com.example.ex_1212;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.ex_1212.databinding.ActivityMainBinding;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView nav;
    // binding : xml 에 있는 view 정보를 지닐 수 있는 객체!
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // MainActivity.xml 에 있는 정보를 binding 객체에 저장!
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        // binding 안에 있는 정보를 토대로 화면에 출력!
        setContentView(binding.getRoot());

        // 프레임 레이아웃에 homeFragment(Home화면요소) 띄우기]
        // 1. Home 화면 요소를 가져오기
        HomeFragment homeFragment = new HomeFragment();
        STARFragment starFragment = new STARFragment();
        WEBFragment webFragment = new WEBFragment();

        // getSupportFragmentManager : 프래그먼트의 화면 전환을 관리함

        // beginTransaction : 프래그먼트매니저한테 요청을 보냄
        // replace : 화면 전환 요청에 대한 내용
        // 요청실행
        //
        getSupportFragmentManager().beginTransaction().replace(R.id.fl,starFragment).commit();

        nav = findViewById(R.id.nav);
        binding.nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                // onNavigationSelected : 네비게이션 바에 있는 아이템 클릭시 실행!
                // item : 클릭한 항목(아이템)의 정보

                if(item.getItemId()==R.id.frag_home){
                    // ?? -> fragment 화면 전환 요청
                    getSupportFragmentManager().beginTransaction().replace(R.id.fl, homeFragment).commit();

                }else if(item.getItemId()== R.id.frag_star){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fl,starFragment).commit();

                }else if(item.getItemId()== R.id.frag_web){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fl,webFragment).commit();

                }


                return true;
            }
        });

    }


}