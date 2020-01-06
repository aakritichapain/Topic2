package com.aakriti.topic2;

public class Calculation {

    private int valueOne;
    private int valueSecond;

    public Calculation(int valueOne, int valueSecond) {
        this.valueOne = valueOne;
        this.valueSecond = valueSecond;
    }


    public int calculate(){
        return valueOne + valueSecond;
    }


    public int getValueOne() {
        return valueOne;
    }

    public void setValueOne(int valueOne) {
        this.valueOne = valueOne;
    }

    public int getValueSecond() {
        return valueSecond;
    }

    public void setValueSecond(int valueSecond) {
        this.valueSecond = valueSecond;
    }
}
