package com.example.ex_1129;

public class Member {//각각 항목에 들어갈 데이터를 한번에 다룰수 있는 클래스

    private int img;
    private String name;
    private String number;

    // Alt + Insert

    public Member(int img, String name, String number) {
        this.img = img;
        this.name = name;
        this.number = number;
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
