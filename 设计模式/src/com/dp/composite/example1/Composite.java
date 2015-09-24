package com.dp.composite.example1;

import android.content.SyncStatusObserver;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @desc 请用一句话描述此文件
 * @creator caozhiqing
 * @data 2015/8/12
 */
public class Composite {

    private String name;

    public Composite(String name){
        this.name = name;
    }
    //树枝节点
    private Collection<Composite> composites = new ArrayList<Composite>();

    //树叶节点
    private Collection<Leaf> leafs = new ArrayList<Leaf>();


    public void addComposite(Composite composite){
        composites.add(composite);
    }

    public void addLeaf(Leaf leaf){
        leafs.add(leaf);
    }

    public void printStruct(String pre){
        System.out.println(pre + "+" + this.name);
        pre += " ";
        for (Leaf leaf : leafs) {
            leaf.printStruct(pre);
        }
        for (Composite composite : composites) {
            composite.printStruct(pre);
        }

   }
}
