package com.dp.composite.example2;

/**
 * @desc 请用一句话描述此文件
 * @creator caozhiqing
 * @data 2015/8/12
 */
public abstract class Component {


    public void addChild(Component component){
        throw new UnsupportedOperationException("不支持此方法");
    }

   public void getChild(Component component){
       throw new UnsupportedOperationException("不支持此方法");
   }

    public void removeChile(Component component){
        throw new UnsupportedOperationException("不支持此方法");
    }

    public abstract void operation(String pre);

}
