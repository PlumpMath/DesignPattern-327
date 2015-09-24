package com.dp.composite.example4;

import com.google.gson.Gson;

/**
 * @desc 客户端
 * @creator caozhiqing
 * @data 2015/8/12
 */
public class Client {
    public static void main(String[] arg){
        Component root = new Composite("服装");
        Component man = new Composite("男装");
        Component wom = new Composite("女装");

        root.addChild(man);
        root.addChild(wom);

        Component leaf1 = new Leaf("夹克");
        Component leaf2 = new Leaf("寸衫");
        man.addChild(leaf1);
        man.addChild(leaf2);

        Component leaf3 = new Leaf("短裙");
        Component leaf4 = new Leaf("Browse");
        wom.addChild(leaf3);
        wom.addChild(leaf4);
        root.operation("");

        System.out.println("----------->");
//        root.removeChile(man);
//        root.operation("");
        Gson gson = new Gson();
        System.out.println(gson.toJson(root));
    }

}
