package com.example.ex_1202;

public class Member {

    private String name;
    private String number;
    private String count;
    private String rank;


    public Member(String name, String number, String count, String rank) {
        this.name = name;
        this.number = number;
        this.count = count;
        this.rank = rank;
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

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
