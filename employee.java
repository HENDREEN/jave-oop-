package com.example.dell.dailywork;

import android.util.Log;

/**
 * Created by Dell on 05/07/2018.
 */

public class employee {
    String name;
    int age;
    public employee(){

    }
    public employee(int age,String name){
        this.age=age;
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void countSalary(){
        Log.i("employee", "countSalary:  330000 ");
    }
    public void countSalary(int salary){
        Log.i("employee", "countSalary: "+salary );
    }
}
