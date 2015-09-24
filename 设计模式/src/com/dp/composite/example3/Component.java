package com.dp.composite.example3;

/**
 * @desc 为了安全性，把所添加、删除等操作放到具体实现组件中。
 * @creator caozhiqing
 * @data 2015/8/12
 */
public abstract class Component {

    private Component parent;

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    public abstract void operation(String pre);

}
