package com.dp.composite.example1;

/**
 * @desc 请用一句话描述此文件
 * @creator caozhiqing
 * @data 2015/8/12
 */
public class Leaf {

    private String name;

    public Leaf(String name){
        this.name = name;
    }

    public void printStruct(String pre){
        System.out.println(pre+"-"+this.name);
    }

}
