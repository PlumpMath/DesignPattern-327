package com.dp.composite.example1;

/**
 * @desc 请用一句话描述此文件
 * @creator caozhiqing
 * @data 2015/8/12
 */
public class Client {

    public static void main(String[] arg){

        Composite root = new Composite("服装");
        Composite man = new Composite("男装");
        Composite wom = new Composite("女装");

        Composite head = new Composite("头巾");

        Leaf leaf1 = new Leaf("大裤衩");
        Leaf leaf2 = new Leaf("寸衫");

        Leaf leaf3 = new Leaf("裙子");

        Leaf head1 = new Leaf("bule");
        Leaf head2 = new Leaf("green");
        root.addComposite(man);
        root.addComposite(wom);

        man.addLeaf(leaf1);
        man.addLeaf(leaf2);

        wom.addLeaf(leaf3);
        wom.addComposite(head);
        head.addLeaf(head1);
        head.addLeaf(head2);

        root.printStruct("");
    }

}
