package com.company;

public class Main {

    public static void main(String[] args) {
        double my20 = 20.00d;
        double my80 = 80.00d;
        double mult2080 = (my80 + my20) * 100.00d;
        double myResMath = mult2080 % 40.00d;

        boolean isThereRemainder = (myResMath == 0.00) ? true : false;
        System.out.println(isThereRemainder);

        if (!isThereRemainder){
            System.out.println("Got some remainder");
        }
    }
}
