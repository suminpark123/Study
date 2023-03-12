package com.example.ex_1129;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//MyAdapter -->나만의 어댑터(내가 정한 형식으로 리스트뷰에 데이터를 띄워줄 수 있는 어뎁터)
//중요! 나만의 어댑터를 만들때는 꼭 BaseAdapter를 상속 받아 줘야한다.
public class MyAdapter extends BaseAdapter {

    private Context context; //현재 액티비티(화면)의 정보
    private  int layout; //리스트뷰에 보여질 항목 레이아웃에 대한 정보
    private ArrayList<Member> dataArray; // 데이터셋
    private LayoutInflater inflater; // xml ->View객체로 변환

    public MyAdapter(Context context, int layout, ArrayList<Member> dataArray) {
        this.context = context;
        this.layout = layout;
        this.dataArray = dataArray;


        //체크
        //xml -->view 객체로 만들수 있는 기능을 받아옴
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {//데이터 셋에 있는 데이터의 갯수를 반환
        return dataArray.size();
    }

    @Override
    public Object getItem(int i) {//데이터에 접근
        return dataArray.get(i);
    }

    @Override
    public long getItemId(int i) {//항목의 id값을 반환
        return i;
    }

    //중요!!!!!!!!!!!!!!!!!★★★★★
    //리스트뷰의 항목에 들어갈 내용을 초기화 해주는 역할
    //항목을 리스트뷰에 표현 할 수 있도록 그려주는(준비하는) 역할
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //my_item.xml을 가지고와서 데이터를 담아준 다음에 ListView로 출력 시켜줘야함


        //layout에 저장되어있는 my_item.xml을 Java에서 사용할 수 있도록 view 객체로 변환하겠습니다.
       view = inflater.inflate(layout,null);
        ImageView img = view.findViewById(R.id.img);
        TextView tv_name = view.findViewById(R.id.tv_name);
        TextView tv_number = view.findViewById(R.id.tv_number);

        img.setImageResource(dataArray.get(i).getImg());
        tv_name.setText(dataArray.get(i).getName());
        tv_number.setText(dataArray.get(i).getNumber());

        return view;

    }
}
