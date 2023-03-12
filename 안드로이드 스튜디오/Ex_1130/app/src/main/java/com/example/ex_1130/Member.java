package com.example.ex_1130;

import android.widget.Button;

public class Member {

    private int img;
    private String name;
    private String number;
    private Button btn;

//
    public Button getBtn() {
        return btn;
    }
//
    public void setBtn(Button btn) {
        this.btn = btn;
    }


    public Member(int img, String name, String number) {
        this.img = img;
        this.name = name;
        this.number = number;
//
        this.btn = btn;

    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }




}

