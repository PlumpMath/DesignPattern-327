package com.dp.composite.example2;

/**
 * @desc 请用一句话描述此文件
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
