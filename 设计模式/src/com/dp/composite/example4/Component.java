package com.dp.composite.example4;

        import com.google.gson.annotations.Expose;

        import java.io.Serializable;
        import java.util.ArrayList;

/**
 * @desc 抽象的缺省类
 * @creator caozhiqing
 * @data 2015/8/12
 */
public abstract class Component implements Serializable{


    private transient Component parent;

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    public void addChild(Component component){
        throw new UnsupportedOperationException("不支持此方法");
    }

    public void getChild(int index) {
        throw new UnsupportedOperationException("不支持此方法");
    }

    public ArrayList<Component> getChild() {
        throw new UnsupportedOperationException("不支持此方法");
    }

    public void removeChile(Component component) {
        throw new UnsupportedOperationException("不支持此方法");
    }

    public abstract void operation(String pre);
}
