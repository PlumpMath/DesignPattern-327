package com.dp.composite.example4;

/**
 * @desc 叶子类，即没有子节点
 * @creator caozhiqing
 * @data 2015/8/12
 */
public class Leaf extends Component {

    private String name;
    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void operation(String pre) {

        System.out.println(pre+"-"+this.name);
    }
}
